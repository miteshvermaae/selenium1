package com.seltests.steps;

import com.seltests.pages.DashboardPage;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class DashboardPageStepdefs {

    DashboardPage dashboardPage = new DashboardPage(Hooks.testDriver);

    @Given("user should be navigated to dashboard page")
    public void userHasOpenedPhptravelsHomepage() {
        String expectedPageTitle="Dashboard - PHPTRAVELS";

        String actualTitle =dashboardPage.getPageTitle();
        Assert.assertEquals(actualTitle,expectedPageTitle,"dashbpard page not opened");

    }
}

