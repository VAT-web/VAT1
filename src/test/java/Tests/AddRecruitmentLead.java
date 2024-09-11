package Tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import javax.mail.MessagingException;
import java.awt.*;
import java.io.IOException;
import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class AddRecruitmentLead extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(AddRecruitmentLead.class);

    @Test
    public void Add_recruitment_lead_creation() throws InterruptedException, IOException, AWTException, MessagingException {
        ExtentTest test = BaseTest.createTest("add recruitment lead flow", "Verify successful login");
        try {
            WebDriverWait wait = new WebDriverWait(driver, ofSeconds(70)); // 70 seconds timeout

            ReportManager.setDriver(driver);
            ReportManager.createTest("Add recruitment lead creation scenario");
//            ReportManager.getTest().pass("Test step passed.");
            test.log(Status.PASS, "Application has successfully launched");
            Thread.sleep(5000);
            ReportManager.getTest().info("Attempting to enter User name");
            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")).sendKeys("A05317");

//            WebElement userName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")));
//            userName.sendKeys("A05317");
            test.log(Status.PASS, "Entered username: A05317");
            ReportManager.getTest().pass("UserName Entered");

//        ReportManager.captureScreenshot("testMethod");
            ReportManager.getTest().pass("Attempting to enter password");
            driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your password\"]")).sendKeys("Tokio@123");
            test.log(Status.PASS, "User has entered password: *****");
            ReportManager.getTest().pass("Password Entered");
            ReportManager.getTest().pass("Attempting to click on Login button");
//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]
         // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]"))).click();
          driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]")).click();
            test.log(Status.PASS, "User clicked login button");
            ReportManager.getTest().pass("clicked on Login button");
            Thread.sleep(5000);
            ReportManager.getTest().info("Attempting to click on the Three lines.");

//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView
            WebElement clickOnThreeLines = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")));
            clickOnThreeLines.click();

            Thread.sleep(3000);

            ReportManager.getTest().pass("User clicked on Three lines successfully.");

            ReportManager.getTest().info("Attempting to click on the recruitment.");
            WebElement clickOnRecruitmentTab = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Recruitment\"])[1]"));
            clickOnRecruitmentTab.click();
            test.log(Status.PASS, "click on recruitment");
            ReportManager.getTest().pass("User clicked on recruitment tab");
            ReportManager.getTest().info("Attempting to click on plus button");
            WebElement clickOnPlusBtn = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"), ofSeconds(20));
            clickOnPlusBtn.click();
            ReportManager.getTest().pass("User clicked on plus Button");
            test.log(Status.PASS, "click on plus button");
            ReportManager.getTest().pass("Attempting to click on Add recruitment lead");

            WebElement addRecruitmentLead = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Add Recruitment Lead\"]"), ofSeconds(20));
            addRecruitmentLead.click();
            ReportManager.getTest().pass("user clicked on add recruitment lead button");

            test.log(Status.PASS, "add recruitment lead");
            ReportManager.getTest().pass("Attempting to click on enter title");

            WebElement enterTitle = waitForElementVisibility(By.id("android:id/text1"), ofSeconds(20));
            enterTitle.click();
            ReportManager.getTest().pass("clicked on title");

            test.log(Status.PASS, "enter title");
            ReportManager.getTest().pass("Attempting to click on Mr. Button");


            WebElement Mr = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Mr.\"]"), ofSeconds(20));
            Mr.click();
            ReportManager.getTest().pass("Successfully clicked on Mr. button");

            test.log(Status.PASS, "Enter Title");
            ReportManager.getTest().pass("Attempting to enter firstname");
// Your existing code
            WebElement enterFirstName = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter First Name\"]"), ofSeconds(20));

// Generate a new random name
            String randomName = generateRandomName();

// Enter the random name
            enterFirstName.sendKeys(randomName);
//            WebElement enterFirstName = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter First Name\"]"), ofSeconds(20));
//            enterFirstName.sendKeys("venky");
            ReportManager.getTest().pass("Successfully entered first name");

            test.log(Status.PASS, "enter first name");
            ReportManager.getTest().pass("Attempting to enter lastname");

            WebElement enterLastName = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter Last Name\"]"), ofSeconds(20));
            enterLastName.sendKeys("eight");
            ReportManager.getTest().pass("Attempting to enter lastname");

            test.log(Status.PASS, "enter last name");
            ReportManager.getTest().pass("Attempting to emter email address");
Thread.sleep(1000);
            enter_email_address();
            ReportManager.getTest().pass("Successfully entered email address");

            test.log(Status.PASS, "enter email address");
            ReportManager.getTest().info("Attempting to enter mobile number");
            enter_mobile_number();
            ReportManager.getTest().pass("Successfully entered mobile number");
            test.log(Status.PASS, "enter mobile number");
            Thread.sleep(500);

            ReportManager.getTest().info("Attempting to enter PAN number");
            enter_pan_number();
            ReportManager.getTest().pass("Successfully entered PAN number");

            test.log(Status.PASS, "enter pan number");

            Thread.sleep(1000);
            ReportManager.getTest().info("Attempting to locate and click the submit button");

// Locate the submit button by its XPath and wait up to 20 seconds for it to be visible
            WebElement submitButton = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Submit\"]"), ofSeconds(20));

// Click the submit button once it's visible
            submitButton.click();

            ReportManager.getTest().pass("Successfully clicked the submit button");

            test.log(Status.PASS, "Submit button click");

            Thread.sleep(4000);
            ReportManager.getTest().info("Attempting to locate the middle name input field");

// Locate the middle name input field by its XPath and wait up to 20 seconds for it to be visible
            WebElement middleName = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter Middle Name\"]"), ofSeconds(20));

