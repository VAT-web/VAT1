package CashlessclaimfilePREPROD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CashlessClaimFilePreProd {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions opt=new ChromeOptions();
        opt.setExperimentalOption("debuggerAddress", "localhost:9494");

        WebDriver driver=new ChromeDriver(opt);
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
        Thread.sleep(5000);


        // After login - To click close button on Popup
        driver.findElement(By.xpath("//button[contains(@class,'ml-16 v-btn')]//span[1]")).click();

        // To click on claims Logo
        driver.findElement(By.xpath("//span[text()='Claims ']")).click();





        // Proceed for Cashless claim file





        //To click the Inward Soft-copy Button
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
        driver.findElement(By.xpath("//div[text()='Cashless Claim File']")).click();

        //Claim Sub Type
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
        driver.findElement(By.xpath("//div[text()='New']")).click();

        //Enter claim id
        driver.findElement(By.xpath("(//label[text()='Select..']/following::input)[1]")).sendKeys("4000003491");//aq
        Thread.sleep(500);
        //Select Feature
        driver.findElement(By.xpath("(//div[@class='v-select__selections']//input)[1]")).click();
        driver.findElement(By.xpath("//div[text()='A']")).click();

        //Add document button
        driver.findElement(By.xpath("//span[text()='Add Document ']")).click();

        //Document Type
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Member Health Card']")).click();

        //Photocopy
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
        driver.findElement(By.xpath("//div[text()='Yes']")).click();
        Thread.sleep(500);

        //Document date
        driver.findElement(By.xpath("//th[text()='Document No.']/following-sibling::th/following::input[@role='button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//button//div[text()='17']")).click();
        Thread.sleep(500);

        //Select Document & Upload
        driver.findElement(By.xpath("//*[@id=\"table-reviewCharges-1\"]/tbody/tr/td[5]/button/span")).click();
        WebElement browse = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        browse.sendKeys("D:\\Screenshots\\Screenshot_1.png");
        Thread.sleep(1000);

        // Click on Upload Button
        driver.findElement(By.xpath("(//input[@type='file']/following::span[@class='v-btn__content'])[2]")).click();

        //Click on submit
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[6]/div[1]/button[2]")).click();
        Thread.sleep(1000);

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







        //Inward id created successfully






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

        //Search button click - DEO Q
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1500);

        //Assign to User and click on action button
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[text()='Tripathy binayak']")).click();
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(2000);






