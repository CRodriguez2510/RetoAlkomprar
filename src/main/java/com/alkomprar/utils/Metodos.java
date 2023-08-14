package com.alkomprar.utils;

import com.alkomprar.page.HomePage;
import com.alkomprar.page.ProductoPage;
import net.serenitybdd.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;


public class Metodos extends PageObject {
    @Page
    ProductoPage productoPage;
    @Page
    HomePage homePage;
    private WebDriver driver;

    public Metodos(WebDriver driver){
        this.driver = driver;
    }

    public void hoverMetodo() {
        metodoEspera();
        By locator = homePage.getMiCuenta();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(locator)).perform();
    }

    public void metodoEspera(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(productoPage.getBtnBusqueda()));
    }
    public void habilitarBotonBuscar(){
        WebElement botonBuscar = driver.findElement(productoPage.getBtnBusqueda());

        if (botonBuscar.getAttribute("disabled") != null) {
              ((JavascriptExecutor) driver).executeScript(
                  "arguments[0].removeAttribute('disabled');", botonBuscar);
        }

    }

    public void scrollPagina(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + pixels + ");");
    }
    }
