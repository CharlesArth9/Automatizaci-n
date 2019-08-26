package com.choucair.formacion.steps;
import com.choucair.formacion.pageobjects.registroDemoPageObject;
import net.thucydides.core.annotations.Step;

public class registroDemoSteps {


  registroDemoPageObject registroDemoPageObject;

    @Step
  public  void abrirPaginaPaciente(){

      registroDemoPageObject.open();
  }

  public  void Cookies(){
      registroDemoPageObject.Cookies();
  }
  public  void registroDEmoXM(){

      registroDemoPageObject.registroDEmoXM();
  }
  public void ValidarMensajes()
  {
      registroDemoPageObject.ValidarMensajes();
  }

}
