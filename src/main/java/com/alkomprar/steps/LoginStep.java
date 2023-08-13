package com.alkomprar.steps;

import com.alkomprar.models.Credenciales;
import com.alkomprar.page.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class LoginStep {

    @Page
    LoginPage loginPage;

    @Step("ingrese mail")
    public void ingreseMail(){
        String mail = Credenciales.data().get(0).get("Correo");

        loginPage.getDriver().findElement(loginPage.getCorreoCampo()).clear();

        loginPage.getDriver().findElement(loginPage.getCorreoCampo())
                .sendKeys(mail);
    }

    @Step("boton continuar")
    public void continuarBtn(){
        loginPage.getDriver().findElement(loginPage.getContinuarBtn()).click();
    }



}
