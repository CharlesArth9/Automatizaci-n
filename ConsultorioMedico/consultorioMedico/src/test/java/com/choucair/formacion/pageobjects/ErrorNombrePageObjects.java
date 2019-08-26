package com.choucair.formacion.pageobjects;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DefaultUrl("https://www.xm.com/register/account/demo?lang=es")

public class ErrorNombrePageObjects extends PageObject{


    @FindBy(xpath = "//input[@id='first_name']")
    WebElementFacade txtNombre;
    @FindBy(xpath = "//div[@class='wrap']//div[2]//h2")
    WebElementFacade Msj;

    public void Cookies() {
        $("//button[@class='btn btn-red btn-solid btn-block js-acceptDefaultCookie gtm-acceptDefaultCookieFirstVisit']").click();
    }

    public void registroDEmoXM() {

        txtNombre.sendKeys("ñoño");
        if (!txtNombre.getText().equalsIgnoreCase("ñoño")){
             txtNombre.clear();
             txtNombre.sendKeys("Carlos");
        }

        $("//input[@id='last_name' and @class='form-control']").sendKeys("Mestra");
        $("//select[@id='country' and @class='form-control valid']").selectByValue("AR");
        $("//input[@id='city' and @class='form-control']").sendKeys("saasasasas");
        $("//input[@id='phone_number' and @name='phone_number']").sendKeys("3106911943");
        $("//input[@id='email' and @name='email']").sendKeys("k@gmail.com");
        $("//select[@id='preferred_language' and @class='form-control']").selectByValue("es");
        $("//select[@id='trading_platform_type' and @class='form-control valid']").selectByValue("mt4");
        $("//select[@id='account_type' and @class='form-control valid']").selectByValue("6");
        $("//select[@id='account_currency' and @class='form-control valid']").selectByValue("USD");
        $("//select[@id='account_leverage' and @class='form-control valid']").selectByValue("200");
        $("//select[@id='investment_amount' and @class='form-control valid']").selectByValue("25000");
        $("//input[@id='account_password' and @name='account_password']").sendKeys("Passwword1");
        $("//input[@id='account_password_confirmation' and @name='account_password_confirmation']").sendKeys("Passwword1");
        $("//i[@class='fa fa-times' and @aria-hidden='true']").click();
        $("//*[@id='demo-form']/div[26]/div/div/div/label/span").click();
        $("//button[@id='submit-btn']").click();


    }

    public void ValidarMensajes() {

        String textoEsperado = "Enhorabuena por la apertura de una Cuenta Demo de XM";
        String mensaje=Msj.getText().trim();
        assertThat(mensaje.equalsIgnoreCase(textoEsperado));

    }
}
