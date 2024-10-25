package com.orangehrmlive.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class DashboardPage extends PageObject {


    // Localizador del menú Recruitment

    By recruitmentMenu = By.xpath("//span[text()='Recruitment']");


    public By getRecruitmentMenu() {return recruitmentMenu;
    }


}
