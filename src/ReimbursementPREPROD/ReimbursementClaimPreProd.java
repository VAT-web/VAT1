package ReimbursementPREPROD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class ReimbursementClaimPreProd {
    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions opt=new ChromeOptions();
        opt.setExperimentalOption("debuggerAddress", "localhost:9494");

        WebDriver driver=new ChromeDriver(opt);
        driver.get("https://wecare-preprod.tataaig.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        Thread.sleep(1500);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[1]/div/div[2]/div/div[3]")).click();

        driver.findElement(By.id("input-40")).sendKeys("Masterone");
        driver.findElement(By.id("input-43")).sendKeys("Iorta@2021");
        Thread.sleep(10000);

        //To click login button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/button")).click();
        Thread.sleep(5000);



        //To click the Inward Soft-copy Button
        driver.findElement(By.xpath("//i[text()='description']")).click();

        //Email
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("jogu.satyanarayana@iorta.in");

        //Date
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("10-01-2023");

        //Time
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[3]")).sendKeys("13:05");

        //No.of documents
        driver.findElement(By.xpath("(//span[text()='watch_later']/following::input)[2]")).sendKeys("1");

        //Claim Type
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Reimbursement']")).click();

        //Claim Sub Type
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
        driver.findElement(By.xpath("//div[text()='New']")).click();

        //Add document button
        driver.findElement(By.xpath("//span[text()='Add Document ']")).click();

        //Document Type
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Member Health Card']")).click();

        //Photocopy
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Yes']")).click();

        //Document date
        driver.findElement(By.xpath("//th[text()='Document No.']/following-sibling::th/following::input[@role='button']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//button//div[text()='17']")).click();

        //Select Document & Upload
        driver.findElement(By.xpath("//*[@id=\"table-reviewCharges-1\"]/tbody/tr/td[5]/button/span")).click();
        WebElement browse = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        browse.sendKeys("D:\\Screenshots\\Screenshot_1.png");
        Thread.sleep(1000);

        // Click on Upload Button
        driver.findElement(By.xpath("(//input[@type='file']/following::span[@class='v-btn__content'])[2]")).click();
        WebDriverWait wait2 =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[6]/div[1]/button[2]")));

        //Click on submit
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[6]/div[1]/button[2]")).click();
        WebElement element03 = driver.findElement(By.xpath("//div[@class='v-snack__content']//div[1]"));
        WebDriverWait wait03 = new WebDriverWait(driver, Duration.ofSeconds(18));
        wait03.until(ExpectedConditions.visibilityOf(element03));
        wait03.until(ExpectedConditions.elementToBeClickable(element03));

        // Try to click the web element
        try {
            element03.click();
        } catch (Exception e) {
            // Print error message
            System.out.println("Unable to click the web element: " + e.getMessage());
        }









        //Inward id created successfully - Starts from claim user home page







        // Find the web element containing the numbers
        WebElement sourceElement = driver.findElement(By.xpath("//div[@class='v-snack__content']//div[1]"));
        String sourceText = sourceElement.getText();

        // Extract only the numbers from the text
        StringBuilder numbersOnly = new StringBuilder();
        for (int i = 0; i < sourceText.length(); i++) {
            char c = sourceText.charAt(i);
            if (Character.isDigit(c)) {
                numbersOnly.append(c);
            }
        }

        //Supervisor Data entry Q - From side menu
        driver.findElement(By.xpath("(//i[text()='toc'])[2]")).click();

        //  Inward id enter in the text box
        WebElement destinationElement = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement.sendKeys(numbersOnly.toString());
        Thread.sleep(500);

        //Search button click - DEO Q
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Assign to User and click on action button
        driver.findElement(By.xpath("(//label[text()='Select User']/following::input)[1]")).click();
        driver.findElement(By.xpath("//div[text()='Tripathy binayak']")).click();
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(2000);

        //Claim user home button - from side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();

        //  Inward id enter in the text box
        WebElement destinationElement1 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement1.sendKeys(numbersOnly.toString());

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(2000);


        //Next button - click - Claim user home page
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(4500);

        //Mem search - Details of insured person hospitalized tab
        driver.findElement(By.xpath("//button[contains(text(),'search')]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)", "");

        //Radio button - Retail -Mem search - window Details of insured person hospitalized tab
        WebElement radioElement = driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]"));
        boolean selectState = radioElement.isSelected();

        if(!selectState) {
            radioElement.click();
        }

        //Radio button - Mem id - -Mem search - window - Details of insured person hospitalized tab
        driver.findElement(By.xpath("(//label[text()='Retail']/following::input)[1]")).click();

        //Text box - Enter Mem id - -Mem search - window - Details of insured person hospitalized tab
        driver.findElement(By.xpath("(//label[text()='Enter...']/following-sibling::input)[1]")).sendKeys("000hjak189103028");
        Thread.sleep(1000);

        //Radio button click - Policy number
        //driver.findElement(By.xpath("//input[@value='search2']")).click();

        //Enter Policy number
        //driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("0235056042");
        //Thread.sleep(1000);

                                          //(OR) Group policy

