package Tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginSample extends BaseTest {


    @Test
    public void LoginSampleTesting() throws InterruptedException {
        ExtentTest test = BaseTest.createTest("Login Test", "Verify successful login");

        // Wait for the username field to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")));

        // Invalid Scenario: Username
        try {
            System.out.println("======Invalid=========");
            usernameField = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in123\"]"));
            usernameField.sendKeys("A05317");
            System.out.println("Entered username: A05317");
            Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
        } catch (Exception e) {
            System.out.println("Invalid scenario failed: " + e.getMessage());
        }

        // Valid Scenario: Username
        try {
            System.out.println("=========Valid======");
            usernameField = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]"));
            usernameField.sendKeys("A05317");
            System.out.println("Entered username: A05317");
        } catch (Exception e) {
            System.out.println("Valid scenario failed: " + e.getMessage());
        }

        // Wait for the password field to be visible
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]")));

        // Invalid Scenario: Password
        try {
            System.out.println(" Invalid Scenario: Password");
            passwordField = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your password123\"]"));
            passwordField.sendKeys("Tokio@123");
            System.out.println("Entered password: *****");
            Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
        } catch (Exception e) {
            System.out.println("Invalid scenario failed: " + e.getMessage());
        }

        // Valid Scenario: Password
        try {
            System.out.println(" Valid Scenario: Password");
            passwordField = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]"));
            passwordField.sendKeys("Tokio@123");
            System.out.println("Entered password: *****");
        } catch (Exception e) {
            System.out.println("Valid scenario failed: " + e.getMessage());
        }
       // driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]")).click();

        // Wait for the login button to be clickable
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Login\"]")));
loginButton.click();
//        // Invalid Scenario: Login Button
//        try {
//            System.out.println("Login button click with invalid code");
//            loginButton = driver.findElement(By.xpath("//123android.widget.FrameLayout[@resource-id=\"android:id/content123\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]"));
//            loginButton.click();
//            System.out.println("Clicked login button");
//            Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//        } catch (Exception e) {
//            System.out.println("Invalid scenario failed: " + e.getMessage());
//        }
//
//        // Valid Scenario: Login Button
//        try {
//            System.out.println("Login button click with valid code");
//            loginButton.click();
//            System.out.println("Clicked login button");
//        } catch (Exception e) {
//            System.out.println("Valid scenario failed: " + e.getMessage());
//        }
    }}

//    }catch (Exception e)
//
//    {
//        // Catch any exceptions during the test steps
//        ExtentTest test;
//        test.log(Status.FAIL, "Exception occurred: " + e.toString());
//
//        // Take screenshot for error reporting
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//
//        // Define a path to store the screenshot
//        String screenshotPath = "path/to/screenshots/error_screenshot.png";
//        File destination = new File(screenshotPath);
//
//        try {
//            FileUtils.copyFile(source, destination);
//            // Attach the screenshot to the test report
//            test.addScreenCaptureFromPath(screenshotPath);
//        } catch (IOException ioException) {
//            // Log an error if attaching the screenshot fails
//            test.log(Status.FAIL, "Failed to attach screenshot: " + ioException.getMessage());
//        }
//
//        // Explicitly fail the test
//        org.testng.Assert.fail("Test failed due to exception: " + e.toString());
//
//
//    }
//}
//}}
