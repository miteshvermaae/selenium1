package com.seltests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDriverManager {
    WebDriver driver=null;

//    static final String browserType="REMOTE";

    public WebDriver getDriver(){
        if(driver == null){
            try {
                setupDriver();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return driver;
    }

    public void setupDriver() throws Throwable{
        String browserType= Configuration.getProperty("browserType");
        switch (browserType){
            case "CHROME":
                System.out.println("RUNNING CHROME BROWSER");
                driver = setupChromeDriver();
            case "FIREFOX":
                System.out.println("RUNNING FIREFOX BROWSER");

                //   driver = setupFFDriver();
                break;
            case "REMOTE":
                System.out.println("RUNNING REMOTE BROWSER");
                setupRemoteWebdriver();
        }


    }

    private void setupRemoteWebdriver() {
        URL url = null;
        try {
            String server=Configuration.getProperty("hubIP");
            String port=Configuration.getProperty("hubPort");

            url = new URL("http://"+server+":"+port+"/wd/hub");
        } catch (Throwable e) {
            e.printStackTrace();
        }

        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setBrowserName("firefox");
        caps.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(url,caps);
    }

    private ChromeDriver setupChromeDriver() {
        String projectFolderPath =System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        return new ChromeDriver();

    }
}
