package com.seltests.steps;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.seltests.SeleniumDriverManager;
import com.seltests.reports.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver testDriver = null;

    @Before
    public void beforeTest1(Scenario scenario) {
        String scenarioName = scenario.getName();
//      ExtentTestManager.extentTest = ExtentTestManager.getExtentReportObj().startTest(scenarioName);

        ExtentTestManager.startTest(scenarioName);
    }

    @Before
    public void beforeTest(){
        //start the browser
        testDriver = new SeleniumDriverManager().getDriver();
        testDriver.manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){
        //closing the browser
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testDriver.quit();

        if(scenario.isFailed()){
            ExtentTestManager.logFailure("Test failed");
        }

        ExtentTestManager.endTest();
    }
}
