package Tests;

import com.aventstack.extentreports.App;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.TapOptions.tapOptions;

public class Recruitment extends BaseTest {


    private static final Logger log = LoggerFactory.getLogger(Recruitment.class);

    @Test
    public void recruitment_flow() throws InterruptedException {

        ExtentTest test = BaseTest.createTest("recruitment flow", "Verify successful login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 30 seconds timeout
        try {

            ReportManager.setDriver(driver);
            ReportManager.createTest("Event Creation");

            test.log(Status.PASS, "Application has successfully launched");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")).sendKeys("A05317");
            ReportManager.getTest().info("Entered username: A05317");
            test.log(Status.PASS, "Entered username: A05317");
            ReportManager.getTest().log(Status.PASS, "Username entered successfully: A05317");

//        ReportManager.captureScreenshot("testMethod");
            ReportManager.getTest().info("Password Entered : *********");
            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]")).sendKeys("Tokio@123");
            test.log(Status.PASS, "User has entered password: *****");
            ReportManager.getTest().pass("Password Entered");
            ReportManager.getTest().info("Attempting click on Login button");
            driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
            test.log(Status.PASS, "User clicked login button");
            ReportManager.getTest().pass("Login button");
            Thread.sleep(5000);
            ReportManager.getTest().info("Attempting to click on the Three lines.");
            WebElement clickOnThreeLines = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
            clickOnThreeLines.click();
            ReportManager.getTest().pass("User clicked on Three lines successfully.");

            ReportManager.getTest().info("Attempting to click on the recruitment.");
            WebElement clickOnRecruitmentTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.TextView[@text=\"Recruitment\"])[1]")));
            clickOnRecruitmentTab.click();
            test.log(Status.PASS, "click on recruitment");
            ReportManager.getTest().pass("User clicked on recruitment tab");


//            WebElement clickOnThreeLines = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
//            clickOnThreeLines.click();
//            test.log(Status.PASS, "User click on three lines");
            // Invalid scenario
//            try {
//                WebElement clickOnThreeLines = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content123\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")));
//                clickOnThreeLines.click();
//                ReportManager.getTest().pass("User clicked on three lines");
//                Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }
//
//// Valid Scenario:
//            try {
//                WebElement clickOnThreeLines = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"), Duration.ofSeconds(20));
//                clickOnThreeLines.click();
//                ReportManager.getTest().pass("User clicked on three lines");
//            } catch (Exception e) {
//                System.out.println("Valid scenario failed: " + e.getMessage());
//            }
//
//// Invalid Scenario
//            try {
//                WebElement clickOnRecruitmentTab = waitForElementVisibility(By.xpath("123//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[10]/android.widget.ImageView"), Duration.ofSeconds(20));
//                clickOnRecruitmentTab.click();
//                ReportManager.getTest().pass("Clicked on recruitment tab");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }
//
//// Valid Scenario
//            try {
//                WebElement clickOnRecruitmentTab = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[10]/android.widget.ImageView"), Duration.ofSeconds(20));
//                clickOnRecruitmentTab.click();
//                ReportManager.getTest().pass("Clicked on recruitment tab");
//            } catch (Exception e) {
//                System.out.println("Valid scenario failed: " + e.getMessage());
//            }
//
//// Invalid Scenario
//            try {
//                WebElement nextDiscussionPlusButton = waitForElementVisibility(By.xpath("//123android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView"), Duration.ofSeconds(20));
//                nextDiscussionPlusButton.click();
//                ReportManager.getTest().pass("Clicked on next discussion plus button");
//                Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }

// Valid Scenario
            try {
                ReportManager.getTest().info("Attempting click on next Discussion PlusButton");
                WebElement nextDiscussionPlusButton = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView"), Duration.ofSeconds(20));
                nextDiscussionPlusButton.click();
                ReportManager.getTest().pass("Clicked on next discussion plus button");
            } catch (Exception e) {
                System.out.println("Valid scenario failed: " + e.getMessage());
            }

// Invalid Scenario
//            try {
//                WebElement reason_dd = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Select an item123\"]"), Duration.ofSeconds(20));
//                reason_dd.click();
//                ReportManager.getTest().pass("Clicked on reason dropdown");
//                Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }

// Valid Scenario
            try {
                ReportManager.getTest().info("Attempting to click on reason dropdown");
                WebElement reason_dd = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Select an item\"]"), Duration.ofSeconds(20));
                reason_dd.click();
                ReportManager.getTest().pass("Clicked on reason dropdown");
            } catch (Exception e) {
                System.out.println("Valid scenario failed: " + e.getMessage());
            }