//        //Claim registration button - From side menu
//        driver.findElement(By.xpath("(//i[text()='queue']/following::i[text()='local_hospital'])[8]")).click();
//        JavascriptExecutor js6 = (JavascriptExecutor) driver;
//        js6.executeScript("window.scrollTo(0,0)", "");
//        Thread.sleep(1000);
//
//        //Cashless claim Radio button - claim registration screen
//        WebElement radioElement1 = driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]"));
//        boolean selectState1 = radioElement1.isSelected();
//
//        if(selectState1 == false) {
//            radioElement1.click();
//        }
//
//        //Pre-auth number Enter - Claim Registration Screen
//        driver.findElement(By.xpath("//div[@class='v-select__slot']//input[1]")).sendKeys("40000");
//        driver.findElement(By.xpath("//div[@class='v-select__slot']//input[1]")).sendKeys("01501");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[@class='v-list-item__title']//span[1]")).click();
//
//        //Next button click - Claim registration screen
//        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[2]")).click();
//        Thread.sleep(3000);
//
//        //Supervisor Data entry Q - From side menu
//        driver.findElement(By.xpath("(//i[text()='toc'])[2]")).click();
//
//        //Claim id field - Enter - DEO Q
//        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("335287820723");
//
//        //Search button click - DEO Q
//        driver.findElement(By.xpath("//span[text()='Search']")).click();
//        Thread.sleep(1000);
//
//        //Assign to User and click on action button
//        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
//        driver.findElement(By.xpath("//div[text()='Tripathy binayak']")).click();
//        driver.findElement(By.xpath("//span[text()='Assign']")).click();
//        Thread.sleep(2000);








          //Proceed for cashless claim file from Claim user home page








        //Claim user home button click - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();

        //  Inward id enter in the text box
        WebElement destinationElement1 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement1.sendKeys(numbersOnly.toString());

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Next button click - Claim ser home screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(4000);

        //Invoice addition tab - click - Cashless claim file registration screen
        driver.findElement(By.xpath("//span[text()=' Invoice Addition Screen ']")).click();

        //Edit invoice button
        driver.findElement(By.xpath("(//button[contains(@class,'float-right text-capitalize')]//span)[1]")).click();
        Thread.sleep(4000);

        //Select invoice
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]")).click();

        //Edit Invoice
        driver.findElement(By.xpath("(//button[contains(@class,'float-right text-capitalize')]//span)[1]")).click();
        Thread.sleep(4000);

        ///Save Services -Invoice addition screen - Cashless claim registration
        driver.findElement(By.xpath("(//span[text()='Add Services ']/following::button[contains(@class,'float-right text-capitalize')]//span)[1]")).click();
        Thread.sleep(3000);

        //Submit button click
        driver.findElement(By.xpath("(//span[text()='Submit '])[1]")).click();
        Thread.sleep(4000);
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("window.scrollTo(0,100)", "");
        Thread.sleep(500);

        //Room and nursing charges - add vales - Billing screen
        driver.findElement(By.xpath("(//div[@class='v-expansion-panel']//button)[1]")).click();

        // Units disallowed - enter
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("1");

        //Units disallowed reason
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("D1");

        //Click on - Add button
        driver.findElement(By.xpath("(//span[text()='Add'])[1]")).click();
        Thread.sleep(1000);
        
        //Submit button
        driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).click();
       Thread.sleep(2000);

        //Global calculate button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Global Calculate']")).click();
        Thread.sleep(3000);

        //Save button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(6000);

        //Return button in popup-Billing screen
        driver.findElement(By.xpath("//span[text()='Return ']")).click();
        Thread.sleep(1000);

        //Submit button click -Billing screen
        driver.findElement(By.xpath("//span[text()='Save']/following::span[text()='Submit']")).click();
        Thread.sleep(5000);

        //Commercial scrutiny q - From side menu
        driver.findElement(By.xpath("(//i[text()='payment'])[2]")).click();
        Thread.sleep(2000);

        //  Inward id enter in the text box
        WebElement destinationElement5 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement5.sendKeys(numbersOnly.toString());

        //Search button - click - Commercial scrutiny Q
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(2000);

        //Assign user - click - Commercial scrutiny Q
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[text()='user approval']")).click();

        //Action - Assign button click - Commercial scrutiny Q
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(500);

        //Claim user home button click - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();

        //  Inward id enter in the text box
        WebElement destinationElement6 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement6.sendKeys(numbersOnly.toString());

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Next button click - Claim ser home screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(3000);

        //Commercial approval checklist
        driver.findElement(By.xpath("//span[text()='Commercial Adjudication Checklist ']")).click();
        Thread.sleep(3000);

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
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(4000);

        //Complete approval checkbox
        driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__input']//div)[2]")).click();

        //Approve - button - commercial approval screen
        driver.findElement(By.xpath("//span[text()='Approve ']")).click();
        Thread.sleep(7000);






        //Proceed for Payment






        //Payment Q button  form Side menu
        driver.findElement(By.xpath("(//i[text()='payment'])[3]")).click();
        Thread.sleep(3000);


        //  Inward id enter in the text box
        WebElement destinationElement2 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement2.sendKeys(numbersOnly.toString());

        //Search button - click - Payment Q
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(2000);

        //Assign user - click - Payment Q
        driver.findElement(By.xpath("//label[text()='Select User']/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[text()='new pay']")).click();

        //Action - Assign button click - Payment Q
        driver.findElement(By.xpath("//span[text()='Assign']")).click();
        Thread.sleep(1500);

        //Claim user home button click - From side menu
        driver.findElement(By.xpath("(//i[text()='local_hospital'])[1]")).click();


        //  Inward id enter in the text box
        WebElement destinationElement4 = driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]"));
        destinationElement4.sendKeys(numbersOnly.toString());

        //Search button click - Claim user hom screen
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(1000);

        //Next button click - Claim ser home screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[3]")).click();
        Thread.sleep(3000);

        // Click om add indemnity payment button - Payment screen
        driver.findElement(By.xpath("(//button[contains(@class,'text-capitalize px-3')]//span)[2]")).click();
        Thread.sleep(3000);

        //Payment form - Select Manual cheque  - Payment screen
        driver.findElement(By.xpath("(//div[@class='v-select__slot']//div)[1]")).click();
        driver.findElement(By.xpath("//div[text()='Manual Cheque']")).click();

        //Cheque number - Enter - Payment screen
        driver.findElement(By.xpath("(//p[@class='font-weight-bold cstm-clr-pln-iphd_claims']/following::div[@class='v-text-field__slot']//input)[7]")).sendKeys("0000001");

        //Cheque Date - Payment screen
        driver.findElement(By.xpath("(//p[@class='font-weight-bold cstm-clr-pln-em']/following::input[@role='button'])[1]")).sendKeys("21-01-2023");

        //Save button - Payment screen
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(3000);

        //Submit button - Payment screen
        driver.findElement(By.xpath("//span[text()='Submit']")).click();



    }
}
