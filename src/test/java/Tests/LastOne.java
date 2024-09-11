package Tests;

import com.aventstack.extentreports.App;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en_old.Ac;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.awt.dnd.Autoscroll;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class LastOne extends BaseTest {


    private static final Logger log = LoggerFactory.getLogger(AddRecruitmentLead.class);

    @Test()
    public void LastSceanrio() throws InterruptedException {
        ExtentTest test = BaseTest.createTest("recruitment flow", "Verify successful login");
        try {


            Thread.sleep(5000);
            test.log(Status.PASS, "Application has successfully launched");

            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")).sendKeys("A05317");
            test.log(Status.PASS, "Entered username: A05317");

            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]")).sendKeys("Tokio@123");
            test.log(Status.PASS, "User has entered password: *****");

            driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
            test.log(Status.PASS, "User clicked login button");


//            Thread.sleep(9000);
//
//            WebElement clickOnThreeLinesBtn = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
//            clickOnThreeLinesBtn.click();
//            test.log(Status.PASS, "User click on three lines");
//
//            Thread.sleep(5000);
//
//            WebElement clickOnRecruitment = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[10]/android.widget.ImageView"));
//            clickOnRecruitment.click();
//            test.log(Status.PASS, "click on recruitment");
//            Thread.sleep(3000);
//
//            WebElement onBoardingSummary = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Onboarding Summary \")"));
//            onBoardingSummary.click();
//Thread.sleep(1000);
//                        WebElement completeNowButton = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Complete Now \uD83D\uDC46\"]"));
//            completeNowButton.click();
//            Thread.sleep(5000);
//          //  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"KYC\")")).click();
//
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                            + ".scrollIntoView(new UiSelector().textMatches(\"Personal Details\"))"));
//            Thread.sleep(3000);
//            WebElement personalDetails = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Personal Details\")"));
//            Actions a = new Actions(driver);
//            a.moveToElement(personalDetails).click().perform();
//          //  personalDetails.click();
////            WebElement notificationIcon = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(12)"));
////            notificationIcon.click();
////            Thread.sleep(4000);
////            WebElement onBoardNowButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ONBOARD NOW\").instance(0)"));
////            onBoardNowButton.click();
////            Thread.sleep(2000);
//
//
////            WebElement yourRecruitments = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Your Recruitments \")"));
////            yourRecruitments.click();
//////
//////            WebElement reviewsComplete = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]"));
//////            reviewsComplete.click();
////            Thread.sleep(2000);
////            WebElement completeNowButton = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Complete Now \uD83D\uDC46\"]"));
////            completeNowButton.click();
////            Thread.sleep(2000);
            WebElement clickOnIncomePlan = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Income Planning\"]"));
            clickOnIncomePlan.click();
            Thread.sleep(3000);

            WebElement CIT = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Career Interview\")"));
            CIT.click();

            Thread.sleep(2000);
            WebElement intiateOnBoarding = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Initiate Onboarding\"]"));
            intiateOnBoarding.click();
            Thread.sleep(2000);
            WebElement IRDAIPANCheck = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"));
            IRDAIPANCheck.click();
            Thread.sleep(1000);
            WebElement InForce = driver.findElement(By.xpath("//android.widget.TextView[@text=\"In-Force\"]"));
            InForce.click();
            Thread.sleep(1000);
            WebElement nameofInsurer = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select\"]"));
            nameofInsurer.click();
            Thread.sleep(1000);
            WebElement chooseInsurer = driver.findElement(By.xpath("//android.widget.TextView[@text=\"ECGC Limited\"]"));
            chooseInsurer.click();
            Thread.sleep(1000);
            WebElement clickOnSubmitBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Submit\"]"));
            clickOnSubmitBtn.click();
            Thread.sleep(1000);
            WebElement clickOnCheckBox = driver.findElement(By.xpath("//android.widget.CheckBox"));
            clickOnCheckBox.click();
            Thread.sleep(1000);
            WebElement verifyBtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Verify\"])[2]"));
            verifyBtn.click();
            Thread.sleep(60000);
            System.out.println("Scroll one");
            scrollToEndAction();
            System.out.println("Scroll Two");
            Thread.sleep(4000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.TextView\").enabled(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Submit\"))"));

            Thread.sleep(6000);
            System.out.println("submit not clicking");
//            WebElement submit = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(17)"));
//            submit.click();
            WebElement againClickOnSubmitButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")"));
//Actions a = new Actions(driver);
//a.moveToElement(againClickOnSubmitButton).click().perform();
            againClickOnSubmitButton.click();
            System.out.println("submit  clicking");
            Thread.sleep(6000);


