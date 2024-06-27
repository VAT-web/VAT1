package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Downloads\\SathyaData\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https//:www.google.com");
    }


}
