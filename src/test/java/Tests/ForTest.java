package Tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import javax.mail.MessagingException;
import java.awt.*;
import java.io.IOException;

import static java.time.Duration.ofSeconds;

public class ForTest extends BaseTest{

    private static final Logger log = LoggerFactory.getLogger(AddRecruitmentLead.class);

    @Test
    public void Branch_HeadTest() throws InterruptedException, IOException, AWTException, MessagingException {
        ExtentTest test = BaseTest.createTest("add recruitment lead flow", "Verify successful login");
        try {
            WebDriverWait wait = new WebDriverWait(driver, ofSeconds(90)); // 30 seconds timeout

            ReportManager.setDriver(driver);
            ReportManager.createTest("Add recruitment lead creation scenario");
//            ReportManager.getTest().pass("Test step passed.");
            test.log(Status.PASS, "Application has successfully launched");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]"))).sendKeys("A05318");
        ReportManager.getTest().pass("Entered username: A05318");

        // Enter password
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]"))).sendKeys("Tokio@123");
        ReportManager.getTest().pass("User has entered password: *****");


        //    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]")).click();
        // Click login button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Login\"]"))).click();
        ReportManager.getTest().pass("User clicked  Branch Head login button");

//            driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();

//
//            Thread.sleep(9000);
        ReportManager.getTest().info("Attempting to click on three lines");
        WebElement clickOnThreeLinesinBH = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")));
        clickOnThreeLinesinBH.click();
        ReportManager.getTest().pass("Successfully clicked on the three lines icon");
        ReportManager.getTest().info("Attempting to click on Recruitment tab");
        WebElement clickOnRecruitmentTabinBH = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Recruitment\"])[1]"));
        clickOnRecruitmentTabinBH.click();
        ReportManager.getTest().pass("Successfully clicked on the Recruitment tab");


        ReportManager.getTest().info("Attempting to click on Career Interview Pending tab");

        WebElement CareerInterviewPending = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Career Interview Pending\"]")));
        CareerInterviewPending.click();

        ReportManager.getTest().pass("Successfully clicked on the Career Interview Pending tab");

        ReportManager.getTest().info("Attempting to click on the Complete Now button");

        WebElement CompleteNowBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Complete Now \uD83D\uDC46\"]")));
        CompleteNowBtn.click();

        ReportManager.getTest().pass("Successfully clicked on the Complete Now button");


        ReportManager.getTest().info("Attempting to click on the Income Planning tab");

        WebElement clickOnIncomePlannin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Income Planning\"]")));
        clickOnIncomePlannin.click();

        ReportManager.getTest().pass("Successfully clicked on the Income Planning tab");

        ReportManager.getTest().info("Attempting to click on the PAN Verification tab");

        WebElement panVerificationinBH = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"PAN Verification\"]")));
        panVerificationinBH.click();

        ReportManager.getTest().pass("Successfully clicked on the PAN Verification tab");


        ReportManager.getTest().info("Attempting to click on the Career Interview tab");

        WebElement CIT = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Career Interview\")")));
        CIT.click();

        ReportManager.getTest().pass("Successfully clicked on the Career Interview tab");

//
//            WebElement CareerInterviewTab = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Career Interview\"])[2]"));
//            CareerInterviewTab.click();

// here index value start from 5
        ReportManager.getTest().info("Attempting to enter text '1' into the first answer field");

        WebElement q1 = waitForElementVisibility(By.xpath("(//android.widget.EditText[@text=\"Enter the answer\"])[1]"), ofSeconds(20));
        q1.sendKeys("1");

        ReportManager.getTest().pass("Successfully entered text '1' into the first answer field");

        //  Thread.sleep(2000);
        WebElement q2 = waitForElementVisibility(By.xpath("(//android.widget.EditText[@text=\"Enter the answer\"])[1]"), ofSeconds(20));
        q2.sendKeys("2");
            ReportManager.getTest().pass("Successfully entered text '2' into the second answer field");
