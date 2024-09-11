package Tests;

import PageObjects.*;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumBy;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class ETLI2 extends BaseTest {

    @Test
    public void ETLIOnBoardingContinution() throws InterruptedException, IOException {

        // Get the test object from BaseTest
        ExtentTest test = BaseTest.createTest("ETLIOnBoardingContinution", "Successful- ETLIOnBoardingContinution From NAT tab");
        loginPage = new LoginPage(driver);
        cdv_incomePlanning = new CDV_IncomePlanning(driver);
        cdv_careerInterview = new CDV_CareerInterview(driver);
        homePage = new HomePage(driver);
        profilePage = new ProfilePage(driver);
        dashBoardPage = new DashBoardPage(driver);
        cdv_nat = new CDV_NAT(driver);

        driver.manage().timeouts().implicitlyWait(ofSeconds(30));


        try {


            // Test steps
            Thread.sleep(9000);
            test.log(Status.PASS, "Application has successfully launched");

            loginPage.enterUserName();
            test.log(Status.PASS, "Entered username: A05317");

            loginPage.enterPassword();
            test.log(Status.PASS, "User has entered password: *****");

            loginPage.clickOnLoginButton();
            test.log(Status.PASS, "User has clicked login button");

            homePage.clickOnThreeLines();
            test.log(Status.PASS, "Clicked on Top Menu Lined");

            profilePage.ClickOnRecruitment();
            test.log(Status.PASS, "Clicked on Recruitment");

            dashBoardPage.ClickOnReviewsOnGoing();
            test.log(Status.PASS, "Clicked On Reviews OnGoing");

            dashBoardPage.ClickOnCompleteNowButton();
            test.log(Status.PASS, "Clicked On Complete Now Button");

            cdv_nat.ClickOnNATtab();
            test.log(Status.PASS, "Clicked on NAT Tab");

            cdv_incomePlanning.ClickOnIncomePlanningTab();
            test.log(Status.PASS, "Clicked on Income Planning Tab");

            cdv_incomePlanning.EnterEarningIncome();
            test.log(Status.PASS, "Entered Earning Income in Income Planning Tab");

            cdv_incomePlanning.ClickOnQuarterly();
            test.log(Status.PASS, "Selected Quarterly in Income Planning Tab");

            cdv_incomePlanning.EnterAverageTicketSize();
            test.log(Status.PASS, "Entered the Average ticket Size in Income Planning Tab");

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Save\"))"
            ));


            cdv_incomePlanning.ClickOnSaveButton();
            test.log(Status.PASS, "Clicked on the Save Button in Income Planning Tab");

            cdv_careerInterview.ClickOnCareerInterviewTab();
            test.log(Status.PASS, "Clicked on Career Interview Tab");

            cdv_careerInterview.ClickOnInitiateCareerInterviewButton();
            test.log(Status.PASS, "Clicked on Initiate Career Interview Button in Career Interview Tab");



///////////////////// my code

            WebElement CandiateDetailViewArrowBtn = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
            CandiateDetailViewArrowBtn.click();
            test.log(Status.PASS,"candiate detail view arrow button");

            Thread.sleep(1000);

            WebElement MYRBackButton = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
            MYRBackButton.click();
            test.log(Status.PASS,"my reviews  arrow button");

            WebElement clickOnProfileIcon = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[4]"));
            clickOnProfileIcon.click();
            test.log(Status.PASS,"clicked on profile icon");
            Thread.sleep(1000);

            WebElement LogOut = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Log Out\"]"));
            LogOut.click();
            test.log(Status.PASS,"clicked on logout button");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")).sendKeys("A05318");
            test.log(Status.PASS, "Entered username: A05318");

            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]")).sendKeys("Tokio@123");
            test.log(Status.PASS, "User has entered password: *****");

            driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
            test.log(Status.PASS, "User clicked login button");

            WebElement ClickOnThreeLines = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
            ClickOnThreeLines.click();
            test.log(Status.PASS,"click on three lines");
            Thread.sleep(2000);

            WebElement ClickOnRecruitment = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[10]/android.widget.ImageView"));
            ClickOnRecruitment.click();
            test.log(Status.PASS,"click on recruitment");

            Thread.sleep(2000);

            WebElement CareerInterviewPending = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Career Interview Pending\"]"));
            CareerInterviewPending.click();
            test.log(Status.PASS,"click on career interview pending");

            Thread.sleep(6000);
            WebElement CompleteNowBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Complete Now \uD83D\uDC46\"]"));
            CompleteNowBtn.click();
            test.log(Status.PASS,"click on complete now button");
            Thread.sleep(6000);
            WebElement clickOnIncomePlanning = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Income Planning\"]"));
            clickOnIncomePlanning.click();
            test.log(Status.PASS,"click on income planning");
            Thread.sleep(6000);
            WebElement CIT = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Career Interview\")"));
            CIT.click();
            test.log(Status.PASS,"click on career interview tab");
            Thread.sleep(6000);
