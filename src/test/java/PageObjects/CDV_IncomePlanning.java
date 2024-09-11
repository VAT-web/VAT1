package PageObjects;

import Tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CDV_IncomePlanning extends BaseTest {

    public AndroidDriver ldriver;

    public CDV_IncomePlanning(AndroidDriver rdriver) throws IOException {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
        configprop =new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Income Planning\"]")
    WebElement clk_IncomePlanning;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Earnings Income\"]")
    WebElement txt_EarningIncome;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]")
    WebElement clk_Quarterly;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Avg Ticket Size\"]")
    WebElement txt_AverageTicketSize;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button")
    WebElement btn_Save;

    public void ClickOnIncomePlanningTab() throws InterruptedException {
        Thread.sleep(1000);
        clk_IncomePlanning.click();
        Thread.sleep(4000);
    }

    public void EnterEarningIncome() throws InterruptedException {
        txt_EarningIncome.sendKeys(configprop.getProperty("Income"));
        Thread.sleep(1000);
    }

    public void ClickOnQuarterly() throws InterruptedException {
        clk_Quarterly.click();
        Thread.sleep(1000);
    }

    public void EnterAverageTicketSize(){
        txt_AverageTicketSize.sendKeys(configprop.getProperty("AverageTicketSize"));
    }

    public void ClickOnSaveButton() throws InterruptedException {
        btn_Save.click();
        Thread.sleep(4000);
    }


}
