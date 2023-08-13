package com.alkomprar.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaProductoPage extends PageObject {

    private final By lnkNombreProducto = By.xpath("//h3[@class=\"product__item__top__title\"]");

    private final By buttonCarrito = By.xpath("//button[@id=\"addToCartButton\"]");
    private final By irCarrito = By.xpath("//div[@class='modal-footer']//a[@href='/cart']");

    public By getLnkNombreProducto() {
        return lnkNombreProducto;
    }

    public By getButtonCarrito() {
        return buttonCarrito;
    }

    public By getIrCarrito() {
        return irCarrito;
    }
}