// Enter the text "nine" into the middle name input field
            middleName.sendKeys("nine");

            ReportManager.getTest().pass("Successfully entered middle name");

            test.log(Status.PASS, "enter middle name");
            Thread.sleep(4000);

            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Occupation\"))"));

            ReportManager.getTest().info("Attempting to locate and click the marital status dropdown");

// Locate the marital status dropdown by its XPath and wait up to 20 seconds for it to be visible
            WebElement maritalStatus = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Spinner"), ofSeconds(20));

// Click the marital status dropdown once it's visible
            maritalStatus.click();

            ReportManager.getTest().pass("Successfully clicked the marital status dropdown");

            test.log(Status.PASS, "enter martial status");
            ReportManager.getTest().info("Attempting to locate and select 'Married' option");

// Locate the 'Married' option by its XPath and wait up to 20 seconds for it to be visible
            WebElement married = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Married\"]"), ofSeconds(20));

// Click the 'Married' option once it's visible
            married.click();

            ReportManager.getTest().pass("Successfully selected 'Married' option");

            test.log(Status.PASS, "choose martial status");

            ReportManager.getTest().info("Attempting to locate and click the Occupation dropdown");

// Locate the Occupation dropdown by its XPath and wait up to 20 seconds for it to be visible
            WebElement occupation = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.Spinner"), ofSeconds(20));

// Click the Occupation dropdown once it's visible
            occupation.click();

            ReportManager.getTest().pass("Successfully clicked the Occupation dropdown");

            test.log(Status.PASS, "click on occupation");
            ReportManager.getTest().info("Attempting to locate and select 'Self Employed' option");

// Locate the 'Self Employed' option by its XPath and wait up to 20 seconds for it to be visible
            WebElement selfEmployed = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Self Employed\"]"), ofSeconds(20));

// Click the 'Self Employed' option once it's visible
            selfEmployed.click();

            ReportManager.getTest().pass("Successfully selected 'Self Employed' option");

            test.log(Status.PASS, "choose occupation");
            ReportManager.getTest().info("Attempting to locate and click the Education dropdown");

// Locate the Education dropdown by its XPath and wait up to 20 seconds for it to be visible
            WebElement education = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Spinner"), ofSeconds(20));

// Click the Education dropdown once it's visible
            education.click();

            ReportManager.getTest().pass("Successfully clicked the Education dropdown");

            test.log(Status.PASS, "click on education");
            ReportManager.getTest().info("Attempting to locate and select 'Graduate and above' option");

// Locate the 'Graduate and above' option by its XPath and wait up to 20 seconds for it to be visible
            WebElement graduate = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Graduate and above\"]"), ofSeconds(20));

// Click the 'Graduate and above' option once it's visible
            graduate.click();

            ReportManager.getTest().pass("Successfully selected 'Graduate and above' option");

            test.log(Status.PASS, "choose education");
            ReportManager.getTest().info("Attempting to locate and click the Date of Birth (DOB) input field");

// Locate the Date of Birth (DOB) input field by its XPath and wait up to 20 seconds for it to be visible
            WebElement enterDOB = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Select Date\"]"), ofSeconds(20));

// Click the Date of Birth (DOB) input field once it's visible
            enterDOB.click();

            ReportManager.getTest().pass("Successfully clicked the Date of Birth (DOB) input field");

            test.log(Status.PASS, "enter DOB");
            Thread.sleep(6000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Lead Details\"))"));


            Thread.sleep(1000);

            ReportManager.getTest().info("Attempting to locate and select the date of birth");

// Locate the specific date of birth (e.g., '5') by its XPath and wait up to 20 seconds for it to be visible
            WebElement pickADateOfBirth = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"1\"]"), ofSeconds(20));

// Click the date of birth once it's visible
            pickADateOfBirth.click();

            ReportManager.getTest().pass("Successfully selected the date of birth");

            test.log(Status.PASS, "Pick A DOB");

            ReportManager.getTest().info("Attempting to locate and click the Income dropdown");
            WebElement clickOnIncome = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Spinner")));
            clickOnIncome.click();

//// Wait for the Income dropdown to be clickable and then click it
//            WebElement clickOnIncome = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android/view/ViewGroup/android/view/ViewGroup[2]/android/view/ViewGroup/android/view/ViewGroup[1]/android/widget/Spinner"),Duration.ofSeconds(20));
//           Actions act = new Actions(driver);
//           act.moveToElement(clickOnIncome).click().perform();
//// Click the Income dropdown
//           // clickOnIncome.click();

            ReportManager.getTest().pass("Successfully clicked the Income dropdown");

            test.log(Status.PASS, "Click on income");
            ReportManager.getTest().info("Attempting to locate and select 'Family Income 5Lac and above' option");

// Locate the 'Family Income 5Lac and above' option by its XPath and wait up to 20 seconds for it to be visible
            WebElement chooseInCome = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Family Income 5Lac and above\"]"), ofSeconds(20));

// Click the 'Family Income 5Lac and above' option once it's visible
            chooseInCome.click();

            ReportManager.getTest().pass("Successfully selected 'Family Income 5Lac and above' option");

            test.log(Status.PASS, "Choose Income");

            scrollToEndAction();
            ReportManager.getTest().info("Attempting to locate and click the Conveyance dropdown");

            WebElement clickOnConveyance = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Spinner"), ofSeconds(20));
            clickOnConveyance.click();

            ReportManager.getTest().pass("Successfully clicked the Conveyance dropdown");

            test.log(Status.PASS, "Click Conveyance");

            ReportManager.getTest().info("Attempting to locate and select the 'owns a 4 wheeler' option");

// Locate the 'owns a 4 wheeler' option by its XPath and wait up to 20 seconds for it to be visible
            WebElement chooseConveyance = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"owns a 4 wheeler\"]"), ofSeconds(20));

