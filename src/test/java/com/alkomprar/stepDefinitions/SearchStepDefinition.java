package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.ListaProductoStep;
import com.alkomprar.steps.ProductoStep;
import com.alkomprar.steps.ValidacionStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class SearchStepDefinition {

    @Steps
    ProductoStep productoStep;
    @Steps
    ListaProductoStep listaProductoStep;
    @Steps
    ValidacionStep validacionStep;

    @Dado("el usuario busca un producto en el campo busqueda")
    public void elUsuarioBuscaUnProductoEnElCampoBusqueda() {
        productoStep.abrirNavegador();
        productoStep.ingresarProducto();

    }
    @Cuando("el usuario selecciona un producto aleatoriamente y lo agrega al carrito")
    public void elUsuarioSeleccionaUnProductoAleatoriamenteYLoAgregaAlCarrito() {
        listaProductoStep.seleccionarProducto();
        listaProductoStep.agregarCarrito();
        listaProductoStep.irCarrito();

    }
    @Entonces("el usurio vera un mensaje de que su producto esta en el carrito")
    public void elUsurioVeraUnMensajeDeQueSuProductoEstaEnElCarrito() {
        validacionStep.validacionProducto();
    }
}
