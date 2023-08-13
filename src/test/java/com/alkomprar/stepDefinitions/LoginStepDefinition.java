package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.HomeStep;
import com.alkomprar.steps.LoginStep;
import com.alkomprar.steps.RegistroStep;
import com.alkomprar.steps.ValidacionStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;


public class LoginStepDefinition {

    @Steps
    HomeStep homeStep;
    @Steps
    LoginStep loginStep;
    @Steps
    RegistroStep registroStep;
    @Steps
    ValidacionStep validacionStep;


    @Dado("que el usuario ingresa alkomprar y da clic en mi cuenta")
    public void queElUsuarioIngresaAlkomprarYDaClicEnMiCuenta() {
        homeStep.abrirNavegador();
        homeStep.hoverMetodo();
        homeStep.miPerfil();


    }
    @Cuando("ingresa el correo y da clic en continuar")
    public void ingresaElCorreoYDaClicEnContinuar() {
        loginStep.ingreseMail();
        loginStep.continuarBtn();

    }
    @Cuando("llena los campos del formulario y da clic en el boton continuar")
    public void llenaLosCamposDelFormularioYDaClicEnElBotonContinuar() {
        registroStep.nombreTxt();
        registroStep.apellidoTxt();
        registroStep.telefonoTxt();
        registroStep.condicionesClic();
        registroStep.continuar_2Btn();

    }
    @Entonces("el usuario vera un mensaje y la opcion para ver su perfil")
    public void elUsuarioVeraUnMensajeYLaOpcionParaVerSuPerfil() {
         validacionStep.validacionCuenta();
    }

}
