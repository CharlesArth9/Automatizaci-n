package com.choucair.formacion.definition;
import com.choucair.formacion.steps.registroDemoSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class registroDemoDefinitions {
    @Steps
    registroDemoSteps registroDemoPageObject;

    @Dado("^que el usuario entra a la pagina de registro de XM$")
    public void que_el_usuario_entra_a_la_pagina_de_registro_de_XM()  {

        registroDemoPageObject.abrirPaginaPaciente();
        registroDemoPageObject.Cookies();

    }
    @Cuando("^se realiza el registro de la cuenta demo en XM$")
    public void se_realiza_el_registro_de_la_cuenta_demo_en_XM() {

        registroDemoPageObject.registroDEmoXM();
}
    @Entonces("^el verifica que se presente en pantalla el mensaje Datos guardados correctamentep$")
    public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamentep() {
        registroDemoPageObject.ValidarMensajes();
    }
}