// here index value start from 5
            WebElement q1 = driver.findElement(By.xpath("(//android.widget.EditText[@text=\"Enter the answer\"])[1]"));
            q1.sendKeys("1");
            test.log(Status.PASS,"Enter question num 1");
            Thread.sleep(2000);
            WebElement q2 = driver.findElement(By.xpath("(//android.widget.EditText[@text=\"Enter the answer\"])[1]"));
            q2.sendKeys("2");
            test.log(Status.PASS,"Enter question num 2");
            Thread.sleep(2000);
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                            + ".scrollIntoView(new UiSelector().textMatches(\"Q5) Please confirm if you shall undertake the (mandatory) 3-day training with your BDP.*\"))"));
            Thread.sleep(1000);
            WebElement q3 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter the answer\")"));
            q3.sendKeys("3");
            test.log(Status.PASS,"Enter question num 3");
            Thread.sleep(2000);


            // Scroll until the text is visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().text(\"Q4) What would be your achievement in the next 30 days, which will make you happy on your today’s decision of joining Edelweiss Life as a PFA? a. Your Earning in Rs. b. Launch Club Recognition *\"))")));

// Click on the element (if needed)
            element1.click();

// Find the input field and enter text
            WebElement q4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter the answer\").instance(0)"));
            q4.sendKeys("4");
            test.log(Status.PASS,"Enter question num 4");


            Thread.sleep(3000);
            WebElement q5 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter the answer\").instance(0)"));
            q5.sendKeys("5");
            test.log(Status.PASS,"Enter question num 5");
            Thread.sleep(4000);


            WebElement q6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Enter the answer\")"));

            q6.sendKeys("6");
            test.log(Status.PASS,"Enter question num 6");
            Thread.sleep(5000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Submit\"))"
            ));

            WebElement q7 = driver.findElement(By.xpath("(//android.widget.EditText[@text=\"Enter the answer\"])[1]"));
            q7.sendKeys("7");
            test.log(Status.PASS,"Enter question num 7");
            Thread.sleep(1000);

            WebElement q8 = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter the answer\"]"));
            q8.sendKeys("8");
            test.log(Status.PASS,"Enter question num 8");
            Thread.sleep(1000);

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Submit\"))"));
            WebElement submitBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Submit\"]"));
            submitBtn.click();
            test.log(Status.PASS,"click on submit button");


            Thread.sleep(1000);

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Approve\"))"));

            Thread.sleep(2000);
            WebElement ApproveBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Approve\"]"));
            Actions act = new Actions(driver);
            act.moveToElement(ApproveBtn).click().perform();
            test.log(Status.PASS,"Click on Approve Button");
            Thread.sleep(2000);
            WebElement Remarks = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Remarks\"]"));
            Remarks.sendKeys("No Remarks");
            test.log(Status.PASS,"Enter Remarks");
            closeNativeKeyboard();
            Thread.sleep(2000);
            WebElement Approve = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Approve\"]"));
            Approve.click();
            test.log(Status.PASS,"Click on Approve Button again");
            Thread.sleep(2000);

            WebElement CDVBackBtn = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
            CDVBackBtn.click();
            test.log(Status.PASS,"Candiate Detail view back button");
            Thread.sleep(2000);
            WebElement MYRBackBtn = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
            MYRBackBtn.click();
            test.log(Status.PASS,"My Recruitment Back button");
            Thread.sleep(2000);
            WebElement profileIcon = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView"));
            profileIcon.click();
            test.log(Status.PASS,"click on profile icon");
            Thread.sleep(2000);
            WebElement LogoutBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Log Out\"]"));
            LogoutBtn.click();
            test.log(Status.PASS,"click on LogOut Button");
            Thread.sleep(6000);
            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")).sendKeys("A05317");
            test.log(Status.PASS, "Entered username: A05317");

            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]")).sendKeys("Tokio@123");
            test.log(Status.PASS, "User has entered password: *****");

            driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
            test.log(Status.PASS, "User clicked login button");


            Thread.sleep(9000);

            WebElement clickOnThreeLinesBtn = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
            clickOnThreeLinesBtn.click();
            test.log(Status.PASS, "User click on three lines");

            Thread.sleep(5000);

            WebElement clickOnRecruitment = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[10]/android.widget.ImageView"));
            clickOnRecruitment.click();
            test.log(Status.PASS, "click on recruitment");
            Thread.sleep(2000);

            WebElement yourRecruitments = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Your Recruitments \")"));
            yourRecruitments.click();
            test.log(Status.PASS,"Your Recruitmnets");

