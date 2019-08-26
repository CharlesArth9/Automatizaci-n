package com.choucair.formacion.definition;

import com.choucair.formacion.steps.ErrorNombreSteps;
import com.choucair.formacion.steps.ErrorPassSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ErrorPassDefinitions {
    @Steps
    ErrorPassSteps ErrorPassSteps;

    @Dado("^que el usuario logra ingresar a la pagina de registro de XM$")
    public void que_el_usuario_logra_ingresar_a_la_pagina_de_registro_de_XM() throws Throwable {
        ErrorPassSteps.abrirPaginaPaciente();
        ErrorPassSteps.Cookies();

    }

    @Cuando("^se realiza el registro ingresando dos password diferente$")
    public void se_realiza_el_registro_ingresando_dos_password_diferentes() throws Throwable {
        ErrorPassSteps.registroDEmoXM();
    }

    @Entonces("^el verifica que se presente en pantalla el mensaje de que no coinciden$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensajede_de_que_no_coinciden() throws Throwable {
        ErrorPassSteps.ValidarMensajes();
    }

}
