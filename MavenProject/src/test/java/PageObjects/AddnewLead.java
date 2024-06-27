package PageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class AddnewLead {
    public WebDriver adriver;
    public WebDriver driver;

    public AddnewLead(WebDriver rdriver) {
        adriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/span[1]/*[1]")
    @CacheLookup
    WebElement plusBtn_click;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement plusAboveBtn_click;

    @FindBy(xpath = "//input[@id='phone']")
    @CacheLookup
    WebElement Enter_MobileNo;

    @FindBy(xpath = "//input[@id='email']")
    @CacheLookup
    WebElement Enter_Email;

    @FindBy(id = "checkBoxWithoutKyc")
    @CacheLookup
    WebElement Slct_WOEkyc;

    @FindBy(xpath = "//span[text()='Get OTP']")
    @CacheLookup
    WebElement Clk_GetOTP;

    @FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
    @CacheLookup
    WebElement DrpDown_Title;

    @FindBy(xpath = "//div[text()='Mr.']")
    @CacheLookup
    WebElement DrpDown_TitleMR;

    @FindBy(xpath = "(//label[text()='First Name']/following::input)[1]")
    @CacheLookup
    WebElement Enter_FirstName;

    @FindBy(xpath = "(//label[text()='Last Name']/following::input)[1]")
    @CacheLookup
    WebElement Last_Name;

    @FindBy(xpath = "(//label[text()='Date of Birth']/following::input)[1]")
    @CacheLookup
    WebElement Enter_DOB;

    @FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[1]")
    @CacheLookup
    WebElement Click_DOB;


    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement Click_Submit;


    public void ClickOnplus() {
        plusBtn_click.click();
    }

    public void ClickOnAbovePlus() {
        plusAboveBtn_click.click();
    }

    public void EnterMobileNo(String mobileno) {
        Enter_MobileNo.sendKeys(mobileno);
    }

    public void EnterEmail(String Email) {
        Enter_Email.sendKeys(Email);
    }

    public void SelectWOEkycCheckbox() {
        Slct_WOEkyc.click();
    }

    public void ClickOnGetOTP() {
        Clk_GetOTP.click();
    }

    public void SelectDropDownTitle() {
        DrpDown_Title.click();
    }

    public void SelectDropDownTitleMR() {
        DrpDown_TitleMR.click();
    }

    public void EnterFirstName(String fname) {
        Enter_FirstName.sendKeys(fname);
    }

    public void EnterLastName(String lname) {
        Last_Name.sendKeys(lname);
    }

    public void EnterDOB(String dob) {
        Enter_DOB.sendKeys(dob);
    }

    public void ClickDOB() {
        Click_DOB.click();
    }


    public void ClickOnSubmit() {
        Click_Submit.click();
    }

    public void Actions() {

        Actions act = new Actions(driver);


    }

    public void MouseHoverMovToElement(WebDriver driver, WebElement element) {

        /**
         * this method provide the functionality to hover the mouse to a particular
         * element.
         */
        Actions a = new Actions(driver);
        a.moveToElement(element).perform();
    }

    public void bottom_Next_button() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                Thread.sleep(1000);  // Adjust the sleep time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

            if (newHeight == lastHeight) {
                break;  // Reached the bottom
            }
            lastHeight = newHeight;
        }
        Thread.sleep(2500);
    }

    public void screenshot(String fileName) throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        // Specify the destination where the screenshot will be saved
        File destFile = new File("C:\\Screenshots\\.png");

        // Copy the screenshot to the destination
        FileUtils.copyFile(srcFile, destFile);
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", element);
    }


    public  void scrollToBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // This script scrolls down to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }
}