package PageObjects;

import Tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CDV_NAT extends BaseTest {
    public AndroidDriver ldriver;

    public CDV_NAT(AndroidDriver rdriver) throws IOException {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
        configprop =new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"NAT\"]")
    WebElement clk_NATtab;

    @FindBy(xpath = "//android.widget.Button")
    WebElement btn_ShareNAT;

    @FindBy(xpath = "")
    WebElement text_CopyMobileNo;


    public void ClickOnNATtab() throws InterruptedException {
        clk_NATtab.click();
    }

    public void ClickOnShareNAT() throws InterruptedException {
        btn_ShareNAT.click();
        Thread.sleep(6000);
    }

}