//            WebElement reviewsComplete = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]"));
//            reviewsComplete.click();
            Thread.sleep(2000);
            WebElement completeNowButton = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Complete Now \uD83D\uDC46\"]"));
            completeNowButton.click();
            test.log(Status.PASS,"Complete Now Button");


            WebElement IncomePlanningTab = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Income Planning\"]"));
            IncomePlanningTab.click();
            test.log(Status.PASS,"income paln tab");
            Thread.sleep(5000);

            WebElement clickOnIncomePlan = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Income Planning\"]"));
            clickOnIncomePlan.click();
            test.log(Status.PASS,"click on income plan");

            Thread.sleep(5000);

            WebElement CareerInterviewTab = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Career Interview\")"));
            CareerInterviewTab.click();
            test.log(Status.PASS,"career interview tab");

            Thread.sleep(2000);
            WebElement intiateOnBoarding = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Initiate Onboarding\"]"));
            intiateOnBoarding.click();
            test.log(Status.PASS,"Intiate OnBoarding");
            Thread.sleep(2000);
            WebElement IRDAIPANCheck = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"));
            IRDAIPANCheck.click();
            test.log(Status.PASS,"IRDAI  Pan check");
            Thread.sleep(1000);
            WebElement InForce = driver.findElement(By.xpath("//android.widget.TextView[@text=\"In-Force\"]"));
            InForce.click();
            test.log(Status.PASS,"InForce");
            Thread.sleep(1000);
            WebElement nameofInsurer = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select\"]"));
            nameofInsurer.click();
            test.log(Status.PASS,"Name of INsurer");
            Thread.sleep(1000);
            WebElement chooseInsurer = driver.findElement(By.xpath("//android.widget.TextView[@text=\"ECGC Limited\"]"));
            chooseInsurer.click();
            test.log(Status.PASS,"Choose insurer");
            Thread.sleep(1000);
            WebElement clickOnSubmitBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Submit\"]"));
            clickOnSubmitBtn.click();
            test.log(Status.PASS,"Click on Submit Button");
            Thread.sleep(1000);
            WebElement clickOnCheckBox = driver.findElement(By.xpath("//android.widget.CheckBox"));
            clickOnCheckBox.click();
            test.log(Status.PASS,"Click on checkBox");
            Thread.sleep(1000);
            WebElement verifyBtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Verify\"])[2]"));
            verifyBtn.click();
            test.log(Status.PASS,"Verify button");
            Thread.sleep(90000);
            System.out.println("Scroll one");
            scrollToEndAction();
            System.out.println("Scroll Two");
            Thread.sleep(4000);
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().className(\"android.widget.TextView\").enabled(true))"
//                            + ".scrollIntoView(new UiSelector().textMatches(\"Submit\"))"));
   // Scroll to end


            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollToEnd(1)"
            ));

            Thread.sleep(4000);
            System.out.println("submit not clicking");

            WebElement againClickOnSubmitButton =  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Submit\")"));

            againClickOnSubmitButton.click();
            test.log(Status.PASS,"again click on submit button");
            System.out.println("submit  clicking");
            Thread.sleep(6000);


////            WebElement clickOnBoarding = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"OnBoarding\"])[2]"));
////            clickOnBoarding.click();
////            Thread.sleep(3000);
            WebElement enterKINnum = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText[2]"));
            enterKINnum.sendKeys("67898789989897");
            test.log(Status.PASS,"Enter KIN number");
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
            test.log(Status.PASS," category");
            Thread.sleep(1000);
            WebElement chooseCategory = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"OBC\"]"));
            chooseCategory.click();
            test.log(Status.PASS,"choose category");
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
            }

            // Explicitly fail the test
            org.testng.Assert.fail("Test failed due to exception: " + e.toString());
        }
    }
}
