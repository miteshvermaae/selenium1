package com.seltests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    By btn_Login=By.xpath("//header//div[contains(@class,'header-right')]/a[@href='https://phptravels.net/login']");
    String HOME_PAGE_URL="https://phptravels.net/";

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    /*public void setDriver(WebDriver driver){
        this.driver=driver;
    }*/

    public void navigate(){
        driver.get(HOME_PAGE_URL);
    }

    public void clickLoginButton(){
        driver.findElement(btn_Login).click();
    }

}