// Click the 'owns a 4 wheeler' option once it's visible
            chooseConveyance.click();

            ReportManager.getTest().pass("Successfully selected the 'owns a 4 wheeler' option");

            test.log(Status.PASS, "Choose conveyance");

            ReportManager.getTest().info("Attempting to locate and click the Sourcing Pool dropdown");
            WebElement clickOnSourcingPool = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Spinner"), ofSeconds(20));
            clickOnSourcingPool.click();

            ReportManager.getTest().pass("Successfully clicked the Sourcing Pool dropdown");

            test.log(Status.PASS, "click on sourcingpool");
            ReportManager.getTest().info("Attempting to locate and select the 'Businessperson' option");

// Locate the 'Businessperson' option by its XPath and wait up to 20 seconds for it to be visible
            WebElement chooseSourcingPool = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Businessperson\"]"), ofSeconds(20));

// Click the 'Businessperson' option once it's visible
            chooseSourcingPool.click();

            ReportManager.getTest().pass("Successfully selected the 'Businessperson' option");

            test.log(Status.PASS, "choose sourcingpool");

            ReportManager.getTest().info("Attempting to locate and click the Sales Exposure dropdown");

            WebElement SalesExposure = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.Spinner"), ofSeconds(20));
            SalesExposure.click();

            ReportManager.getTest().pass("Successfully clicked the Sales Exposure dropdown");

            test.log(Status.PASS, "click salesExposure");
            ReportManager.getTest().info("Attempting to locate and select the 'Passive sale' option");

// Locate the 'Passive sale' option by its XPath and wait up to 20 seconds for it to be visible
            WebElement passiveSale = waitForElementVisibility(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Passive sale\"]"), ofSeconds(20));

// Click the 'Passive sale' option once it's visible
            passiveSale.click();

            ReportManager.getTest().pass("Successfully selected the 'Passive sale' option");

            test.log(Status.PASS, "Choose SalesEXposure");

            waitForElementVisibility(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollToEnd(1)"
            ), ofSeconds(20));

            waitForElementVisibility(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Influencer\"))"), ofSeconds(20));

            ReportManager.getTest().info("Attempting to locate the Influencer element");

// Log the attempt to locate the Influencer element
            ReportManager.getTest().info("Attempting to locate the Influencer element");

            WebElement Influencer = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup"), ofSeconds(20));
            Actions acc = new Actions(driver);

// Move to the Influencer element and click on it
            acc.moveToElement(Influencer).click().perform();

// Log success after clicking the Influencer element
            ReportManager.getTest().pass("Successfully clicked on Influencer dropdown");

            test.log(Status.PASS, "influencer click");


            ReportManager.getTest().info("Attempting to locate and select the 'Relative of social worker, leader, bureaucrat, local club member' option");

// Locate the 'Relative of social worker, leader, bureaucrat, local club member' option by its XPath and wait up to 20 seconds for it to be visible
            WebElement chooseInfluencer = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Relative of social worker, leader, bureaucrat, local club member \"]"), ofSeconds(20));

// Initialize Actions class for advanced user interactions
            Actions ac = new Actions(driver);

// Move to the element and click it
            ac.moveToElement(chooseInfluencer).click().perform();

            ReportManager.getTest().pass("Successfully selected the 'Relative of social worker, leader, bureaucrat, local club member' option");

            test.log(Status.PASS, "choose influencer clicked");

            // chooseInfluencer.click();

// Log the attempt to locate the 'Save Changes' button
            ReportManager.getTest().info("Attempting to locate the 'Save Changes' button");

// Locate the 'Save Changes' button by its XPath and wait up to 20 seconds for it to be visible
            WebElement saveChangesButton = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Save Changes\"]"), ofSeconds(20));

// Click the 'Save Changes' button once it is visible
            saveChangesButton.click();

// Log success after clicking the 'Save Changes' button
            ReportManager.getTest().pass("Successfully clicked the 'Save Changes' button");

            test.log(Status.PASS, "save changes button click");


            // p-50

            // Log the attempt to locate the 'P-50' element
            ReportManager.getTest().info("Attempting to locate the 'P-50' element");

// Locate the 'P-50' element by its XPath and wait up to 20 seconds for it to be visible
            WebElement p50 = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"P-50\"]"), ofSeconds(20));

// Click the 'P-50' element once it is visible
            p50.click();

// Log success after clicking the 'P-50' element
            ReportManager.getTest().pass("Successfully clicked the 'P-50' element");

// Log the attempt to locate the 'P-50 Count' input field
            ReportManager.getTest().info("Attempting to locate the 'P-50 Count' input field");

// Locate the 'P-50 Count' input field by its class name and wait up to 20 seconds for it to be visible
            WebElement enterP50Count = waitForElementVisibility(By.className("android.widget.EditText"), ofSeconds(20));

// Enter the value '12' into the 'P-50 Count' input field
            enterP50Count.sendKeys("12");

// Log success after entering the value into the 'P-50 Count' input field
            ReportManager.getTest().pass("Successfully entered '12' into the 'P-50 Count' input field");

            test.log(Status.PASS, "Enter P-50");
