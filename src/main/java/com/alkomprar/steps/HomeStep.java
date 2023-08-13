package com.alkomprar.steps;

import com.alkomprar.page.HomePage;
import com.alkomprar.utils.Metodos;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import static net.serenitybdd.core.Serenity.getDriver;


public class HomeStep {

    @Page
    HomePage homePage;
    @Page
    Metodos metodos;

    @Step("abrir navegador")

    public void abrirNavegador(){

        homePage.openUrl("https://www.alkomprar.com/");
    }
    @Step("mi cuenta")
    public void hoverMetodo() {
        metodos.metodoEspera();
        By locator = homePage.getMiCuenta();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(locator)).perform();
    }

   @Step("mi perfil")
    public void miPerfil(){

        homePage.getDriver().findElement(homePage.getMiPerfil()).click();
   }

   }

