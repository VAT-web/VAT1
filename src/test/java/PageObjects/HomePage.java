package PageObjects;

import Tests.BaseTest;
import Tests.ReportManager;
import ch.qos.logback.classic.util.LoggerNameUtil;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class HomePage extends BaseTest {

    public AndroidDriver ldriver;
    private final WebDriverWait wait;
    public HomePage(AndroidDriver rdriver) throws IOException {
        ldriver = rdriver;
        configprop = new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
        PageFactory.initElements(rdriver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Button/android.widget.Button/android.view.ViewGroup")
    WebElement btn_Plus;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.Button[1]")
    WebElement btn_AddRecruitmentLead;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    WebElement clk_MenuLines;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Recruitment\"])[1]")
    WebElement click_Recruitment;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private WebElement clickOnThreeLines;


    public void clickOnPlusButton() throws InterruptedException {
        btn_Plus.click();
        Thread.sleep(1000);
    }

    public void clickOnAddRecruitmentLead() throws InterruptedException {
        btn_AddRecruitmentLead.click();

    }

    // Reusable wait method for By locator
    private  WebElement waitForElementVisibilitys(By locator, Duration timeout) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickOnThreeLines() {
        try {
            // Wait for the element to be clickable
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(clk_MenuLines));
            element.click();
            ReportManager.getTest().info("Clicked on the 'Three Lines' button.");
            ReportManager.getTest().pass("Successfully clicked on the 'Three Lines' button.");
        } catch (Exception e) {
            ReportManager.getTest().fail("Failed to click on the 'Three Lines' button: " + e.getMessage());

        }

    }
        // Method to click on Recruitment with wait condition and logging
        public void clickOnRecruitment () {
            try {
                // Wait until the element is visible and clickable
                ReportManager.getTest().info("Waiting for Recruitment element to be visible and clickable.");
                WebElement recruitmentElement = wait.until(ExpectedConditions.elementToBeClickable(click_Recruitment));

                // Log the action before clicking
                ReportManager.getTest().info("Clicking on Recruitment element.");
                recruitmentElement.click();

                // Log success
                ReportManager.getTest().info("Successfully clicked on Recruitment element.");
            } catch (Exception e) {
                // Log any exceptions that occur
                ReportManager.getTest().fail("Failed to click on Recruitment element: " + e.getMessage());
            }
        }
    }