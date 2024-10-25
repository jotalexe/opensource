package com.orangehrmlive.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RecruitmentPage extends PageObject {



    // Localizadores
    By addButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By firstNameField = By.name("firstName");
    By lastNameField = By.name("lastName");
    By emailField = By.xpath("//input[@placeholder='Type here'][1]");
    By saveButton = By.xpath("//button[@type='submit']");
    By msjconfirmacion = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");


    public By getAddButton() {return addButton;}
    public By getFirstNameField() {return firstNameField;}
    public By getLastNameField() {return lastNameField;}
    public By getEmailField() {return emailField;}
    public By getSaveButton() {return saveButton;}
    public By getMsjconfirmacion() {return msjconfirmacion;}

}

