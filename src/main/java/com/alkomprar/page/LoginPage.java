package com.alkomprar.page;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {


    private final By correoCampo = By.id("js-login-email");

    private final By continuarBtn = By.id("js-login-continue");


    public By getCorreoCampo() {
        return correoCampo;
    }

    public By getContinuarBtn() {
        return continuarBtn;

    }
}
