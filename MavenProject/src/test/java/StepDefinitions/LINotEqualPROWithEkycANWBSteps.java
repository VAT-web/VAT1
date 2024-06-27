//package StepDefinitions;
//
//
//import PageObjects.AddnewLead;
//import PageObjects.BaseClass;
//import PageObjects.LoginPage;
//import com.beust.ah.A;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en_old.Ac;
//import io.cucumber.java.en_scouse.An;
//import io.cucumber.java.eo.Se;
//import io.cucumber.java.it.Ma;
//import org.junit.Assert;
//import org.openqa.selenium.*;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.awt.*;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.time.Duration;
//import java.time.Instant;
//import java.util.Properties;
//import java.util.Random;
//
//import static java.awt.SystemColor.window;
//import static java.lang.Thread.*;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//
//public class LINotEqualPROWithEkycANWBSteps extends BaseClass {
//
//    @Before
//    public void setup() throws IOException {
//        configprop = new Properties();
//        FileInputStream configpropfile = new FileInputStream("cofig.properties");
//        configprop.load(configpropfile);
//
//        String br = configprop.getProperty("browser");
//
//        if (br.equals("CHROME")) {
//            System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
//            driver = new ChromeDriver();
//        } else if (br.equals("FIREFOX")) {
//            System.setProperty("webdriver.gecko.driver", configprop.getProperty("Firefoxpath"));
//            FirefoxOptions options = new FirefoxOptions();
//            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//            driver = new FirefoxDriver(options);
//        } else if (br.equals("IE")) {
//            System.setProperty("webdriver.ie.driver", configprop.getProperty("IEpath"));
//            driver = new InternetExplorerDriver();
//        }
//
//    }
//
//    @After
//    public void afterScenario(Scenario scenario) {
//        if (scenario.isFailed()) {
//
//            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "FailedScenarioScreenshot");
//
////            String scenarioName = scenario.getName().replaceAll(" ", "_");
////            ScreenshotUtils.captureScreenshot(driver, scenarioName);
//        }
//    }
//
//    @Given("Open Chrome browsers")
//    public void im_on_aviva_login_pages() throws InterruptedException {
//        lp = new LoginPage(driver);
//       AddnewLead AN = new AddnewLead(driver);
//       // PageObjects.AddnewLead AN = new PageObjects.AddnewLead();
//      //  PageObjects.AddnewLead AN = new PageObjects.AddnewLead(driver);
//
//
//
//        this.driver = driver;
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//    }
//
//    @When("Entered Aviva url in search")
//    public void Open_Chrome_browser() throws IOException {
//        configprop = new Properties();
//        FileInputStream configpropfile = new FileInputStream("cofig.properties");
//        configprop.load(configpropfile);
//
//        driver.get(configprop.getProperty("PREPRODURL"));
//
//        // String urL = configprop.getProperty("Url");
////
////        if (urL.equals("DEV")) {
////            driver.get(configprop.getProperty("DevUrl"));
////        } else if (urL.equals("UAT")) {
////            driver.get(configprop.getProperty("UatUrl"));
////        } else if (urL.equals("PREPROD")) {
////            driver.get(configprop.getProperty("PREPRODURL"));
////        } else if (urL.equals("PROD")) {
////            driver.get(configprop.getProperty("ProdUrl"));
////        }
//    }
//
//
//    @When("they enter valid Employee ID and Password")
//    public void they_enter_valid_employee_id_and_password() {
//        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
//        username.sendKeys(configprop.getProperty("preProdUserName"));
//
//        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//       password.sendKeys(configprop.getProperty("PreProPassWord"));
//
//
//    }
//
//    @When("they click on the login button")
//    public void they_click_on_the_login_button() {
//
//        WebElement click_on_Login = driver.findElement(By.xpath("//button[@type='submit']"));
//        click_on_Login.click();
//
//    }
//
//    @Then("they should be logged in successfully")
//    public void they_should_be_logged_in_successfully() {
//
//
//        String text = "AVIVA";
//        assertTrue(text.contains("AVIVA"));
//        System.out.println(text);
//
//
//    }
//
//
//    @Given("I initiated the lead creation process by clicking the Add New Lead icon\\(plus icon)")
//    public void i_initiated_the_lead_creation_process_by_clicking_the_add_new_lead_icon_plus_icon() throws InterruptedException {
//        driver.findElement(By.xpath("//span[@aria-label='plus-circle']//*[name()='svg']")).click();
//        driver.findElement(By.xpath("//span[@aria-label='file-text']//*[name()='svg']")).click();
//        Thread.sleep(3000);
//    }
//
//    @When("I Entered the Mobile number in corresponding text input field")
//    public void i_entered_the_mobile_number_in_corresponding_text_input_field() throws InterruptedException {
//
//
////        Thread.sleep(3000);
//        WebElement MobNumber = driver.findElement(By.xpath("//input[@id='phone']"));
////        MobNumber.sendKeys(configprop.getProperty("MobNumber"));
//        MobNumber.sendKeys("7658994670");
//
//
//    }
//
//    @When("I Entered the Email ID in corresponding text input field")
//    public void i_entered_the_email_id_in_corresponding_text_input_field() {
//
//        WebElement MailId = driver.findElement(By.xpath("//input[@id='email']"));
//        MailId.sendKeys(configprop.getProperty("MailId"));
//
//
//    }
//
//    @When("Is Proposer Same as Life Insured? - I Selected as NO")
//    public void is_proposer_same_as_life_insured_i_selected_as_no() throws InterruptedException {
//        driver.findElement(By.xpath("(//span)[@class=\"ant-select-selection-item\"][2]")).click();
//        driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='No']")).click();
//
//        Thread.sleep(3000);
//    }
//
//    @When("I have chosen the option to proceed with the eKYC by selecting the checkbox")
//    public void i_have_chosen_the_option_to_proceed_with_the_e_kyc_by_selecting_the_checkbox() throws InterruptedException {
//
//        WebElement CheckBox = driver.findElement(By.xpath("//input[@id='checkBox']"));
//        CheckBox.click();
//        Thread.sleep(2000);
//    }
//
//    @When("I Entered the AadhaarNum No in corresponding text input field")
//    public void i_entered_the_AadhaarNum_no_in_corresponding_text_input_field() throws InterruptedException {
//
//        WebElement AadhaarNum = driver.findElement(By.xpath("//input[@id='aadharNumber']"));
//        AadhaarNum.sendKeys(configprop.getProperty("AadhaarNum"));
//
//        Thread.sleep(3000);
//
//    }
//
//    @When("I Clicked on Verify button")
//    public void i_clicked_on_verify_button() throws InterruptedException {
//
//        WebElement VerifyBtn = driver.findElement(By.xpath("//span[text()='VERIFY']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(VerifyBtn).click().perform();
////        driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[6]")).click();
//        Thread.sleep(60000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
////
////        // Scroll down by pixel
//       js.executeScript("window.scrollBy(0, 900)");
//       Thread.sleep(5000);
//    }
//
//
//
//    @Given("Details Of The Life Insured 1")
//    public void Details_of_the_life_insured_1() throws InterruptedException {
//
//driver.findElement(By.xpath("//input[@class=\"ant-radio-input\"]")).click();
//       // driver.findElement(By.xpath("//div[@class=\"icon \"]")).click();
//       // driver.findElement(By.xpath("//div[@class=\"icon \"]")).click();
////        driver.findElement(By.xpath("(//label[text()='City']/following::input)[2]")).click();
//       Thread. sleep(4000);
//
//
//    }
//    @When("I agree to proceed with e-KYC Authentication")
//    public void i_agree_to_proceed_with_e_kyc_authentication() throws InterruptedException {
//
//
////        JavascriptExecutor js2 = (JavascriptExecutor) driver;
////       js2.executeScript("window.scrollTo(0,1000)", "");
//      Thread.  sleep(8000);
//        WebElement CheckBox =  driver.findElement(By.xpath("(//input)[@class=\"ant-checkbox-input\"][3]"));
//        CheckBox.click();
////        Actions Accn = new Actions(driver);
////        Accn.moveToElement(CheckBox).click();
////        Thread.sleep(1000);
//        Thread.sleep(8000);
//
//    }
//
//    @And("I enter the Aadhaar Number")
//    public void i_enter_the_Aadhaar_number() throws InterruptedException {
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//       // WebElement Aadhaar_Number = driver.findElement(By.xpath("(//input)[@class=\"ant-input\"][2]"));
////       WebElement Aadhaar_Number =  driver.findElement(By.xpath("(//input)[@class=\"ant-input\"][3]"));
////
//WebElement  Aadhaar_Number = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[2]/div[2]/form/div/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div/div/span/input"));
//        Aadhaar_Number.click();
//     Aadhaar_Number.sendKeys("906993579910");
//
// driver.findElement(By.xpath("//span[text()='VERIFY']")).click();
//        Thread. sleep(60000);
////        Aadhaar_Number.sendKeys(configprop.getProperty("Aadhaar_Number"));
////        Thread.sleep(6000);
//
//        //driver.findElement(By.xpath("(//button)[@type=\"button\"][2]")).click();
//
//    }
//
//
//
//
//
//
////    @And("I enter the PAN Number")
////    public void i_enter_the_pan_number() throws InterruptedException {
////
////        WebElement PanNum = driver.findElement(By.xpath("//input[@placeholder=\"Enter Pan Number\"]"));
////        PanNum.sendKeys(configprop.getProperty("PanNum"));
////      Thread.sleep(5000);
////    }
//
//    @And("I select the Title")
//    public void i_select_the_title() throws InterruptedException {
////
////driver.findElement(By.xpath("//input[@id=\"titleNameProposer\"]")).click();
////
//
//      //  driver.findElement(By.xpath("//div[contains(text(),'Mr.')]")).click();
////driver.findElement(By.xpath("aria-haspopup=\"listbox\"")).click();
//        Thread. sleep(8000);
//        driver.findElement(By.xpath("(//input)[@aria-autocomplete=\"list\"][6]")).click();
//        Thread. sleep(8000);
//        driver.findElement(By.xpath("//div[text()='Mr.']")).click();
//
//
//    }
//
//
//    @And("I click on state button ")
//    public void i_select_the_state() {
//
//        WebElement dropdown = driver.findElement(By.xpath("//input[@id='accordion_268,\"multiLiState\"']"));
//
//
//        // Create a Select object
//        Select select = new Select(dropdown);
//
//        // Select "Telangana" by visible text
//        select.selectByVisibleText("Telangana");
//    }
//
//    @And("I clicked on City")
//    public void i_select_the_city() {
//
//        WebElement dd = driver.findElement(By.xpath("//input[@id='accordion_268,\"multiLiCity\"']"));
//        Select sel = new Select(dd);
//        sel.selectByVisibleText("Hyderabad");
//    }
//
//
////new //
//
//
//
//    @And("I select the Lead Status ")
//    public void i_select_the_lead_status_as(String string) {
//        WebElement Lead_Status = driver.findElement(By.xpath("//span[@title='Interested']"));
//
//        Select Lead_status = new Select(Lead_Status);
//        Lead_status.selectByVisibleText("Interested");
//
//    }
//    @And("I select the Lead Disposition")
//    public void i_select_the_lead_disposition_as(String string) {
//
//        WebElement Lead_Disposition = driver.findElement(By.xpath("//span[@title=\"Login WIP - Proposal Draft\"]"));
//        Select Lead_dep = new Select(Lead_Disposition);
//        Lead_dep.selectByVisibleText("Login WIP - Proposal Draft");
//
//    }
//
//
//
//    @Then("I clicked on Submit & Proceed button")
//    public void i_Clicked_On_Submit_Proceed_Button() throws InterruptedException {
//
////        driver.findElement(By.xpath("//span[text()='Submit & Proceed']")).click();
////        driver.findElement(By.xpath("//span[normalize-space()='Submit & Proceed']")).click();
////
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, 0);");
//
//        // Find the element you want to click
//        WebElement elementToClick = driver.findElement(By.xpath("//span[text()='Submit & Proceed']"));
//
//        try {
//            // Click on the element
//            elementToClick.click();
//        } catch(org.openqa.selenium.ElementClickInterceptedException e) {
//            // If the click is intercepted, handle the exception
//            System.out.println("Element click intercepted. Trying alternative method...");
//
//            // Scroll the element into view
//            js.executeScript("arguments[0].scrollIntoView();", elementToClick);
//
//            // Wait for the element to be clickable
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//            wait.until(ExpectedConditions.elementToBeClickable(elementToClick));
//
//            // Click on the element again
//            elementToClick.click();
//            Thread.sleep(3000);
//        }
//       JavascriptExecutor js1 = (JavascriptExecutor) driver;
//js1.executeScript("window.scrollTo(0, 0);");
//        Thread.sleep(3000);
//    }
//
////
////    @Given("I am on the Personal Details page")
////    public void i_am_on_the_personal_details_page() throws InterruptedException {
////
////
////    }
//
//
//    @When("I clicked on Lead Details tab")
//    public void i_clicked_on_Lead_details_tab() {
//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        js1.executeScript("window.scrollTo(0, 0);");
//        WebElement element01 = driver.findElement(By.xpath("//div[text()='Lead Details ']"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(element01)).click();
//    }
//
//    @When("I select a Title")
//    public void i_select_a_title() throws InterruptedException {
//
//Thread.sleep(4000);
//      driver.findElement(By.xpath("(//input)[@role=\"combobox\"][6]")).click();
//      Thread.sleep(4000);
//        driver.findElement(By.xpath("//div[text()='Mrs.']")).click();
//
//    }
//
////    @And("I enter a First Name")
////    public void i_enter_a_first_name() {
////
////    }
////
////    @And("I enter a Last Name")
////    public void i_enter_a_last_name() {
////
////    }
//
//    @And("I enter a Father's Name")
//    public void i_enter_a_father_s_name() {
//        WebElement FatherName = driver.findElement(By.xpath("//input[@id='fatherName']"));
//        FatherName.sendKeys(configprop.getProperty("Fathername"));
//
//    }
//
//    @And("I select a Gender")
//    public void i_select_a_gender() {
//
//
//    }
//
//    @And("I select a Marital Status")
//    public void i_select_a_marital_status() throws InterruptedException {
//
//        Thread.sleep(4000);
//        WebElement MartialStatus = driver.findElement(By.xpath("//input[@id='maritalStatus']"));
//        Select Martial_status = new Select(MartialStatus);
//        Martial_status.selectByVisibleText("Single");
//
//    }
//
//    @Then("I  click on proceed button")
//    public void I_Click_on_proceed_button() {
//
//        driver.findElement(By.xpath("//span[normalize-space()='Proceed']")).click();
//    }
//
//    @Then("click on next page proceed button")
//    public void click_on_next_page_proceed_button() {
//
//        driver.findElement(By.xpath("//span[normalize-space()='Proceed']")).click();
//    }
//
//    @When("click on identify needs")
//    public void click_on_identify_needs() {
//
//        WebElement webElement = driver.findElement(By.xpath("//input[@id='Occupation']"));
//        Select salaried = new Select(webElement);
//        salaried.selectByVisibleText("Salaried");
//    }
//
//    @And("click on priority {int}")
//    public void click_on_priority(Integer int1) {
//        WebElement ele1 = driver.findElement(By.xpath("//input[@id='keygoals1']"));
//        Select priority = new Select(ele1);
//        priority.selectByVisibleText("Life Cover");
//
//
//    }
//
//    @And("click on risk profile")
//    public void click_on_risk_profile() {
//
//        WebElement ele2 = driver.findElement(By.xpath("//input[@id='riskProfile']"));
//        Select risk = new Select(ele2);
//        risk.selectByVisibleText("Low Risk: Capital Safe, Conservative");
//
//    }
//
//    @Then("click on submit button")
//    public void click_on_submit_button() {
//
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    }
//
//    @When("I clicked on Aviva New Wealth Builder")
//    public void I_Click_on_ANWB(){
//        WebElement ANWB = driver.findElement(By.xpath("//p[text()='Aviva New Wealth Builder']"));
//        ANWB.click();
//    }
//
//    @And("I clicked on benfit illustriation")
//    public void I_click_on_benfit_illustriation_button(){
//        WebElement elem = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary rounded-2']"));
//        elem.click();
//    }
//
//    @And("I clicked on proceed alert button")
//    public void I_clicked_on_proceed_alert_button(){
//        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//
////        Alert alert = driver.switchTo().alert();
////        alert.accept();
//    }
//
//    @Given("I clicked on gender")
//    public void i_clicked_on_gender() {
//
//
//        WebElement Gender = driver.findElement(By.xpath("//input[@id='selectedProposerGender']"));
//
//        Gender.click();
//        WebElement Male = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Male']"));
//
//        Male.click();
//
//
//
////      Select sel = new Select(Gender);
//// sel.selectByVisibleText("Male");
//
//  }
//    @And("I clicked on policy term")
//    public void i_clicked_on_policy_term() {
//
//
////driver.findElement(By.id("selectedPolicyTerm")).click();
//        driver.findElement(By.xpath("(//span)[@class='ant-select-arrow'][3]")).click();
//        driver.findElement(By.xpath("//span[@title=\"20\"]")).click();
//
//
//    }
//    @And("I clicked on payment frequency")
//    public void i_clicked_on_payment_frequency() {
//
//        driver.findElement(By.xpath("(//span)[@class=\"ant-select-arrow\"][5]")).click();
//        driver.findElement(By.xpath("//span[@title=\"Half Yearly\"]")).click();
//
//    }
////    @And("I clicked on  Premium Payment Term")
////    public void i_clicked_on_premium_payment_term() {
////
////    }
//
//    @And("I clicked on Annualized Premium")
//    public void i_clicked_on_annualized_premium() {
//
//        WebElement premium  = driver.findElement(By.xpath("//input[@id='annualPremium']"));
//        premium.sendKeys(configprop.getProperty("premium"));
//
//    }
//
//    @Then("I cliked on Generete benfit illustriation btn to preocced")
//    public void I_clicked_on_generate_illustration_button(){
//        driver.findElement(By.xpath("//span[normalize-space()='Generate Benefit Illustration']")).click();
//    }
//
//
//    @When("I clicked on Download BI button")
//    public void I_clicked_on_Download_bi_button(){
//        driver.findElement(By.xpath("//span[text()='Download BI']")).click();
//    }
//
//    @Then("I clicked on proceed button")
//    public void I_clicked_on_proceed_button(){
//
//        driver.findElement(By.xpath("I clicked on proceed button")).click();
//    }
//
//@And("I clicked on upload image button")
//    public void I_clicked_on_upload_image_button(){
//
//        WebElement Document =  driver.findElement(By.xpath("//span[contains(text(),'Upload')]"));
//        Document.sendKeys(configprop.getProperty("Document"));
//}
//
//
//
//    @And("I Clicked on OK button after uploading the document")
//    public void Click_on_OK_button_after_uploading_the_document() throws InterruptedException {
//
//        WebElement slider = driver.findElement(By.xpath("(//div[@class='ant-slider-handle'])[3]"));
//        int width = slider.getSize().getWidth();
//        // Initialize Actions class
//        Actions action = new Actions(driver);
//        // Move the slider from left end to right
//        action.clickAndHold(slider).moveByOffset(width, 0).release().perform();
//
//        sleep(1000);
//        driver.findElement(By.xpath("(//div[@class='ant-modal-footer']//button)[2]")).click();
//        sleep(9000);
//    }
//    @And("I clicked on NEXT button")
//    public void I_clicked_on_NEXT_button() throws InterruptedException {
//        WebElement NextButton = driver.findElement(By.xpath("//span[text()='Next']"));
//        NextButton.click();
//        sleep(3000);
//    }
//
//    ////////////////////////////////////////////////////////////////////////////////
//
//
//    @When("I click on the Self Reference in the Aviva Dashboard")
//    public void i_click_on_the_self_reference_in_the_aviva_dashboard() throws InterruptedException {
//
//
//
//        sleep(2000);
//        driver.findElement(By.xpath("//p[normalize-space()='Self/Reference']")).click();
//    }
//    @When("I click on the Filter button")
//    public void i_click_on_the_filter_button() {
//        driver.findElement(By.xpath("//figure[@class='round-cards43']")).click();
//    }
//    @When("I click on Lead ID")
//    public void i_click_on_lead_id() throws InterruptedException {
//
//        sleep(3000);
//        driver.findElement(By.xpath("//span[normalize-space()='Lead ID']")).click();
//    }
//    @When("I enter the lead ID")
//    public void i_enter_the_lead_id() throws InterruptedException {
//        driver.findElement(By.xpath("//input[@placeholder='Enter the Lead’s ID']")).sendKeys("324666");
//sleep(7000);
//    }
//    @When("I click on the Apply button")
//    public void i_click_on_the_apply_button() throws InterruptedException {
//        //driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollTo(0, 0);");
//
//
//
//
//        // Find the element to click
//        WebElement elementToClick = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
//
//        // Scroll to the element's location
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToClick);
//        driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
//
//sleep(10000);
//
//
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Apply']")));
//
//    }
//    @When("I click on the Update button")
//    public void i_click_on_the_update_button() throws InterruptedException {
//
//        WebElement updatedLocator = driver.findElement(By.xpath("//button[text()='Update']"));
//        updatedLocator.click();
//        Thread.sleep(3000);
//
//     //   driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
//    }
//    @When("I click on the Lead Details tab")
//    public void i_click_on_the_lead_details_tab() throws InterruptedException {
//
//
//
//
//        //driver.findElement(By.xpath("//div[text()='Lead Details ']")).click();
//      //  driver.findElement(By.xpath("//div[@id='rc-tabs-1-tab-2']")).click();
//
//
//
//
//        WebElement element2 = driver.findElement(By.xpath("//div[text()='Lead Details ']"));
//       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
//       wait1.until(ExpectedConditions.elementToBeClickable(element2)).click();
//
//
//Thread.sleep(4000);
//
//    }
//
//    @When("I click on the Title and select Mr")
//    public void i_click_on_the_title_and_select_mr() {
//        driver.findElement(By.xpath("//div[@class='ant-select ant-select-borderless select-box ant-select-single ant-select-show-arrow ant-select-show-search']//span[@class='ant-select-selection-item']")).click();
//        driver.findElement(By.xpath("//div[contains(text(),'Mr.')]")).click();
//    }
//    @When("I click on Father and enter father's name")
//    public void i_click_on_father_and_enter_father_s_name() throws InterruptedException {
//
//        driver.findElement(By.xpath("//input[@id='fatherName']")).clear();
//        driver.findElement(By.xpath("//input[@id='fatherName']")).sendKeys("Ram");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, 500);");
//        Thread.sleep(4000);
//    }
//    @When("I click on the Marital Status tab")
//    public void i_click_on_the_marital_status_tab() throws InterruptedException {
//
//        WebElement elementToClick = driver.findElement(By.id("maritalStatus"));
//        elementToClick.click();
////        elementToClick.sendKeys(Keys.ENTER);
//       Thread.sleep(9000);
//    }
//    @When("I click on the Proceed button")
//    public void i_click_on_the_proceed_button() throws InterruptedException {
//
//
////driver.findElement(By.xpath("//span[@normalize-space()='Proceed']")) .click();
//
//
//        WebElement proceedButton = driver.findElement(By.xpath("//span[text()='Proceed']"));
//        proceedButton.click();
//      //  WebElement proceedButton = driver.findElement(By.xpath("//span[text()='Proceed']"));
//      //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", proceedButton);
//
//
//
////
////        Actions actions = new Actions(driver);
////        actions.moveToElement(proceedButton).click().perform();
//        sleep(7000);
//    }
//    @When("I click on the Proceed button again in contact details")
//    public void i_click_on_the_proceed_button_again_in_contact_details() throws InterruptedException {
//
//
//     WebElement againProceed =  driver.findElement(By.xpath("//span[normalize-space()='Proceed']"));
//     Actions ac = new Actions(driver);
//     ac.moveToElement(againProceed).click().perform();
//     Thread.sleep(5000);
//    }
//    @When("I click on Educational Qualification")
//    public void i_click_on_educational_qualification() {
//
//       WebElement grad =  driver.findElement(By.id("educationDetails"));
//     //   driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Graduate']")).click();
//        grad.click();
//        grad.sendKeys(Keys.ENTER);
//
//    }
//    @When("I click on Profession Type")
//    public void i_click_on_profession_type() {
//
//     WebElement sal =   driver.findElement(By.xpath("//span[@title='Salaried']"));
//     Actions accn = new Actions(driver);
//     accn.moveToElement(sal).click().perform();
//       // driver.findElement(By.xpath("//div[contains(text(),'Salaried')]")).click();
//
//
//    }
//    @When("I click on Income Group")
//    public void i_click_on_income_group() throws InterruptedException {
//
////driver.findElement(By.xpath("(//div)[@class=\"ant-select ant-select-borderless select-box ant-select-single ant-select-show-arrow\"][3]")).click();
//        sleep(7000);
//         WebElement el = driver.findElement(By.xpath("//span[text()='Between INR 2.5 Lakh and INR 5 Lakh']"));
//         Actions act = new Actions(driver);
//         act.moveToElement(el).click().perform();
//    }
//    @When("I click on the Proceed button in professional details")
//    public void i_click_on_the_proceed_button_in_professional_details() {
//
//
//
//        driver.findElement(By.xpath("//span[normalize-space()='Proceed']")).click();
//    }
//    @When("I click on the Proceed button in Additional Details functionality")
//    public void i_click_on_the_proceed_button_in_additional_details_functionality() throws InterruptedException {
//
//       // driver.findElement(By.xpath("//span[normalize-space()='Proceed']")).click();
//       WebElement add =  driver.findElement(By.xpath("//span[text()='Proceed']"));
//       Actions actu = new Actions(driver);
//       actu.moveToElement(add).click().perform();
//       Thread.sleep(4000);
//
//
//    }
//
//    @When("i click on Need Analysis tab")
//    public void i_click_on_need_analysis_tab() throws InterruptedException {
//
//        WebElement needAnalysis = driver.findElement(By.xpath("//div[text()='Need Analysis ']"));
//        needAnalysis.click();
//        Thread.sleep(3000);
//    }
//
//
//
//    @When("I click on Occupation of Proposer Policy Holder")
//    public void i_click_on_occupation_of_proposer_policy_holder() throws InterruptedException {
//        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
//        driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Salaried']")).click();
//        Thread.sleep(3000);
//    }
//    @When("I click on Priorityz")
//    public void i_click_on_priority() throws InterruptedException {
//
//
////        Thread.sleep(9000);
////
////       WebElement element1 = driver.findElement(By.id("keygoals1"));
//////Point loc = element1.getLocation();
//////        JavascriptExecutor js = (JavascriptExecutor) driver;
////      // js.executeScript("window.scrollBy"+loc);
////
////        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
////
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
////     wait.until(ExpectedConditions.elementToBeClickable(element1)).click();
////
////
////
////
////        WebElement element2 = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Life Cover']"));
////        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
////        wait.until(ExpectedConditions.elementToBeClickable(element2)).click();
////
////
////
////    }
//
//        WebElement element12 = driver.findElement(By.xpath("//label[text()='Priority 1']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element12);
//        element12.click();
//
//        sleep(1000);
//        driver.findElement(By.id("keygoals1")).click();
//        sleep(1000);
//
//        WebElement element1 = driver.findElement(By.xpath("(//label[@class='ant-form-item-required'])[3]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//        sleep(1000);
//
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        By elementLocator = By.xpath("//div[text()='Life Cover']");
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
//        element.click();
//
////        //driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]"));
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////
////        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
////
////        while (true) {
////            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
////
////            try {
////                Thread.sleep(1000);  // Adjust the sleep time as needed
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////
////            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
////
////            if (newHeight == lastHeight) {
////                break;  // Reached the bottom
////            }
////            lastHeight = newHeight;
////        }
//    }
//    @When("I click on Risk Profile")
//    public void i_click_on_risk_profile() throws InterruptedException {
//
//
//
//        WebElement element2 = driver.findElement(By.id("riskProfile"));
////        Point loc = element2.getLocation();
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy"+loc);
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(element2)).click();
////        JavascriptExecutor js1 = (JavascriptExecutor) driver;
////        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//
//        WebElement g =  driver.findElement(By.xpath("//div[contains(text(),'Low Risk: Capital Safe, Conservative')]"));
//        g.click();
//
//    }
//    @When("I click on the Submit button")
//    public void i_click_on_the_submit_button() {
//
//       WebElement sub =   driver.findElement(By.xpath("//span[normalize-space()='Submit']"));
////       Actions su = new Actions(driver);
////       su.moveToElement(sub).click().perform();
//        sub.click();
//    }
//
//
//     @When("I click on Aviva New Wealth Builder")
//     public void i_click_on_Aviva_new_wealth_builder(){
//
//        driver.findElement(By.xpath("//p[normalize-space()='Aviva New Wealth Builder']")).click();
//     }
//    @When("I click on Benefit Illustration")
//    public void i_click_on_benefit_illustration() throws InterruptedException {
//
//        sleep(8000);
//        driver.findElement(By.xpath("//span[normalize-space()='Benefit Illustration']")).click();
//        sleep(5000);
//        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
////        Alert al=driver.switchTo().alert();
////        al.accept();
////        Thread.sleep(8000);
////        JavascriptExecutor js2 = (JavascriptExecutor) driver;
////        js2.executeScript("window.scrollTo(0,800)", "");
////        Thread.sleep(3000);
//
//
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript("window.scrollBy(0, 800);");
//        Thread.sleep(8000);
//
//    }
//    @When("i select gender")
//    public void select_gender() throws AWTException {
////
////        WebElement gender = driver.findElement(By.id("selectedProposerGender"));
////        gender.click();
////
////        Robot r = new Robot();
////        r.keyPress(KeyEvent.VK_DOWN);
////        r.keyPress(KeyEvent.VK_ENTER);
//        // Perform the first click action
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(13));
//      //  wait.until(ExpectedConditions.titleIs("Salesdrive"));
//        WebElement firstClickElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.p50 > div:nth-of-type(6) span.ant-select-selection-item")));
//        firstClickElement.click();
//
//        // Perform the second click action
//        WebElement secondClickElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.ant-select-item-option-active > div")));
//        secondClickElement.click();
//
//    }
//
//    @When("I click on Policy Terms plan")
//    public void i_click_on_policy_term() throws InterruptedException {
//
//
//
//
//        WebElement element123 = driver.findElement(By.id("selectedPolicyTerm"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element123);
//        try {
//            element123.click();
//        } catch (ElementClickInterceptedException e) {
//            // Retry clicking after scrolling down more
//            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 100);"); // Scroll down by 100 pixels
//            element123.click(); // Try clicking again
//        }
//        sleep(1000);
//
//// If you need to click the same element again, you can repeat the above process
//
//// Alternatively, if you want to click another element after the initial one:
//        WebElement optionElement = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='14']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement);
//        try {
//            optionElement.click();
//        } catch (ElementClickInterceptedException e) {
//            // Retry clicking after scrolling down more
//            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 100);"); // Scroll down by 100 pixels
//            optionElement.click(); // Try clicking again
//        }
//        sleep(1000);
//
//
//    }
//    @When("I click on Payment Frequency - Annual")
//    public void i_click_on_payment_frequency_annual() throws InterruptedException {
//
//        sleep(3000);
//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[8]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
//        sleep(3000);
//driver.findElement(By.xpath("//span[text()='Single Pay']")).click();
//
//
//    }
//    @When("I click on Annualized Premium")
//    public void i_click_on_annualized_premium() throws InterruptedException {
//sleep(1000);
//        driver.findElement(By.xpath("//input[@id='annualPremium']")).sendKeys("75000");
//
//    }
//    @When("I click on Generate BI")
//    public void i_click_on_generate_bi() throws InterruptedException {
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//span[normalize-space()='Generate Benefit Illustration']")).click();
//
//        WebElement element12345 = driver.findElement(By.xpath("//span[normalize-space()='Generate Benefit Illustration']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element12345);
//        try {
//            element12345.click();
//        } catch (ElementClickInterceptedException e) {
//            // Retry clicking after scrolling down more
//            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
//            element12345.click(); // Try clicking again
//        }
//
////        Thread.sleep(5000);
////        WebElement proceedButton = driver.findElement(By.xpath("//span[text()='Proceed']"));
////        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", proceedButton);
////        sleep(10000);
//    }
//
//    @When("bottom")
//    public void bottom() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            try {
//                Thread.sleep(1000);  // Adjust the sleep time as needed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//            if (newHeight == lastHeight) {
//                break;  // Reached the bottom
//            }
//            lastHeight = newHeight;
//        }
//              Thread.sleep(30000);
//    }
//    @When("I click on the Proceed buttons")
//    public void i_click_on_the_proceed_buttons() throws InterruptedException {
//
//
////driver.findElement(By.xpath("//span[@normalize-space()='Proceed']")) .click();
//
//
//        WebElement proceedButton = driver.findElement(By.xpath("//button[@type='submit' and contains(@class, 'ant-btn') and contains(@class, 'ant-btn-default') and contains(@class, 'proceedBtn')]/span[text()='Proceed']"));
//        proceedButton.click();
//
//        Thread.sleep(5000);
//    }
//    @When("I click on Upload the Document")
//    public void i_click_on_upload_the_document() throws InterruptedException, AWTException {
//
//
//        WebElement uploadButton = driver.findElement(By.xpath("//button[contains(., 'Upload')]")); // Locate the button element
//
//
//        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']")); // Locate the hidden file input
//        String filepath = "C:\\Users\\User\\Desktop\\sample_passphoto.jpg"; // Path to the image file
//        fileInput.sendKeys(filepath); // Upload the image file
//
//
//
//    }
//    @When("I click on the OK button")
//    public void i_click_on_the_ok_button() throws InterruptedException {
//        WebElement slider = driver.findElement(By.xpath("(//div[@class='ant-slider-handle'])[3]"));
//        int width = slider.getSize().getWidth();
//        // Initialize Actions class
//        Actions action = new Actions(driver);
//        // Move the slider from left end to right
//        action.clickAndHold(slider).moveByOffset(width, 0).release().perform();
//
//        sleep(1000);
//        driver.findElement(By.xpath("(//div[@class='ant-modal-footer']//button)[2]")).click();
//        sleep(7000);
//        // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
//        sleep(4000);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript("window.scrollBy(0, 800);");
//        sleep(7000);
//
//
//        WebElement NextBtn = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
//        NextBtn.click();
//
//        sleep(5000);
//
//
//    }
//
//    @When("I click on Upload the Document again")
//    public void i_click_on_upload_the_document_again() throws InterruptedException {
//
//
//        // Locate the "Upload" button
//        WebElement uploadButton = driver.findElement(By.xpath("//button[contains(@class, 'ant-btn-default') and contains(span, 'Upload')]"));
//
//        // Provide the file path of the image you want to upload
//        String filepath = "C:\\Users\\User\\Desktop\\sample_passphoto.jpg"; // Replace with the actual file path
//
//        // Click the "Upload" button to trigger the file input
//       // uploadButton.click();
//
//        // Locate the file input element
//        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
//
//        // Provide the file path to the file input for uploading
//        fileInput.sendKeys(filepath);
//
//
//        sleep(6000);
//        WebElement slider1 = driver.findElement(By.xpath("(//div[@class='ant-slider-handle'])[3]"));
//        int width = slider1.getSize().getWidth();
//        // Initialize Actions class
//        Actions action = new Actions(driver);
//        // Move the slider from left end to right
//        action.clickAndHold(slider1).moveByOffset(width, 0).release().perform();
//
//        sleep(1000);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript("window.scrollBy(0, 500);");
//
//        driver.findElement(By.xpath("(//div[@class='ant-modal-footer']//button)[2]")).click();
//
//        //  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
//        sleep(6000);
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//
//        js2.executeScript("window.scrollBy(0, 500);");
//        sleep(6000);
//    }
//        @When("I click on the Next button")
//                public void _click_next_btn() throws InterruptedException {
//
//        // Scroll down to the "Next" button
//        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
//       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextButton);
//
//        // Click on the "Next" button
//        nextButton.click();
//
//        sleep(9000);
//    }
//
//
//    @When("I click on Upload the Document \\(Owner Bank A\\/c Proof)")
//    public void i_click_on_upload_the_document_owner_bank_a_c_proof() throws InterruptedException {
//
////      WebElement Document3 =   driver.findElement(By.xpath("//span[contains(text(),'Upload')]"));
////        Document3.sendKeys(configprop.getProperty("Document3"));
////        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
////        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
//
//        WebElement uploadButton = driver.findElement(By.xpath("//button[contains(., 'Upload')]")); // Locate the button element
////        uploadButton.click();
//
//
//        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']")); // Locate the hidden file input
//        String filepath = "C:\\Users\\User\\Desktop\\sample_aadhar.jpg";
//        fileInput.sendKeys(filepath);
//
//
//        // click on OK btn
////        WebElement slider2 = driver.findElement(By.xpath("(//div[@class='ant-slider-handle'])[3]"));
////        int width = slider2.getSize().getWidth();
////        // Initialize Actions class
////        Actions action = new Actions(driver);
////        // Move the slider from left end to right
////        action.clickAndHold(slider2).moveByOffset(width, 0).release().perform();
//
//       // Thread.sleep(1000);
//        //driver.findElement(By.xpath("(//div[@class='ant-modal-footer']//button)[2]")).click();
//
//        // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
//        sleep(4000);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript("window.scrollBy(0, 500);");
//        sleep(7000);
//    }
//    @When("I click on the Next btn")
//    public void i_click_on_the_nextt_button() throws InterruptedException {
//
//        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
//
//       Thread. sleep(3000);
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//
//        js2.executeScript("window.scrollBy(0, 500);");
//      Thread.  sleep(3000);
//    }
//     @When("I click on the Proceed btn")
//    public void i_click_on_proceed_button() throws InterruptedException {
//
//        driver.findElement(By.xpath("//span[normalize-space()='Proceed']")).click();
//         sleep(3000);
//         JavascriptExecutor js2 = (JavascriptExecutor) driver;
//
//         js2.executeScript("window.scrollBy(0, 1200);");
//     }
//
//
////=========================================================================================
//
//    @Given("I am on the Proposal Form page")
//    public void i_am_on_the_proposal_form_page() throws InterruptedException {
//        sleep(3000);
//       // driver.findElement(By.xpath("//span[text()='Rural']")).click();//span[text()='Rural']
////        JavascriptExecutor js2 = (JavascriptExecutor) driver;
////
////        js2.executeScript("window.scrollBy(0, 1200);");
//
//
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//
//    }
//    @When("I click on Continue to Proposal Form")
//    public void i_click_on_continue_to_proposal_form() throws InterruptedException {
//
//
//
//
//
//        WebElement element2 = driver.findElement(By.xpath("//span[normalize-space()='Continue to Proposal Form']"));
//        element2.click();
////        Point loc = element2.getLocation();
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy"+loc);
////
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
////        wait.until(ExpectedConditions.elementToBeClickable(element2)).click();
//Thread.sleep(5000);
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//
//        js2.executeScript("window.scrollBy(0, 2000);");
//       Thread. sleep(1000);
//    }
//    @When("I click on Next")
//    public void i_click_on_next() throws InterruptedException {
//
//        WebElement element2 = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
//        element2.click();
//
//
//
//Thread.sleep(5000);
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//
//        js2.executeScript("window.scrollBy(0, 200);");
//       Thread. sleep(15000);
//
//    }
//    @When("I select title")
//  public void i_select_title_as_mrs() throws InterruptedException, AWTException {
//        // Wait for the input element to be clickable
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////        WebElement inputElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='titleName' and @type='search' and @class='ant-select-selection-search-input' and @role='combobox']")));
//WebElement ck = driver.findElement(By.xpath("//input[@id='titleName' and @type='search' and @class='ant-select-selection-search-input' and @role='combobox']"));
//
//        // Create an instance of Actions class
//        Actions actions = new Actions(driver);
//
//        // Move to the input element and click it
//        actions.moveToElement(ck).click().perform();
//Robot r = new Robot();
//r.keyPress(KeyEvent.VK_ENTER);
//        r.keyPress(KeyEvent.VK_ENTER);
//
//        // Sleep for 5 seconds to observe the result
//        Thread.sleep(5000);
////       // WebElement cl = driver.findElement(By.id("titleName"));
////      driver.findElement(By.xpath("//input[@id='titleName' and @type='search' and @class='ant-select-selection-search-input' and @role='combobox']")).click();
////
////
////        // Create an instance of the Robot class
////        Robot r = new Robot();
////
////        // Press the Enter key
////        r.keyPress(KeyEvent.VK_ENTER);
////        r.keyRelease(KeyEvent.VK_ENTER);
////        // Wait for the input element to be clickable
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////        WebElement inputElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='titleName' and @type='search' and @class='ant-select-selection-search-input' and @role='combobox']")));
////
////        // Scroll to the input element
////        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputElement);
////
////        // Click on the input element using JavaScript
////        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputElement);
////
////        // Create an instance of the Robot class
////        Robot r = new Robot();
////
////        // Press the Enter key
////        r.keyPress(KeyEvent.VK_ENTER);
////        r.keyRelease(KeyEvent.VK_ENTER);
//
//
//       Thread. sleep(4000);
//    }
//@When("I select MRS")
//        public void i_select_MRs() throws InterruptedException, AWTException {
//
//
//    Robot rob = new Robot();
//    rob.keyPress(KeyEvent.VK_ENTER);
//
//// Simulate pressing the down arrow key
//  //  rob.keyPress(KeyEvent.VK_DOWN);
//   // rob.keyRelease(KeyEvent.VK_DOWN);
//
//// Instead of directly clicking the element, use Actions class to click
////        Actions actions = new Actions(driver);
////        actions.moveToElement(driver.findElement(By.xpath("//span[@class='ant-select-selection-item' and text()='Mr.']"))).click().perform();
////
////        Thread.sleep(5000);
//    }
//    @When("I enter Father's First Name")
//    public void i_enter_father_s_first_name() throws InterruptedException {
//
//    driver.findElement(By.xpath("//input[@id='FathersFirstName']")).sendKeys("ramesh");
//      Thread.  sleep(5000);
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//
//        js2.executeScript("window.scrollBy(0, 350);");
//Thread.sleep(8000);
//
//    }@When("i enter martialStatus")
//    public void i_enter_martial_status() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//// Wait until the overlaying element disappears or is not visible
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span.ant-select-selection-item")));
//
//// Perform the click action
//        WebElement maritalStatus = wait.until(ExpectedConditions.elementToBeClickable(By.id("MaritalStatus")));
//        maritalStatus.click();
//
//// Use Actions to send keys and interact with the element
//        Actions actions = new Actions(driver);
//        actions.moveToElement(maritalStatus).click().perform();
//        maritalStatus.sendKeys("S");
//        actions.sendKeys(maritalStatus, Keys.ENTER).perform();
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////
////        WebElement martialStatus = wait.until(ExpectedConditions.elementToBeClickable(By.id("MaritalStatus")));
////        martialStatus.click();
////        // Create an instance of Actions class
////        Actions actions = new Actions(driver);
////
////        actions.moveToElement(martialStatus).click().perform();
////        martialStatus.sendKeys("S");
////
////        actions.sendKeys(martialStatus, Keys.ENTER).perform();
//    }
//
////    @When("And i enter martialStatus")
////    public void i_enter_martialStatus(){
////                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////
////                WebElement martialStatus = wait.until(ExpectedConditions.elementToBeClickable(By.id("MaritalStatus")));
////        martialStatus.click();
////                // Create an instance of Actions class
////                Actions actions = new Actions(driver);
////
////                actions.moveToElement(martialStatus).click().perform();
////                martialStatus.sendKeys("S");
////
////                actions.sendKeys(martialStatus, Keys.ENTER).perform();
////    }
//
//    @When("I click Age proof as aadhar")
//    public void i_click_on_age_proof_as_aadhar() throws InterruptedException, AWTException {
//
//
//
//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement ageProof = wait1.until(ExpectedConditions.elementToBeClickable(By.id("AgeProof")));
//
//        // Create an instance of Actions class
//        Actions action = new Actions(driver);
//
//        // Move to the AgeProof element and click it
//        action.moveToElement(ageProof).click().perform();
//
//        // Send ENTER key to the AgeProof element
//        action.sendKeys(ageProof, Keys.ENTER).perform();
//Thread.sleep(5000);
//
//    }
//@When("i enter Educational Qualification")
//public void enter_Educational_qualification() throws InterruptedException {
//
//          WebElement Educ = driver.findElement(By.id("Educational"));
//          Actions ac = new Actions(driver);
//          ac.moveToElement(Educ).click().perform();
//          Educ.sendKeys("G");
//          Thread.sleep(1000);
//         ac.sendKeys(Educ,Keys.ENTER).perform();
//       Thread.sleep(4000);
//}
//    @When("i click on occupation")
//    public void click_on_occupation() throws InterruptedException {
//
//
//        WebElement occupation =   driver.findElement(By.id("Occupation"));
//       Actions acc = new Actions(driver);
//       acc.moveToElement(occupation).click().perform();
//        occupation.sendKeys("S");
////        Thread.sleep(1000);
//        acc.sendKeys(occupation,Keys.ENTER);
//        Thread.sleep(3000);
//    }
//
//    @When("i enter Email ID")
//    public void I_enter_email_id() throws InterruptedException {
//
//        driver.findElement(By.xpath("//input[@id='EmailID']")).sendKeys("venkateshkoochana22@gmail.com");
//       Thread. sleep(5000);
//    }
//
//    @When("I enter MObileNum")
//    public void I_enter_mobilenum() throws InterruptedException {
//
//        driver.findElement(By.xpath("//input[@id='primaryNo']")).sendKeys("7563897891");
//
//      Thread.  sleep(5000);
//    }
//
//
//
//
//    @When("I click on Name of the Business")
//    public void i_click_on_name_of_the_business() throws InterruptedException {
//
//
//
//       WebElement nameofBusiness =  driver.findElement(By.xpath("//input[@id='Nameofthebusiness']"));
//        nameofBusiness.sendKeys("Bookstall");
//      Thread.  sleep(5000);
//
//
//    }
//    @When("I click on Business Address Line {int}")
//    public void i_click_on_business_address_line(Integer int1) throws InterruptedException {
//
//        WebElement AddressLine = driver.findElement(By.xpath("//input[@id='BusinessAddressLine1']"));
//        AddressLine.sendKeys("HighTech,Hyd");
//        Thread.  sleep(5000);
////        JavascriptExecutor js2 = (JavascriptExecutor) driver;
////
////        js2.executeScript("window.scrollBy(0, 1700);");
//    }
//    @When("I select state as Telangana")
//    public void i_select_state_as_telangana() throws InterruptedException {
//
////        WebElement state = driver.findElement(By.xpath("(//span)[text()='Please select.'][1]"));
////        state.click();
//
//        WebElement ts = driver.findElement(By.id("BusinessState"));
//        ts.sendKeys("Tel");
//        Thread.  sleep(5000);
//        ts.sendKeys(Keys.DOWN);
//        Thread.  sleep(3000);
//        ts.sendKeys(Keys.ENTER);
//        Thread.  sleep(3000);
//
//
//    }
//    @When("I select city as Hyderabad")
//    public void i_select_city_as_hyderabad() throws InterruptedException {
//
//        WebElement city = driver.findElement(By.xpath("//input[@id='BusinessCity']"));
//        city.sendKeys("Hyd");
//        Thread.  sleep(3000);
////city.sendKeys(Keys.DOWN);
////Thread.sleep(1000);
//        city.sendKeys(Keys.DOWN);
//        Thread.  sleep(1000);
//        city.sendKeys(Keys.ENTER);
//
//        Thread.  sleep(1000);
//
//    }
//    @When("I enter pincode")
//    public void i_enter_pincode() throws InterruptedException {
//
//    WebElement pinCode = driver.findElement(By.xpath("//input[@id='BusinessPincode']"));
//    pinCode.sendKeys("590893");
//
//
//        Thread.  sleep(3000);
//
//    }
//    @When("I enter Tel \\(Resi)")
//    public void i_enter_tel_resi() throws InterruptedException {
//
//
//        WebElement telephone = driver.findElement(By.xpath("//input[@id='BusinessTelResi']"));
//        telephone.sendKeys("04042007389");
//        Thread.  sleep(3000);
//    }
//    @When("I enter Annual Income")
//    public void i_enter_annual_income() throws InterruptedException {
//
//
//        WebElement AnnualIncome = driver.findElement(By.xpath("//input[@id='yourInnualIncome']"));
//        AnnualIncome.sendKeys("80000");
//        Thread.  sleep(3000);
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//
//       js2.executeScript("window.scrollBy(0, 1800);");
//
//
//        Thread.  sleep(3000);
//
//    }
//    @When("I select Income Tax PAN as Form {int}\\/{int}")
//    public void i_select_income_tax_pan_as_form(Integer int1, Integer int2) throws InterruptedException {
//
//        WebElement incomeTaxpan = driver.findElement(By.id("IncomeTaxPAN"));
//        incomeTaxpan.sendKeys("FORM");
//        incomeTaxpan.sendKeys(Keys.ENTER);
//        //incomeTaxpan.sendKeys(Keys.ENTER);
//        //or//
////        incomeTaxpan.sendKeys(Keys.DOWN);
////        Thread.sleep(1000);
////        incomeTaxpan.sendKeys(Keys.ENTER);
//
//
//
//        Thread.sleep(8000);
//
//    }
//
//
//    @When("I click on last Next Btn")
//    public void i_click_on_next_btn() throws InterruptedException {
//
//        WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
//        nextBtn.click();
//
////        JavascriptExecutor js2 = (JavascriptExecutor) driver;
////
////        js2.executeScript("window.scrollBy(0, 3000);");
//        Thread.sleep(30000);
//    }
//
//    @When("I click on next button")
//    public void i_click_on_next_button() throws InterruptedException {
//
//        //driver.findElement(By.id("NameasperBankAccount")).sendKeys("venkatesh");
////        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//////
////        js2.executeScript("window.scrollBy(0, 3000);");
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            try {
//                Thread.  sleep(3000);  // Adjust the sleep time as needed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//            if (newHeight == lastHeight) {
//                break;  // Reached the bottom
//            }
//            lastHeight = newHeight;
//        }
//       Thread.sleep(3000);
//
//        WebElement nextButton = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default']/span[text()='Next']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextButton);
//        nextButton.click();
//
//
//        // driver.findElement(By.xpath("//span[text()='Next']")).click();
//       // driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default']/span[text()='Next']")).click();
//   Thread.sleep(30000);
//
//    }
//    @When("I enter Customer Height")
//    public void i_enter_customer_height() throws InterruptedException {
//
//      WebElement Height =   driver.findElement(By.xpath("(//input)[@id='sinceWhenNumber'][1]"));
//      Height.sendKeys("176");
//      Thread.sleep(1000);
//    }
//    @When("I enter Customer Weight\\(in kgs)")
//    public void i_enter_customer_weight_in_kgs() throws InterruptedException {
//    WebElement weight = driver.findElement(By.xpath("(//input)[@id='sinceWhenNumber'][2]"));
//    weight.sendKeys("70");
//  // AN.bottom_Next_button();
//
//
////    JavascriptExecutor js3 = (JavascriptExecutor) driver;
////    js3.executeScript("window.scrollBy(0,2000);");
//
//    }
//
//    @When("i click to bottom")
//    public void i_click_to_bottom() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            try {
//                sleep(1000);  // Adjust the sleep time as needed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//            if (newHeight == lastHeight) {
//                break;  // Reached the bottom
//            }
//            lastHeight = newHeight;
//        }
//      Thread.  sleep(2500);
//    }
//
//    @When("I click on next btnn")
//    public void i_click_on_next_btnn() throws InterruptedException {
//
////        JavascriptExecutor js3 = (JavascriptExecutor) driver;
////        js3.executeScript("window.scrollBy(0,1800);");
//        WebElement nextButton = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default']/span[text()='Next']"));
//       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextButton);
//        nextButton.click();
//
//
//        // driver.findElement(By.xpath("//span[text()='Next']")).click();
//        Thread.  sleep(9000);
//
//        JavascriptExecutor js5 = (JavascriptExecutor) driver;
//        js5.executeScript("window.scrollBy(0,900);");
//      Thread.  sleep(3000);
//
//    }
//    @When("I click on next btn again")
//    public void i_click_on_next_btn_again() throws InterruptedException {
//
//
//        driver.findElement(By.xpath("//span[text()='Next']")).click();
//       Thread. sleep(9000);
//        JavascriptExecutor js3 = (JavascriptExecutor) driver;
//        js3.executeScript("window.scrollBy(0,5000);");
//        Thread.  sleep(3000);
//
//    }
//    @When("I click on next btn in declarationform")
//    public void i_click_on_next_btn_in_declarationform() throws InterruptedException {
//        driver.findElement(By.xpath("//span[text()='Next']")).click();
//        Thread.  sleep(3000);
//
//        JavascriptExecutor js3 = (JavascriptExecutor) driver;
//        js3.executeScript("window.scrollBy(0,100);");
//        Thread.  sleep(3000);
//    }
//
//
//
//    @Given("I am on the Proposer Details pages")
//    public void i_am_on_the_proposer_details_page() throws AWTException, InterruptedException {
//
//Thread.sleep(5000);
//
//
//
//    }
//    @When("I click on the Relationship with Life to be Insured section")
//    public void i_click_on_the_relationship_with_life_to_be_insured_section() throws AWTException, InterruptedException {
//
//        WebElement Relation = driver.findElement(By.id("RelationshipofnomineewithLA"));
//        Relation.click();
//
//        Robot rob = new Robot();
//        rob.keyPress(KeyEvent.VK_ENTER);
////
//        JavascriptExecutor js3 = (JavascriptExecutor) driver;
//
//
//        js3.executeScript("window.scrollBy(0,900);");
////1200
//       Thread. sleep(10000);
//
//    }
//    @When("I click on Age proof")
//    public void i_click_on_age_proof() throws AWTException, InterruptedException {
//        WebElement Proof = driver.findElement(By.id("ageproof"));
//        Proof.click();
//        Robot rob = new Robot();
//        rob.keyPress(KeyEvent.VK_ENTER);
//        JavascriptExecutor js3 = (JavascriptExecutor) driver;
//
//
//        js3.executeScript("window.scrollBy(0,1200);");
//       Thread. sleep(4000);
//    }
//
//    @When("I click on Source Of Income")
//    public void i_click_on_source_of_income() throws AWTException, InterruptedException {
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,3500);");
////    WebElement sourceOfIncome = driver.findElement(By.id("sourceOfIncome"));
////    sourceOfIncome.click();
//        driver.findElement(By.xpath("//input[@id='sourceOfIncome' and contains(@class, 'ant-select-selection-search-input')]")).click();
//        Robot rob = new Robot();
//        rob.keyPress(KeyEvent.VK_ENTER);
//       Thread. sleep(2000);
//
//
//    }
//    @When("I click on Name of the Organisation")
//    public void i_click_on_name_of_the_organisation() throws InterruptedException {
//
//        WebElement organisation = driver.findElement(By.id("nameOfOrganisation"));
//        organisation.sendKeys("ISRO");
//       Thread. sleep(2000);
//
//
//    }
//    @When("I click on Address Line {int}")
//    public void i_click_on_address_line(Integer int1) throws InterruptedException {
//
//        WebElement AddressLine = driver.findElement(By.id("AddressLine1Bussiness"));
//        AddressLine.sendKeys("HighTechCity,Hyderabad");
//        JavascriptExecutor js3 = (JavascriptExecutor) driver;
//        js3.executeScript("window.scrollBy(0,200);");
//       Thread. sleep(2000);
//
//    }
//    @When("I click on state")
//    public void i_click_on_state() throws AWTException {
//        WebElement state = driver.findElement(By.id("BusinessState"));
//        state.sendKeys("Tel");
//        Robot rob = new Robot();
//        rob.keyPress(KeyEvent.VK_ENTER);
//
//
//    }
//    @When("I click on city")
//    public void i_click_on_city() throws AWTException {
//
//        WebElement city = driver.findElement(By.id("BusinessCity"));
//        city.sendKeys("Hydera");
//        Robot rob = new Robot();
//        rob.keyPress(KeyEvent.VK_ENTER);
//
//    }
//    @When("I entered Pincode")
//    public void i_entered_pincode() {
//
//   WebElement pinCode = driver.findElement(By.id("PincodeBussiness"));
//   pinCode.sendKeys("500038");
//
//
//    }
//    @When("I enter Work phone number")
//    public void i_enter_work_phone_number() {
//
//
//        WebElement PhoneNum = driver.findElement(By.xpath("(//input)[@id='sinceWhenNumber'][4]"));
//        PhoneNum.sendKeys("7565689781");
//
//    }
//    @When("I enter Proposer's Annual Income")
//    public void i_enter_proposer_s_annual_income() throws InterruptedException {
//
//    WebElement AnnualIncome = driver.findElement(By.id("Proposer"));
//    AnnualIncome.sendKeys("500000");
//        JavascriptExecutor js3 = (JavascriptExecutor) driver;
//        js3.executeScript("window.scrollBy(0,3000);");
//     Thread.   sleep(2000);
//
//
//
//    }
//    @When("I enter Name as per Bank Account")
//    public void i_enter_name_as_per_bank_account() {
//
//        WebElement name = driver.findElement(By.id("nameasperbankaccount"));
//        name.sendKeys("Venkatesh");
//
//
//
//
//
//    }
//    @When("I enter Bank Account Number")
//    public void i_enter_bank_account_number() {
//
//        driver.findElement(By.id("bankaccountnumber")).sendKeys("63561978408");
//
//
//    }
//    @When("I enter Bank Name")
//    public void i_enter_bank_name() {
//
//
//        WebElement BankName =  driver.findElement(By.id("bankName"));
//        BankName.sendKeys("State B");
//        BankName.sendKeys(Keys.ENTER);
//
//    }
//    @When("I enter Bank Account Type")
//    public void i_enter_bank_account_type() throws AWTException {
//
//        WebElement Accountype =  driver.findElement(By.id("bankaccounttype"));
//
//        Accountype.sendKeys(Keys.DOWN);
//        Accountype.sendKeys(Keys.DOWN);
//        Accountype.sendKeys(Keys.ENTER);
//
//
//    }
//    @When("I enter MICR Code\\({int} Digits)")
//    public void i_enter_micr_code_digits(Integer int1) {
//
//         WebElement MirCode = driver.findElement(By.id("micrCode"));
//         MirCode.sendKeys("123456789");
//
//
//
//    }
//    @When("I enter IFSC Code \\({int} digit)")
//    public void i_enter_ifsc_code_digit(Integer int1) {
//
//    WebElement IFSCcode = driver.findElement(By.id("ifscCode"));
//        IFSCcode.sendKeys("SBIN0003345");
//
//    }
//    @When("I click verify bank details")
//    public void i_click_verify_bank_details() {
//
//        driver.findElement(By.xpath("//span[text()='Verify Bank Details']")).click();
//
//    }
//
//    @When("click on bottom proceed btn")
//    public void click_on_bottom_proceed_button() throws InterruptedException {
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            try {
//                sleep(1000);  // Adjust the sleep time as needed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//            if (newHeight == lastHeight) {
//                break;  // Reached the bottom
//            }
//            lastHeight = newHeight;
//        }
//        sleep(3000);
//        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//
//       Thread. sleep(5000);
//    }
//
//
//    @When("I click proceed Btn")
//    public void i_click_proceed_btn() throws InterruptedException {
//
//        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//
//Thread.sleep(5000);
//    }
//    @Then("I should be directed to the next step")
//    public void i_should_be_directed_to_the_next_step() {
//
//
//
//
//    }
//
//
//    @Given("I upload Proposer document")
//    public void i_upload_proposer_document() throws InterruptedException {
//       WebElement income =  driver.findElement(By.id("Select Document Type"));
//       income.click();
//        income.sendKeys(Keys.DOWN);
//        income.sendKeys(Keys.ENTER);
//      Thread.  sleep(3000);
//
//        WebElement uploadButton = driver.findElement(By.xpath("//button[contains(., 'Upload')]")); // Locate the button element
//        //  uploadButton.click(); // Click the button to trigger the upload functionality
//
//
//        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']")); // Locate the hidden file input
//        String filepath = "C:\\Users\\User\\Desktop\\sample_passphoto.jpg"; // Path to the image file
//        fileInput.sendKeys(filepath);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            try {
//                sleep(1000);  // Adjust the sleep time as needed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//            if (newHeight == lastHeight) {
//                break;  // Reached the bottom
//            }
//            lastHeight = newHeight;
//        }
//     Thread.   sleep(3000);
//
//
//
//
//
//        driver.findElement(By.xpath("//span[text()='Next']")).click();
//
//      Thread. sleep(2000);
//    }
//
//
//    @Given("I upload Life Insured document")
//    public void i_upload_life_insured_document() throws InterruptedException {
//
//        WebElement income =  driver.findElement(By.id("Select Document Type"));
//        income.click();
//        income.sendKeys(Keys.DOWN);
//        income.sendKeys(Keys.ENTER);
//        Thread.  sleep(3000);
//
//        WebElement uploadButton = driver.findElement(By.xpath("//button[contains(., 'Upload')]")); // Locate the button element
//        //  uploadButton.click(); // Click the button to trigger the upload functionality
//
//
//        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']")); // Locate the hidden file input
//        String filepath = "C:\\Users\\User\\Desktop\\sample_aadhar.jpg"; // Path to the image file
//        fileInput.sendKeys(filepath);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            try {
//                sleep(1000);  // Adjust the sleep time as needed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//            if (newHeight == lastHeight) {
//                break;  // Reached the bottom
//            }
//            lastHeight = newHeight;
//        }
//        Thread.  sleep(3000);
//
//        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//
//
//    }
//
//
//
//
//    @When("I click on the checkbox")
//    public void i_click_on_the_checkbox() throws InterruptedException {
//
//        WebElement checkBox = driver.findElement(By.id("checkBox"));
//        checkBox.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            try {
//                Thread.  sleep(3000);  // Adjust the sleep time as needed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//            if (newHeight == lastHeight) {
//                break;  // Reached the bottom
//            }
//            lastHeight = newHeight;
//        }
//        Thread.  sleep(3000);
//
//
//    }
//
//
//    @When("I click on getotpToEnter to verify")
//    public void i_click_on_OTP() throws InterruptedException {
//    WebElement getOTP = driver.findElement(By.xpath("//span[text()='Get OTP']"));
//    getOTP.click();
//        Thread.  sleep(3000);
//
//    }
//
//    @When("I verify the OTP")
//    public void i_verify_the_otp() throws InterruptedException {
//        Thread.  sleep(3000);
//    }
//
//    @When("I click the proceed to payment button")
//    public void i_click_on_the_proceed_payment_button(){
////
//         WebElement proceedButton = driver.findElement(By.xpath("//button[text()='Proceed to Payment']"));
//         proceedButton.click();
//
//    }
//
//    @When("I select the payment mode")
//    public void i_select_the_payment_mode() throws InterruptedException {
//        Thread.  sleep(3000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            try {
//                Thread.  sleep(3000); // Adjust the sleep time as needed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//            if (newHeight == lastHeight) {
//                break;  // Reached the bottom
//            }
//            lastHeight = newHeight;
//
//        }
//Thread.sleep(5000);
////     WebElement paymentMode = driver.findElement(By.xpath("//input[@id='paymentMode' and @class='ant-select-selection-search-input']"));
////     paymentMode.click();
//        WebElement paymentMode = driver.findElement(By.xpath("//input[@id='paymentMode' and @class='ant-select-selection-search-input']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(paymentMode).click().perform();
//
//        paymentMode.sendKeys("A");
//     paymentMode.sendKeys(Keys.ENTER);
//        Thread.sleep(5000);
//WebElement makePayment = driver.findElement(By.xpath("//span[text()='Make Payment']"));
//makePayment.click();
//        Thread.sleep(1000);
//
//        WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
//        closeButton.click();
//     driver.findElement(By.xpath("//span[text()='Proceed To Enach']")).click();
//Thread.sleep(4000);
//
//    }
//
//    @When("I click on proceed to eSIR")
//    public void click_on_eSIR() throws InterruptedException {
//
//        driver.findElement(By.xpath("I click on proceed to eSIR")).click();
//        Thread.  sleep(20000);
//    }
//
//    @When("select agent")
//    public void select_agent() throws InterruptedException {
//
//        WebElement selctAgent = driver.findElement(By.xpath("//span[@class='ant-select-selection-search']//input[@id='spagent']"));
//        selctAgent.click();
//        selctAgent.sendKeys(Keys.ENTER);
//        Thread.  sleep(3000);
//
////WebElement checkBox = driver.findElement(By.className("ant-checkbox-inner"));
////checkBox.click();
////span[@aria-label='file-text']//*[name()='svg']
//
//        driver.findElement(By.xpath("//span[@class=\"ant-checkbox-inner\"]")).click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//
//            try {
//                Thread.  sleep(2000);  // Adjust the sleep time as needed
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");
//
//            if (newHeight == lastHeight) {
//                break;  // Reached the bottom
//            }
//            lastHeight = newHeight;
//        }
//        WebElement submitButton = driver.findElement(By.xpath("//span[@aria-label='file-text']//*[name()='svg']"));
//        submitButton.click();
//        Thread.  sleep(20000);
//
//    }
//
//    @When("click on eSIR Authentication verify")
//    public void verify(){
//        WebElement verify = driver.findElement(By.xpath("//span[text()='Verify']"));
//        verify.click();
//    }
//
//
//
//
//
//    @Then("the proposal submission process should be completed successfully")
//    public void the_proposal_submission_process_should_be_completed_successfully() {
//
//
//
//    }
//
//}
//
//
//
//
//