//        Thread.sleep(1000);


            waitForElementVisibility(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollToEnd(1)"
            ), ofSeconds(20));


        WebElement q3 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter the answer\")")));
        q3.sendKeys("3");
//        Thread.sleep(2000);


        // Scroll until the text is visible
        WebDriverWait wait3 = new WebDriverWait(driver, ofSeconds(10));
        WebElement element1 = wait3.until(ExpectedConditions.presenceOfElementLocated(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().text(\"Q4) What would be your achievement in the next 30 days, which will make you happy on your today’s decision of joining Edelweiss Life as a PFA? a. Your Earning in Rs. b. Launch Club Recognition *\"))")));

// Click on the element (if needed)
        element1.click();

// Find the input field and enter text
        WebElement q4 = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter the answer\").instance(0)"), ofSeconds(20));
        q4.sendKeys("4");


        //  Thread.sleep(3000);
        WebElement q5 = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter the answer\").instance(0)"), ofSeconds(20));
        q5.sendKeys("5");
        //Thread.sleep(4000);

            waitForElementVisibility(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollToEnd(1)"
            ), ofSeconds(20));

        WebElement q6 = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter the answer\")"), ofSeconds(20));

        q6.sendKeys("6");
//        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Submit\"))"
        ));

        WebElement q7 = waitForElementVisibility(By.xpath("(//android.widget.EditText[@text=\"Enter the answer\"])[1]"), ofSeconds(20));
        q7.sendKeys("7");
//        Thread.sleep(1000);

        WebElement q8 = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter the answer\"]"), ofSeconds(20));
        q8.sendKeys("8");
//        Thread.sleep(1000);

        ReportManager.getTest().pass("All Ans are entered");

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Submit\"))"));


        ReportManager.getTest().info("Attempting to click on the Submit button");

        WebElement submitButn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Submit\"]"));
        submitButn.click();

        ReportManager.getTest().pass("Successfully clicked on the Submit button");



//        Thread.sleep(1000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Approve\"))"));

        //    Thread.sleep(2000);
        ReportManager.getTest().info("Attempting to click on the Approve button");

        WebElement ApproveBtn = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Approve\"]"), ofSeconds(20));
        Actions act1 = new Actions(driver);
        act1.moveToElement(ApproveBtn).click().perform();

        ReportManager.getTest().pass("Successfully clicked on the Approve button");

        //   Thread.sleep(2000);
        ReportManager.getTest().info("Attempting to enter 'No Remarks' into the Remarks field");

        WebElement Remarks = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter Remarks\"]"), ofSeconds(20));
        Remarks.sendKeys("No Remarks");

        ReportManager.getTest().pass("Successfully entered 'No Remarks' into the Remarks field");

//            closeNativeKeyboard();
        //Thread.sleep(2000);
        ReportManager.getTest().info("Attempting to click on the Approve button");

        WebElement Approve = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Approve\"]"), ofSeconds(20));
        Approve.click();

        ReportManager.getTest().pass("Successfully clicked on the Approve button");

        //  Thread.sleep(2000);

        WebElement CDVBackBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")));
        CDVBackBtn.click();
        //  Thread.sleep(2000);
        WebElement MYRBackBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")));
        MYRBackBtn.click();
        //  Thread.sleep(2000);
        WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView")));
        profileIcon.click();
        // Thread.sleep(2000);
        WebElement LogoutBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Log Out\"]")));
        LogoutBtn.click();
         Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]"))).sendKeys("A05317");
        test.log(Status.PASS, "Entered username: A05317");

        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]")).sendKeys("Tokio@123");
        test.log(Status.PASS, "User has entered password: *****");

            driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
        test.log(Status.PASS, "User clicked login button");


