package com.alkomprar.steps;

import com.alkomprar.models.Productos;
import com.alkomprar.page.ProductoPage;
import com.alkomprar.utils.Metodos;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;



public class ProductoStep extends PageObject {
    @Page
    ProductoPage productoPage;
    @Page
    Productos productos;
    @Page
    Metodos metodos;

    @Step("abrir navegador")

    public void abrirNavegador(){

        productoPage.openUrl("https://www.alkomprar.com/");

    }

    @Step ("ingresar producto")
    public void ingresarProducto(){
        metodos.metodoEspera();
        String producto = productos.data().get(0).get("Nombre");
        productoPage.getDriver().findElement(productoPage.getTxtBusqueda()).clear();

        productoPage.getDriver().findElement(productoPage.getTxtBusqueda())
                .sendKeys(producto);
        metodos.metodoEspera();
        metodos.habilitarBotonBuscar();
        productoPage.getDriver().findElement(productoPage.getBtnBusqueda()).click();
    }


}
