package PageObjects;

import Tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DashBoardPage extends BaseTest {
    public AndroidDriver ldriver;

    public DashBoardPage(AndroidDriver rdriver) throws IOException {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
        configprop =new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
    }

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
    WebElement clk_ReviewsOnGoing;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]")
    WebElement clk_CompleteNow;



    public void ClickOnReviewsOnGoing() throws InterruptedException {
        clk_ReviewsOnGoing.click();
        Thread.sleep(4000);
    }

    public void ClickOnCompleteNowButton() throws InterruptedException {
        clk_CompleteNow.click();
        Thread.sleep(4000);
    }

}
