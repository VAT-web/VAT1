package Tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;

import com.aventstack.extentreports.App;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.regex.Pattern;

import PageObjects.*;
import io.appium.java_client.android.AndroidDriver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class BaseTest {
    public static AndroidDriver driver;


    public WebDriver mdriver;

    public AppiumDriverLocalService service;
    public static ExtentReports extent;

    public Properties configprop;

    public LoginPage loginPage;
    public Gmail gmail;
    public HomePage homePage;

    public NewLeadPage newLeadPage;
    public ReportManager reportManager;

    public CDV_ProfilePage cdv_ProfilePage;

    public CDV_P50 cdv_p50;

    public CDV_NAT cdv_nat;

    public CDV_IncomePlanning cdv_incomePlanning;

    public CDV_CareerInterview cdv_careerInterview;

    public ProfilePage profilePage;

    public DashBoardPage dashBoardPage;
    public RecruitmentPage recruitmentPage;


    public static ExtentTest createTest(String testName, String description) {
        ExtentTest test = extent.createTest(testName, description);
        return test;
    }

    protected static void finalizeReport() {

    }

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        // Appium setup (unchanged - replace paths as needed)

        service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//User//node_modules//appium-uiautomator2-driver//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();

        //options.setDeviceName("Pixel");
        options.setDeviceName("Vivo I2208 API 34");// real device


        // options.setChromedriverExecutable("//Users//rahulshetty//documents//chromedriver 11");
        // C:\Users\User\Downloads\app-release (1) (1) (1).apk
        //options.setApp("C://Users//User//Downloads//ETLI-UAT-0.6.30.apk");
//        "C://Users//User//Downloads//ETLI-UAT-0.6.34(2).apk"
//        "C://Users//User//Downloads//app-release (5).apk"
       // "C://Users//User//Downloads//ETLI-UAT-0.6.34(2).apk"

     //   "C://Users//User//Downloads//ETLI-UAT-0.6.36.apk"
        options.setApp("C://Users//User//Downloads//ETLI-UAT-0.6.36.apk");
        //   options.setAppPackage("com.etli.myzindagi");
        // options.setApp("C://Users//User//Downloads//app-debug (7).apk");


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        options.withBrowserName("Chrome");
        driver.setFileDetector(new LocalFileDetector());
        // Extent Reports initialization
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("extent-report.html"); // Replace with your desired report path
        extent.attachReporter(spark);

    }

    // Abstract method to be implemented by subclasses
    protected DesiredCapabilities getCapabilities() {
        return null;
    }

    private void clickElement(By locator, String description) {
        try {
            WebElement element = waitForElementVisibility(locator, Duration.ofSeconds(20));
            element.click();
        } catch (Exception e) {
        }
    }

    public void gmailAutomation(AndroidDriver driver) {
        UiAutomator2Options options = new UiAutomator2Options();
        // real device
        options.setPlatformName("Android");
        options.setPlatformVersion("14");
        options.setDeviceName("Vivo I2208 API 34");
        options.setAppPackage("com.google.android.gm");
        options.setAppActivity("com.google.android.gm.ConversationListActivityGmail");
        options.noReset().withBrowserName("Chrome");
        options.setAutomationName("UiAutomator2");
        options.withBrowserName("Chrome");

    }

    public void switchToWebViewContext(AndroidDriver Driver) {
        // Method to switch to WebView context
        Set<String> contextHandles = driver.getContextHandles();
        for (String context : contextHandles) {
            if (context.startsWith("WEBVIEW")) {
                driver.context(context);
                break;
            }
        }
    }

    // Utility methods

    public void longPressAction(WebElement ele) {
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(),
                        "duration", 2000));
    }

    public void scrollToEndAction() {
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0

            ));
        } while (canScrollMore);
    }

    public void swipeAction(WebElement ele, String direction) {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId(),

                "direction", direction,
                "percent", 0.75
        ));


    }


    public Double getFormattedAmount(String amount) {
        Double price = Double.parseDouble(amount.substring(1));
        return price;

    }

    public void closeNativeKeyboard() {
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            // Handle exception if hideKeyboard() fails (not all drivers may support this method)
            System.out.println("Keyboard close operation failed: " + e.getMessage());
        }
    }


    public void enter_email_address() {

        try {
            // Attempt to enter a random email address
            String randomEmail = generateRandomEmail();
            WebElement emailInput = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Email ID\"]"));
            emailInput.sendKeys(randomEmail);
        } catch (Exception e) {
            // If entering random email fails, use a predefined email
            WebElement emailId = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Email ID\"]"));
            emailId.sendKeys("venky.123@gmail.com");
        }
    }

    // Method to generate a random email address
    public static String generateRandomEmail() {
        String domain = "example.com"; // Replace with your desired domain
        String username = generateRandomString(10); // Generate a random username
        return username + "@" + domain;
    }

    // Method to generate a random string of specified length
    public static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();


    }

    public void enter_mobile_number() throws InterruptedException {

        // Generate a random 10-digit mobile number starting with 8 or 9
        String mobileNumber = generateRandomMobileNumber();

        // Locate the mobile number input field and enter the random mobile number
        By mobileNumberField = By.xpath("//android.widget.EditText[@text=\"Enter Primary Mobile\"]"); // Replace with actual locator
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);

    }

    // Method to generate a random 10-digit mobile number starting with 8 or 9
    public static String generateRandomMobileNumber() {
        Random random = new Random();

        // Generate the first digit (8 or 9)
        int firstDigit = 8 + random.nextInt(2); // 8 or 9

        // Generate the remaining 9 digits
        StringBuilder sb = new StringBuilder();
        sb.append(firstDigit);
        for (int i = 1; i < 10; i++) {
            sb.append(random.nextInt(10)); // Generate random digits
        }

        return sb.toString();
    }


    public void enter_pan_number() {

        // Generate a random PAN number
        String randomPan = generateRandomPan();

        // Find the PAN input field and enter the random PAN number
        WebElement panNumber = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter PAN Number\"]"));
        panNumber.sendKeys(randomPan);

    }

    // Method to generate a random PAN number
    public static String generateRandomPan() {
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        // First 5 characters
        for (int i = 0; i < 5; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        // Next 4 digits
        sb.append(random.nextInt(10)).append(random.nextInt(10)).append(random.nextInt(10)).append(random.nextInt(10));

        // Last character
        sb.append(chars.charAt(random.nextInt(chars.length())));

        return sb.toString();
    }


//    public void NATquizAnswers() throws InterruptedException {
//
//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]")).click();
//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")).click();
//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]")).click();
//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]")).click();
//        Thread.sleep(2000);
//        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(37)")).click();
//        // driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View[1]")).click();
//        Thread.sleep(5000);
//        //Scroll to end
//        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                        + ".scrollIntoView(new UiSelector().textMatches(\"Submit\"))"));
//
//        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").scrollable(true))"
//                        + ".scrollToEnd(1)"
//        ));
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]")).click();
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]")).click();
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[1]")).click();
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"SalesdriveX - Super-charged sales activities\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View[1]")).click();
//        Thread.sleep(500);
//
//
//    }


    @AfterClass
    public void tearDown() {
        //	driver.quit();


        //	service.stop();

        // Flush Extent Reports
        extent.flush();
        ReportManager.flushReports();

    }

    public WebElement waitForElementVisibility(By locator, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public boolean getWait(int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        return false;
    }


    // Method to extract OTP from message
    protected static String extractOTPFromMessage() {
        try {
            // Wait for the message body element to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement messageBody = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                    "//android.widget.TextView[contains(@text, \"Here's your OTP for your mobile verification\")]"
            )));

            String messageText = messageBody.getText();
            System.out.println("Extracted Message Text: " + messageText);

            // Regex pattern to extract the OTP (adjust pattern as needed)
            Pattern otpPattern = Pattern.compile("\\b\\d{6}\\b"); // Matches a 6-digit number
            Matcher matcher = otpPattern.matcher(messageText);
            if (matcher.find()) {
                String otp = matcher.group();
                System.out.println("Extracted OTP: " + otp); // Debugging statement
                return otp;
            } else {
                System.out.println("OTP pattern not matched.");
            }
        } catch (WebDriverException e) {
            e.printStackTrace(); // Print stack trace for debugging
            System.out.println("Error extracting OTP: " + e.getMessage());
        }
        return null;
    }

    // Method to enter OTP into fields
    protected static void enterOTPIntoFields(String otp) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Ensure OTP is not null and is a valid length
        if (otp == null || otp.length() != 6) {
            System.out.println("Invalid OTP: " + otp);
            return;
        }

        // Split OTP into individual characters and input each one into corresponding field
        for (int i = 0; i < otp.length(); i++) {
            WebElement targetField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(" + i + ")")
            ));
            System.out.println("Entering " + otp.charAt(i) + " into field index " + i); // Debugging statement
            targetField.sendKeys(String.valueOf(otp.charAt(i)));
        }
        Thread.sleep(2000); // Allow time for each digit to be entered
    }

    static void scrollToEnd(AndroidDriver driver) {
        boolean moreElements = true;
        while (moreElements) {
            // Perform a scroll action using UIAutomator
            scrollDownUsingUIAutomator(driver);

//            // Check if the "Cancel" or "Submit" buttons are visible
//            try {
//                // Check for "Cancel" button
//                WebElement cancelButton = driver.findElement(AppiumBy.accessibilityId("Cancel"));
//                if (cancelButton.isDisplayed()) {
//                    moreElements = false;
//                }
//            } catch (Exception e) {
//                // Button not found, continue scrolling
//            }
//
//            try {
//                // Check for "Submit" button if needed
//                WebElement submitButton = driver.findElement(AppiumBy.accessibilityId("Submit"));
//                if (submitButton.isDisplayed()) {
//                    moreElements = false;
//                }
//            } catch (Exception e) {
//                // Button not found, continue scrolling
//            }
   }
    }

    private static void scrollDownUsingUIAutomator(AndroidDriver driver) {
        // Use UIAutomator to scroll down
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"
        ));
    }


    // Method to generate a random name
    public String generateRandomName() {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "Grace"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

}




//    public String gmailOTP(){
//
//
//        // Wait for email body to load
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement emailBody = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.google.android.gm:id/body\")")));
//
//// Extract OTP from the email body (you might need to use regex or specific text extraction logic)
//        String emailText = emailBody.getText();
//// Extract OTP from emailText using regex or string operations
//        String otp = extractOtpFromText(emailText); // Implement this method based on your OTP format
//        public String extractOtpFromText(String text) {
//            // Example regex for a 6-digit OTP
//            Pattern pattern = Pattern.compile("\\b\\d{6}\\b");
//            Matcher matcher = pattern.matcher(text);
//            return matcher.find() ? matcher.group() : "";
//        }






