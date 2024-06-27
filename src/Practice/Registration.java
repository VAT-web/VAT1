package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Registration {
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





        //Search Mem id - Mem details screen
        driver.findElement(By.xpath("//button[contains(text(),'search')]")).click();
        JavascriptExecutor js0 = (JavascriptExecutor) driver;
        js0.executeScript("window.scrollTo(0,0)", "");

        //Radio button - Retail
        WebElement radioElement = driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]"));
        boolean selectState = radioElement.isSelected();

        if(selectState == false) {
            radioElement.click();
        }

        //Radio button - Mem id
        //driver.findElement(By.xpath("(//label[text()='Retail']/following::input)[1]")).click();

        //Text box - Enter Mem id
        //driver.findElement(By.xpath("(//label[text()='Enter...']/following-sibling::input)[1]")).sendKeys("0000056789U01030");

        //Radio button click - Policy number
        driver.findElement(By.xpath("//input[@value='search2']")).click();

        //Enter Policy number
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("0235057738");


        //Search - Click
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[1]")).click();
        Thread.sleep(1000);

        //Radio button - Select work item from search result
        driver.findElement(By.xpath("//input[@id='1']/following-sibling::div[1]")).click();
        Thread.sleep(1000);

        //Okay - Click
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(2000);

        //Date - Mem details tab
        driver.findElement(By.xpath("(//label[text()='dd-mm-yyyy']/following::input)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//button//div[text()=1]")).click();
        Thread.sleep(2000);

        //Time - Mem Detail tab
        driver.findElement(By.xpath("(//label[text()='Select..']/following-sibling::input)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='00']")).click();

        //Coverage select - Mem details tab
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();


        //DropdownSelect - Coverage - Mem details tab
        //driver.findElement(By.xpath("//div[text()='In Patient Treatment']")).click();

        //Save - Mem details tab
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(2500);

        //Potential duplicate Yes
        driver.findElement(By.xpath("//div[@class='v-card__actions']//button[1]")).click();
        Thread.sleep(5000);


        //Next - Mem details tab
        driver.findElement(By.xpath("//i[text()='arrow_forward']")).click();
        Thread.sleep(2000);

        //Potential duplicate Yes
        driver.findElement(By.xpath("//div[@class='v-card__actions']//button[1]")).click();
        Thread.sleep(6000);


        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,350)", "");
        Thread.sleep(1000);

        //Search button click - Provider details tab
        driver.findElement(By.xpath("(//p[@class='font-weight-bold cstm-clr-pln-iphd_claims']/following::input[@readonly='readonly'])[1]")).click();
        Thread.sleep(2000);

        //Entity name - Enter- Provider details tab
        driver.findElement(By.xpath("(//span[text()='Institution ']/following::input)[3]")).sendKeys("Digital provider");

        //Search button click - Provider search - Provider details tab
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(2000);

        //Select radio button - Provider search - provider details tab
        driver.findElement(By.xpath("(//input[@role='radio']/following-sibling::div)[1]")).click();

        //Save button click - provider search - Provider details tab
        driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
        Thread.sleep(16000);

        //Select checkbox - treating doctor popup - provider search - provider details tab
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();
        Thread.sleep(1000);

        //Save button - treating doctor popup - provider search - provider details tab
        driver.findElement(By.xpath("//span[text()='Select']")).click();
        Thread.sleep(2000);

        //Save button - Provider details screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(5000);

        //Next button - Provider details screen
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[5]/div/button[5]/span")).click();
        Thread.sleep(3000);

        //Modality dropdown - Patient details from hospital
        driver.findElement(By.className("v-select__selections")).click();
        driver.findElement(By.xpath("//div[text()='Allopathic']")).click();

        //Nature of illness - Enter - Patient details from hospital
        driver.findElement(By.name("natureOfIllness")).sendKeys("Nature of illness....");

        //Relavent critical - Enter - patient details from hospital
        driver.findElement(By.name("revelentCriticalFindings")).sendKeys("Relevant critical...");

        //Duration of present - Enter - Patient details from hospital
        driver.findElement(By.name("durationOfPresentAlignment")).sendKeys("2");

        //Date of 1st consultant
        driver.findElement(By.xpath("(//label[text()='dd/mm/yyyy']/following::input)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='1']")).click();

        //Past history of present - Enter - Patient details from hospital
        driver.findElement(By.name("pastHistory")).sendKeys("Past history details.....");

        //Save button - click - Patient details from hospital
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(2000);

        //Next button - click - Patient details from hospital
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(4000);

        //Select intimation
        driver.findElement(By.xpath("//span[text()='Select Intimation']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@id='[object Object]']/following-sibling::div)[6]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()=' Tag ']")).click();
        Thread.sleep(500);

        //Emergency planned radio button - Patient admission details screen
        driver.findElement(By.xpath("(//input[@role='radio']/following-sibling::div)[1]")).click();

        //Expected date of discharge - Patient admission details screen
        driver.findElement(By.xpath("(//label[text()='Planned']/following::input)[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//div[text()=6]")).click();

        //Days in ICU - Patient admission details screen
        driver.findElement(By.xpath("(//label[@class='v-label theme--light']/following-sibling::input)[1]")).sendKeys("3");

        //Room type - Patient admission details screen
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Triple Sharing Non AC']")).click();

        //Exp cost of Hospitalization - Patient admission details screen
        driver.findElement(By.xpath("(//v-text[@class='font-weight-bold cstm-clr-pr-Ms']/following::span[text()=' Ailment ']/following::input)[3]")).sendKeys("100");

        //Save button - patient admission details screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(4000);

        //Next Button - Patient admission detatils
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,500)", "");


        //Lumpsum


        //Diallowed amount - Billing screen
        //driver.findElement(By.xpath("(//span[text()='Next']/following::input)[2]")).sendKeys("0");

        //Disallowed reason - billing screen
        //driver.findElement(By.xpath("(//span[text()='Next']/following::input)[3]")).sendKeys("No reasson...");
        //Thread.sleep(1000);

        //Approve amount - Billing screen
        //driver.findElement(By.xpath("(//v-text[@class='font-weight-bold cstm-clr-pr-Ms']/following::div[@class='v-text-field__slot']//input)[4]")).sendKeys("100");

        //Save button - Billing screen
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(4000);

        //Submit button click - Billing screen
        //driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).click();







        //Itemwise





        //Finala approval - checkbox -Billing screen
        driver.findElement(By.xpath("(//input[@role='checkbox']/following-sibling::div)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-card__actions']//button[1]")).click();
        Thread.sleep(2000);

        //To click on Item wise radio button
        driver.findElement(By.xpath("//input[@value='Itemwise']/following-sibling::div[1]")).click();
        Thread.sleep(3000);

        //Enter Invoice Number -Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("123455");

        //Date select-Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//button//div[text()='4']")).click();

        //Pincode Enter - -Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[3]")).sendKeys("127245");
        Thread.sleep(1000);

        //Part is hospital checkbox - -Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]")).click();
        Thread.sleep(3000);

        //Add invoice button - -Invoice addition screen
        driver.findElement(By.xpath("(//button[contains(@class,'float-right text-capitalize')]//span)[2]")).click();
        Thread.sleep(2000);

        //Add Services -  -Invoice addition screen - Single room
        driver.findElement(By.xpath("//span[text()='Add Services ']")).click();

        //Item Description -  -Invoice addition screen
        driver.findElement(By.cssSelector("input[placeholder='Select']")).click();
        Thread.sleep(1000);

        //Type Room in search box -Item Description popup- -Invoice addition screen
        driver.findElement(By.xpath("//p[@class='font-weight-bold cstm-clr-pr']/following::span[text()='Total Net Amount']/following::input")).sendKeys("single");

        //Search button click - Item Description popup -Invoice addition screen
        driver.findElement(By.xpath("(//button[contains(@class,'px-3 text-capitalize')]//span)[1]")).click();
        Thread.sleep(1500);

        //Select radio button click -Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[3]")).click();
        Thread.sleep(1000);

        //Submit button click -Invoice addition screen
        driver.findElement(By.xpath("(//button[contains(@class,'px-3 text-capitalize')]//span)[2]")).click();
        Thread.sleep(1000);

        //Units -Invoice addition screen
        driver.findElement(By.xpath("(//span[text()='Units']/following::span[text()='Action']/following::input)[6]")).sendKeys("2");

        //Gross amount -Invoice addition screen
        driver.findElement(By.xpath("(//label[text()='Enter gross amount']/following::input)[1]")).sendKeys("300");
        Thread.sleep(3000);


        //Save Services -Invoice addition screen
        driver.findElement(By.xpath("(//span[text()='Add Services ']/following::button[contains(@class,'float-right text-capitalize')]//span)[1]")).click();
        Thread.sleep(3000);

        //Submit button click -Invoice addition screen
        driver.findElement(By.xpath("(//span[text()='Submit '])[1]")).click();
        Thread.sleep(4000);


        //Room and nursing charges - add vales - Billing screen
        driver.findElement(By.xpath("(//div[@class='v-expansion-panel']//button)[1]")).click();

        // Untits disallowed - enter
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("1");

        //Untits disallwed resaon
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("D1");

        //Click on - Add button
        driver.findElement(By.xpath("//span[text()='Add']")).click();
        Thread.sleep(1000);

        //Diallowences amount - Manual disaaloence popup- Billing screen
        driver.findElement(By.xpath("(//span[text()='Action']/following::input)[1]")).sendKeys("1");

        //Disallowed reason - Manual disaaloence popup- Billing screen
        driver.findElement(By.xpath("(//span[text()='Action']/following::input)[2]")).sendKeys("D2");

        //Submit button
        driver.findElement(By.xpath("(//span[text()='Submit'])[3]")).click();
        Thread.sleep(2000);


        //Global calculate button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Global Calculate']")).click();
        Thread.sleep(3000);

        //Save button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        Thread.sleep(5000);

        //Return button in popup-Billing screen
        driver.findElement(By.xpath("//span[text()='Return ']")).click();
        Thread.sleep(1000);

        //Submit button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Save']/following::span[text()='Submit']")).click();

        Thread.sleep(5000);

        WebElement a = driver.findElement(By.xpath("//div[@class='v-snack__content']//div[1]"));
        System.out.println(a.getText());



    }
}