//        Thread.sleep(1000);

            // Log the attempt to locate the 'Upload' button
            ReportManager.getTest().info("Attempting to locate the 'Upload' button");
            WebElement upload = waitForElementVisibility(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"), ofSeconds(20));
            upload.click();

// Log success after clicking the 'Upload' button
            ReportManager.getTest().pass("Successfully clicked the 'Upload' button");


            test.log(Status.PASS, "Click on Upload");

            //  try {


            // Find and click on the element to open the gallery or file picker
            // Log the attempt to locate the 'Open Gallery' button
            ReportManager.getTest().info("Attempting to locate the 'Open Gallery' button");
            WebElement openGallery = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView"), ofSeconds(20));
            openGallery.click();

// Log success after clicking the 'Open Gallery' button
            ReportManager.getTest().pass("Successfully clicked the 'Open Gallery' button");
            test.log(Status.PASS, "Click on Open Gallery");

            // Log the attempt to locate the 'Photo' element
            ReportManager.getTest().info("Attempting to locate the 'Photo' element");

            WebElement photo = waitForElementVisibility(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[1]"), ofSeconds(20));
            photo.click();

// Log success after clicking the 'Photo' element
            ReportManager.getTest().pass("Successfully clicked the 'Photo' element");


            test.log(Status.PASS, "Choose photo");
            // Log the attempt to locate the 'Upload' button
            ReportManager.getTest().info("Attempting to locate the 'Upload' button");
            WebElement uploadButton = waitForElementVisibility(By.xpath("//android.widget.Button"), ofSeconds(20));
            uploadButton.click();

// Log success after clicking the 'Upload' button
            ReportManager.getTest().pass("Successfully clicked the 'Upload' button");

            test.log(Status.PASS, "click on upload button");

            // Log the attempt to locate the 'NAT' element
            ReportManager.getTest().info("Attempting to locate the 'NAT' element");

            WebElement NAT = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"NAT\"]"), ofSeconds(20));
            NAT.click();

// Log success after clicking the 'NAT' element
            ReportManager.getTest().pass("Successfully clicked the 'NAT' element");


            test.log(Status.PASS, "Click on NAT button");
            // Log the attempt to locate the 'Share NAT' button
            ReportManager.getTest().info("Attempting to locate the 'Share NAT' button");

            WebElement ShareNATButton = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Share NAT\"]"), ofSeconds(20));
            ShareNATButton.click();

// Log success after clicking the 'Share NAT' button
            ReportManager.getTest().pass("Successfully clicked the 'Share NAT' button");


            test.log(Status.PASS, "click on share NAT button");


            Thread.sleep(3000);
            driver.activateApp("com.google.android.gm");

            test.log(Status.PASS, "gmail open");
            ReportManager.getTest().pass("Successfully opened Gmail");

            ReportManager.getTest().pass("Attempting to refresh the Gmail");

            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
            Thread.sleep(1500);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
            Thread.sleep(5000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
            Thread.sleep(1500);
            // Refresh pages
//            wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)")));
//            Thread.sleep(500);
//            wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)")));

            // driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
            test.log(Status.PASS, "Refresh the Email");

// Log the attempt to locate the first email
            ReportManager.getTest().info("Attempting to locate the first email with the text 'communications'");
            WebElement clickOnFirstEmail = waitForElementVisibility(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.gm:id/senders\" and @text=\"communications\"]"), ofSeconds(20));
            clickOnFirstEmail.click();

// Log success after clicking the first email
            ReportManager.getTest().pass("Successfully clicked the first email with the text 'communications'");

            test.log(Status.PASS, "Clicked on Latest Email");

            // Scroll to End
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollToEnd(1)"
            ));

            // Log the attempt to locate the link with the specified text
            ReportManager.getTest().info("Attempting to locate the link with the text 'click here to start your Numerical Ability Test (NAT)'");


            WebElement clickOnLInk = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().text(\"click here to start your Numerical Ability Test (NAT).\")"), ofSeconds(20));
            clickOnLInk.click();

            Thread.sleep(5000);

            WebElement shareButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Share\"]"));
            shareButton.click();
            Thread.sleep(1000);

            WebElement copiedlinkclick = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Copy\"]/android.widget.ImageView"));
            copiedlinkclick.click();
            // open chrome
            ReportManager.getTest().info("Attempting to open chrome");
            driver.activateApp("com.android.chrome");
            ReportManager.getTest().pass("Chrome opened");


            WebElement searchField = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]"));
            searchField.click();
            Thread.sleep(1000);
            WebElement copiedLink = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.chrome:id/line_1\" and @text=\"Link you copied\"]"));
            copiedLink.click();


            // Perform long press on the element
//            new TouchAction<>(driver)
//                    .longPress(LongPressOptions.longPressOptions()
//                            .withElement(ElementOption.element(linkElement))
//                            .withDuration(Duration.ofSeconds(2)))
//                    .release()
//                    .perform();

//            WebElement linkElement = driver.findElement(By.xpath("//a[contains(text(),'Numerical Ability Test (NAT)')]"));
//
//// Perform long press on the element
//            TouchAction action = new TouchAction(driver);
//            action.longPress(LongPressOptions.longPressOptions()
//                            .withElement(ElementOption.element(linkElement))
//                            .withDuration(ofSeconds(2))) // You can adjust the duration as needed
//                    .release()
//                    .perform();

//            WebElement clickOnLInk = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().text(\"click here to start your Numerical Ability Test (NAT).\")"), Duration.ofSeconds(20));
//            // Perform long press on the element
//            TouchAction action = new TouchAction(driver);
//            action.longPress(LongPressOptions.longPressOptions()
//                            .withElement(ElementOption.element(clickOnLInk))
//                            .withDuration(ofSeconds(2))) // You can adjust the duration as needed
//                    .release()
//                    .perform();
            ReportManager.getTest().pass("Lp success");


//
//// Wait for "Open in Browser" button to be visible
//            WebElement openInBrowserButton = new WebDriverWait(driver, Duration.ofSeconds(20))
//                    .until(ExpectedConditions.visibilityOfElementLocated(
//                            AppiumBy.androidUIAutomator("new UiSelector().text(\"Open in Browser\")")
//                    ));
//
//            // Click on the "Open in Browser" button
//            openInBrowserButton.click();


// Log success after clicking the link
            ReportManager.getTest().pass("Successfully clicked the link with the text 'click here to start your Numerical Ability Test (NAT)'");

            test.log(Status.PASS, "Clicked on Exam Link");