//        Thread.sleep(9000);

        WebElement clickOnThreeLinesBtn = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"), ofSeconds(20));
        clickOnThreeLinesBtn.click();
        test.log(Status.PASS, "User click on three lines");

        // Thread.sleep(5000);

        WebElement clickOnRecruitment = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[10]/android.widget.ImageView"), ofSeconds(20));
        clickOnRecruitment.click();
        test.log(Status.PASS, "click on recruitment");
        // Thread.sleep(2000);
        WebElement reviewsComplete = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]"), ofSeconds(20));
        reviewsComplete.click();
        // Thread.sleep(2000);
        WebElement completeNowButton = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Complete Now \uD83D\uDC46\"]"), ofSeconds(20));
        completeNowButton.click();

        WebElement clickOnIncomePlan = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Income Planning\"]"), ofSeconds(20));
        clickOnIncomePlan.click();
        //Thread.sleep(3000);



        WebElement careerInterviewTabInMyUser = waitForElementVisibility(By.xpath("(//android.widget.TextView[@text=\"Career Interview\"])[2]"), ofSeconds(20));
        careerInterviewTabInMyUser.click();
        // Thread.sleep(2000);
        WebElement intiateOnBoarding = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Initiate Onboarding\"]"), ofSeconds(20));
        intiateOnBoarding.click();

//            WebElement IRDAIPANCheck = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"), ofSeconds(20));
//            IRDAIPANCheck.click();
//            Thread.sleep(1000);
//            WebElement InForce = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"In-Force\"]"), ofSeconds(20));
//            InForce.click();
//            Thread.sleep(1000);
//            WebElement nameofInsurer = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Select\"]"), ofSeconds(20));
//            nameofInsurer.click();
//            Thread.sleep(1000);
//            WebElement chooseInsurer = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"ECGC Limited\"]"), ofSeconds(20));
//            chooseInsurer.click();
//            Thread.sleep(1000);
//            WebElement clickOnSubmitBtn = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Submit\"]"), ofSeconds(20));
//            clickOnSubmitBtn.click();
//            Thread.sleep(1000);
//            WebElement clickOnCheckBox = waitForElementVisibility(By.xpath("//android.widget.CheckBox"), ofSeconds(20));
//            clickOnCheckBox.click();
//            Thread.sleep(60000);
//            WebElement verifyBtn = waitForElementVisibility(By.xpath("(//android.widget.TextView[@text=\"Verify\"])[2]"), ofSeconds(20));
//            verifyBtn.click();
//            WebElement againClickOnSubmitButton = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Submit\"]"), ofSeconds(20));
//            againClickOnSubmitButton.click();
        Thread.sleep(6000);
        WebElement clickOnBoarding = waitForElementVisibility(By.xpath("(//android.widget.TextView[@text=\"OnBoarding\"])[2]"), ofSeconds(20));
        clickOnBoarding.click();
        Thread.sleep(3000);
        WebElement enterKINnum = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText[2]"), ofSeconds(20));
        enterKINnum.sendKeys("67898789989897");
        closeNativeKeyboard();
        Thread.sleep(3000);
        WebElement clickOnVerifyBtn = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Verify\"]"), ofSeconds(20));
        clickOnVerifyBtn.click();
        Thread.sleep(3000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Father's Title\"))"));
        Thread.sleep(4000);
        WebElement FatherTitle = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"), ofSeconds(20));
        FatherTitle.click();
        Thread.sleep(2000);
        WebElement Mister = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Mr.\"]"), ofSeconds(20));
        Mister.click();
        // Thread.sleep(2000);
        WebElement fatherFirstName = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Father's First Name\"]"), ofSeconds(20));
        fatherFirstName.sendKeys("R");
        Thread.sleep(2000);
        WebElement fatherMiddleName = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Father's Middle Name\"]"), ofSeconds(20));
        fatherMiddleName.sendKeys("A");
        Thread.sleep(2000);

        WebElement fatherLastName = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Father's Last Name\"]"), ofSeconds(20));
        fatherLastName.sendKeys("SH");
        Thread.sleep(1000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Aadhar Card Number\"))"));
        Thread.sleep(4000);

        WebElement AadharNum = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Aadhar Card Number\"]"), ofSeconds(20));
        AadharNum.sendKeys("890990899910");
        //  Thread.sleep(2000);
        WebElement currentHouseNum = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Current House Number\"]"), ofSeconds(20));
        currentHouseNum.sendKeys("1-9");
        Thread.sleep(2000);
        closeNativeKeyboard();
        WebElement currentStreet = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Current Street\"]"), ofSeconds(20));
        currentStreet.sendKeys("PB colony");
        closeNativeKeyboard();
        WebElement currentTown = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Current Town\"]"));
        currentTown.sendKeys("HYD");
        closeNativeKeyboard();
