package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ErrorPassPageObjects;
import net.thucydides.core.annotations.Step;

public class ErrorPassSteps {

    ErrorPassPageObjects ErrorPassPageObjects;

    @Step
    public  void abrirPaginaPaciente(){

        ErrorPassPageObjects.open();
    }

    public  void Cookies(){

        ErrorPassPageObjects.Cookies();
    }
    public  void registroDEmoXM(){

        ErrorPassPageObjects.registroDEmoXM();
    }
    public void ValidarMensajes() {

        ErrorPassPageObjects.ValidarMensajes();
    }
}
