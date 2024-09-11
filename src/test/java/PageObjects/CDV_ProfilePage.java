package PageObjects;

import Tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CDV_ProfilePage extends BaseTest {

    public AndroidDriver ldriver;

    public CDV_ProfilePage(AndroidDriver rdriver) throws IOException {
        ldriver=rdriver;
        configprop =new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
        PageFactory.initElements(rdriver , this);
    }

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Spinner")
    static WebElement clk_MeritalStatus;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Unmarried\"]")
    static WebElement slct_MeritalStatus;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Spinner")
    WebElement clk_Occupation;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Private Service\"]")
    WebElement slct_Occupation;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Spinner")
    WebElement clk_Education;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Graduate and above\"]")
    WebElement slct_Education;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Select Date\"]")
    WebElement clk_DOB;

    @FindBy(xpath = "//android.widget.TextView[@text=\"2006\"]")
    WebElement clk_Year;

    @FindBy(xpath = "//android.widget.TextView[@text=\"1994\"]")
    WebElement slct_Year;

    @FindBy(xpath = "//android.view.View[@text=\"July\"]")
    WebElement clk_Month;

    @FindBy(xpath = "//android.widget.TextView[@text=\"January\"]")
    WebElement slct_Month;

    @FindBy(xpath = "//android.widget.TextView[@text=\"1\"]")
    WebElement slct_Date;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Spinner")
    WebElement clk_Income;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Family Income less than 5Lac\"]")
    WebElement slct_Income;


    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Spinner")
    WebElement clk_Conveyance;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"owns a 2 wheeler\"]")
    WebElement slct_Conveyance;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Spinner")
    WebElement clk_SourcingPoll;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Financial Consultant\"]")
    WebElement slct_SourcingPool;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.Spinner")
    WebElement clk_SalesExposure;

    @FindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"No exposure\"]")
    WebElement slct_SalesExposure;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement clk_Influencer;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Relative of social worker, leader, bureaucrat, local club member \"]")
    WebElement slct_Influencer;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Save Changes\"]")
    WebElement btn_SaveChanges;


    public static void SelectMeritalStatus() throws InterruptedException {

        clk_MeritalStatus.click();
        Thread.sleep(1000);
        slct_MeritalStatus.click();
        Thread.sleep(2000);
    }

    public void SelectOccupation() throws InterruptedException {
        clk_Occupation.click();
        Thread.sleep(1000);
        slct_Occupation.click();
        Thread.sleep(1000);
    }

    public void SelectEducation() throws InterruptedException {
        clk_Education.click();
        Thread.sleep(1000);
        slct_Education.click();
    }

    public void SelectDOB() throws InterruptedException {
        clk_DOB.click();
        clk_Year.click();
        slct_Year.click();
        clk_Month.click();
        slct_Month.click();
        slct_Date.click();
        Thread.sleep(3000);
    }

    public void SelectIncome() throws InterruptedException {
        clk_Income.click();
        Thread.sleep(1000);
        slct_Income.click();
        Thread.sleep(1000);
    }

    public void SelectConveyance() throws InterruptedException {
        clk_Conveyance.click();
        Thread.sleep(1000);
        slct_Conveyance.click();
        Thread.sleep(1000);
    }

    public void SelectSourcingPool(){
        clk_SourcingPoll.click();
        slct_SourcingPool.click();
    }

    public void SelectInfluencer(){
        clk_Influencer.click();
        slct_Influencer.click();

    }

    public void SelectSalesExposure(){
        clk_SalesExposure.click();
        slct_SalesExposure.click();
    }

    public void ClickOnSaveChanges() throws InterruptedException {
        btn_SaveChanges.click();
        Thread.sleep(2000);
    }


}
