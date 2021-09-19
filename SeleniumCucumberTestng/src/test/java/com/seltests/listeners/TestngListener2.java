package com.seltests.listeners;

import org.testng.*;

public class TestngListener2 implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("onStart - suite");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("onFinish - suite");

    }
}
