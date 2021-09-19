package com.seltests.steps;

import com.relevantcodes.extentreports.LogStatus;
import com.seltests.reports.ExtentTestManager;
import io.cucumber.java.en.Given;

public class Samplestepdefs {
    @Given("first number is {int}")
    public void numberIs( int arg1) {
        System.out.println(" sample step number ="+arg1);
        ExtentTestManager.logInfo("some step executes:number ="+arg1);

        // logic
        int  i= 10/arg1;

        ExtentTestManager.logInfo("step first Number setup is passed");
    }
}