//            WebElement ThreeDots = waitForElementVisibility(AppiumBy.accessibilityId("Customize and control Google Chrome"), ofSeconds(20));
//            ThreeDots.click();
//            test.log(Status.PASS, "Clicked on Three dots ");
//
//            WebElement DeskTopSite = waitForElementVisibility(By.id("com.android.chrome:id/checkbox"), ofSeconds(20));
//            DeskTopSite.click();
//            test.log(Status.PASS, "CLicked on DeskTop Site");
// Log the attempt to locate the 'Send OTP' button
            ReportManager.getTest().info("Attempting to locate the 'Send OTP' button");

            Thread.sleep(1000);
            WebElement clickOnSendOTPBtn11 = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Send OTP\")")));
            Actions otp1 = new Actions(driver);
            otp1.moveToElement(clickOnSendOTPBtn11).click().perform();
            Thread.sleep(3000);


// Log success after clicking the 'Send OTP' button
            ReportManager.getTest().pass("Successfully clicked the 'Send OTP' button");

            test.log(Status.PASS, "CLicked on send OTP Button");


            //minimize the chorme
            //   driver.executeScript("mobile: shell", ImmutableMap.of("command", "am force-stop com.android.chrome"));

// Log the attempt to locate the 'Minimize tab' element
            //   ReportManager.getTest().info("Attempting to locate the 'Minimize tab' element");
//            WebElement miniMIzeTab = waitForElementVisibility(AppiumBy.accessibilityId("Minimize tab"), ofSeconds(20));
//            miniMIzeTab.click();

// Log success after clicking the 'Minimize tab' element
            //  ReportManager.getTest().pass("Successfully clicked the 'Minimize tab' element");

// Log the attempt to locate the 'Navigate up' element
            //  ReportManager.getTest().info("Attempting to locate the 'Navigate up' element");
//
//            WebElement navigateUp = waitForElementVisibility(AppiumBy.accessibilityId("Navigate up"), ofSeconds(20));
//            navigateUp.click();

// Log success after clicking the 'Navigate up' element
            //   ReportManager.getTest().pass("Successfully clicked the 'Navigate up' element");

            // refresh the Email for latest messages
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
//            Thread.sleep(2000);
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
//            Thread.sleep(500);
// Log the attempt to locate the first email for OTP
            //   ReportManager.getTest().info("Attempting to locate the first email with the text 'communications' for OTP");
//            driver.activateApp("com.android.chrome");
// WebElement chrome = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.chrome:id/tile_view_title\" and @text=\"SalesdriveX - Super-charged sales activities\"]"));
//chrome.click();
//Thread.sleep(1500);
//            WebElement clickOnSendOTPBtn1 = waitForElementVisibility(AppiumBy.androidUIAutomator("new UiSelector().text(\"Send OTP\")"), ofSeconds(20));
//            clickOnSendOTPBtn1.click();
//driver.activateApp("window.open('https://mail.google.com', '_blank');");
            ReportManager.getTest().info("Attemting to open Gmail Application");
            driver.activateApp("com.google.android.gm");
            ReportManager.getTest().pass("opened Gmail Application");


            ReportManager.getTest().info("Attempting to locate the 'Close tab' element using accessibility ID.");

            WebElement navigateUp = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Close tab")));
            navigateUp.click();
            ReportManager.getTest().pass("Successfully clicked the 'Close tab' element.");


            Thread.sleep(500);
            WebElement inGmailBack = driver.findElement(AppiumBy.accessibilityId("Navigate up"));
            inGmailBack.click();
            Thread.sleep(2000);
            // refresh the Email for latest messages
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
            Thread.sleep(2000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
            Thread.sleep(2000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
            Thread.sleep(500);
            WebElement clickOnFirstEmailforOTP = waitForElementVisibility(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.gm:id/senders\" and @text=\"communications\"]"), ofSeconds(20));
            clickOnFirstEmailforOTP.click();
// Log success after clicking the first email for OTP
            ReportManager.getTest().pass("Successfully clicked the first email with the text 'communications' for OTP");
            ReportManager.getTest().info("Attempting Extract OTP from the Message");


            // Step 1: Extract OTP from the message
            String otp = extractOTPFromMessage();
            Assert.assertNotNull(otp, "Failed to extract OTP from message");
            Assert.assertTrue(otp.matches("\\d{6}"), "Extracted OTP is not a valid 6-digit number");

            Reporter.log("Extracted OTP: " + otp);
            ReportManager.getTest().pass("Succesfully Extracted OTP from the message");
            // Activate Chrome app

            ReportManager.getTest().info("Attempting to open the Chrome");

            driver.activateApp("com.android.chrome");
            ReportManager.getTest().pass("Succesfully Chrome opened");


            // Step 2: Enter OTP into fields
            enterOTPIntoFields(otp);

            // Add assertions here to verify that the OTP was entered correctly if possible
            ReportManager.getTest().pass("OTP entered");


//
//
//
//
//            test.log(Status.PASS, "Clicked on Latest Email for OTP");
//            Thread.sleep(2000);
//            try {
//                //WebElement messageContainer = mdriver.findElement(By.xpath("(//android.widget.RelativeLayout[@resource-id=\"com.samsung.android.messaging:id/card_view_list_item\"])[3]"));
//
//                // Find the message body inside the container
//                WebElement messageBody = driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id='com.samsung.android.messaging:id/bubble_text_view']/android.widget.LinearLayout/android.widget.LinearLayout[@resource-id='com.samsung.android.messaging:id/contents_container']/android.widget.TextView[contains(@text, 'OTP for Aadhaar')])[last()]"));
//                String messageText = messageBody.getText();
//
//                // Print the message text to verify it's correctly extracted
//                System.out.println("Extracted Message Text: " + messageText);
//
//                // Use regex to extract the OTP from the message text
//                Pattern otpPattern = Pattern.compile("Here's your OTP for your mobile verification \\(XX\\d{4}\\) is (\\d{6})");
//                Matcher matcher = otpPattern.matcher(messageText);
//                if (matcher.find()) {
//                    String otp = matcher.group(1);
//                    System.setProperty("Otp", otp);
//                    // Print the OTP
//                    System.out.println("Extracted OTP: " + otp);
//                } else {
//                    System.out.println("OTP not found in the message");
//                }
//            } catch (Exception e) {
//                System.out.println("Message container not found: " + e.getMessage());
//            }
//            // OTPAutomation();
//            Thread.sleep(5000);
//
//            String otp = System.getProperty("Otp");
//            String[] otpDigits = otp.split(""); // Split OTP into individual characters
//            Thread.sleep(5000);
//// Iterate over each input field and send the corresponding OTP digit
//            for (int i = 0; i < otpDigits.length; i++) {
//                // Find the input field by its instance index using MobileBy.AndroidUIAutomator
//                WebElement targetField = driver.findElement(AppiumBy.androidUIAutomator(
//                        "new UiSelector().className(\"android.widget.EditText\").instance(" + i + ")"
//                ));
//                targetField.sendKeys(otpDigits[i]);
//            }

//
//
//         WebElement targetField = waitForElementVisibility(By.xpath("//android.widget.Button[@text=\"Submit\"]"), Duration.ofSeconds(20));
//         targetField.sendKeys(System.getProperty("Otp"));

//            Thread.sleep(40000);
// Log the attempt to locate the 'Submit' button
            ReportManager.getTest().info("Attempting to Click the 'Submit' button");
//            Thread.sleep(1000);
            WebElement SubmitOTP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text=\"Submit\"]")));
            SubmitOTP.click();
            ReportManager.getTest().pass("Successfully clicked the 'Submit' button");