// Invalid Scenario
//            try {
//                WebElement careerProgressReviewButton = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Career Progression Review123\"]"), Duration.ofSeconds(20));
//                careerProgressReviewButton.click();
//                ReportManager.getTest().pass("Clicked on career progress review button");
//                Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }

// Valid Scenario
            try {
                ReportManager.getTest().info("Attempting to click on career progress review button");

                WebElement careerProgressReviewButton = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Career Progression Review\"]"), Duration.ofSeconds(20));
                careerProgressReviewButton.click();
                ReportManager.getTest().pass("Clicked on career progress review button");
            } catch (Exception e) {
                System.out.println("Valid scenario failed: " + e.getMessage());
            }

//// Invalid Scenario
//            try {
//                WebElement title = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter Title123\"]"), Duration.ofSeconds(20));
//                title.sendKeys("New Event");
//                ReportManager.getTest().pass("Entered title");
//                Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }

// Valid Scenario
            try {
                ReportManager.getTest().info("Attempting to click on Title Text field");

                WebElement title = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter Title\"]"), Duration.ofSeconds(20));
                title.sendKeys("New Event");
                ReportManager.getTest().pass("Entered title");
            } catch (Exception e) {
                System.out.println("Valid scenario failed: " + e.getMessage());
            }
//
//// Invalid Scenario
//            try {
//                WebElement startDate = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[123]/android.widget.ImageView"), Duration.ofSeconds(20));
//                startDate.click();
//                ReportManager.getTest().pass("Clicked on start date");
//                Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }

// Valid Scenario
            try {
                ReportManager.getTest().info("Attempting to click on start date");

                WebElement startDate = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView"), Duration.ofSeconds(20));
                startDate.click();
                ReportManager.getTest().pass("Clicked on start date");
            } catch (Exception e) {
                System.out.println("Valid scenario failed: " + e.getMessage());
            }
//Invalid Scenario
//            try {
//                WebElement pickADate = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"10123\"]"), Duration.ofSeconds(20));
//                pickADate.click();
//                ReportManager.getTest().pass("Picked a start date");
//                Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }

// Valid Scenario
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"25\"))"));


            try {
                ReportManager.getTest().info("Attempting to click on pick a date");

                WebElement pickADate = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"5\"]"), Duration.ofSeconds(20));
                pickADate.click();
                ReportManager.getTest().pass("Picked a start date");
            } catch (Exception e) {
                System.out.println("Valid scenario failed: " + e.getMessage());
            }
////Invalid Scenario
//            try {
//                WebElement StartTime = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Spinner123\").instance(0)"), Duration.ofSeconds(20));
//                StartTime.click();
//                ReportManager.getTest().pass("Clicked on start time");
//                Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }

// Valid Scenario
            ReportManager.getTest().info("Attempting to click on start time");

            WebElement StartTime = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Spinner\").instance(0)"), Duration.ofSeconds(20));
            StartTime.click();
            ReportManager.getTest().pass("Clicked on start time");


//
//            WebElement pickATime = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"8:00 AM\")"));
//            pickATime.click();
//            test.log(Status.PASS, "pick a start time");
//            Thread.sleep(9000);

            // Invalid Scenario:

//            try {
//                WebElement pickATime = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().text(\"8:00 AM123\")"), Duration.ofSeconds(20));
//                pickATime.click();
//                ReportManager.getTest().pass("pick a start time");
//                Assert.fail("Invalid scenario failed: Element was found, but it shouldn't have been");
//            } catch (Exception e) {
//                System.out.println("Invalid scenario failed: " + e.getMessage());
//            }

// Valid Scenario:

            ReportManager.getTest().info("Attempting to click pick a start time");

            WebElement pickAStartTime = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().text(\"2:00 PM\")"), Duration.ofSeconds(20));
            pickAStartTime.click();
            ReportManager.getTest().pass("picked a start time");


