package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewNat  {
WebDriver mdriver = new ChromeDriver();

   @Test(priority = 1)
    public void dummyOpen() throws InterruptedException {


       Thread.sleep(10000);

    }

    @Test(priority = 2)
    public void natExamScript() throws InterruptedException {


        String updatedUrl = "https://etlidev.salesdrive.app/sendOtpRequest?user_id=663f4ebab81ab382c532c2cf&lead_id=669f78ac172591e0ca60e3f4";
        //enter otp manually
        mdriver.get(updatedUrl);
        mdriver.manage().window().maximize();
        Thread.sleep(80000);

        mdriver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]")).click();
        Thread.sleep(30000);
        WebElement element9 = mdriver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]"));
        Actions actions9 = new Actions(mdriver);
        actions9.moveToElement(element9).click().perform();
        Thread.sleep(8000);
        WebElement element = mdriver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]"));
        Actions actions = new Actions(mdriver);
        actions.moveToElement(element).click().perform();
        Thread.sleep(6000);
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