//            WebElement ThreeDots = waitForElementVisibility(AppiumBy.accessibilityId("Customize and control Google Chrome"), ofSeconds(20));
//            ThreeDots.click();
//            test.log(Status.PASS, "Clicked on Three dots ");
//
//            WebElement DeskTopSite = waitForElementVisibility(By.id("com.android.chrome:id/checkbox"), ofSeconds(20));
//            DeskTopSite.click();
// Log success after clicking the 'Submit' button


            test.log(Status.PASS, "Clikcked on Submit OTP Button");
// Log the attempt to locate the 'Next' button
            ReportManager.getTest().info("Attempting to click  the 'Next' button");
            // Scroll to End
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                            + ".scrollToEnd(1)"
//            ));
            // Locate the "Next" button by ID (or other locators)
//            Thread.sleep(3000);
            //    WebElement nextButton = driver.findElement(AppiumBy.id("com.example.app:id/next_button"));

            // Click the "Next" button
            //  nextButton.click();
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"Next\")")));

//
            Actions nextBun = new Actions(driver);
            nextBun.moveToElement(nextButton).click().perform();

// Log success after clicking the 'Next' button
            ReportManager.getTest().pass("Successfully clicked the 'Next' button");

            test.log(Status.PASS, "Clicked on NEXT Button");
            Thread.sleep(1000);
            //  NATquizAnswers();

            ReportManager.getTest().info("Attempting to enter first answer");
            WebElement a1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]")));
            Actions aa = new Actions(driver);
            aa.moveToElement(a1).click().perform();
            ReportManager.getTest().pass("first answer entered");
            WebElement a2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")));
            aa.moveToElement(a2).click().perform();
            ReportManager.getTest().pass("Second answer entered");
            WebElement a3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]")));
            aa.moveToElement(a3).click().perform();
            ReportManager.getTest().pass("third answer entered");
            WebElement a4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]")));
            aa.moveToElement(a4).click().perform();
            ReportManager.getTest().pass("fourth answer entered");
            WebElement a5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[1]")));
            aa.moveToElement(a5).click().perform();
            // driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")).click();
            ReportManager.getTest().pass("fifth answer entered");
            WebElement a6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View[1]")));
            aa.moveToElement(a6).click().perform();
            ReportManager.getTest().pass("6th ans entered");


            Thread.sleep(1000);


//            // Scroll to the bottom of the page using JavaScript
//            JavascriptExecutor js1 = (JavascriptExecutor) driver;
//            js1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            // Scroll down using Android UIAutomator
//            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
//
//            // Scroll to End
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"
            ));
            Thread.sleep(2000);
//            driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"
//            ));
//
//
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                            + ".scrollToEnd(1)"
//            ));
            test.log(Status.PASS, "upto end scrolling");
//
//            WebElement a7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")));
//            aa.moveToElement(a7).click().perform();
//
//            test.log(Status.PASS, "7th Ans entered");
            ReportManager.getTest().pass("seventh answer entered");
            WebElement a8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]")));
            aa.moveToElement(a8).click().perform();
            ReportManager.getTest().pass("8th th answered");
            WebElement a9 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View/android.view.View")));
            aa.moveToElement(a9).click().perform();
            ReportManager.getTest().pass("9th th answered");

            WebElement a10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View[1]")));
            aa.moveToElement(a10).click().perform();
            ReportManager.getTest().pass("10 th answered");
            driver.findElement(By.xpath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]")).click();
            ReportManager.getTest().pass("NAT answers are entered");

            test.log(Status.PASS, "NAT QUiz Answers entered");
            //SubmitButtonAfterExam
            ReportManager.getTest().info("Attempting to click on submit button");
            WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text=\"Submit\"]")));
            aa.moveToElement(submitBtn).click().perform();
            ReportManager.getTest().pass("Successfully clicked on Submit button");
            // Wait for the element to be visible
            WebElement element = driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View"));

            // Verify if the element is displayed
            if (element.isDisplayed()) {
                System.out.println("Element is displayed. Test Passed.");
            } else {
                System.out.println("Element is not displayed. Test Failed.");
            }

