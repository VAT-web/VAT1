package Others;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IOSSlider extends IOSBaseTest {

	
	@Test
	public void IOSSliderTest() throws InterruptedException
	{
		
	WebElement slider =	driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`label == 'AppElem'`]"));	
	slider.sendKeys("0%"); //setValue
	Assert.assertEquals("0%", slider.getAttribute("value"));
	slider.sendKeys("1%");	
	Assert.assertEquals("100%", slider.getAttribute("value"));
	
		
	}
}