//        // Radio button policy
//        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//input)[3]")).click();
//        //Enter policy number
//        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("0235057741");
//        //Enter mem id
//        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("ABC1/01/025");
//        Thread.sleep(1000);


        //Search - Click - -Mem search - window - Details of insured person hospitalized tab
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[1]")).click();
        Thread.sleep(3000);

        //Radio button - Select work item from search result - -Mem search - window - Details of insured person hospitalized tab
        driver.findElement(By.xpath("(//span[@class='v-btn__content']/following::div[@class='v-input--selection-controls__ripple'])[9]")).click();
        Thread.sleep(1000);

        //Okay - Click - -Mem search - window - Details of insured person hospitalized tab
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(2000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollTo(0,600)", "");
        Thread.sleep(2000);

        //Date - Mem details tab - Details of insured person hospitalized tab
        driver.findElement(By.xpath("(//label[text()='dd-mm-yyyy']/following::input)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//button//div[text()=1]")).click();
        Thread.sleep(3000);

        //Time - Mem Detail tab - Details of insured person hospitalized tab
        driver.findElement(By.xpath("(//label[text()='Select..']/following-sibling::input)[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='00']")).click();

        //Claimed amount - Enter - Details of insured person hospitalized tab
        driver.findElement(By.xpath("(//p[@class='font-weight-bold cstm-clr-pln-iphd_claims']/following::div[@class='v-text-field__slot']//input)[6]")).sendKeys("100");
        Thread.sleep(500);




        //Benefit claimed - Dropdown select - Details of insured person hospitalized tab
        driver.findElement(By.xpath("//input[@id='benifitClaimed']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='In Patient Treatment']")).click();
        Thread.sleep(2000);

        //Save - Details of insured person hospitalized tab
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span/following::button[contains(@class,'text-capitalize px-3')]//span)[5]")).click();
        Thread.sleep(2000);

        //Potential duplicate Yes
        driver.findElement(By.xpath("//span[text()=' Yes ']")).click();
        Thread.sleep(5000);

        //Next - Details of insured person hospitalized tab
        //driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span/following::button[contains(@class,'text-capitalize px-3')]//span)[5]")).click();
        //Thread.sleep(4500);

        //Save button - Insurance history details tab
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(2500);

        //Next button - Insurance history details tab
        driver.findElement(By.xpath("//i[text()='arrow_forward']")).click();
        Thread.sleep(2500);
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollTo(0,0)", "");

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
        Thread.sleep(20000);

        //Select checkbox - treating doctor popup - provider search - provider details tab
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();
        Thread.sleep(1500);

        //Save button - treating doctor popup - provider search - provider details tab
        driver.findElement(By.xpath("//span[text()='Select']")).click();
        Thread.sleep(2500);

        //Save button - Provider details screen
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(3000);

        //Next button - Provider details screen
        driver.findElement(By.xpath("//span[text()='Save']/following::button[contains(@class,'text-capitalize px-3')]//span")).click();
        Thread.sleep(3000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollTo(0,300)", "");
        Thread.sleep(1000);

      /*  //Select intimation - Hospitalization details tab
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@role='radio']/following-sibling::div)[01]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()=' Tag ']")).click();
        Thread.sleep(500);*/

        //In-Patient Registration number - Hospitalization details
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("121212");

        //Room category - Hospitalization details
        driver.findElement(By.xpath("(//div[@class='v-select__slot']//div)[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//v-text[@class='font-weight-bold']/following::div[text()='Daycare']")).click();

        //Hospitalization due to - Hospitalization details
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Injury']")).click();

        //Type of admission - Hospitalization details
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Emergency']")).click();

        //Date of discharge- Hospitalization details
        driver.findElement(By.xpath("(//label[text()='dd-mm-yyyy']/following::input)[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//button//div[text()=30]")).click();

        //Time - Hospitalization details
        driver.findElement(By.xpath("(//v-text[@class='font-weight-bold']/following::input[@role='button'])[4]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='00']")).click();

        //System of medicine - Hospitalization details tab
        driver.findElement(By.xpath("//v-text[text()=' System of medicine ']/following::div[@class='v-text-field__slot']//input")).sendKeys("medicine");
        Thread.sleep(1000);

        //Status at discharge- Hospitalization details tab
        driver.findElement(By.xpath("//div[@class='flex xs6']/following-sibling::div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Discharge to home']")).click();

        //Date of injury - Hospitalization details tab
        driver.findElement(By.xpath("(//v-text[@class='font-weight-bold']/following::input[@role='button'])[5]")).sendKeys("01-02-2023");
        Thread.sleep(500);

        //Injury details - Hospitalization details tab
        driver.findElement(By.xpath("//v-text[text()=' Injury details ']/following::div[@class='v-text-field__slot']//input")).sendKeys("Injury details..");

        //Cause - Hospitalization details tab
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div/div[4]/div/div[3]/div/div/div/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//div[text()='Self-inflicted']")).click();

        //Save- Hospitalization details tab
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(4000);

        //Next - Hospitalization details tab
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(4000);

        //PAN Number - Enter - Bank details screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("BHGAF7676F");

        //Account number - Enter-Bank details screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("123456");

        //IFSC- Bank details screen
        driver.findElement(By.xpath("//div[@class='v-select__slot']//input[1]")).sendKeys("SBI0");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//div[text()='0012959']")).click();
        Thread.sleep(3000);

        //Save-Bank details screen
        //driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        //Thread.sleep(3000);

        //Next-Bank details screen
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(4500);
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("window.scrollTo(0,0)", "");

        //Enter Invoice Number -Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("123455");

        //Date select-Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//button//div[text()='28']")).click();

        //Pincode Enter - -Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[3]")).sendKeys("127245");
        Thread.sleep(1000);

        //Part is hospital checkbox - -Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]")).click();
        Thread.sleep(2000);

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
        driver.findElement(By.xpath("(//label[text()='Enter gross amount']/following::input)[1]")).sendKeys("100");
        Thread.sleep(3000);

        //Save Services -Invoice addition screen
        driver.findElement(By.xpath("(//span[text()='Add Services ']/following::button[contains(@class,'float-right text-capitalize')]//span)[1]")).click();
        Thread.sleep(2500);

        //Submit button click -Invoice addition screen
        driver.findElement(By.xpath("(//span[text()='Submit '])[1]")).click();
        Thread.sleep(3000);

        //Billing tab - click
        driver.findElement(By.xpath("//button[@value='BillingScreen']//span[1]")).click();
        Thread.sleep(1000);

        //Room and nursing charges - add vales - Billing screen
        driver.findElement(By.xpath("(//div[@class='v-expansion-panel']//button)[1]")).click();

        // Units disallowed - enter
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("1");

        //Units disallowed reason
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("D1");

        //Click on - Add button
        driver.findElement(By.xpath("//span[text()='Add']")).click();
        Thread.sleep(1000);

        //Allowances amount - Manual dissonance popup- Billing screen
        driver.findElement(By.xpath("(//span[text()='Action']/following::input)[1]")).sendKeys("1");

        //Disallowed reason - Manual dissonance popup- Billing screen
        driver.findElement(By.xpath("(//span[text()='Action']/following::input)[2]")).sendKeys("D2");
        Thread.sleep(600);

        //Submit button
        driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).click();
        Thread.sleep(2000);

        //Global calculate button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Global Calculate']")).click();
        Thread.sleep(4000);

        //Save button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(5000);


        //Return button in popup-Billing screen
        driver.findElement(By.xpath("//button[contains(@class,'float-right text-capitalize')]//span[1]")).click();
        Thread.sleep(1000);


        //Submit button click -Billing screen
        driver.findElement(By.xpath("//button[contains(@class,'float-right text-capitalize')]//span[1]")).click();
        Thread.sleep(6000);

        WebElement a = driver.findElement(By.xpath("//div[@class='v-snack__content']//div[1]"));
        System.out.println(a.getText());








        //Claim id Created successfully - Starts From DPC







        //Side menu - DPC button
        driver.findElement(By.xpath("(//i[text()='queue'])[3]")).click();
        Thread.sleep(2000);


        //  Inward id enter in the text box & Search
        WebElement destinationElement4 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement4.sendKeys(numbersOnly.toString());

        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Assign to user - in DPC Q
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='binayak trip']")).click();

        //Assign button click - In DPC Q
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(2000);

        //Claim User home button - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();







        //Starting the DPC screen form Claim user home page






        //  Inward id enter in the text box
        WebElement destinationElement3 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement3.sendKeys(numbersOnly.toString());

        //Click on Search button - In Claim user home
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1500);

        //Click on Next button - In Claim User Home Screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(4500);


        //Tag claim to case - Click - IDC/PCS Screen
        driver.findElement(By.xpath("//span[text()='Tag Claim To Case']")).click();
        Thread.sleep(2000);

        //Selection of tag - in ICD/PCS screen
        driver.findElement(By.xpath("(//span[@class='v-btn__content']//span)[2]")).click();
        Thread.sleep(2000);

        //Modality
        driver.findElement(By.xpath("(//div[@class='v-select__selections']//input)[1]")).click();
        driver.findElement(By.xpath("//div[text()='Allopathic']")).click();

        //Ailment
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("Ailment..");

        //Additional details
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("Additonal de..");

        //Injury details - Search ICD
        driver.findElement(By.xpath("(//span[text()='Search'])[1]")).click();
        Thread.sleep(3000);

        //Block code
        driver.findElement(By.xpath("(//span[text()='Claim Details']/following::input)[3]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[text()='A00-A09']")).click();
        driver.findElement(By.xpath("//div[@class='flex xs9']/following::span[text()='Search']")).click();
        Thread.sleep(2000);

        //Select Radio button after ICD search
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();
        Thread.sleep(1000);

        //Discharge Detail
        driver.findElement(By.xpath("(//span[text()='Search'])[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//span[text()='Claim Details']/following::input)[3]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[text()='A00-A09']")).click();
        driver.findElement(By.xpath("//div[@class='flex xs9']/following::span[text()='Search']")).click();
        Thread.sleep(2000);

        //Select Radio button after ICD search
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();
        Thread.sleep(1000);

        //Add diagnosis
        driver.findElement(By.xpath("(//span[text()='Search'])[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//span[text()='Claim Details']/following::input)[3]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[text()='A00-A09']")).click();
        driver.findElement(By.xpath("//div[@class='flex xs9']/following::span[text()='Search']")).click();
        Thread.sleep(2000);

        //Select Radio button after ICD search
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();
        Thread.sleep(1000);

        //Primary Diag - Enter
        driver.findElement(By.xpath("(//span[text()='Action']/following::input)[1]")).sendKeys("Diag1");

        //Line of treatment - drop down select
        driver.findElement(By.xpath("(//div[@class='v-select__selections']//input)[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Medical']")).click();

        //Route of Drug - Drop down select
        driver.findElement(By.xpath("(//div[@class='v-select__selections']//input)[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Oral']")).click();

        //Name of surgery
        driver.findElement(By.xpath("(//div[@slot='append']//button)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[text()='\u200B']/following::input)[1]")).sendKeys("and");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='Remove Of Tissue Exp']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),\"Confirm\")]")).click();
        Thread.sleep(1000);

        //Delete secondary diag
        driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();

        //Details of Producer - enter
        driver.findElement(By.xpath("//span[text()='Delete']/following::input")).sendKeys("Details..");

        //Save
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(3500);

        //Submit
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(4000);







        // Starts from Commercial approval screen







        //Commercial scrutiny q - From side menu
        driver.findElement(By.xpath("(//i[text()='payment'])[2]")).click();
        Thread.sleep(1000);

        //  Inward id enter in the text box
        WebElement destinationElement6 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement6.sendKeys(numbersOnly.toString());

        //Search button - click - Commercial scrutiny Q
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1500);

        //Assign user - click - Commercial scrutiny Q
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[text()='user approval']")).click();

        //Action - Assign button click - Commercial scrutiny Q
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(1000);

        //Claim user home button click - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();

        //  Inward id enter in the text box
        WebElement destinationElement7 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement7.sendKeys(numbersOnly.toString());

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Next button click - Claim ser home screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(3000);

        //Commercial approval checklist
        driver.findElement(By.xpath("//span[text()='Commercial Adjudication Checklist ']")).click();
        Thread.sleep(1000);

        //Commercial checklist screen - Checkboxes - click - Commercial approval screen
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]")).click();
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[3]")).click();
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[4]")).click();

        //Commercial checklist screen - comments - enter - Commercial approval screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[1]")).sendKeys("Comment1");
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[2]")).sendKeys("Comment2");
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[3]")).sendKeys("Comment3");
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[4]")).sendKeys("Comment4");

        //Commercial checklist screen - Save - Commercial approval screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(2000);


        //Approve - button - commercial approval screen
        driver.findElement(By.xpath("//span[text()='Approve ']")).click();
        Thread.sleep(7000);







        //Starts from Medical Approval Q






        //Medical scrutiny button - From side menu
        driver.findElement(By.xpath("//i[text()='local_hospital']/following::i[text()='view_list']")).click();
        Thread.sleep(2000);

        //  Inward id enter in the text box
        WebElement destinationElement8 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement8.sendKeys(numbersOnly.toString());

        //Search - button click - Medical scrutiny Q
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Assign to User - click - Medical Scrutiny Q
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[text()='medical approver']")).click();

        //Assign button click - Medical scrutiny Q
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(1000);

        //Claim user home button click - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();

        //  Inward id enter in the text box
        WebElement destinationElement9 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement9.sendKeys(numbersOnly.toString());

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Next button click - Claim ser home screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(2500);

        //Next button in Medical approval Q
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        //Medical adjudication checklist button click - Medical approval Q
        driver.findElement(By.xpath("//span[text()=' Medical Adjudication Checklist ']")).click();
        Thread.sleep(4000);

        //Check boxes - click - In Medical checklist screen-Medical approval Q
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[1]")).click();
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[3]")).click();
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[4]")).click();

        //Comments enter - Medical checklist screen - Medical approval Q
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[1]")).sendKeys("Comment1");
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[2]")).sendKeys("Comment2");
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[3]")).sendKeys("Comment3");
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[4]")).sendKeys("Comment4");

        //Save button - Medical checklist screen - Medical approval Q
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(2000);

        //submit button - Medical checklist - Medical approval Q
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(2500);

        driver.switchTo().alert().accept();
        Thread.sleep(1000);


        //Approval remarks - Enter - Medical approval Q
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[1]")).sendKeys("Approved");

        //Complete approval checkbox
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]")).click();

        //Approve - Button click - Medical approval Q
        driver.findElement(By.xpath("//span[text()='Approve ']")).click();
        Thread.sleep(7400);


