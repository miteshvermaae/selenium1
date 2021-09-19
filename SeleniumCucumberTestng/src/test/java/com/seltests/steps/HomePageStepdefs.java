package com.seltests.steps;

import com.seltests.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepdefs {
    HomePage homePage = new HomePage(Hooks.testDriver);

    @Given("user has opened phptravels homepage")
    public void userHasOpenedPhptravelsHomepage() {
        System.out.println("opening home page");
        homePage.navigate();
    }

    @When("user clicks login button on home page")
    public void userClicksLoginButtonOnHomePage() {
        homePage.clickLoginButton();
    }
}
