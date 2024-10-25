package com.orangehrmlive.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {


    // Localizadores
    By txtUsuario = By.name("username");
    By txtClave = By.name("password");
    By btnLogin = By.xpath("//button[@type='submit']");
    //By imgpicture =By.xpath("//img[@alt='profile picture']");


    public By getTxtUsuario() {return txtUsuario;}
    public By getTxtClave() {return txtClave;}
    public By getBtnLogin() {return btnLogin;}
    //public By getImgpicture() {return imgpicture;}


}
