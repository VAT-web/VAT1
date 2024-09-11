package PageObjects;

import Tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends BaseTest {

    public AndroidDriver ldriver;

    public LoginPage(AndroidDriver rdriver) throws IOException {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

        configprop = new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
    }

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter your ID eg.ABSR123@edelweisslife.in\"]")
    WebElement txt_UserName;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter your password\"]")
    WebElement txt_Password;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    WebElement btn_LoginButton;


    public void enterUserName() {

        txt_UserName.sendKeys("A05317");
    }

    public void enterPassword() {
        txt_Password.sendKeys(configprop.getProperty("Password"));
    }

    public void clickOnLoginButton() throws InterruptedException {
        btn_LoginButton.click();

    }

}
