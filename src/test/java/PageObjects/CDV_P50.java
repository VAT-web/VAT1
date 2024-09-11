package PageObjects;

import Tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CDV_P50 extends BaseTest {

    public AndroidDriver ldriver;

    public CDV_P50(AndroidDriver rdriver) throws IOException {
        ldriver=rdriver;
        PageFactory.initElements(rdriver , this);

        configprop =new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"P-50\"]")
    WebElement clk_P50;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Count\"]")
    WebElement txt_P50Count;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    WebElement btn_Upload;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
    WebElement clk_GalleryAndUpload;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Albums\"]")
    WebElement clk_Album;

    @FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[1]")
    WebElement clk_Favorite;
    @FindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"]")
    WebElement slct_Image;

    @FindBy(xpath = "//android.widget.Button")
    WebElement btn_UploadP50;

    public void ClickOnP50(){
        clk_P50.click();
    }

    public void EnterP50Count(){
        txt_P50Count.sendKeys(configprop.getProperty("Count"));
    }

    public void ClickOnUpload() throws InterruptedException {
        btn_Upload.click();
        Thread.sleep(3000);
    }

    public void UploadImage() throws InterruptedException {
        clk_GalleryAndUpload.click();
        Thread.sleep(2000);
//        clk_Album.click();
        Thread.sleep(1000);
//        clk_Favorite.click();
//        Thread.sleep(2000);
        slct_Image.click();
       Thread.sleep(3000);
    }

    public void ClickOnUploadP50() throws InterruptedException {
        btn_UploadP50.click();
        Thread.sleep(4000);
    }



}
