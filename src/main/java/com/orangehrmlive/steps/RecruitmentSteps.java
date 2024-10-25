package com.orangehrmlive.steps;

import com.orangehrmlive.pageObjects.DashboardPage;
import com.orangehrmlive.pageObjects.RecruitmentPage;
import com.orangehrmlive.utils.DatosExcel;
import com.orangehrmlive.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import java.io.IOException;

public class RecruitmentSteps {


    RecruitmentPage recruitmentPage = new RecruitmentPage();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    DashboardPage dashboardPage = new DashboardPage();

    DatosExcel datosExcel = new DatosExcel();

    private static final String Ruta = "DatosoRangehrmlive.xlsx";
    private static final String Recruitment = "Recruitment";


    @Step("Dar Clic en RecruitmentMenu")
    public void darclicrecruitmentMenu(){
        dashboardPage.getDriver().findElement(dashboardPage.getRecruitmentMenu()).click();
        esperaImplicita.EsperaImplicita(2);
    }

    @Step("Dar Clic en AddButton")
    public void darclicAddButton(){
        recruitmentPage.getDriver().findElement(recruitmentPage.getAddButton()).click();
        esperaImplicita.EsperaImplicita(2);

    }

   @Step ("Escribir Nombre")
    public void escribirnombre() throws IOException {
        recruitmentPage.getDriver().findElement(recruitmentPage.getFirstNameField()).
                sendKeys(datosExcel.leerDatosExcel(Ruta,Recruitment ,1,0));
       esperaImplicita.EsperaImplicita(2);

    }

    @Step ("Escribir Apellido")
    public void esccribirapellido() throws  IOException {
        recruitmentPage.getDriver().findElement(recruitmentPage.getLastNameField()).
                sendKeys(datosExcel.leerDatosExcel(Ruta, Recruitment, 1, 1));
        esperaImplicita.EsperaImplicita(2);

    }

    @Step("Escribir Correo")
    public void esccribircorreo() throws  IOException {
        recruitmentPage.getDriver().findElement(recruitmentPage.getEmailField()).
                sendKeys(datosExcel.leerDatosExcel(Ruta, Recruitment, 1,2));
        esperaImplicita.EsperaImplicita(2);

       }

    @Step("Clic en Guardar")
    public void clicenGuardar(){
        recruitmentPage.getDriver().findElement(recruitmentPage.getSaveButton()).click();
        esperaImplicita.EsperaImplicita(5);
    }

    @Step
    public void validarconfirmacion(){
        esperaImplicita.EsperaImplicita(5);
        Assert.assertThat(recruitmentPage.getDriver().findElement(recruitmentPage.getMsjconfirmacion())
                .isDisplayed(), Matchers.is(true));
    }
}
