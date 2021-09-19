package tutorials;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsSample {

    public static void main(String[] args) {
        String pathOfProject= System.getProperty("user.dir");

        ExtentReports extentReportsObj = new ExtentReports(pathOfProject+"/extentReport.html");

        //start a test
        ExtentTest extentTestObj =extentReportsObj.startTest("Sample Test 1");
        extentTestObj.log(LogStatus.INFO,"this is some info step");
        extentTestObj.log(LogStatus.PASS,"this is some pass step");
        // stop  test
        extentReportsObj.endTest(extentTestObj);


        //start a test
        ExtentTest extentTestObj2 =extentReportsObj.startTest("Sample Test 2");
        extentTestObj2.log(LogStatus.INFO,"this is some info step for test2");
        extentTestObj2.log(LogStatus.PASS,"this is some pass step for test2");
        extentTestObj2.log(LogStatus.FAIL,"this is some failed step for test2");
        // stop  test
        extentReportsObj.endTest(extentTestObj2);


        //start a test
        ExtentTest extentTestObj3 =extentReportsObj.startTest("Sample Test 3");
        extentTestObj3.log(LogStatus.INFO,"this is some info step for test3");
        extentTestObj3.log(LogStatus.FAIL,"this is some failed step for test3");
        extentTestObj3.log(LogStatus.PASS,"this is some pass step for test3");
        // stop  test
        extentReportsObj.endTest(extentTestObj3);


        //close the report
        extentReportsObj.flush();
    }
}
