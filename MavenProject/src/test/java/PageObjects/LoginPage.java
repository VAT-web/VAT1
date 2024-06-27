package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver ldriver;
    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }
    @FindBy(xpath="//input[@id='email']")
    WebElement txt_empid;
    @FindBy(xpath = "//input[@id='password']")
    WebElement txt_password;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement  btn_login;

    public void enterEmpid(String empid) {
        txt_empid.sendKeys(empid);
    }

    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }

    public void ClickOnLogin(){
        btn_login.click();
    }
}
