package PageObjects;

import Tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class NewLeadPage extends BaseTest {

    public AndroidDriver ldriver;

    public NewLeadPage(AndroidDriver rdriver) throws IOException {
        ldriver=rdriver;
        configprop = new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "android:id/text1")
    WebElement clk_Title;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Mr.\"]")
    WebElement slct_Title;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter First Name\"]")
    WebElement txt_FirstName;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Last Name\"]")
    WebElement txt_LastName;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Email ID\"]")
    WebElement txt_EmailId;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Primary Mobile\"]")
    WebElement txt_MobileNumber;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter PAN Number\"]")
    WebElement txt_PanNumber;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.Button")
    WebElement btn_Submit;

    public void ClickOnTitle() throws InterruptedException {
        clk_Title.click();
        Thread.sleep(1000);
    }

    public void SelectTitle() throws InterruptedException {
        slct_Title.click();
        Thread.sleep(1000);
    }

    public void EnterFirstName() throws InterruptedException {
        txt_FirstName.sendKeys(configprop.getProperty("FirstName"));
        Thread.sleep(1000);
    }

    public void EnterLastName() throws InterruptedException {
        txt_LastName.sendKeys(configprop.getProperty(("LastName")));
        Thread.sleep(1000);
    }

    public void EnterEmailId(){

        // Generate a random email address
        String randomEmail = generateRandomEmaill();

        // Locate the email field element (replace with your actual locator)
        WebElement emailField = txt_EmailId; // Replace with your ID

        // Enter the random email address into the field
        emailField.sendKeys(randomEmail);
    }

    private String generateRandomEmaill() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder email = new StringBuilder();
        Random random = new Random();

        // Generate username (10 characters)
        for (int i = 0; i < 10; i++) {
            email.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Add "@" symbol
        email.append("@");

        // Generate domain (8 characters)
        for (int i = 0; i < 8; i++) {
            email.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Add ".com" extension
        email.append(".com");

        return email.toString();


        //txt_EmailId.sendKeys(configprop.getProperty("Email"));
    }

    public void EnterMobileNumberAndClickSubmit() throws InterruptedException {
        WebElement mobileNumberInput = txt_MobileNumber; // Replace with your locator
        String randomMobileNumber = generateRandomMobileNumberStartingWith9();
        mobileNumberInput.sendKeys(randomMobileNumber);
        //mobileNumberInput.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
//        txt_PanNumber.sendKeys(configprop.getProperty("PanNo"));
        btn_Submit.click();
        Thread.sleep(8000);
    }

    private String generateRandomMobileNumberStartingWith9() {
        Random random = new Random();
        int randomNumber = random.nextInt(900000000) + 100000000; // Generates a 9-digit number
        return "9" + randomNumber;
        //txt_MobileNumber.sendKeys(configprop.getProperty("MobileNo"));
    }

//    public void EnterPanNumber() throws InterruptedException {
//        scrollToEndAction();
//        txt_PanNumber.sendKeys(configprop.getProperty("PanNo"));
//        Thread.sleep(1000);
//    }
//
//    public void ClickOnSubmit() throws InterruptedException {
//        btn_Submit.click();
//        Thread.sleep(5000);
//    }

}
