package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email extends BaseTest{
    public void EmailAutomation() {


        try {
            //WebElement messageContainer = mdriver.findElement(By.xpath("(//android.widget.RelativeLayout[@resource-id=\"com.samsung.android.messaging:id/card_view_list_item\"])[3]"));

            // Find the message body inside the container
            WebElement messageBody = mdriver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id='com.samsung.android.messaging:id/bubble_text_view']/android.widget.LinearLayout/android.widget.LinearLayout[@resource-id='com.samsung.android.messaging:id/contents_container']/android.widget.TextView[contains(@text, 'OTP for Aadhaar')])[last()]"));
            String messageText = messageBody.getText();

            // Print the message text to verify it's correctly extracted
            System.out.println("Extracted Message Text: " + messageText);

            // Use regex to extract the OTP from the message text
            Pattern otpPattern = Pattern.compile("Here's your OTP for your mobile verification \\(XX\\d{4}\\) is (\\d{6})");
            Matcher matcher = otpPattern.matcher(messageText);
            if (matcher.find()) {
                String otp = matcher.group(1);
                System.setProperty("Otp", otp);
                // Print the OTP
                System.out.println("Extracted OTP: " + otp);
            } else {
                System.out.println("OTP not found in the message");
            }
        } catch (Exception e) {
            System.out.println("Message container not found: " + e.getMessage());
        }
    }
}