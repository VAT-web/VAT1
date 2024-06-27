package PreauthPREPROD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PreauthRegistrationPreProd {
    private static WebDriver driver;

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


        //To click the Inward Softcopy Button
        driver.findElement(By.linkText("Claim User Home")).click();

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
        driver.findElement(By.xpath("//div[text()='Cashless']")).click();

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
        Thread.sleep(1000);

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
        Thread.sleep(500);

        //  Inward id enter in the text box
        WebElement destinationElement1 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement1.sendKeys(numbersOnly.toString());
        Thread.sleep(1000);

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(3000);

        //Next button - click - Claim user home page
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(4000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,300)", "");


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
        driver.findElement(By.xpath("(//label[text()='Retail']/following::input)[1]")).click();

        //Text box - Enter Mem id
        driver.findElement(By.xpath("(//label[text()='Enter...']/following-sibling::input)[1]")).sendKeys("000hjak189103028");

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

        //Date - Mem details tab
        driver.findElement(By.xpath("(//label[text()='dd-mm-yyyy']/following::input)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//button//div[text()=2]")).click();
        Thread.sleep(2000);

        //Time - Mem Detail tab
        driver.findElement(By.xpath("(//label[text()='Select..']/following-sibling::input)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='00']")).click();

        //Coverage select - Mem details tab
        driver.findElement(By.xpath("(//div[@class='v-select__selections']//input)[1]")).click();
        Thread.sleep(1000);
        //DropdownSelect - Coverage - Mem details tab
        driver.findElement(By.xpath("//div[text()='In Patient Treatment']")).click();

        //Save - Mem details tab
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(5000);

        //Potential duplicate Yes
        //driver.findElement(By.xpath("//div[@class='v-card__actions']//button[1]")).click();
        //Thread.sleep(4500);


        //Next - Mem details tab
        driver.findElement(By.xpath("//i[text()='arrow_forward']")).click();
        Thread.sleep(5000);

        //Potential duplicate Yes
        //driver.findElement(By.xpath("//div[@class='v-card__actions']//button[1]")).click();
        //Thread.sleep(5000);


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
        Thread.sleep(20000);

        //Select checkbox - treating doctor popup - provider search - provider details tab
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();
        Thread.sleep(1000);

        //Save button - treating doctor popup - provider search - provider details tab
        driver.findElement(By.xpath("//span[text()='Select']")).click();
        Thread.sleep(2000);

        //Save button - Provider details screen
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(4500);

        //Next button - Provider details screen
        driver.findElement(By.xpath("//span[text()='Save']/following::button[contains(@class,'text-capitalize px-3')]//span")).click();
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
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(2000);

        //Next button - click - Patient details from hospital
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(4000);

        //Select intimation
        //driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[1]")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("(//span[text()='Select']/following::input[@id='[object Object]']/following-sibling::div)[1]")).click();
        //Thread.sleep(500);
        //driver.findElement(By.xpath("//span[text()=' Tag ']")).click();
        //Thread.sleep(500);

        //
        driver.findElement(By.xpath("(//label[text()='Picker in menu']/following::input)[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[text()='00']")).click();

        //Emergency planned radio button - Patient admission details screen
        driver.findElement(By.xpath("(//input[@role='radio']/following-sibling::div)[1]")).click();

        //Expected date of discharge - Patient admission details screen
        driver.findElement(By.xpath("(//label[text()='Planned']/following::input)[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//div[text()=30]")).click();
        Thread.sleep(500);

        //Days in ICU - Patient admission details screen
        driver.findElement(By.xpath("(//label[text()='Planned']/following::input)[3]")).sendKeys("3");
        Thread.sleep(500);

        //Room type - Patient admission details screen
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Triple Sharing Non AC']")).click();

        //Exp cost of Hospitalization - Patient admission details screen
        driver.findElement(By.xpath("(//v-text[@class='font-weight-bold cstm-clr-pr-Ms']/following::span[text()=' Ailment ']/following::input)[3]")).sendKeys("100");

        //
        driver.findElement(By.xpath("(//input[@id='10']/following-sibling::div)[2]")).click();
        Thread.sleep(500);

        //Save button - patient admission details screen
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(3500);

        //Next Button - Patient admission detatils
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3500);
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
        Thread.sleep(4500);

        //Enter Invoice Number -Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("123455");

        //Date select-Invoice addition screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//button//div[text()='28']")).click();

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
        driver.findElement(By.xpath("(//label[text()='Enter gross amount']/following::input)[1]")).sendKeys("100");
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
        Thread.sleep(500);

        //Submit button
        driver.findElement(By.xpath("(//span[text()='Submit'])[3]")).click();
        Thread.sleep(2000);


        //Global calculate button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Global Calculate']")).click();
        Thread.sleep(4000);

        //Save button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();

        Thread.sleep(5000);


        //Return button in popup-Billing screen
        driver.findElement(By.xpath("//span[text()='Return ']")).click();
        Thread.sleep(1000);


        //Submit button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Save']/following::span[text()='Submit']")).click();

        Thread.sleep(5000);

        WebElement a = driver.findElement(By.xpath("//div[@class='v-snack__content']//div[1]"));
        System.out.println(a.getText());










        //Claim id Created successfully - Starts From DPC










        //Side menu - DPC button  //
        driver.findElement(By.xpath("(//i[text()='queue'])[3]")).click();
        Thread.sleep(2000);

        //  Inward id enter in the text box
        WebElement destinationElement2 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement2.sendKeys(numbersOnly.toString());
        Thread.sleep(1000);


        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Assign to user - in DPC Q
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[text()='binayak trip']")).click();

        //Assign button click - In DPC Q
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(2000);

        //Claim User home button - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();
        Thread.sleep(1000);







        //Statring the DPC screen form Cliam user home page






        //  Inward id enter in the text box
        WebElement destinationElement3 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement3.sendKeys(numbersOnly.toString());
        Thread.sleep(1000);


        //Click on Search button - In Claim user home
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Click on Next button - In Claim User Home Screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(4000);

        // OR

        //Next button - In claim user Home page
        //driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();


        //Tag claim to case - Click - IDC/PCS Screen
        driver.findElement(By.xpath("//span[text()='Tag Claim To Case']")).click();
        Thread.sleep(2000);

        //Selection of tag - in ICD/PCS screen
        driver.findElement(By.xpath("(//span[@class='v-btn__content']//span)[2]")).click();
        Thread.sleep(2000);

        //Click on Add Diagonosis - in ICD/PCS Screen
        driver.findElement(By.xpath("//button[contains(@class,'rounded-0 btnTextColor')]//span[1]")).click();
        Thread.sleep(1000);

        //Enter Diagonosis Name - In ICD/PCS Screen
        driver.findElement(By.xpath("(//span[text()='ICD 10 PCS code']/following::input)[1]")).sendKeys("Diag1");
        Thread.sleep(1000);

        //Search - ICD code -Add Diagonosis popup - ICD/PCS Screen
        driver.findElement(By.xpath("(//span[text()='Search'])[2]")).click();
        Thread.sleep(3000);

        //Block code - click -ICD popup- Add Diagnosis popup - In ICD/PCS Screen
        driver.findElement(By.xpath("(//label[text()='Select...']/following-sibling::div)[3]")).click();
        Thread.sleep(1500);

        //Select Block code -ICD popup-  Add Diagnosos popup - In ICS/PCS Screen
        driver.findElement(By.xpath("//div[text()='A00-A09']")).click();

        //Search button -ICD popup- Add Diagnosos popup - In ICS/PCS Screen
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div/div[3]/div/button[2]/span")).click();
        Thread.sleep(2000);

        //Radio buttion - ICD popup- Add Diagnosos popup - In ICS/PCS Screen
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();

        //Proposed line of traetment - Add Diagnosis popup - ICD PCS Screen
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
        Thread.sleep(700);
        driver.findElement(By.xpath("//div[text()='Medical']")).click();

        //Rout of drug.. - Add diagnosos popup - ICD /PCS screen
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//div[text()='Oral']")).click();

        //Add - button click - Add diagnosis popup - ICD/PCS Screen
        driver.findElement(By.xpath("//span[text()='Add ']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollTo(0,1000)", "");

        //Injury Details - Enter - ICD/PCS Screen
        driver.findElement(By.xpath("(//v-text[text()=' Injury Details ']/following::div[@class='v-text-field__slot']//input)[1]")).sendKeys("Fever");

        //Cause - Icd/Pcs Screen
        driver.findElement(By.xpath("//label[@class='v-label theme--light']/following-sibling::div[1]")).click();
        driver.findElement(By.xpath("//div[text()='Self-inflicted']")).click();

        //Serach button - Injury ICD code - ICD/PCS screen
        driver.findElement(By.xpath("//button[contains(@class,'text-capitalize mt-8')]//span[1]")).click();
        Thread.sleep(3000);

        //Block code - ICD search popup - ICD/PCS Screen
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div/div[1]/div[2]/div/div/div/div[1]/div[1]/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='A00-A09']")).click();

        //Search button - ICD search popup - ICD/PCS Screen
        driver.findElement(By.xpath("//div[@class='flex xs9']/following::span[text()='Search']")).click();
        Thread.sleep(1000);

        //Radio button - ICD Serach popup - ICD/PCS Screen
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();

        //Save button - ICD/PCD screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(3000);

        //Submit button - ICD/PCS Screen
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(4000);







        // Starts from Commecrcial approval








        //Commercial scutiny q - From side menu
        driver.findElement(By.xpath("(//i[text()='payment'])[2]")).click();
        Thread.sleep(1000);

        //  Inward id enter in the text box
        WebElement destinationElement4 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement4.sendKeys(numbersOnly.toString());
        Thread.sleep(1000);

        //Search button - click - Commercial scrutiny Q
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1500);

        //Assign user - click - Commercial scurutiny Q
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[text()='user approval']")).click();

        //Action - Assign button click - Commercial srutiny Q
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(500);


        //Claim user home button click - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();

        //  Inward id enter in the text box
        WebElement destinationElement5 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement5.sendKeys(numbersOnly.toString());
        Thread.sleep(1000);

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Next button click - Claim ser home screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(5000);

        //Commecial Adjuducation checklist - Commecrial approval Screen
        driver.findElement(By.xpath("//span[text()='Commercial Adjudication Checklist ']")).click();
        Thread.sleep(3000);

        //Commercial checklist screen - Checkbox's - click - Commercial approval screen
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[1]")).click();
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]")).click();
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[3]")).click();
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[4]")).click();

        //Commercial checklist screen - comments - enter - Commerical approval screen
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[1]")).sendKeys("Comment1");
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[2]")).sendKeys("Comment2");
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[3]")).sendKeys("Comment3");
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[4]")).sendKeys("Comment4");

        //Commercial checklist screen - Save - Commecrial approval screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(4000);

        //Approve - button - commecrial approval srceen
        driver.findElement(By.xpath("//span[text()='Approve ']")).click();
        Thread.sleep(6500);

        //Worning screen - checklist check - Commercial approval screen
        //driver.findElement(By.xpath("//div[@class='v-input--selection-controls__input']//div[1]")).click();

        //Warning screen - comments - enter - Commercaila approval screen
        //driver.findElement(By.xpath("//div[@class='v-text-field__slot']//textarea[1]")).sendKeys("Comment1");

        //waring screen - Save button - Commercaila approval screen
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(3000);

        //warning screen - Submit - Commercaila approval screen
        //driver.findElement(By.xpath("//span[text()='Submit']")).click();
        //Thread.sleep(2000);

        //Approve - Button - Commercial approval screen
        //driver.findElement(By.xpath("//span[text()='Approve ']")).click();
        //Thread.sleep(6000);








        //Starts from Medical Scutiny Q







        //Medical scrutiny button - From side menu
        driver.findElement(By.xpath("//i[text()='local_hospital']/following::i[text()='view_list']")).click();
        Thread.sleep(1500);

        //  Inward id enter in the text box
        WebElement destinationElement6 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement6.sendKeys(numbersOnly.toString());
        Thread.sleep(1000);

        //Search - button click - Medical scrutiny Q
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Assign to User - click - Medical Scutiny Q
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[text()='medical approver']")).click();

        //Assign button click - Medical scrutiny Q
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(1000);

        //Claim user home button click - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();

        //  Inward id enter in the text box
        WebElement destinationElement7 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement7.sendKeys(numbersOnly.toString());
        Thread.sleep(1000);

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1500);

        //Next button click - Claim ser home screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(4000);

        //Medical adjudication checklist button click - Medical approval Q
        driver.findElement(By.xpath("//span[text()=' Medical Adjudication Checklist ']")).click();
        Thread.sleep(3000);

        //Check boxes - click - In Medical checklist screen- Medical approval Q
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
        Thread.sleep(4000);

        //submit button - Medical checklist - Medical approval Q
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(4000);

        //Approval remarks - Enter - Medical aprroval Q
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[1]")).sendKeys("Approved");

        //Aprove - Button click - Medical approval Q
        driver.findElement(By.xpath("//span[text()='Approve ']")).click();
        Thread.sleep(6500);


        //Warning screen - Check box click - Medical Approval Q
        //driver.findElement(By.xpath("//div[@class='v-input--selection-controls__input']//div[1]")).click();

        //Warning screen - Comment - Enter - Medical Approval Q
        //driver.findElement(By.xpath("//div[@class='v-text-field__slot']//textarea[1]")).sendKeys("Comment");

        //Save button - Warning screen - Medical approval Q
        //driver.findElement(By.xpath("//span[text()='Save']")).click();
        //Thread.sleep(3500);

        // Submit button - Warning screen - Medical approval Q
        //driver.findElement(By.xpath("//span[text()='Submit']")).click();
        //Thread.sleep(2000);

        //Approval remarks - Enter - Medical aprroval Q
        //driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//textarea)[1]")).sendKeys("Approved");

        //Aprove - Button click -
        //driver.findElement(By.xpath("//span[text()='Approve ']")).click();
        //Thread.sleep(6000);



    }
}
