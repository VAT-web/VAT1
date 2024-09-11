package Tests;

import PageObjects.*;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.time.Duration.ofSeconds;

public class LoginScript extends BaseTest {

    @Test()
    public void LoginApplication() throws InterruptedException, IOException {

        // Get the test object from BaseTest
        ExtentTest test = BaseTest.createTest("MyZindagi", "Succesfully launched the application");
//        loginPage = new LoginPage(driver);
//        cdv_incomePlanning = new CDV_IncomePlanning(driver);
//        cdv_careerInterview = new CDV_CareerInterview(driver);
//        homePage = new HomePage(driver);
//        dashBoardPage = new DashBoardPage(driver);
//        profilePage = new ProfilePage(driver);/*/*/
//        cdv_nat = new CDV_NAT(driver);

        driver.manage().timeouts().implicitlyWait(ofSeconds(30));




            // Test steps
            Thread.sleep(9000);
            test.log(Status.PASS, "Application has successfully launched");

            loginPage.enterUserName();
            test.log(Status.PASS, "Entered username: A05317");

            loginPage.enterPassword();
            test.log(Status.PASS, "User has entered password: *****");

            loginPage.clickOnLoginButton();
            test.log(Status.PASS, "User has clicked login button");
        }
    }
