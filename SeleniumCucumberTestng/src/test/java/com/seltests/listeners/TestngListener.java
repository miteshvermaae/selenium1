package com.seltests.listeners;

import com.seltests.reports.ExtentTestManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        String name = iTestResult.getMethod().getMethodName();
        System.out.println("onTestStart::Testname ="+name);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess::");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure::");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped::");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart::");

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish::");

    }
}
