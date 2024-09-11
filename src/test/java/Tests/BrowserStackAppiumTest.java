package Tests;

import io.appium.java_client.AppiumDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackAppiumTest {

    public static void main(String[] args) throws MalformedURLException {
        // BrowserStack credentials
        String userName = "venkateshkoochan_3qFVYM";
        String accessKey = "eMKJzn3Ts7sUHrsbGyyL";

        // BrowserStack Appium hub URL
        String hub = "https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";

        // DesiredCapabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("app", "bs://<app-id>"); // Replace <app-id> with your app's BrowserStack ID
        caps.setCapability("device", "iPhone 12"); // Or any other device you want to test on
        caps.setCapability("os_version", "14"); // iOS version
        caps.setCapability("project", "My Project");
        caps.setCapability("build", "Build Number");
        caps.setCapability("name", "BrowserStack Test");

        // Initialize Appium driver
        AppiumDriver driver = new AppiumDriver(new URL(hub), caps);

        // Perform test operations here
        // Example: Open the app and interact with it

        // Close the driver
        driver.quit();
    }
}
