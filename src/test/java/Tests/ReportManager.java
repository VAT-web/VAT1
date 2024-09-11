package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.MediaEntityBuilder;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Base64;

public class ReportManager {
    private static ExtentReports extentReports;
    private static ExtentTest extentTest;
    private static AndroidDriver driver;

    public static ExtentReports getInstance() {
        if (extentReports == null) {
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
            extentReports = new ExtentReports();
            extentReports.attachReporter(htmlReporter);
        }
        return extentReports;
    }

    public static void createTest(String testName) {
        extentTest = getInstance().createTest(testName);
    }

    public static ExtentTest getTest() {
        return extentTest;
    }

    public static void flushReports() {
        if (extentReports != null) {
            extentReports.flush();
        }
    }

    public static void setDriver(AndroidDriver driver) {
        ReportManager.driver = driver;
    }

    public static void captureScreenshot(String testName) {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }

        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        String base64Screenshot = Base64.getEncoder().encodeToString(screenshot);

        extentTest.fail("Screenshot below:", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
    }
}
