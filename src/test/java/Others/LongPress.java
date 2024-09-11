package Others;

import Tests.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LongPress extends BaseTest {

	@Test
	public void LongPressGesture() throws MalformedURLException, InterruptedException
	{

		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	WebElement ele=	driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(ele);
	String menuText =	driver.findElement(By.id("android:id/title")).getText();
	Assert.assertEquals(menuText, "Sample menu");
	Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
	
		
			
	}
	
	
}
