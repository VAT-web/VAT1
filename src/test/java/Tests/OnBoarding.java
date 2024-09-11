package Tests;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

public class OnBoarding extends  BaseTest {

    public void onBoardingPage() {
        WebElement personalDetails = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Personal Details\")"));
        personalDetails.click();
WebElement educationalDetails = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Educational Details\")"));
educationalDetails.click();
WebElement contactDetails = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Contact Details\")"));
contactDetails.click();

    }
}