// Switch back to your app
            ReportManager.getTest().info("Attempting to switch back to ETLI appliaction");
            driver.activateApp("com.etli.myzindagi");
            ReportManager.getTest().pass("ETLI App opened");

            ReportManager.getTest().pass("Attempting to click on Income Planning");
            WebElement clickOnIncomePlanning = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Income Planning\"]")));
            clickOnIncomePlanning.click();
            ReportManager.getTest().pass("clicked on Income Planning");
            //   Thread.sleep(3000);
//
//            WebElement enterEarnings =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text=\"Enter Earnings Income\"]")));
//            enterEarnings.sendKeys("75000");

            // Log attempting to enter earnings
            ReportManager.getTest().info("Attempting to enter earnings into 'Enter Earnings Income' field.");

            // Locate the 'Enter Earnings Income' text field and input the earnings value
            WebElement enterEarnings = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text='Enter Earnings Income']")));
            enterEarnings.sendKeys("75000");

            // Log successful entry of earnings
            ReportManager.getTest().pass("Successfully entered earnings '75000' into 'Enter Earnings Income' field.");


//        Thread.sleep(500);
            closeNativeKeyboard();
//        Thread.sleep(1000);
//            WebElement ticketSize = waitForElementVisibility(By.xpath("//android.widget.EditText[@text=\"Enter Avg Ticket Size\"]"), ofSeconds(20));
//            ticketSize.sendKeys("25");
//            Thread.sleep(500);

            // Log attempting to find the 'Enter Avg Ticket Size' text field
            ReportManager.getTest().info("Attempting to locate the 'Enter Avg Ticket Size' text field.");

            // Wait for the element to be visible
            WebElement ticketSize = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text='Enter Avg Ticket Size']")));

            // Log successful visibility of the element
            ReportManager.getTest().info("'Enter Avg Ticket Size' text field is visible.");

            // Log attempting to enter the ticket size
            ReportManager.getTest().info("Attempting to enter '25' into the 'Enter Avg Ticket Size' text field.");
            ticketSize.sendKeys("25");

            // Log successful entry of the ticket size
            ReportManager.getTest().pass("Successfully entered '25' into the 'Enter Avg Ticket Size' text field.");


            closeNativeKeyboard();
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textMatches(\"Save\"))"));
            WebElement save = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Save\"]"), ofSeconds(20));
            save.click();
            WebElement PANVerification = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"PAN Verification\"]")));
            PANVerification.click();

//            WebElement PANNumberCheck = wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.EditText")));
//            PANNumberCheck.click();
            WebElement IRDAIPANCheck = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")));
            IRDAIPANCheck.click();

            WebElement InForce = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"In-Force\"]")));
            InForce.click();
            Thread.sleep(1000);
            WebElement nameofInsurer = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Select\"]"), ofSeconds(20));
            nameofInsurer.click();
            Thread.sleep(1000);
            WebElement chooseInsurer = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"ECGC Limited\"]"), ofSeconds(20));
            chooseInsurer.click();
            Thread.sleep(1000);
            WebElement clickOnSubmitBtn = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Submit\"]"), ofSeconds(20));
            clickOnSubmitBtn.click();
            Thread.sleep(1000);
            WebElement clickOnCheckBox = waitForElementVisibility(By.xpath("//android.widget.CheckBox"), ofSeconds(20));
            clickOnCheckBox.click();


            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                            + ".scrollToEnd(1)"
            ));
          //  Thread.sleep(3000);


ReportManager.getTest().info("tring to verify NSDL pan check");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.TextView[@text=\"Verify\"])[3]"))).click();

//            WebElement verifyBtn = waitForElementVisibility(By.xpath("(//android.widget.TextView[@text=\"Verify\"])[2]"), ofSeconds(20));
//            verifyBtn.click();
            WebElement againClickOnSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Submit\"]")));
            againClickOnSubmitButton.click();


//
//            WebElement careerInterview = waitForElementVisibility(By.xpath("//android.widget.TextView[@text=\"Career Interview\"]"), ofSeconds(20));
//            careerInterview.click();
            // Log attempting to locate the 'Career Interview' element
            ReportManager.getTest().info("Attempting to locate the 'Career Interview' element.");

            // Wait for the 'Career Interview' element to be visible
            WebElement careerInterview = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Career Interview']")));

            // Log successful visibility of the element
            ReportManager.getTest().info("'Career Interview' element is visible.");

            // Log attempting to click the 'Career Interview' element
            ReportManager.getTest().info("Attempting to click on the 'Career Interview' element.");
            careerInterview.click();

            // Log successful click action
            ReportManager.getTest().pass("Successfully clicked on the 'Career Interview' element.");

            ReportManager.getTest().info("Attempting to click on the initiate careerInterview button ");
            WebElement InitiateCareerInterview = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Initiate Career Interview\"]")));
            Actions actions = new Actions(driver);
            actions.moveToElement(InitiateCareerInterview).click().perform();
           // Thread.sleep(1500);
         //   InitiateCareerInterview.click();
//            WebElement PANVerificationclkickagain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"PAN Verification\"]")));
//            PANVerificationclkickagain.click();
//            WebElement careerInterviewagain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Career Interview']")));
//
//            careerInterviewagain.click();

//            WebElement InitiateCareerInterviewagain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Initiate Career Interview\"]")));
//            InitiateCareerInterviewagain.click();


            ReportManager.getTest().pass("Successfully clicked on  initiate careerInterview tab");


            ReportManager.getTest().info("Attempting to click on the candidate detail view arrow button ");
            WebElement CandidateDetailViewArrowBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")));
            CandidateDetailViewArrowBtn.click();
            ReportManager.getTest().pass("Successfully clicked on the candidate detail view arrow button");

