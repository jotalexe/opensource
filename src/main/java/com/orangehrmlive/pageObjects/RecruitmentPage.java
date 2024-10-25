package com.orangehrmlive.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RecruitmentPage extends PageObject {



    // Localizadores
    By addButton = By.xpath("//button[text()='+ Add']");
    By firstNameField = By.name("firstName");
    By lastNameField = By.name("lastName");
    By emailField = By.name("email");
    By saveButton = By.xpath("//button[@type='submit']");

    public By getAddButton() {return addButton;}
    public By getFirstNameField() {return firstNameField;}
    public By getLastNameField() {return lastNameField;}
    public By getEmailField() {return emailField;}
    public By getSaveButton() {return saveButton;}


}

