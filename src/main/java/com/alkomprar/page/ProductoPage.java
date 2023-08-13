package com.alkomprar.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductoPage extends PageObject {

    private final By TxtBusqueda = By.xpath("//input[@id='js-site-search-input']");
    private final By BtnBusqueda = By.id("js-search-button");

    public By getTxtBusqueda() {
        return TxtBusqueda;
    }

    public By getBtnBusqueda() {
        return BtnBusqueda;
    }
}