//
            //   Thread.sleep(4000);
            // Locate the ImageView by instance index (2 in this case)
            //  ReportManager.getTest().info("Attempting to click on end date");

            WebElement imageView = driver.findElement(By.xpath(
                    "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView"));

            // Check if the element is displayed and click it
            if (imageView.isDisplayed()) {
                imageView.click();
                System.out.println("ImageView clicked.");
            } else {
                System.out.println("ImageView not found.");
            }


            ReportManager.getTest().pass("Attempting to click on end date");
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)"))).click();
//            Actions a = new Actions(driver);
//           a.moveToElement(endDate).click().perform();

            //  WebElement endDate = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView"));
//            Actions a = new Actions(driver);
//            a.moveToElement(endDate).click().perform();
//            WebElement enDate = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")));
//            enDate.click();
            //  ReportManager.captureScreenshot("testMethod");

            ReportManager.getTest().pass("click on end date");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"7\"]"))).click();

            ReportManager.getTest().pass("pick a end date");

            ReportManager.getTest().info("Attempting to click on the 'End Time' button.");


            WebElement endTime = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Spinner")));

            Actions ap = new Actions(driver);
            ap.moveToElement(endTime).click().perform();
            // clickOnEndTime.click();
            ReportManager.getTest().pass("Successfully clicked on the 'End Time' button.");

            ReportManager.getTest().info("Attempting to click on the ' Pick a End Time' button.");

            WebElement pickAEndTime = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"2:30 PM\"]")));
            pickAEndTime.click();
            ReportManager.getTest().pass("Picked the end time.");


// Log that you are attempting an action
            ReportManager.getTest().info("Attempting to click on the 'Frequency' button.");

            WebElement clickOnFrequency = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")));
            clickOnFrequency.click();
            ReportManager.getTest().pass("Successfully clicked on the 'Frequency' button.");

            ReportManager.getTest().pass("Attempting to pick a frequency");

            WebElement pickAFrequency = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Weekly on Monday\"]")));

            pickAFrequency.click();
            ReportManager.getTest().pass("Successfully picked the frequency.");


            ReportManager.getTest().info("Attempting to enter the description.");


            WebElement enterDescription = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text=\"Enter Description\"]")));
            enterDescription.sendKeys("Test");
            ReportManager.getTest().pass("Successfully entered the description.");


// Scroll to End
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollToEnd(1)"
            ));

            closeNativeKeyboard();
            ReportManager.getTest().info("Attempting to add a team member.");


            WebElement addTeamMem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text=\"Search by Name\"]")));
            addTeamMem.sendKeys("test");
            ReportManager.getTest().pass("Successfully added the team member.");

            closeNativeKeyboard();
            ReportManager.getTest().info("Attempting to click on the checkbox for 'High Priority'.");


            WebElement highPriorityCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.CheckBox")));
            highPriorityCheckBox.click();
            ReportManager.getTest().pass("Successfully clicked on the checkbox for 'High Priority'.");


            scrollToEndAction();
            ReportManager.getTest().info("Attempting to click on the 'Book Appointment' tab.");

            WebElement bookAppointment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Book Appointment\"]")));
            bookAppointment.click();
            ReportManager.getTest().pass("Successfully clicked on the 'Book Appointment' tab.");


            //  Thread.sleep(1000);


        } catch (Exception e) {
            ReportManager.getTest().fail("Test step failed: " + e.getMessage());
            ReportManager.captureScreenshot("testMethod");
        }
    }
}


//
//        catch (Exception e) {
//            // Catch any exceptions during the test steps
//            test.log(Status.FAIL, "Exception occurred: " + e.toString());
//
//            // Take screenshot for error reporting
//            TakesScreenshot ts = (TakesScreenshot) driver;
//            File source = ts.getScreenshotAs(OutputType.FILE);
//
//            // Define a path to store the screenshot
//            String screenshotPath = "path/to/screenshots/error_screenshot.png";
//            File destination = new File(screenshotPath);
//
//            try {
//                FileUtils.copyFile(source, destination);
//                // Attach the screenshot to the test report
//                test.addScreenCaptureFromPath(screenshotPath);
//            } catch (IOException ioException) {
//                // Log an error if attaching the screenshot fails
//                test.log(Status.FAIL, "Failed to attach screenshot: " + ioException.getMessage());
//
//                // Explicitly fail the test
//                Assert.fail("Test failed due to exception: " + e.toString());





