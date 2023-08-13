package com.alkomprar.steps;

import com.alkomprar.models.Credenciales;
import com.alkomprar.page.RegistroPage;
import com.alkomprar.utils.Metodos;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class RegistroStep {

    @Page
    RegistroPage registroPage;
    @Page
    Credenciales credenciales;
   @Page
    Metodos metodos;


    @Step ("campo nombre")
    public void nombreTxt(){
        String nombre = credenciales.data().get(0).get("Nombres");
        registroPage.getDriver().findElement(registroPage.getNombreTxt()).clear();
        registroPage.getDriver().findElement(registroPage.getNombreTxt())
                .sendKeys(nombre);
    }

    @Step("campo apellido")
    public void apellidoTxt(){
        String apellido = Credenciales.data().get(0).get("Apellidos");
        registroPage.getDriver().findElement(registroPage.getApellidoTxt()).clear();
        registroPage.getDriver().findElement(registroPage.getApellidoTxt())
                .sendKeys(apellido);
    }

    @Step("campo telefono")
    public void telefonoTxt(){
        String telefono = Credenciales.data().get(0).get("Telefono");
        registroPage.getDriver().findElement(registroPage.getTelefonoTxt()).clear();
        registroPage.getDriver().findElement(registroPage.getTelefonoTxt())
                .sendKeys(telefono);
    }

    @Step("clic condiciones")
    public void condicionesClic(){
        metodos.scrollPagina(150);
        registroPage.getDriver().findElement(registroPage.getTerminos()).click();

    }
    @Step("boton continuar2")
    public void continuar_2Btn() {
        registroPage.getDriver().findElement(registroPage.getContinuar_2Btn()).click();
    }

}
