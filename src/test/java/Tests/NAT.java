package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class NAT{

    public Properties configprop;
    public WebDriver mdriver;

    @Test
    public void NAT_Test() throws InterruptedException, IOException {

        Thread.sleep(40000);

        configprop = new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);
        System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
        mdriver = new ChromeDriver();
        mdriver.manage().window().maximize();
        mdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
       // mdriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

        mdriver.get(configprop.getProperty("NATurl"));
        mdriver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]")).click();
        Thread.sleep(30000);
        WebElement element9 = mdriver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]"));
        Actions actions9 = new Actions(mdriver);
        actions9.moveToElement(element9).click().perform();
        Thread.sleep(8000);
        WebElement element = mdriver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]"));
        Actions actions = new Actions(mdriver);
        actions.moveToElement(element).click().perform();
        Thread.sleep(5000);
        mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[1]")).click();
        mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[6]")).click();
        mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[9]")).click();

        WebElement element1 = mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[13]"));
        Actions actions1 = new Actions(mdriver);
        actions1.moveToElement(element1).click().perform();
        WebElement element2 = mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[15]"));
        Actions actions2 = new Actions(mdriver);
        actions2.moveToElement(element2).click().perform();
        WebElement element3 = mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[18]"));
        Actions actions3 = new Actions(mdriver);
        actions3.moveToElement(element3).click().perform();
        WebElement element4 = mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[21]"));
        Actions actions4 = new Actions(mdriver);
        actions4.moveToElement(element4).click().perform();
        WebElement element5 = mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[23]"));
        Actions actions5 = new Actions(mdriver);
        actions5.moveToElement(element5).click().perform();
        WebElement element6 = mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[26]"));
        Actions actions6 = new Actions(mdriver);
        actions6.moveToElement(element6).click().perform();
        WebElement element7 = mdriver.findElement(By.xpath("(//label[@class='ant-radio-button-wrapper click mg-left-top'])[29]"));
        Actions actions7 = new Actions(mdriver);
        actions7.moveToElement(element7).click().perform();
        WebElement element8 = mdriver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']"));
        Actions actions8 = new Actions(mdriver);
        actions8.moveToElement(element8).click().perform();
        Thread.sleep(6000);
        mdriver.quit();

    }
}

