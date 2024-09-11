package PageObjects;

import Tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CDV_CareerInterview extends BaseTest {
    public AndroidDriver ldriver;

    public CDV_CareerInterview(AndroidDriver rdriver) throws IOException {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
        configprop =new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Career Interview\"]")
    WebElement clk_CareerInterviewTab;

    @FindBy(xpath = "//android.widget.Button")
    WebElement btn_InitiateCareerInterview;

    public void ClickOnCareerInterviewTab() throws InterruptedException {
        clk_CareerInterviewTab.click();
        Thread.sleep(1000);
    }

    public void ClickOnInitiateCareerInterviewButton() throws InterruptedException {
        btn_InitiateCareerInterview.click();
        Thread.sleep(10000);

    }

}
