package com.orangehrmlive.stepDefinitions;


import com.orangehrmlive.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Dado("El usuario está en la página de login")
    public void elUsuarioEstáEnLaPáginaDeLogin() throws IOException {

        loginSteps.abrirnavegador();
    }

    @Cuando("El usuario ingresa el nombre de usuario {string} y la contraseña {string}")
    public void elUsuarioIngresaElNombreDeUsuarioYLaContraseña(String string, String string2) throws IOException {

        loginSteps.escribirusuario();
        loginSteps.escribirclave();

    }

    @Cuando("El usuario hace clic en el botón de login")
    public void elUsuarioHaceClicEnElBotónDeLogin() {

        loginSteps.darcliclogin();
    }

    @Entonces("El usuario debería ser redirigido al dashboard")
    public void elUsuarioDeberíaSerRedirigidoAlDashboard() {

        //loginSteps.validarimgpicture();

    }


}
