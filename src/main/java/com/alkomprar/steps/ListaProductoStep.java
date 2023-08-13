package com.alkomprar.steps;

import com.alkomprar.page.ListaProductoPage;
import com.alkomprar.utils.Metodos;
import com.alkomprar.utils.SeleccionRandom;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

public class ListaProductoStep {

    @Page
    ListaProductoPage listaProductoPage;
    @Page
    Metodos metodos;
    @Step("Seleccion de productos")
    public void seleccionarProducto(){
        WebElement producto = SeleccionRandom.seleccion(
                listaProductoPage.getDriver(),
                listaProductoPage.getLnkNombreProducto()
        );

        producto.click();
        metodos.metodoEspera();
    }
    @Step("agregar carrito")
    public void agregarCarrito(){
        metodos.scrollPagina(250);
        listaProductoPage.getDriver().findElement(listaProductoPage.getButtonCarrito()).click();
    }

    @Step("ir carrito")
    public void irCarrito(){
     listaProductoPage.getDriver().findElement(listaProductoPage.getIrCarrito()).click();
    }
}
