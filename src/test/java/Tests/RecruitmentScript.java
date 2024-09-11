package Tests;

import PageObjects.*;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.time.Duration.ofSeconds;

public class RecruitmentScript extends BaseTest {

    @Test
    public void AddRecruitmentLeadCreation() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(ofSeconds(30));
        // Get the test object from BaseTest
        ExtentTest test = BaseTest.createTest("Recruitment", "LeadCreation");
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        newLeadPage = new NewLeadPage(driver);
        cdv_ProfilePage = new CDV_ProfilePage(driver);
        cdv_p50 = new CDV_P50(driver);
        cdv_nat = new CDV_NAT(driver);
        recruitmentPage = new RecruitmentPage(driver);

        loginPage.enterUserName();
        loginPage.enterPassword();
        recruitmentPage.clickLoginButton();

        test.log(Status.PASS, "Application has successfully launched");
        homePage.clickOnThreeLines();
        homePage.clickOnRecruitment();
        recruitmentPage.clickOnPlusButton();
        recruitmentPage.clickOnAddRecruitmentLead();
        recruitmentPage.clickOnTitle();
        recruitmentPage.clickOnMr();
        recruitmentPage.enterFirstName();
        recruitmentPage.enterLastName();
        enter_email_address();
        enter_mobile_number();
        enter_pan_number();
        recruitmentPage.clickSubmitButton();
        recruitmentPage.enterMiddleName();
        recruitmentPage.selectMaritalStatus();
        recruitmentPage.selectOccupation();
        recruitmentPage.selectEducation();
        recruitmentPage.enterDateOfBirth();
        recruitmentPage.selectIncome();
        recruitmentPage.selectConveyance();
        recruitmentPage.selectSourcingPool();
        recruitmentPage.selectSalesExposure();
        recruitmentPage.selectInfluencer();
        recruitmentPage.saveChanges();
        recruitmentPage.interactWithP50();
        recruitmentPage.enterP50Count();
        recruitmentPage.clickUpload();
        recruitmentPage.clickOpenGallery();
        recruitmentPage.clickPhoto();
        recruitmentPage.clickUploadButton();
        recruitmentPage.clickNAT();
        recruitmentPage.clickShareNATButton();
        recruitmentPage.activateGmailApp();
        recruitmentPage.refreshGmail();
        recruitmentPage.clickOnFirstEmail();
        recruitmentPage.scrollToEnd();
        recruitmentPage.clickOnLink();
        recruitmentPage.clickShareButton();
        recruitmentPage.clickCopiedLink();
        recruitmentPage.activateChromeApp();
        recruitmentPage.refreshGmail();
        recruitmentPage.clickOnFirstEmail();
        recruitmentPage.scrollToEnd();
        recruitmentPage.clickOnLink();
        recruitmentPage.clickShareButton();
        recruitmentPage.clickCopiedLink();
        recruitmentPage.activateChromeApp();
        recruitmentPage.clickCopiedLinkinSearchField();
        recruitmentPage.clickSendOTPButton();
        recruitmentPage.activateGmailApp();







    }
}