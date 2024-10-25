package com.orangehrmlive.steps;


import com.orangehrmlive.pageObjects.LoginPage;
import com.orangehrmlive.utils.DatosExcel;
import com.orangehrmlive.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    DatosExcel datosExcel = new DatosExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();


    private static final String Ruta = "DatosoRangehrmlive.xlsx";
    private static final String PaginaWeb = "Url";
    private static final String Login = "Login";


    @Step ("Abrir Navegador")
    public void abrirnavegador() throws IOException {
        loginPage.openUrl(datosExcel.leerDatosExcel(Ruta,PaginaWeb,1,0));
    }

    @Step ("Escribir Usuario")
    public void escribirusuario() throws IOException {
        loginPage.getDriver().findElement(loginPage.getTxtUsuario()).
                sendKeys(datosExcel.leerDatosExcel(Ruta,Login ,1,0));
    }

    @Step ("Escribir clave")
    public void escribirclave() throws IOException {
        loginPage.getDriver().findElement(loginPage.getTxtClave()).
                sendKeys(datosExcel.leerDatosExcel(Ruta,Login ,1,1));
    }

    @Step ("Dar Clic en Boton Login")
    public void darcliclogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin()).click();
        esperaImplicita.EsperaImplicita(5);

    }


}