// earlier myr back button page is there but now recruitment made simple page and now changed this xpath
            ReportManager.getTest().info("Attempting to click on MYR back button ");
            WebElement MYRBackButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")));
            MYRBackButton.click();
            ReportManager.getTest().pass("Successfully clicked on MYR back button");


            ReportManager.getTest().info("Attempting to click on the Profile icon");
            WebElement clickOnProfileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView")));
            clickOnProfileIcon.click();
            ReportManager.getTest().pass("Successfully clicked on the profile icon");
            //Thread.sleep(1000);
            ReportManager.getTest().info("Attempting to click on logout button");
            WebElement LogOut = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Log Out\"]")));
            LogOut.click();
            ReportManager.getTest().pass("Successfully clicked on logout button");
            Thread.sleep(3000);

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

            ReportManager.getTest().pass("All the eight Ans are entered");

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

            ReportManager.getTest().info("Attempting to click on the CDVBackBtn");

            // Wait for the element to be clickable and then click it
            WebElement CDVBackBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
            ));

            // Click the button
            CDVBackBtn.click();

            // Report success
            ReportManager.getTest().pass("Successfully clicked on the CDVBackBtn");

            //  Thread.sleep(2000);
            ReportManager.getTest().info("Attempting to click on the MYRBackBtn");

            // Wait for the MYRBackBtn to be clickable and then click it
            WebElement MYRBackBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
            ));

            // Click the button
            MYRBackBtn.click();

            // Log the success of the click action
            ReportManager.getTest().pass("Successfully clicked on the MYRBackBtn");

            //  Thread.sleep(2000);
            ReportManager.getTest().info("Attempting to click on the profileIcon");

            // Wait for the profileIcon to be clickable and then click it
            WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView")
            ));

            // Click the icon
            profileIcon.click();

            // Log the success of the click action
            ReportManager.getTest().pass("Successfully clicked on the profileIcon");
            // Thread.sleep(2000);
            // Log the attempt to click the Logout button
            ReportManager.getTest().info("Attempting to click on the Logout button");

            // Wait for the Logout button to be clickable and then click it
            WebElement LogoutBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.widget.TextView[@text=\"Log Out\"]")
            ));
            LogoutBtn.click();

            // Log the success of the click action
            ReportManager.getTest().pass("Successfully clicked on the Logout button");
            Thread.sleep(3000);


            ReportManager.getTest().info("Attempting to enter ID into the input field");

            // Wait for the input field to be clickable and then send keys
            WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")
            ));
            inputField.sendKeys("A05317");

            // Log the success of the action
            ReportManager.getTest().pass("Successfully entered ID into the input field");
            test.log(Status.PASS, "Entered username: A05317");

            ReportManager.getTest().info("Attempting to enter password into the input field");

            // Wait for the password input field to be visible and then send keys
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//android.widget.EditText[@text=\"Enter your password\"]")
            ));
            passwordField.sendKeys("Tokio@123");

            // Log the success of the action
            ReportManager.getTest().pass("Successfully entered password into the input field");
            test.log(Status.PASS, "User has entered password: *****");

            ReportManager.getTest().info("Attempting to click the Login button");

            // Wait for the Login button to be clickable and then click it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]") // Adjust this XPath as needed
            ));
            loginButton.click();

            // Log the success of the click action
            ReportManager.getTest().pass("Successfully clicked the Login button");
            test.log(Status.PASS, "User clicked login button");


//        Thread.sleep(9000);
            ReportManager.getTest().info("Attempting to click the ThreeLines");
            WebElement clickOnThreeLinesBtn = waitForElementVisibility(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"), ofSeconds(20));
            clickOnThreeLinesBtn.click();
            ReportManager.getTest().pass("Successfully clicked on the three lines");

            test.log(Status.PASS, "User click on three lines");

            // Thread.sleep(5000);

            ReportManager.getTest().info("Attempting to click on the Recruitment button");

            // Define the locator for the Recruitment button
            By recruitmentButtonLocator = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[10]/android.widget.ImageView");

            // Wait for the Recruitment button to be visible
            WebElement clickOnRecruitment = wait.until(ExpectedConditions.visibilityOfElementLocated(recruitmentButtonLocator));

            // Click the Recruitment button
            clickOnRecruitment.click();

            // Log the success of the click action
            ReportManager.getTest().pass("Successfully clicked on the Recruitment button");
            test.log(Status.PASS, "click on recruitment");
            // Thread.sleep(2000);
            // Log the attempt
            Reporter.log("Attempting to click on the 'Reviews Complete' button");

            // Define the locator for the 'Reviews Complete' element
            By reviewsCompleteLocator = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]");

            // Wait for the 'Reviews Complete' element to be visible
            WebElement reviewsComplete = wait.until(ExpectedConditions.visibilityOfElementLocated(reviewsCompleteLocator));

            // Click the 'Reviews Complete' element
            reviewsComplete.click();

            // Log the success
            Reporter.log("Successfully clicked on the 'Reviews Complete' button");
            // Thread.sleep(2000);


            By completeNowLocator = By.xpath("//android.widget.TextView[@text=\"Complete Now \uD83D\uDC46\"]");

            // Log the attempt to find and click the 'Complete Now' button
            ReportManager.getTest().info("Attempting to find and click the 'Complete Now' button");

            // Wait for the 'Complete Now' button to be visible
            WebElement completeNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(completeNowLocator));

            // Click the 'Complete Now' button
            completeNowButton.click();

            // Log the success of the click action
            ReportManager.getTest().pass("Successfully clicked on the 'Complete Now' button");


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