//            WebElement currentPincode = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Current Pincode\"]"));
//            currentPincode.sendKeys("500038");
        Thread.sleep(6000);
// Get the current pincode element and enter the text
        WebElement currentPincode = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter Current Pincode\"]"), ofSeconds(20));

        currentPincode.sendKeys("500038");

// Get the text element that contains the entered pincode
        WebElement pincodeText = waitForElementVisibility(By.xpath("//android.widget.TextView[contains(text(), '500038')]"), ofSeconds(20));

// Click on the text element
        pincodeText.click();


        WebElement currentDistrict = waitForElementVisibility(By.xpath("//android.widget.Spinner"), ofSeconds(20));
        currentDistrict.click();
        Thread.sleep(3000);
        WebElement ameerpet = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"AMEERPET\"]"), ofSeconds(20));
        ameerpet.click();
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Current Country\"))"));
        Thread.sleep(2000);


        WebElement submitBUTTON = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Submit\"]"), ofSeconds(20));
        Actions acti = new Actions(driver);
        acti.moveToElement(submitBUTTON).click().perform();
        Thread.sleep(5000);

// Personal Details
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Category\"))"));

        Thread.sleep(3000);
        WebElement category = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.Spinner"), ofSeconds(20));
        category.click();
        WebElement chooseCategory = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"OBC\"]"), ofSeconds(20));
        chooseCategory.click();
        Thread.sleep(3000);
        WebElement area = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.Spinner"), ofSeconds(20));
        area.click();
        WebElement chooseArea = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Urban\"]"), ofSeconds(20));
        chooseArea.click();
        Thread.sleep(3000);


        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Other Qualification\"))"));
        Thread.sleep(3000);
        WebElement otherQualification = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter Other Qualification\"]"), ofSeconds(20));
        otherQualification.sendKeys("Btech");
        closeNativeKeyboard();
        WebElement saveAndNextBtn = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Save and Next\"]"), ofSeconds(20));
        saveAndNextBtn.click();
        // Educational details

        WebElement basicQualification = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"));
        basicQualification.click();
        WebElement ssc = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Class X\"]"));
        ssc.click();
        Thread.sleep(3000);

        WebElement boardName = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Board Name\"]"));
        boardName.sendKeys("SBTET");
        closeNativeKeyboard();
        Thread.sleep(1000);
        WebElement rollNum = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Roll number\"]"));
        rollNum.sendKeys("1232118355");

        closeNativeKeyboard();


        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Highest qualification \"))"));

        Thread.sleep(1000);
        WebElement highestQualification = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView"));
        highestQualification.click();


        WebElement panVerification = driver.findElement(By.xpath("//android.widget.TextView[@text=\"PAN Verification\"]"));
        panVerification.click();
        Thread.sleep(5000);
        WebElement onBoarding = driver.findElement(By.xpath("//android.widget.TextView[@text=\"OnBoarding\"]"));
        onBoarding.click();
        Thread.sleep(5000);
        WebElement history = driver.findElement(By.xpath("//android.widget.TextView[@text=\"History\"]"));
        history.click();
        Thread.sleep(4000);
        // Find the TextView element by XPath
        WebElement textView = driver.findElement(By.xpath("//android.widget.TextView[@text='New Recruitment Created']"));

        // Verify if the text is displayed
        if (textView.isDisplayed()) {
            System.out.println("Text 'New Recruitment Created' is displayed.");
        } else {
            System.out.println("Text 'New Recruitment Created' is not displayed.");
        }


//        } catch (Exception e) {
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
//

//            }

    } catch (Exception e) {
        ReportManager.getTest().fail("Test step failed: " + e.getMessage());
        ReportManager.captureScreenshot("testMethod");
    }
}
}


