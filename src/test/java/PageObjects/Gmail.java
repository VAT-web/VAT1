package PageObjects;

import Tests.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Gmail extends BaseTest {
    public AndroidDriver ldriver;
    public AndroidDriver rdriver;

    public void  Gmail_Automation() throws IOException {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
        configprop =new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
    }

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.google.android.gm:id/open_search\"]")
     WebElement Search_Field;



    public void enterInSearchField() throws InterruptedException {
        Search_Field.click();
        Search_Field.sendKeys("Communications");
    }

    }

