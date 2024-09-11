package Tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LoginTest extends BaseTest {
@Step("test case 1")
    @Test
    public void LoginToMyZindagiApp() throws InterruptedException {

        // Get the test object from BaseTest
        ExtentTest test = BaseTest.createTest("Login Test", "Verify successful login");

        try {
            // Test steps
            Thread.sleep(5000);
           test.log(Status.PASS, "Application has successfully launched");
            Allure.step("Application has succesfully launched");
            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")).sendKeys("A05317");
            test.log(Status.PASS, "Entered username: A05317");
            Allure.step("Entered Username");

            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]")).sendKeys("Tokio@123");
           test.log(Status.PASS, "User has entered password: *****");
            Allure.step("Entered Password");

            driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
           test.log(Status.PASS, "User clicked login button");
            Allure.step("Clicking on Login button");

            Thread.sleep(8000); // Replace with explicit wait or page load strategy
        }

        catch (Exception e) {
            // Catch any exceptions during the test steps
            test.log(Status.FAIL, "Exception occurred: " + e.toString());

            // Take screenshot for error reporting
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Define a path to store the screenshot
            String screenshotPath = "path/to/screenshots/error_screenshot.png";
            File destination = new File(screenshotPath);

            try {
                FileUtils.copyFile(source, destination);
                // Attach the screenshot to the test report
                test.addScreenCaptureFromPath(screenshotPath);
            } catch (IOException ioException) {
                // Log an error if attaching the screenshot fails
                test.log(Status.FAIL, "Failed to attach screenshot: " + ioException.getMessage());
            }

            // Explicitly fail the test
            org.testng.Assert.fail("Test failed due to exception: " + e.toString());
        }
    }
}
