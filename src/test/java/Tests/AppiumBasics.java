package Tests;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumBy;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class AppiumBasics extends BaseTest {

	@Test
	public void WifiSettingsName() throws MalformedURLException {
		// Get the test object from BaseTest
		ExtentTest test = BaseTest.createTest("WiFi Settings Name", "Verify setting WiFi name");

		try {
			// Locate the element by accessibility id
			driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			test.log(Status.PASS, "Clicked on Preference");

			// Click on "3. Preference dependencies"
			driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
			test.log(Status.PASS, "Clicked on '3. Preference dependencies'");

			// Click on the checkbox
			driver.findElement(By.id("android:id/checkbox")).click();
			test.log(Status.PASS, "Clicked on the checkbox");

			// Click on the second RelativeLayout element
			driver.findElements(By.className("android.widget.RelativeLayout")).get(1).click();
			test.log(Status.PASS, "Clicked on the second RelativeLayout");

			// Verify Alert Title
			String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
			Assert.assertEquals(alertTitle, "WiFi settings", "Alert title mismatch");
			test.log(Status.PASS, "Alert title verified: " + alertTitle);

			// Enter new WiFi name
			driver.findElement(By.id("android:id/edit")).sendKeys("Sathya_Wifi");
			test.log(Status.PASS, "Entered new WiFi name: Sathya_Wifi");

			// Click on the second button
			driver.findElements(By.className("android.widget.Button")).get(1).click();
			test.log(Status.PASS, "Clicked on the second button");

		} catch (Exception e) {
			// Catch any exceptions during the test steps
			test.log(Status.FAIL, "Exception occurred: " + e.toString());

			// Take screenshot for error reporting
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);

			// Define a path to store the screenshot
			String screenshotPath = "path/to/screenshots/error_screenshot.png";
			File destination = new File(screenshotPath);

			try {
				FileUtils.copyFile(source, destination);
				// Attach the screenshot to the test report
				test.addScreenCaptureFromPath(screenshotPath);
			} catch (IOException ioException) {
				// Log an error if attaching the screenshot fails
				test.log(Status.FAIL, "Failed to attach screenshot: " + ioException.getMessage());
			}

			// Explicitly fail the test
			Assert.fail("Test failed due to exception: " + e.toString());
		}
	}
}