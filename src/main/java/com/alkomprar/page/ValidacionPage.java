package com.alkomprar.page;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionPage extends PageObject {


    @Getter
    private final By LBLCuenta = By.xpath("//div[@class=\"account-section-header visible module-title\"]");

    private final By LBLProducto = By.xpath("//div[@class=\"row cart-content\"]");


    public By getLBLCuenta() {
        return LBLCuenta;
    }

    public By getLBLProducto() {
        return LBLProducto;
    }


}