////            WebElement clickOnBoarding = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"OnBoarding\"])[2]"));
////            clickOnBoarding.click();
////            Thread.sleep(3000);
            WebElement enterKINnum = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText[2]"));
            enterKINnum.sendKeys("67898789989897");
            closeNativeKeyboard();
            Thread.sleep(1000);
            WebElement clickOnVerifyBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Verify\"]"));
            clickOnVerifyBtn.click();
            Thread.sleep(8000);

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Father's First Name\"))"));
            Thread.sleep(4000);
            WebElement FatherTitle = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));
            FatherTitle.click();
            Thread.sleep(2000);
            WebElement Mister = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Mr.\"]"));
            Mister.click();
            Thread.sleep(2000);
            WebElement fatherFirstName = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Father's First Name\"]"));
            fatherFirstName.sendKeys("R");
            Thread.sleep(2000);
            WebElement fatherMiddleName = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Father's Middle Name\"]"));
            fatherMiddleName.sendKeys("A");
            Thread.sleep(2000);

            WebElement fatherLastName = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Father's Last Name\"]"));
            fatherLastName.sendKeys("SH");
            Thread.sleep(1000);

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Aadhar Card Number\"))"));
            Thread.sleep(4000);

            WebElement AadharNum = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Aadhar Card Number\"]"));
            AadharNum.sendKeys("890990899910");
            Thread.sleep(2000);
            WebElement currentHouseNum = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Current House Number\"]"));
            currentHouseNum.sendKeys("1-9");
            Thread.sleep(2000);
            closeNativeKeyboard();
            WebElement currentStreet = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Current Street\"]"));
            currentStreet.sendKeys("PB colony");
            closeNativeKeyboard();
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Current Town\"))"));

            Thread.sleep(4000);
            WebElement currentTown = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Current Town\"]"));
            currentTown.sendKeys("HYD");
            closeNativeKeyboard();
            Thread.sleep(5000);

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Current Pincode\"))"));
            Thread.sleep(6000);
// Get the current pincode element and enter the text
            WebElement currentPincode = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Current Pincode\"]"));

            currentPincode.sendKeys("500038");

// Get the text element that contains the entered pincode
            WebElement pincodeText = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"500038\"])[1]"));

// Click on the text element
            pincodeText.click();


            WebElement currentDistrict = driver.findElement(By.xpath("//android.widget.Spinner"));
            currentDistrict.click();
            Thread.sleep(3000);
            WebElement ameerpet = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"AMEERPET\"]"));
            ameerpet.click();
            Thread.sleep(2000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().text(\"Submit\"))"));
            Thread.sleep(2000);


            WebElement submitBUTTON = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Submit\"]"));
            Actions acti = new Actions(driver);
            acti.moveToElement(submitBUTTON).click().perform();
            Thread.sleep(5000);

// Personal Details
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                            + ".scrollIntoView(new UiSelector().textMatches(\"Category\"))"));
//
            Thread.sleep(20000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().text(\"Area\"))"));
            Thread.sleep(1000);
            WebElement category = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Spinner\").instance(0)"));
            category.click();
            test.log(Status.PASS, " category");
            Thread.sleep(1000);
            WebElement chooseCategory = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"OBC\"]"));
            chooseCategory.click();
            test.log(Status.PASS, "choose category");
            Thread.sleep(3000);
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                            + ".scrollIntoView(new UiSelector().text(\"Occupation\"))"));
            WebElement area = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Spinner\").instance(1)"));
            area.click();
            WebElement chooseArea = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Rural\")"));
            chooseArea.click();
            Thread.sleep(3000);

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().text(\"Other Qualification\"))"));

            Thread.sleep(3000);
            WebElement otherQualification = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter Other Qualification\")"));
            otherQualification.sendKeys("Btech");
            closeNativeKeyboard();

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollToEnd(1)"
            ));
            Thread.sleep(2000);
            WebElement saveAndNextBtn = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup"));
            saveAndNextBtn.click();

            // Educational details;
            Thread.sleep(30000);
//            WebElement educationalDetails = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Educational Details\")"));
//            educationalDetails.click();
            Thread.sleep(3000);
            WebElement basicQualification = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));
            basicQualification.click();
            test.log(Status.PASS, "basic Qualificatio");
            WebElement ssc = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Class XII\"]"));
            ssc.click();
            Thread.sleep(3000);

            WebElement boardName = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Board Name\"]"));
            boardName.sendKeys("SBTET");
            closeNativeKeyboard();
            Thread.sleep(1000);
            WebElement rollNum = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Roll number\"]"));
            rollNum.sendKeys("1232118355");
            Thread.sleep(2000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollToEnd(1)"
            ));
            Thread.sleep(3000);
            WebElement selectDate = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Select Date\"]"));
            selectDate.click();
            Thread.sleep(3000);
            WebElement fourteen = driver.findElement(By.xpath("//android.widget.TextView[@text=\"2024\"]"));
            fourteen.click();
            driver.findElement(By.xpath("//android.widget.TextView[@text=\"2012\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//android.widget.TextView[@text=\"5\"]")).click();

//
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                            + ".scrollIntoView(new UiSelector().textMatches(\"Highest qualification \"))"));

            Thread.sleep(1000);
            WebElement highestQualification = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView"));
            highestQualification.click();


            WebElement chooseQualification = driver.findElement(By.xpath("//android.widget.TextView[@text=\"POST GRADUATE\"]"));
            chooseQualification.click();


            WebElement saveAndNxtButton = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup"));
            saveAndNxtButton.click();
            Thread.sleep(3000);


        } catch (Exception e) {
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

                // Explicitly fail the test
                Assert.fail("Test failed due to exception: " + e.toString());


            }
        }
    }
}