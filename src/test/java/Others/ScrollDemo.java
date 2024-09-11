package Others;

import Tests.BaseTest;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ScrollDemo extends BaseTest {

    @Test
    public void ScrollDemoTest() throws MalformedURLException, InterruptedException
    {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        //where to scroll is known prior
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));


        //No prior idea
        scrollToEndAction();


    }


}