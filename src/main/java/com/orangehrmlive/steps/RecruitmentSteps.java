package com.orangehrmlive.steps;

import com.orangehrmlive.pageObjects.DashboardPage;
import com.orangehrmlive.pageObjects.RecruitmentPage;
import com.orangehrmlive.utils.DatosExcel;
import com.orangehrmlive.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RecruitmentSteps {


    RecruitmentPage recruitmentPage = new RecruitmentPage();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    DashboardPage dashboardPage = new DashboardPage();

    DatosExcel datosExcel = new DatosExcel();

    private static final String Ruta = "DatosoRangehrmlive.xlsx";
    private static final String Recruitment = "Recruitment";


    @Step("Dar Clic en RecruitmentMenu")
    public void darclicrecruitmentMenu(){
        esperaImplicita.EsperaImplicita(15);
        dashboardPage.getDriver().findElement(dashboardPage.getRecruitmentMenu()).click();
    }

    @Step("Dar Clic en AddButton")
    public void darclicAddButton(){
        recruitmentPage.getDriver().findElement(recruitmentPage.getAddButton()).click();

    }

   @Step ("Escribir Nombre")
    public void escribirnombre() throws IOException {
        recruitmentPage.getDriver().findElement(recruitmentPage.getFirstNameField()).
                sendKeys(datosExcel.leerDatosExcel(Ruta,Recruitment ,1,0));

    }

    @Step ("Escribir Apellido")
    public void esccribirapellido() throws  IOException {
        recruitmentPage.getDriver().findElement(recruitmentPage.getLastNameField()).
                sendKeys(datosExcel.leerDatosExcel(Ruta, Recruitment, 1, 1));

    }

    @Step("Escribir Correo")
    public void esccribircorreo() throws  IOException {
        recruitmentPage.getDriver().findElement(recruitmentPage.getEmailField()).
                sendKeys(datosExcel.leerDatosExcel(Ruta, Recruitment, 1,2));

       }


}
