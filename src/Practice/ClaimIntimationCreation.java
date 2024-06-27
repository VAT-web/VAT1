package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ClaimIntimationCreation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("debuggerAddress", "localhost:9494");

        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://wecare-uat.tataaig.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[1]/div/div[2]/div/div[3]")).click();

        driver.findElement(By.id("input-40")).sendKeys("Masterone");
        driver.findElement(By.id("input-43")).sendKeys("Iorta@2021");
        Thread.sleep(10000);

        //To click login button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/button")).click();
        Thread.sleep(4000);

        // After login - To click close button on Popup
        driver.findElement(By.xpath("//button[contains(@class,'ml-16 v-btn')]//span[1]")).click();
        Thread.sleep(1000);

        // To click on claims Logo
        driver.findElement(By.xpath("//span[text()='Claims ']")).click();



        driver.findElement(By.xpath("//v-list-tile-title[text()='Claims Intimation']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Claim Intimation Search']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Create New Intimation ']")).click();
        driver.findElement(By.xpath("//span[text()='Create New Intimation ']")).click();
        Thread.sleep(500);

        //Radio button - Retail
        WebElement radioElement = driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]"));
        boolean selectState = radioElement.isSelected();

        if(selectState == false) {
            radioElement.click();
        }

        //Radio button - Mem id
        driver.findElement(By.xpath("(//label[text()='Retail']/following::input)[1]")).click();

        //Text box - Enter Mem id
        driver.findElement(By.xpath("(//label[text()='Enter...']/following-sibling::input)[1]")).sendKeys("000hjak189102008");

        //Radio button click - Policy number
        //driver.findElement(By.xpath("//input[@value='search2']")).click();

        //Enter Policy number
        //driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("0235057738");

        //Search - Click
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[1]")).click();
        Thread.sleep(1000);

        //Radio button - Select work item from search result
        driver.findElement(By.xpath("(//span[@class='v-btn__content']/following::div[@class='v-input--selection-controls__ripple'])[9]")).click();
        Thread.sleep(1000);

        //Okay - Click
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//label[@class='v-label theme--light']/following-sibling::input)[1]")).sendKeys("9666191927");
        driver.findElement(By.xpath("(//label[@class='v-label theme--light']/following-sibling::input)[2]")).sendKeys("jogu.satyanarayana@iorta.in");

        driver.findElement(By.xpath("(//label[@class='v-label theme--light']/following-sibling::input)[3]")).sendKeys("Fever");

        driver.findElement(By.xpath("(//div[@class='v-input__append-inner']//button)[2]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[text()='Ram hospital']")).clear();
        Thread.sleep(500);

        driver.findElement(By.xpath("(//input[@role='button'])[1]")).sendKeys("02-03-2023");

        driver.findElement(By.xpath("(//div[@class='v-select__selections']//input)[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Call center']")).click();
    }
}