package PageObjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddnewLead {
    public WebDriver adriver;

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


}