//        //Warning screen - Check box click - Medical Approval Q
//        driver.findElement(By.xpath("//div[@class='v-input--selection-controls__input']//div[1]")).click();
//
//        //Warning screen - Comment - Enter - Medical Approval Q
//        driver.findElement(By.xpath("//div[@class='v-text-field__slot']//textarea[1]")).sendKeys("Comment");
//
//        //Save button - Warning screen - Medical approval Q
//        driver.findElement(By.xpath("//span[text()='Save']")).click();
//        Thread.sleep(3500);
//
//        // Submit button - Warning screen - Medical approval Q
//        driver.findElement(By.xpath("//span[text()='Submit']")).click();
//        Thread.sleep(2000);
//
//        //Approval remarks - Enter - Medical approval Q
//        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[1]")).sendKeys("Approved");
//
//        //Approve - Button click -
//        driver.findElement(By.xpath("//span[text()='Approve ']")).click();
//        Thread.sleep(6000);






        //Starts from Payment screen





        //Payment Q button  form Side menu
        driver.findElement(By.xpath("(//i[text()='payment'])[3]")).click();
        Thread.sleep(3000);

        //  Inward id enter in the text box
        WebElement destinationElement10 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement10.sendKeys(numbersOnly.toString());

        //Search button - click - Payment Q
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(2000);

        //Assign user - click - Payment Q
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[text()='new pay']")).click();

        //Action - Assign button click - Payment Q
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(500);

        //Claim user home button click - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();

        //  Inward id enter in the text box
        WebElement destinationElement11 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement11.sendKeys(numbersOnly.toString());

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Next button click - Claim ser home screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(3000);

//        // Click om add indemnity payment button - Payment screen
//        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[2]")).click();
//        Thread.sleep(3000);
//
//        //Payment form - Select Manual cheque  - Payment screen
//        driver.findElement(By.xpath("(//div[@class='v-select__slot']//div)[1]")).click();
//        driver.findElement(By.xpath("//div[text()='Manual Cheque']")).click();
//
//        //Cheque number - Enter - Payment screen
//        driver.findElement(By.xpath("(//p[@class='font-weight-bold cstm-clr-pln-iphd_claims']/following::div[@class='v-text-field__slot']//input)[7]")).sendKeys("0000001");
//
//        //Cheque Date - Payment screen
//        driver.findElement(By.xpath("(//p[@class='font-weight-bold cstm-clr-pln-em']/following::input[@role='button'])[1]")).sendKeys("21-01-2023");
//
//        //Save button - Payment screen
//        driver.findElement(By.xpath("//span[text()='Save']")).click();
//        Thread.sleep(3000);
//
//        //Submit button - Payment screen
//        driver.findElement(By.xpath("//span[text()='Submit']")).click();



    }
}
