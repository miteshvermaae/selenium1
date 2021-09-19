package com.seltests;

import com.seltests.reports.ExtentTestManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "classpath:features",
        glue = "com.seltests.steps",
        tags = "@NewSampleTest",
        plugin = {"pretty","html:target/cucumber-report.html"}
)

public class TestRunnerRegression2 extends AbstractTestNGCucumberTests {



    @BeforeSuite
    public void beforesuite(){
        System.out.println(" beofre suite...");
        String pathOfProject = System.getProperty("user.dir");
        ExtentTestManager.setExtentReportObj(pathOfProject+"/extentReport.html");
    }

    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite...");
        ExtentTestManager.flushReport();
    }

}
