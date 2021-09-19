package com.seltests.steps;

import com.seltests.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Map;

public class LognPageStepdefs {

    LoginPage loginPage = new LoginPage(Hooks.testDriver);


    @Then("Login page is opened having title {string}")
    public void loginPageIsOpened(String expectedPageTitle) {
        //assert that this login page is opened
        String actualTitle =loginPage.getPageTitle();
        Assert.assertEquals(actualTitle,expectedPageTitle,"Page title not matched for login page");
    }

    @And("enters following login details")
    public void entersFollowingLoginDetails(DataTable dataTable) {
        Map<String,String> dataMap =dataTable.asMap(String.class,String.class);

        String username= dataMap.get("username");
        String password= dataMap.get("password");

        loginPage.setUserName(username);
        loginPage.setUserPassword(password);
    }

    @And("clicks login button on login page")
    public void clicksLoginButtonOnLoginPage() {
        loginPage.clickLogin();
    }
}
