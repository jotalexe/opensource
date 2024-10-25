package com.orangehrmlive.stepDefinitions;

import com.orangehrmlive.pageObjects.DashboardPage;
import com.orangehrmlive.steps.LoginSteps;
import com.orangehrmlive.steps.RecruitmentSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class RecruitmentStepDefinitions {

    @Steps
    LoginSteps loginSteps;
    RecruitmentSteps recruitmentSteps;
    DashboardPage dashboardPage;

    @Dado("El usuario ha iniciado sesión en OrangeHRM")
    public void elUsuarioHaIniciadoSesiónEnOrangeHRM() throws IOException {

        loginSteps.abrirnavegador();
        loginSteps.escribirusuario();
        loginSteps.escribirclave();
        loginSteps.darcliclogin();
        //loginSteps.validarimgpicture();

    }

    @Cuando("El usuario navega a la sección {string}")
    public void elUsuarioNavegaALaSección(String string) {

        dashboardPage.getRecruitmentMenu();

     }

    @Cuando("El usuario hace clic en el botón {string}")
    public void elUsuarioHaceClicEnElBotón(String string){

        recruitmentSteps.darclicAddButton();
    }

    @Cuando("El usuario ingresa los detalles del candidato")
    public void elUsuarioIngresaLosDetallesDelCandidato() throws IOException {

        recruitmentSteps.escribirnombre();
        recruitmentSteps.esccribirapellido();
        recruitmentSteps.esccribircorreo();
    }

    @Entonces("El usuario debería ver un mensaje de confirmación de que el candidato fue agregado exitosamente")
    public void elUsuarioDeberíaVerUnMensajeDeConfirmaciónDeQueElCandidatoFueAgregadoExitosamente() {

    }


}
