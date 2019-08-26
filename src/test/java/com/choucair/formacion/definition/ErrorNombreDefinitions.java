package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ErrorNombreSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ErrorNombreDefinitions {
    @Steps
    ErrorNombreSteps ErrorNombreSteps;

    @Dado("^que el usuario ingresa a la pagina de registro de XM$")
    public void que_el_usuario_ingresa_a_la_pagina_de_registro_de_XM() throws Throwable {
        ErrorNombreSteps.abrirPaginaPaciente();
        ErrorNombreSteps.Cookies();

    }

    @Cuando("^se realiza el registro ingresando de manera incorrecta el nombre$")
    public void se_realiza_el_registro_ingresando_de_manera_incorrecta_el_nombre() throws Throwable {
        ErrorNombreSteps.registroDEmoXM();
    }

    @Entonces("^el verifica que se presente en pantalla el mensajede error$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensajede_error() throws Throwable {
        ErrorNombreSteps.ValidarMensajes();
    }

}
