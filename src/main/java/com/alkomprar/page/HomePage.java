package com.alkomprar.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class HomePage extends PageObject {

    private final By miPerfil = By.xpath("//i[@class='pull-left alk-icon-user']");
    private final By miCuenta = By.xpath("//span[contains(@class, 'icon alk-icon-user')]");

    public By getMiPerfil() {
        return miPerfil;
    }

    public By getMiCuenta() {
        return miCuenta;
    }
}
