package Tests;

import PageObjects.*;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumBy;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static java.time.Duration.ofSeconds;

public class ETLI extends BaseTest {

    @Test
    public void ETLIOnBoarding() throws InterruptedException, IOException {

        // Get the test object from BaseTest
        ExtentTest test = BaseTest.createTest("ETLIOnBoarding", "Successful- ETLIOnBoarding Till NAT tab");
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        newLeadPage = new NewLeadPage(driver);
        cdv_ProfilePage = new CDV_ProfilePage(driver);
        cdv_p50 = new CDV_P50(driver);
        cdv_nat = new CDV_NAT(driver);
        driver.manage().timeouts().implicitlyWait(ofSeconds(30));


        try {

            // Test steps
            Thread.sleep(12000);
            test.log(Status.PASS, "Application has successfully launched");

            loginPage.enterUserName();
            test.log(Status.PASS, "Entered username: A05317");

            loginPage.enterPassword();
            test.log(Status.PASS, "User has entered password: *****");

            loginPage.clickOnLoginButton();
            test.log(Status.PASS, "User has clicked login button");

            homePage.clickOnPlusButton();
            test.log(Status.PASS, "User has clicked on Plus button in Dashboard page");

            homePage.clickOnAddRecruitmentLead();
            test.log(Status.PASS, "User has clicked on Add a Recruitment lead in Dashboard page");

            newLeadPage.ClickOnTitle();
            test.log(Status.PASS, "New Lead page has opened - Clicked on the Title Field");

            newLeadPage.SelectTitle();
            test.log(Status.PASS, "Selected the Titile as Mr. in New Lead page");

            newLeadPage.EnterFirstName();
            test.log(Status.PASS, "Enterd the First Name in New Lead page");

            newLeadPage.EnterLastName();
            test.log(Status.PASS, "Entered the Last Name in New Lead page");

            newLeadPage.EnterEmailId();
            test.log(Status.PASS, "Entered the EmailId in New Lead page");

            newLeadPage.EnterMobileNumberAndClickSubmit();
            test.log(Status.PASS, "Entered the Mobile number in New Lead page");
            test.log(Status.PASS, "Clicked on Submit button in New Lead page");



//// Replace with the element's locating strategy (e.g., id, text)
//            String elementText = "new UiSelector().text(\"Marital Status\")";
//
//// Scroll using UiScrollable and scrollIntoView
//            try {
//                ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
//                        "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
//                                ".scrollIntoView(new UiSelector().text(\"" + elementText + "\").instance(0))"));
//            } catch (Exception e) {
//                System.out.println("Element not found using UiScrollable: " + e.getMessage());
//            }

//            driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Marital Status\"));"
//            ));


Thread.sleep(3000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Marital Status\"))"
            ));


            cdv_ProfilePage.SelectMeritalStatus();
            test.log(Status.PASS, "Candidate Detailed View Page has been opened");
            test.log(Status.PASS, "Selected the merital staus: Unmarried in CDV- Profile Tab");

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Date of Birth\"))"
            ));

            cdv_ProfilePage.SelectOccupation();
            test.log(Status.PASS, "Selected the Occupation as Private Sector in CDV-Profile Tab");

            cdv_ProfilePage.SelectEducation();
            test.log(Status.PASS, "Selected the Educational Qualification as: Graduate and Above in CDV-Profile Tab");

            cdv_ProfilePage.SelectDOB();
            test.log(Status.PASS, "Selected the DOB: 01/01/1994 in CDV-Profile Tab");

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Influencer\"))"
            ));

            cdv_ProfilePage.SelectIncome();
            test.log(Status.PASS, "Selected the Income as: Family Income less than 5lac in CDV-Profile Tab");

            cdv_ProfilePage.SelectConveyance();
            test.log(Status.PASS, "Selected the Conveyance as: owns a 2 wheeler in CDV-Profile Tab");

            cdv_ProfilePage.SelectSourcingPool();
            test.log(Status.PASS, "Selected the Sourcing pool: Financial consultant in CDV-Profile Tab");

            cdv_ProfilePage.SelectSalesExposure();
            test.log(Status.PASS, "Selected the Sales Exposure: No Exposure in CDV-Profile Tab");

            scrollToEndAction();

            cdv_ProfilePage.SelectInfluencer();
            test.log(Status.PASS, "Selected the Influencer: Relative social worker.... in CDV-Profile Tab");

            cdv_ProfilePage.ClickOnSaveChanges();
            test.log(Status.PASS, "Clicked on Save changes in CDV-Profile Tab");

            cdv_p50.ClickOnP50();
            test.log(Status.PASS, "Clicked on P50 tab in CDV-P50 Tab");

            cdv_p50.EnterP50Count();
            test.log(Status.PASS, "Entered the P50 count: 12 in CDV-P50 Tab");

            cdv_p50.ClickOnUpload();
            test.log(Status.PASS, "Clicked on upload button to upload the Image in CDV-P50 Tab");

            cdv_p50.UploadImage();
            test.log(Status.PASS, "Success - Uploded Image from Galleray in CDV-P50 Tab");

            cdv_p50.ClickOnUploadP50();
            test.log(Status.PASS, "Clicked on Upload P-50 in CDV-P50 Tab");

            cdv_nat.ClickOnNATtab();
            test.log(Status.PASS, "Clicked on NAT Tab");

            cdv_nat.ClickOnShareNAT();
            test.log(Status.PASS, "Clicked on Share NAT Button in NAT Tab! Now NAT link will be sent to the mentioned Email Address");


            driver.quit();

//            cdv_incomePlanning.ClickOnIncomePlanningTab();
//            test.log(Status.PASS, "Clicked on Income Planning Tab");
//
//            cdv_incomePlanning.EnterEarningIncome();
//            test.log(Status.PASS, "Entered Earning Income in Income Planning Tab");
//
//            cdv_incomePlanning.ClickOnQuarterly();
//            test.log(Status.PASS, "Selected Quarterly in Income Planning Tab");
//
//            cdv_incomePlanning.EnterAverageTicketSize();
//            test.log(Status.PASS, "Entered the Average ticket Size in Income Planning Tab");
//
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                            + ".scrollIntoView(new UiSelector().textMatches(\"Save\"))"
//            ));
//
//
//            cdv_incomePlanning.ClickOnSaveButton();
//            test.log(Status.PASS, "Clicked on the Save Button in Income Planning Tab");
//
//            cdv_careerInterview.ClickOnCareerInterviewTab();
//            test.log(Status.PASS, "Clicked on Career Interview Tab");
//
//            cdv_careerInterview.ClickOnInitiateCareerInterviewButton();
//            test.log(Status.PASS, "Clicked on Initiate Career Interview Button in Career Interview Tab");









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
