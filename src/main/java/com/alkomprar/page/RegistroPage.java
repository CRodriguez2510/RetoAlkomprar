package com.alkomprar.page;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPage extends PageObject {

    @Getter
    private final By nombreTxt = By.id("register.firstName");
    private final By apellidoTxt = By.id("register.lastName");
    private final By telefonoTxt = By.id("register.mobileNumber");
    private final By terminos = By.xpath("//label[@for='registerChkTermsConditions']");
    private final By continuar_2Btn = By.xpath("//button[contains(@class, 'js-btn-register-myaccount')]");
    ;

    public By getNombreTxt() {
        return nombreTxt;
    }

    public By getApellidoTxt() {
        return apellidoTxt;
    }

    public By getTelefonoTxt() {
        return telefonoTxt;
    }

    public By getTerminos() {
        return terminos;
    }

    public By getContinuar_2Btn() {
        return continuar_2Btn;
    }

}
