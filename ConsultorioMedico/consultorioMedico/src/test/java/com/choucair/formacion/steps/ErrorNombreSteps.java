package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ErrorNombrePageObjects;
import net.thucydides.core.annotations.Step;

public class ErrorNombreSteps {

    ErrorNombrePageObjects ErrorNombrePageObjects;

    @Step
    public  void abrirPaginaPaciente(){

        ErrorNombrePageObjects.open();
    }

    public  void Cookies(){
        ErrorNombrePageObjects.Cookies();
    }
    public  void registroDEmoXM(){

        ErrorNombrePageObjects.registroDEmoXM();
    }
    public void ValidarMensajes()
    {
        ErrorNombrePageObjects.ValidarMensajes();
    }
}
