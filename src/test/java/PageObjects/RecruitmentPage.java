package PageObjects;

import Tests.BaseTest;
import Tests.ReportManager;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class RecruitmentPage extends BaseTest {

    private final WebDriverWait wait;
    public AndroidDriver ldriver;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter your password\"]")
    WebElement txt_Password;

    // Define WebElement using @AndroidFindBy with XPath locator
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    private WebElement loginButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement clickPlusButton;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private WebElement threeLinesIcon;
    // Define the element with @FindBy
    @FindBy(xpath = "//android.widget.TextView[@text=\"Add Recruitment Lead\"]")
    private WebElement addRecruitmentLead;
    @FindBy(id = "android:id/text1")
    private WebElement enterTitle;
    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Mr.\"]")
    private WebElement mrElement;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter First Name\"]")
    private WebElement enterFirstName;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Last Name\"]")
    private WebElement enterLastName;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Submit\"]")
    private WebElement submitButton;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Middle Name\"]")
    private WebElement middleName;

    @FindBy(xpath = "//android.widget.ScrollView/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup[3]/android/widget/Spinner")
    private WebElement maritalStatusSpinner;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Married\"]")
    private WebElement marriedOption;

    @FindBy(xpath = "//android.widget.ScrollView/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup[4]/android/widget/Spinner")
    private WebElement occupationSpinner;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Self Employed\"]")
    private WebElement selfEmployedOption;

    @FindBy(xpath = "//android.widget.ScrollView/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup[5]/android/widget/Spinner")
    private WebElement educationSpinner;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Graduate and above\"]")
    private WebElement graduateOption;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Select Date\"]")
    private WebElement dobField;

    @FindBy(xpath = "//android.widget.TextView[@text=\"12\"]")
    private WebElement dobDate;

    @FindBy(xpath = "//android.widget.ScrollView/android/view/ViewGroup/android/view/ViewGroup[2]/android/view/ViewGroup/android/view/ViewGroup[1]/android/widget/Spinner")
    private WebElement incomeSpinner;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Family Income 5Lac and above\"]")
    private WebElement incomeOption;

    @FindBy(xpath = "//android.widget.ScrollView/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup[2]/android/widget/Spinner")
    private WebElement conveyanceSpinner;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"owns a 4 wheeler\"]")
    private WebElement conveyanceOption;

    @FindBy(xpath = "//android.widget.ScrollView/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup[3]/android/widget/Spinner")
    private WebElement sourcingPoolSpinner;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Businessperson\"]")
    private WebElement sourcingPoolOption;

    @FindBy(xpath = "//android.widget.ScrollView/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup[4]/android/widget/Spinner")
    private WebElement salesExposureSpinner;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Passive sale\"]")
    private WebElement salesExposureOption;

    @FindBy(xpath = "//android.widget.ScrollView/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup/android/view/ViewGroup[5]/android/view/ViewGroup/android/view/ViewGroup")
    private WebElement influencerElement;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Relative of social worker, leader, bureaucrat, local club member \"]")
    private WebElement chooseInfluencerOption;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Save Changes\"]")
    private WebElement saveChangesButton;

    // Use @FindBy annotation to locate the element
    @FindBy(xpath = "//android.widget.TextView[@text='P-50']")
    private WebElement p50;

    // Use @FindBy annotation to locate the element by class name
    @FindBy(className = "android.widget.EditText")
    private WebElement enterP50Count;

    // Use @FindBy annotation to locate the element by XPath
    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement upload;

    // Use @FindBy annotation to locate the element by XPath
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView")
    private WebElement openGallery;

    // Use @FindBy annotation to locate the element by XPath
    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.google.android.providers.media.module:id/icon_thumbnail'])[1]")
    private WebElement photo;

    // Use @FindBy annotation to locate the element by XPath
    @FindBy(xpath = "//android.widget.Button")
    private WebElement uploadButton;

    // Use @FindBy annotation to locate the element by XPath
    @FindBy(xpath = "//android.widget.TextView[@text='NAT']")
    private WebElement NAT;

    // Use @FindBy annotation to locate the element by XPath
    @FindBy(xpath = "//android.widget.TextView[@text='Share NAT']")
    private WebElement ShareNATButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.google.android.gm:id/senders' and @text='communications']")
    private WebElement clickOnFirstEmail;

    // Define WebElement using UiAutomator
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"click here to start your Numerical Ability Test (NAT).\")")
    private WebElement clickOnLink;

    // Define WebElement using @FindBy
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Share']")
    private WebElement shareButton;

    // Define WebElement using @FindBy
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Copy']/android.widget.ImageView")
    private WebElement copiedlinkclick;

    // Define WebElement using @FindBy
    @FindBy(xpath = "//android.widget.EditText[@resource-id='com.android.chrome:id/search_box_text']")
    private WebElement searchField;

    // Define WebElement using @FindBy
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.android.chrome:id/line_1' and @text='Link you copied']")
    private WebElement copiedLink;

    // Define WebElement using @AndroidFindBy
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Send OTP\")")
    private WebElement clickOnSendOTPBtn11;

    // Define WebElement using AppiumBy
    @AndroidFindBy(accessibility = "Close tab")
    private WebElement navigateUp;

    // Define WebElement using AppiumBy
    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement inGmailBack;

    // Define WebElement using @AndroidFindBy with XPath locator
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    private WebElement submitBtn;

    // Define WebElement using @AndroidFindBy with XPath locator
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Income Planning']")
    private WebElement clickOnIncomePlanning;


    // Define WebElement using @AndroidFindBy for XPath locator
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.google.android.gm:id/senders' and @text='communications']")
    private WebElement clickOnFirstEmailforOTP;

    // Define WebElement using @AndroidFindBy with XPath locator
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    private WebElement submitOTP;

    // Define WebElement using AppiumBy with androidUIAutomator
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Next\")")
    private WebElement nextButton;


    public RecruitmentPage(AndroidDriver rdriver) throws IOException {
        ldriver = rdriver;
        configprop = new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
        PageFactory.initElements(rdriver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        ReportManager.setDriver(driver);
        ReportManager.createTest("Add recruitment lead creation scenario");
    }

    // Reusable wait method for By locator
    private WebElement waitForElementVisibilitys(By locator, Duration timeout) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }



    // Method to click on the plus button
    public void clickOnPlusButton() {
        try {
            // Use WebElement directly if initialized with PageFactory
            if (clickPlusButton != null) {
                ReportManager.getTest().info("Attempting to click  on Plus Button.");
                clickPlusButton.click();
                ReportManager.getTest().pass("Clicked on Plus Button.");
            } else {
                // If clickPlusButton is not initialized, find it using By locator
                By clickPlusButton = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
                WebElement plusButton = waitForElementVisibilitys(clickPlusButton, Duration.ofSeconds(20));
                ReportManager.getTest().info("Clicking on Plus Button.");
                plusButton.click();
            }
        } catch (Exception e) {
            ReportManager.getTest().fail("Failed to click on Plus Button: " + e.getMessage());
        }
    }

    // Method to click on the specific element
    public void clickLoginButton() {
        try {
            // Wait for the specificElement to be clickable
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
            // Click the element
            element.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the specific element.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the specific element: " + e.getMessage());
        }
    }


    // Method to wait for the element and click it
    public void clickOnAddRecruitmentLead() {
        try {
            // Use WebDriverWait to ensure the element is visible before interacting with it
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(addRecruitmentLead));
            ReportManager.getTest().info("Clicking on Add Recruitment Lead button.");
            element.click();
            ReportManager.getTest().pass("Clicked on Add Recruitment Lead button.");

        } catch (Exception e) {
            ReportManager.getTest().fail("Failed to click on Add Recruitment Lead button: " + e.getMessage());
        }
    }


    public void clickOnTitle() {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(enterTitle));
            ReportManager.getTest().info("Clicking on enterTitle filed");
            element.click();
            ReportManager.getTest().pass("Successfully clicked on element with enterTitle: ");
        } catch (Exception e) {
            ReportManager.getTest().fail("Failed to click on element with locator:  ");
        }
    }

    public void clickOnMr() {
        try {

            wait.until(ExpectedConditions.elementToBeClickable(mrElement));

            ReportManager.getTest().info("Clicking on the 'Mr.' element.");

            mrElement.click();

            ReportManager.getTest().pass("Successfully clicked on the 'Mr.' element.");
        } catch (Exception e) {

            ReportManager.getTest().fail("Failed to click on the 'Mr.' element: " + e.getMessage());
        }
    }

    public void enterFirstName() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(enterFirstName));

            ReportManager.getTest().info("Entering first name");

            enterFirstName.sendKeys("Venky");

            ReportManager.getTest().pass("Successfully entered first name: ");
        } catch (Exception e) {

            ReportManager.getTest().fail("Failed to enter first name: " + e.getMessage());
        }
    }

    public void enterLastName() {
        try {

            wait.until(ExpectedConditions.elementToBeClickable(enterLastName));

            ReportManager.getTest().info("Entering last name");

            enterLastName.sendKeys("Nine");

            ReportManager.getTest().pass("Successfully entered last name");

        } catch (Exception e) {
            // Log any exceptions that occur
            ReportManager.getTest().fail("Failed to enter last name: " + e.getMessage());
        }
    }

    @Test()
    public void clickSubmitButton() {
        try {

            wait.until(ExpectedConditions.elementToBeClickable(submitButton));
            ReportManager.getTest().info("Clicking on the 'Submit' button.");
            submitButton.click();
            ReportManager.getTest().pass("Successfully clicked on the 'Submit' button.");
        } catch (Exception e) {
            ReportManager.getTest().fail("Failed to click on the 'Submit' button: " + e.getMessage());
        }
    }


    // Method to enter Middle Name
    public void enterMiddleName() {
        WebElement middleNameField = wait.until(ExpectedConditions.elementToBeClickable(middleName));
        middleNameField.sendKeys("Nine");
        ReportManager.getTest().log(Status.PASS, "Entered middle name:");
    }

    // Method to select Marital Status
    public void selectMaritalStatus() {
        WebElement maritalStatusElement = wait.until(ExpectedConditions.elementToBeClickable(maritalStatusSpinner));
        maritalStatusElement.click();
        ReportManager.getTest().log(Status.PASS, "Clicked on marital status dropdown.");

        WebElement marriedOptionElement = wait.until(ExpectedConditions.elementToBeClickable(marriedOption));
        marriedOptionElement.click();
        ReportManager.getTest().log(Status.PASS, "Selected marital status 'Married'.");
    }

    // Method to select Occupation
    public void selectOccupation() {
        WebElement occupationElement = wait.until(ExpectedConditions.elementToBeClickable(occupationSpinner));
        occupationElement.click();
        ReportManager.getTest().log(Status.PASS, "Clicked on occupation dropdown.");

        WebElement selfEmployedOptionElement = wait.until(ExpectedConditions.elementToBeClickable(selfEmployedOption));
        selfEmployedOptionElement.click();
        ReportManager.getTest().log(Status.PASS, "Selected occupation 'Self Employed'.");
    }


    public void selectEducation() {
        WebElement educationElement = wait.until(ExpectedConditions.elementToBeClickable(educationSpinner));
        educationElement.click();
        ReportManager.getTest().log(Status.PASS, "Clicked on education dropdown.");

        WebElement graduateElement = wait.until(ExpectedConditions.elementToBeClickable(graduateOption));
        graduateElement.click();
        ReportManager.getTest().log(Status.PASS, "Selected education 'Graduate and above'.");
    }

    // Method to enter Date of Birth
    public void enterDateOfBirth() throws InterruptedException {
        WebElement dobElement = wait.until(ExpectedConditions.elementToBeClickable(dobField));
        dobElement.click();
        ReportManager.getTest().log(Status.PASS, "Clicked on DOB field.");

        Thread.sleep(6000); // Wait for calendar to appear

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Lead Details\"))"));

        WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(dobDate));
        dateElement.click();
        ReportManager.getTest().log(Status.PASS, "Selected date of birth.");
    }

    // Method to select Income
    public void selectIncome() {
        WebElement incomeElement = wait.until(ExpectedConditions.elementToBeClickable(incomeSpinner));
        incomeElement.click();
        ReportManager.getTest().log(Status.PASS, "Clicked on income dropdown.");

        WebElement incomeOptionElement = wait.until(ExpectedConditions.elementToBeClickable(incomeOption));
        incomeOptionElement.click();
        ReportManager.getTest().log(Status.PASS, "Selected income 'Family Income 5Lac and above'.");
    }

    // Method to select Conveyance
    public void selectConveyance() {
        WebElement conveyanceElement = wait.until(ExpectedConditions.elementToBeClickable(conveyanceSpinner));
        conveyanceElement.click();
        ReportManager.getTest().log(Status.PASS, "Clicked on conveyance dropdown.");

        WebElement conveyanceOptionElement = wait.until(ExpectedConditions.elementToBeClickable(conveyanceOption));
        conveyanceOptionElement.click();
        ReportManager.getTest().log(Status.PASS, "Selected conveyance 'owns a 4 wheeler'.");
    }

    // Method to select Sourcing Pool
    public void selectSourcingPool() {
        WebElement sourcingPoolElement = wait.until(ExpectedConditions.elementToBeClickable(sourcingPoolSpinner));
        sourcingPoolElement.click();
        ReportManager.getTest().log(Status.PASS, "Clicked on sourcing pool dropdown.");

        WebElement sourcingPoolOptionElement = wait.until(ExpectedConditions.elementToBeClickable(sourcingPoolOption));
        sourcingPoolOptionElement.click();
        ReportManager.getTest().log(Status.PASS, "Selected sourcing pool 'Businessperson'.");
    }

    // Method to select Sales Exposure
    public void selectSalesExposure() {
        WebElement salesExposureElement = wait.until(ExpectedConditions.elementToBeClickable(salesExposureSpinner));
        salesExposureElement.click();
        ReportManager.getTest().log(Status.PASS, "Clicked on sales exposure dropdown.");

        WebElement salesExposureOptionElement = wait.until(ExpectedConditions.elementToBeClickable(salesExposureOption));
        salesExposureOptionElement.click();
        ReportManager.getTest().log(Status.PASS, "Selected sales exposure 'Passive sale'.");
    }

    // Method to select Influencer
    public void selectInfluencer() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollToEnd(1)")));

        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textMatches(\"Influencer\"))")));

        WebElement influencerElement = wait.until(ExpectedConditions.elementToBeClickable(this.influencerElement));
        Actions actions = new Actions(driver);
        actions.moveToElement(influencerElement).click().perform();
        ReportManager.getTest().log(Status.PASS, "Clicked on influencer.");

        WebElement chooseInfluencerElement = wait.until(ExpectedConditions.elementToBeClickable(chooseInfluencerOption));
        actions.moveToElement(chooseInfluencerElement).click().perform();
        ReportManager.getTest().log(Status.PASS, "Selected influencer option.");
    }

    // Method to save changes
    public void saveChanges() {
        WebElement saveChangesElement = wait.until(ExpectedConditions.elementToBeClickable(saveChangesButton));
        saveChangesElement.click();
        ReportManager.getTest().log(Status.PASS, "Clicked on 'Save Changes' button.");
    }


    // Method to interact with the p50 element
    public void interactWithP50() {
        try {
            // Wait for the p50 element to be visible
            WebElement p50Element = wait.until(ExpectedConditions.elementToBeClickable(p50));
            // Perform the action (e.g., click)
            p50Element.click();
            // Log the action
            ReportManager.getTest().log(Status.PASS, "Clicked on 'P-50' element.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to interact with 'P-50' element: " + e.getMessage());
        }

    }

    // Method to enter a specific value (12) into the enterP50Count input field
    public void enterP50Count() {
        try {
            // Wait for the enterP50Count element to be visible and enabled
            WebElement enterP50CountElement = wait.until(ExpectedConditions.elementToBeClickable(enterP50Count));
            // Clear any existing text and enter the value 12
            enterP50CountElement.clear();
            enterP50CountElement.sendKeys("12");
            // Log the action
            ReportManager.getTest().pass("Successfully entered '12' into the 'enterP50Count' field.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to enter text into 'enterP50Count' field: " + e.getMessage());
        }
    }

    // Method to click the upload element
    public void clickUpload() {
        try {
            // Wait for the upload element to be clickable
            WebElement uploadElement = wait.until(ExpectedConditions.elementToBeClickable(upload));
            // Click the upload element
            uploadElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked the 'upload' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click the 'upload' button: " + e.getMessage());
        }
    }

    // Method to click the openGallery element
    public void clickOpenGallery() {
        try {
            // Wait for the openGallery element to be clickable
            WebElement openGalleryElement = wait.until(ExpectedConditions.elementToBeClickable(openGallery));
            // Click the openGallery element
            openGalleryElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked the 'Open Gallery' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click the 'Open Gallery' button: " + e.getMessage());
        }
    }

    // Method to click the photo element
    public void clickPhoto() {
        try {
            // Wait for the photo element to be clickable
            WebElement photoElement = wait.until(ExpectedConditions.elementToBeClickable(photo));
            // Click the photo element
            photoElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked the 'photo' element.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click the 'photo' element: " + e.getMessage());
        }
    }

    // Method to click the uploadButton element
    public void clickUploadButton() {
        try {
            // Wait for the uploadButton element to be clickable
            WebElement uploadButtonElement = wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
            // Click the uploadButton element
            uploadButtonElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked the 'Upload' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click the 'Upload' button: " + e.getMessage());
        }
    }


    // Method to click the NAT element
    public void clickNAT() {
        try {
            // Wait for the NAT element to be clickable
            WebElement NATElement = wait.until(ExpectedConditions.elementToBeClickable(NAT));
            // Click the NAT element
            NATElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked the 'NAT' element.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click the 'NAT' element: " + e.getMessage());
        }
    }

    // Method to click the ShareNATButton element
    public void clickShareNATButton() {
        try {
            // Wait for the ShareNATButton element to be clickable
            WebElement ShareNATButtonElement = wait.until(ExpectedConditions.elementToBeClickable(ShareNATButton));
            // Click the ShareNATButton element
            ShareNATButtonElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked the 'Share NAT' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click the 'Share NAT' button: " + e.getMessage());
        }
    }


    // Method to activate the Google Gmail app
    public void activateGmailApp() {
        driver.activateApp("com.google.android.gm");
        ReportManager.getTest().pass("Successfully activated the 'Google Gmail' app.");

    }


    public void refreshGmail() throws InterruptedException {

        ReportManager.getTest().pass("Attempting to refresh the Gmail");

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
        Thread.sleep(1500);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
        Thread.sleep(1500);
    }


    // Method to click on the first email
    public void clickOnFirstEmail() {
        try {
            // Wait for the clickOnFirstEmail element to be visible and clickable
            WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(clickOnFirstEmail));
            // Click the email element
            emailElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the first email.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the first email: " + e.getMessage());
        }
    }


    public void scrollToEnd() {
        // Scroll to End
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
                        + ".scrollToEnd(1)"
        ));

    }


    // Method to click on the link
    public void clickOnLink() {
        try {
            // Wait for the clickOnLink element to be clickable
            WebElement linkElement = wait.until(ExpectedConditions.elementToBeClickable(clickOnLink));
            // Click the link element
            linkElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the link 'click here to start your Numerical Ability Test (NAT).'");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the link 'click here to start your Numerical Ability Test (NAT).': " + e.getMessage());
        }
    }

    // Method to click the Share button
    public void clickShareButton() {
        try {
            // Wait for the shareButton element to be clickable
            WebElement shareButtonElement = wait.until(ExpectedConditions.elementToBeClickable(shareButton));
            // Click the shareButton element
            shareButtonElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked the 'Share' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click the 'Share' button: " + e.getMessage());
        }
    }


    // Method to click on the copied link
    public void clickCopiedLink() {
        try {
            // Wait for the copiedlinkclick element to be clickable
            WebElement copiedLinkElement = wait.until(ExpectedConditions.elementToBeClickable(copiedlinkclick));
            // Click the copiedlinkclick element
            copiedLinkElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the 'Copy' link.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the 'Copy' link: " + e.getMessage());
        }
    }

    public void activateChromeApp() {
        driver.activateApp("com.android.chrome");
        ReportManager.getTest().pass("Successfully activated the Chrome app.");
    }

    // Method to click the search field (if needed)
    public void clickSearchField() {
        try {
            // Wait for the searchField element to be clickable
            WebElement searchFieldElement = wait.until(ExpectedConditions.elementToBeClickable(searchField));
            // Click the searchField element
            searchFieldElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked the search field.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click the search field: " + e.getMessage());
        }
    }


    // Method to click on the copied link
    public void clickCopiedLinkinSearchField() {
        try {
            // Wait for the copiedLink element to be clickable
            WebElement copiedLinkElement = wait.until(ExpectedConditions.elementToBeClickable(copiedLink));
            // Click the copiedLink element
            copiedLinkElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the 'Link you copied'.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the 'Link you copied': " + e.getMessage());
        }
    }

    // Method to click on the 'Send OTP' button
    public void clickSendOTPButton() {
        try {
            // Wait for the clickOnSendOTPBtn11 element to be clickable
            WebElement sendOTPButton = wait.until(ExpectedConditions.elementToBeClickable(clickOnSendOTPBtn11));
            // Click the 'Send OTP' button
            Actions otp1 = new Actions(driver);
            otp1.moveToElement(sendOTPButton).click().perform();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the 'Send OTP' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the 'Send OTP' button: " + e.getMessage());
        }
    }


    // Method to click on the 'Close tab' button
    public void clickNavigateUp() {
        try {
            // Wait for the navigateUp element to be clickable
            WebElement navigateUpElement = wait.until(ExpectedConditions.elementToBeClickable(navigateUp));
            // Click the 'Close tab' button
            navigateUpElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the 'Close tab' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the 'Close tab' button: " + e.getMessage());
        }
    }

    // Method to click on the 'Navigate up' button
    public void clickNavigateUptogotoGmail() {
        try {
            // Wait for the inGmailBack element to be clickable
            WebElement navigateUpElement = wait.until(ExpectedConditions.elementToBeClickable(inGmailBack));
            // Click the 'Navigate up' button
            navigateUpElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the 'Navigate up' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the 'Navigate up' button: " + e.getMessage());
        }
    }


    public void refreshGmailForOTP() throws InterruptedException {

        Thread.sleep(2000);
        // refresh the Email for latest messages
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))" + ".scrollToBeginning(1)"));
        Thread.sleep(500);
    }


    // Method to click on the first email for OTP
    public void clickOnFirstEmailForOTP() {
        try {
            // Wait for the clickOnFirstEmailforOTP element to be visible
            WebElement firstEmailElement = wait.until(ExpectedConditions.visibilityOf(clickOnFirstEmailforOTP));
            // Click the first email for OTP
            firstEmailElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the first email for OTP.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the first email for OTP: " + e.getMessage());
        }
    }

    public void OTPAutomation() throws InterruptedException {
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


    }


    // Method to click on the 'Submit' button
    public void clickSubmitOTP() {
        try {
            // Wait for the submitOTP element to be clickable
            WebElement submitOTPButton = wait.until(ExpectedConditions.elementToBeClickable(submitOTP));
            // Click the 'Submit' button
            submitOTPButton.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the 'Submit' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the 'Submit' button: " + e.getMessage());
        }
    }

    // Method to click on the 'Next' button
    public void clickNextButton() {
        try {
            // Wait for the nextButton element to be clickable
            WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(nextButton));
            // Click the 'Next' button
            Actions nextBun = new Actions(driver);
            nextBun.moveToElement(nextButtonElement).click().perform();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the 'Next' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the 'Next' button: " + e.getMessage());
        }
    }

    public void NATAnswers() throws InterruptedException {

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
    }

    // Method to click on the 'Submit' button
    public void clickSubmitButtonAfterExam() {
        try {
            // Wait for the submitBtn element to be clickable
            WebElement submitButtonElement = wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
            // Click the 'Submit' button
            submitButtonElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the 'Submit' button.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the 'Submit' button: " + e.getMessage());
        }
    }

    public void activateMyZindagiApplication() {

        ReportManager.getTest().info("Attempting to switch back to ETLI appliaction");
        driver.activateApp("com.etli.myzindagi");
        ReportManager.getTest().pass("ETLI App opened");

    }

    // Method to click on the 'Income Planning' element
    public void clickIncomePlanning() {
        try {
            // Wait for the clickOnIncomePlanning element to be clickable
            WebElement incomePlanningElement = wait.until(ExpectedConditions.elementToBeClickable(clickOnIncomePlanning));
            // Click the 'Income Planning' element
            incomePlanningElement.click();
            // Log the action
            ReportManager.getTest().pass("Successfully clicked on the 'Income Planning' element.");
        } catch (Exception e) {
            // Handle the exception and log the failure
            ReportManager.getTest().log(Status.FAIL, "Failed to click on the 'Income Planning' element: " + e.getMessage());
        }
    }


}
