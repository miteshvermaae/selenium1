package com.seltests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By txt_username=By.xpath("//input[@name='email' and @type='email']");
    By txt_password=By.xpath("//input[@name='password' and @type='password']");
    By btn_Login=By.xpath("//div[@class='modal-body']//button[@type='submit']");
    By btn_LoginWithCss=By.cssSelector("div.modal-body button[type='submit']");

    //div[@class='modal-body']//button[@type='submit']
    //

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUserName(String _username)
    {
        driver.findElement(txt_username).sendKeys(_username);
    }


    public void setUserPassword(String _password)
    {
        driver.findElement(txt_password).sendKeys(_password);
    }

    public void clickLogin(){
        driver.findElement(btn_LoginWithCss).click();
    }
}
