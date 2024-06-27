package StepDefinitions;

import PageObjects.GenericUtilities;
import PageObjects.AddnewLead;
import PageObjects.BaseClass;
import PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OonaSteps extends BaseClass {

    private static GenericUtilities genericUtilities;
    private GenericUtilities gu;

    @Before
    public void setup() throws IOException {
        configprop = new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);

        String br = configprop.getProperty("browser");

        if (br.equals("CHROME")) {
            System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
            driver = new ChromeDriver();
        } else if (br.equals("FIREFOX")) {
            System.setProperty("webdriver.gecko.driver", configprop.getProperty("Firefoxpath"));
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            driver = new FirefoxDriver(options);
        } else if (br.equals("IE")) {
            System.setProperty("webdriver.ie.driver", configprop.getProperty("IEpath"));
            driver = new InternetExplorerDriver();
        }

    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "FailedScenarioScreenshot");

//            String scenarioName = scenario.getName().replaceAll(" ", "_");
//            ScreenshotUtils.captureScreenshot(driver, scenarioName);
        }
    }

    @Given("I open Chrome")
    public void im_on_aviva_login_pages() throws InterruptedException {
        lp = new LoginPage(driver);
        AddnewLead AN = new AddnewLead(driver);
        GenericUtilities gu = new GenericUtilities(driver, this);

        this.an = new GenericUtilities();
        this.gu = new GenericUtilities();


        this.driver = driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--use-fake-ui-for-media-stream");
        driver = new ChromeDriver(options);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
    }


    public void someMethod(WebDriver driver) {
        // Create an instance of AddNew, passing the WebDriver
        GenericUtilities an = new GenericUtilities();

    }


    @When("I enter \"Pramerica\" in the search bar")
    public void Open_Chrome_browser() throws IOException {
        configprop = new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);

        driver.get(configprop.getProperty("PramericaURL"));

        // String urL = configprop.getProperty("Url");
//
//        if (urL.equals("DEV")) {
//            driver.get(configprop.getProperty("DevUrl"));
//        } else if (urL.equals("UAT")) {
//            driver.get(configprop.getProperty("UatUrl"));
//        } else if (urL.equals("PREPROD")) {
//            driver.get(configprop.getProperty("PREPRODURL"));
//        } else if (urL.equals("PROD")) {
//            driver.get(configprop.getProperty("ProdUrl"));
//        }
    }

    @When("I enter my Pramerica user ID")
    public void i_enter_my_pramerica_user_id() throws InterruptedException {

        WebElement UserID = driver.findElement(By.xpath("//input[@id='email']"));
        UserID.sendKeys(configprop.getProperty("PramericaID"));


    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @When("I enter the OTP")
    public void i_enter_the_otp() throws InterruptedException {

        driver.findElement(By.cssSelector("#otp1")).sendKeys("2");
        driver.findElement(By.cssSelector("#otp2")).sendKeys("6");
        driver.findElement(By.cssSelector("#otp3")).sendKeys("0");
        driver.findElement(By.cssSelector("#otp4")).sendKeys("5");
        Thread.sleep(2000);

        // here enter otp manually
    }

    @When("I click on the verify OTP button")
    public void i_click_on_the_verify_otp_button() throws InterruptedException {

        WebElement verifyButton = driver.findElement(By.xpath("//span[normalize-space()='Verify OTP']"));
        verifyButton.click();
        Thread.sleep(4000);

    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

    }

    @When("the user clicks on activities")
    public void the_user_clicks_on_activities() {

        WebElement activities = driver.findElement(By.cssSelector("div.ant-row-center > div:nth-of-type(1) p.ttile_name"));
        activities.click();
    }

    @When("the user clicks on the create event plus button")
    public void the_user_clicks_on_the_create_event_plus_button() {

        WebElement createEventImagePlus = driver.findElement(By.cssSelector("div.EventCreate-btn > img"));
        createEventImagePlus.click();
    }

    @When("the user clicks on worksite")
    public void the_user_clicks_on_worksite() {
        WebElement worksite = driver.findElement(By.cssSelector("div.CalendarEvent-Modal-Card-button-flex-wrap > button:nth-of-type(1)"));
        worksite.click();

    }

    @When("the user selects the Event Type")
    public void the_user_selects_the_event_type() throws InterruptedException {

        WebElement eventDropdown = driver.findElement(By.tagName("select"));
        eventDropdown.sendKeys("Unit Presentation");
        Thread.sleep(3000);


    }

    @When("the user enters the Unit Name")
    public void the_user_enters_the_unit_name() throws InterruptedException {
        WebElement UnitName = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div[3]/input"));
        UnitName.sendKeys("Test");
        Thread.sleep(4000);

    }

    @When("the user selects the Event Start Date")
    public void the_user_selects_the_event_start_date() throws InterruptedException {
        WebElement dateInputField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div[4]/div/div/div/div/div/input"));
        dateInputField.click();

        // Scroll down to ensure today's date link is visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", dateInputField);
        Thread.sleep(3000);
//WebElement eventDate = driver.findElement(By.xpath("//div[@class='ant-picker CalendarEvent-Modal-picker-style ant-picker-focused']//input[@placeholder='Select date']"));
//eventDate.click();
        WebElement toDay = driver.findElement(By.xpath("//a[@class='ant-picker-today-btn']"));
        toDay.click();
        Thread.sleep(10000);

    }

    @When("the user selects Follow Up {int} Date")
    public void the_user_selects_follow_up_date(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the user clicks on Add Team Member")
    public void the_user_clicks_on_add_team_member() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.cssSelector("[class=\"ant-input\"]"));
        dropdown.click();
        Thread.sleep(3000);
        dropdown.sendKeys("Gurjeet Singh  (70014208) (Executive Prahri Manager)");
        dropdown.click();
        Thread.sleep(3000);

    }

    @When("the user sets the status to open")
    public void the_user_sets_the_status_to_open() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("the user enters remarks")
    public void the_user_enters_remarks() {
        WebElement notesTextarea = driver.findElement(By.cssSelector("textarea"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", notesTextarea);
        notesTextarea.sendKeys("Test");


    }

    @Then("the user clicks on create event")
    public void the_user_clicks_on_create_event() throws InterruptedException {

        WebElement bookAppointmentButton = driver.findElement(By.cssSelector("div.CalendarEvent-Modal-book-appointment-flex > button"));
        bookAppointmentButton.click();
        Thread.sleep(5000);
    }

    @Given("I am on the Pramerica calendar page")
    public void i_am_on_the_pramerica_calendar_page() {

    }

    @When("the user clicked  on the  event plus button")
    public void i_clicked_on_event_plus_button() throws InterruptedException {

        WebElement createEventImagePlus = driver.findElement(By.cssSelector("div.EventCreate-btn > img"));
        createEventImagePlus.click();
        Thread.sleep(2000);

    }

    @When("I click on the create event button")
    public void i_click_on_the_create_event_button() {
        WebElement CanttOpportunity = driver.findElement(By.xpath("//button[text()='Cantt Opportunity']"));
        CanttOpportunity.click();
    }

    @When("I select {string} as the event type")
    public void i_select_as_the_event_type(String string) {

        WebElement eventTypeDropdown = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/select"));
        eventTypeDropdown.click();
        eventTypeDropdown.sendKeys("Access Permission");
    }

    @When("I enter {string} as the attendee name")
    public void i_enter_as_the_attendee_name(String string) {

        WebElement attendeeInput = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div[3]/input"));
        attendeeInput.click();
        attendeeInput.sendKeys("iorta");
    }

    @When("I select {string} as the category")
    public void i_select_as_the_category(String string) throws InterruptedException {
        WebElement categoryDropdown = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div[4]/select"));
        categoryDropdown.click();
        categoryDropdown.sendKeys("digital");
        Thread.sleep(2000);

    }

    @When("I click on the All day button")
    public void i_click_on_the_ALLDAY_button() throws InterruptedException {
        // Find the WebElement for the "All Day" button
        WebElement allDayButton = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div[5]/button[2]"));
        allDayButton.click();
// Create a JavaScriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

// Scroll the page until the "All Day" button is in view
        js.executeScript("arguments[0].scrollIntoView();", allDayButton);

// Click on the "All Day" button
        allDayButton.click();
        WebElement eventStartDate = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div[6]/div/div/div/div/div/input"));
        eventStartDate.click();
        Thread.sleep(3000);
    }

    @When("I select today's date")
    public void i_select_today_s_date() {
        WebElement today = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/a"));
        today.click();

    }

    @When("I type in the description textarea")
    public void i_type_in_the_description_textarea() {
        WebElement descriptionTextarea = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div[11]/textarea"));
        descriptionTextarea.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", descriptionTextarea);
        descriptionTextarea.sendKeys("Test");

    }

    @When("I submit the event")
    public void i_submit_the_event() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/button")).click();
        Thread.sleep(3000);
    }

    @And("the user clicked  on the create event plus button")
    public void theUserClickedOnTheCreateEventPlusButton() throws InterruptedException {


        WebElement createEventImagePlus = driver.findElement(By.xpath("//img[@alt='Addactivity']"));
        createEventImagePlus.click();
        Thread.sleep(3000);
    }


    @When("I click on Create Customer Event")
    public void i_click_on_create_customer_event() {
        WebElement eventButton = driver.findElement(By.xpath("//button[@class=\"CalendarEvent-Modal-Card-eventwith-static-button-style\" and text()='Customer']"));
        eventButton.click();

    }

    @When("I click on Event Type")
    public void i_click_on_event_type() {

        WebElement eventTypeDropdown = driver.findElement(By.cssSelector("div:nth-of-type(2) > select"));
        eventTypeDropdown.click();
        Select eventTypeSelect = new Select(eventTypeDropdown);
        eventTypeSelect.selectByVisibleText("Servicing Request");
    }

    @When("I click on event name")
    public void event_name() throws InterruptedException {

        WebElement inputField = driver.findElement(By.cssSelector("div:nth-of-type(3) > input"));
        inputField.click();
        inputField.sendKeys("hackthon");
        Thread.sleep(2000);
    }

    @When("I click on Mode")
    public void i_click_on_mode() {
        // Select "digital" from dropdown
        WebElement categoryDropdown = driver.findElement(By.cssSelector("div:nth-of-type(4) > select"));
        categoryDropdown.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", categoryDropdown);
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByVisibleText("Digital");


    }

    @When("I click on All Day")
    public void i_click_on_all_day() {

        WebElement allday = driver.findElement(By.xpath("//button[normalize-space()='All Day']"));
        allday.click();

    }

    @When("I click on Event Start Date")
    public void i_click_on_event_start_date() {

        WebElement startDate = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        startDate.click();

    }

    @When("I click on Today")
    public void i_click_on_today() {

        WebElement today = driver.findElement(By.xpath("//a[text()='Today']"));
        today.click();


    }

    @When("I click on Add Team Member")
    public void i_click_on_add_team_member() throws InterruptedException {

        WebElement dropdown = driver.findElement(By.cssSelector("[data-icon=\"search\"]"));
        dropdown.click();
        Thread.sleep(3000);
        dropdown.sendKeys("Bal Krishan  (70068546) (Officer Prahri)");
        Thread.sleep(3000);
//        WebElement dropdownOption = driver.findElement(By.xpath("//div[text()='Arun Gautam  (70044495) (Executive Prahri Manager)']"));
//        dropdownOption.click();

    }

    @When("I click on Enter Remarks")
    public void i_click_on_enter_remarks() throws InterruptedException {
        WebElement descriptionTextarea = driver.findElement(By.tagName("textarea"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", descriptionTextarea);
        descriptionTextarea.click();
        descriptionTextarea.sendKeys("Testing");
        Thread.sleep(9000);

    }

    @When("I click on Create Event")
    public void i_click_on_create_event() throws InterruptedException {
        WebElement bookAppointmentButton = driver.findElement(By.cssSelector("div.CalendarEvent-Modal-book-appointment-flex > button"));
        bookAppointmentButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", bookAppointmentButton);
        bookAppointmentButton.click();
        Thread.sleep(1000);
    }

    @Given("the user click on the create event plus button")
    public void the_user_click_on_the_create_event_plus_button() {

        WebElement createEventImagePlus = driver.findElement(By.xpath("//img[@alt='Addactivity']"));
        createEventImagePlus.click();


    }

    @Given("i clic on Supervisor")
    public void i_clic_on_supervisor() {

        driver.findElement(By.xpath("//button[text()='Supervisor']")).click();
    }

    @Given("i click on event type as a business planning")
    public void i_click_on_event_type_as_a_business_planning() {

        WebElement eventType = driver.findElement(By.xpath("(//select)[@class=\"CalendarEvent-Modal-TimePicker-style\"][1]"));
        eventType.click();

        Select categorySelect = new Select(eventType);
        categorySelect.selectByVisibleText("Business Planning");
    }

    @Given("i click on event mode as a digital")
    public void i_click_on_event_mode_as_a_digital() {
        WebElement eventMode = driver.findElement(By.xpath("(//select)[@class=\"CalendarEvent-Modal-TimePicker-style\"][2]"));
        eventMode.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", eventMode);
        Select categorySelect = new Select(eventMode);
        categorySelect.selectByVisibleText("Digital");
    }

    @Given("i clicked on Allday")
    public void i_clicked_on_allday() {

        WebElement allday = driver.findElement(By.xpath("//button[normalize-space()='All Day']"));
        allday.click();
    }

    @Given("i clicked on Event Start Date as today")
    public void i_clicked_on_event_start_date_as_today() throws InterruptedException {
        WebElement startDate = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        startDate.click();
        Thread.sleep(3000);
        WebElement today = driver.findElement(By.xpath("//a[text()='Today']"));
        today.click();
        Thread.sleep(6000);

    }

    @Given("i clicked on create event")
    public void i_clicked_on_create_event() throws InterruptedException {
        WebElement bookAppointmentButton = driver.findElement(By.xpath("//button[text()='Create Event']"));
        bookAppointmentButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", bookAppointmentButton);
        bookAppointmentButton.click();
        Thread.sleep(5000);
    }


    @Given("i clickn on create event plus button again")
    public void i_clickn_on_create_event_plus_button_again() {

        WebElement createEventImagePlus = driver.findElement(By.cssSelector("div.EventCreate-btn > img"));
        createEventImagePlus.click();
    }

    @Given("i click on tam tab")
    public void i_click_on_tam_tab() throws InterruptedException {

        WebElement team = driver.findElement(By.xpath("(//button)[text()='Team'][2]"));
        team.click();
        Thread.sleep(4000);

    }

    @Given("i click on event type as Training")
    public void i_click_on_event_type_as_training() {


        WebElement eventType = driver.findElement(By.xpath("(//select)[@class=\"CalendarEvent-Modal-TimePicker-style\"][1]"));
        eventType.click();

        Select categorySelect = new Select(eventType);
        categorySelect.selectByVisibleText("Training");

    }

    @Given("i click on event mode as in-person")
    public void i_click_on_event_mode_as_in_person() {

        WebElement eventMode = driver.findElement(By.xpath("(//select)[@class=\"CalendarEvent-Modal-TimePicker-style\"][2]"));
        eventMode.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", eventMode);
        Select categorySelect = new Select(eventMode);
        categorySelect.selectByVisibleText("In-person");
    }

    @Given("click on AllDayTab")
    public void click_on_all_day_tab() {
        WebElement Allday = driver.findElement(By.xpath("//button[normalize-space()='All Day']"));
        Allday.click();
    }

    @Given("click on event start tab as today")
    public void click_on_event_start_tab_as_today() throws InterruptedException {
        WebElement startDate = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        startDate.click();
        Thread.sleep(3000);
        WebElement today = driver.findElement(By.xpath("//a[text()='Today']"));
        today.click();
        Thread.sleep(6000);
    }

    @Given("click on Create event tab finally")
    public void click_on_create_event_tab_finally() throws InterruptedException {
        WebElement bookAppointmentButton = driver.findElement(By.xpath("//button[text()='Create Event']"));
        bookAppointmentButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", bookAppointmentButton);
        bookAppointmentButton.click();
        Thread.sleep(5000);

    }

    @When("I click on pramerica dashboard")
    public void i_click_on_pramerica_DashBoard() throws InterruptedException {

        WebElement DashBoard = driver.findElement(By.xpath("//div[@class='sc-fqkvVR fXzeAg']//img"));
        DashBoard.click();
        Thread.sleep(2000);
    }

    @When("i click on ToDo")
    public void i_click_on_to_do() throws InterruptedException {

        WebElement ToDo = driver.findElement(By.xpath("//div[text()='To Do ']"));
        ToDo.click();
        Thread.sleep(3000);
    }

    @When("i click on create new task plus button")
    public void i_click_on_create_new_task_plus_button() throws InterruptedException {
        WebElement spanElement = driver.findElement(By.cssSelector("span.anticon.anticon-plus-circle"));

        // Perform actions on the element if needed
        // For example, you can click on the span element
        spanElement.click();

        Thread.sleep(30000);

    }

    @When("i enter Add Team Member")
    public void i_enter_add_team_member() throws InterruptedException {


        WebElement team = driver.findElement(By.xpath("(//span)[@class=\"ant-select-selection-item\"][1]"));

        Actions ac = new Actions(driver);
        ac.moveToElement(team).click().perform();
        Thread.sleep(4000);
        ac.moveToElement(team).click().perform();


    }

    @When("i enter needs in remember tab")
    public void i_enter_needs_in_remember_tab() {
        WebElement rem = driver.findElement(By.xpath("//input[@type='text' and @placeholder='What do you need to remember To Do' and @maxlength='100' and @class='ant-input' and @value='']"));
        rem.sendKeys("Task ToDo do entry");

    }

    @When("i click on priority")
    public void i_click_on_priority() throws InterruptedException {

        WebElement HighPriority = driver.findElement(By.xpath("//span[text()='High']"));
        HighPriority.click();
        Thread.sleep(5000);
    }

    @When("i click on Set a Due Reminder")
    public void i_click_on_set_a_due_reminder() {
        driver.findElement(By.xpath("//input[contains(@placeholder,'Select date')]")).click();
        driver.findElement(By.xpath("//a[text()='Today']")).click();

    }

    @When("i enter time")
    public void i_enter_time() throws InterruptedException {

        WebElement timeDD = driver.findElement(By.cssSelector("div.Todo-Create-FooterReminder span.ant-select-selection-item"));
        timeDD.click();

        // Click on the active option in the dropdown using CSS selector
        WebElement selectTime = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='1:00 AM']"));
        selectTime.click();
        Thread.sleep(1000);
    }

    @When("i click on save button")
    public void i_click_on_save_button() throws InterruptedException {
        WebElement saveButton = driver.findElement(By.xpath("//span[normalize-space()='Save']"));
        saveButton.click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll up to the top of the page
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(5000);
    }

    @When("i click on three dots")
    public void i_click_on_three_dots() {

        WebElement threedots = driver.findElement(By.xpath("//body//div[@id='root']//div[@class='site-card-border-less-wrapper']//div//div//div[1]//div[1]//div[1]//div[2]//img[1]"));
        threedots.click();
    }

    @When("i click on edit")
    public void i_click_on_edit() throws InterruptedException {

        WebElement edit = driver.findElement(By.cssSelector("body div[id='root'] div[class='ant-card-body'] div[class='ant-card-body'] div:nth-child(1)"));
        edit.click();
        Thread.sleep(12000);

    }

    @When("i change Add Team Member")
    public void i_change_add_team_member() throws InterruptedException {
        WebElement textEdit = driver.findElement(By.xpath("(//span)[@class=\"ant-select-selection-item\"][4]"));
//        textEdit.click();
//        Thread.sleep(3000);
//        textEdit.sendKeys("Gurjeet Singh  (70014208) (Executive Prahri Manager)");
//        textEdit.click();
//        Thread.sleep(8000);

        Actions ac = new Actions(driver);
        ac.moveToElement(textEdit).click().perform();
        Thread.sleep(4000);
        ac.moveToElement(textEdit).click().perform();

    }

    @When("i enter needs in remember tab text clear and reenter")
    public void i_enter_needs_in_remember_tab_text_clear_and_reenter() throws InterruptedException {


        WebElement textClear = driver.findElement(By.xpath("(//input)[@placeholder=\"What do you need to remember To Do\"][2]"));
        textClear.sendKeys("and test again");
        //  textClear.sendKeys("new test");


        Thread.sleep(6000);
    }

    @When("i changed priority to medium")
    public void i_changed_priority_to_medium() throws InterruptedException {

        //     WebElement medium = driver.findElement(By.xpath("//button[contains(@ant-click-animating-without-extra-node,'false')]//span[contains(text(),'Medium')]"));
        //  medium.click();
        WebElement we = driver.findElement(By.xpath("(//span)[text()='Medium'][2]"));
        Actions ac = new Actions(driver);
        ac.moveToElement(we).click().perform();
        Thread.sleep(7000);

    }

    @When("i click on Set a Due Reminder to another date")
    public void i_click_on_set_a_due_reminder_to_another_date() throws InterruptedException {
        driver.findElement(By.xpath("(//input)[contains(@placeholder,'Select date')][2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a)[@class='ant-picker-today-btn' and @aria-disabled='false'][2]")).click();

        Thread.sleep(10000);
    }

    @When("i enter another time")
    public void i_enter_another_time() throws InterruptedException, AWTException {

        WebElement timeDD = driver.findElement(By.xpath("//span[@title='01:00 AM']"));
        timeDD.click();
        Thread.sleep(3000);
//        WebElement tim = driver.findElement(By.xpath("//div[@title='12:00 AM']"));
//        tim.click();
        Thread.sleep(3000);
        Robot robot = new Robot();

        // Simulate pressing the ENTER key
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

    }

    @When("i click on save button again")
    public void i_click_on_save_button_again() throws InterruptedException {

        //  driver.findElement(By.xpath("//span[text()='Save']")).click();
        WebElement saveButton = driver.findElement(By.xpath("(//button)[@class='ant-btn ant-btn-default Todo-Create-FooterReminder-Button todo-mb20'][2]"));
        saveButton.click();
        Thread.sleep(3000);
    }

    @When("I click on the Create New Task button")
    public void i_click_on_the_button(String string) {

        driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M512 64C26')]")).click();
    }

    @When("I enter Add Team Member in the task name field")
    public void i_enter_in_the_task_name_field(String string) throws InterruptedException {

        WebElement dropdown = driver.findElement(By.cssSelector("[data-icon=\"search\"]"));
        dropdown.click();
        Thread.sleep(3000);
        dropdown.sendKeys("Bal Krishan  (70068546) (Officer Prahri)");
        Thread.sleep(3000);
    }

    @When("I enter needs in the remember tab")
    public void i_enter_in_the_remember_tab(String string) {
        WebElement rem = driver.findElement(By.xpath("//input[@type='text' and @placeholder='What do you need to remember To Do' and @maxlength='100' and @class='ant-input' and @value='']"));
        rem.sendKeys("Task ToDo  for new create");
    }


    @When("I enter the specified time to entry")
    public void i_click_on(String string) throws InterruptedException {
        WebElement HighPriority = driver.findElement(By.xpath("//span[normalize-space()='Low']"));
        HighPriority.click();
        Thread.sleep(5000);
    }

    @When("I click on the Save button tab")
    public void i_enter_the_specified(String string) {
        driver.findElement(By.xpath("//input[contains(@placeholder,'Select date')]")).click();
        driver.findElement(By.xpath("//a[text()='Today']")).click();
    }

    @Then("I should receive a confirmation message")
    public void i_should_receive_a_confirmation_message() {

    }


    //          OONA APP ////

    @When("I enter the Oona URL")
    public void i_enter_the_oona_url() throws IOException {
        configprop = new Properties();
        FileInputStream configpropfile = new FileInputStream("cofig.properties");
        configprop.load(configpropfile);

        driver.get(configprop.getProperty("OonaURL"));

    }

    @When("I enter my Mobile Number")
    public void i_enter_my_mobile_number() throws IOException {

        WebElement MobNuM = driver.findElement(By.cssSelector("input[id='phoneNumber']"));
        MobNuM.sendKeys(configprop.getProperty("OonaMobileNum"));

    }

    @When("I click on the Terms & Conditions and Privacy Policy")
    public void i_click_on_the_terms_conditions_and_privacy_policy() {

        WebElement CheckBox = driver.findElement(By.cssSelector("input[id='tncCheckbox']"));
        CheckBox.click();

    }

    @When("I click on the continue button")
    public void i_click_on_the_continue_button() {

        driver.findElement(By.cssSelector("button[id='terms']")).click();
    }

    @When("I fill the OTP")
    public void i_enter_OTPs() {
        WebElement OTP = driver.findElement(By.cssSelector("input[id=\"code\"]"));
        OTP.sendKeys(configprop.getProperty("OonaOTP"));


    }

    @When("I click on the Verify Button")
    public void i_click_on_the_verify_button() throws InterruptedException {

        driver.findElement(By.cssSelector("input[id=\"kc-login\"]")).click();
        Thread.sleep(8000);
    }

    @When("i click on IDN Button")
    public void change_language() throws InterruptedException {
        WebElement LanguageChange = driver.findElement(By.xpath("//span[text()='IDN']"));
        LanguageChange.click();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, 500);");
        Thread.sleep(3000);
    }

    @When("I click on the CAR product")
    public void i_click_on_the_car_product() throws InterruptedException {

        WebElement car = driver.findElement(By.xpath("//div[@class='product-thick-font' and text()='Car']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Timeout after 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(car));
        car.click();

        Thread.sleep(6000);
    }

    @When("I click on existing quotation as NO")
    public void i_click_on_existing_quotation_as_no() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='No']")).click();
        Thread.sleep(1000);

    }

    @Then("I click on Skip This Step")
    public void i_should_be_able_to_proceed_further() throws InterruptedException {

        driver.findElement(By.xpath("//span[normalize-space()='Skip This Step']")).click();
        Thread.sleep(3000);
    }

    @Given("I am on the Motor Insurance Policy Page")
    public void i_am_on_the_motor_insurance_policy_page() {


    }

    @When("I enter the Insured Name")
    public void i_enter_the_insured_name() throws InterruptedException {

        WebElement InsuredName = driver.findElement(By.xpath("//input[@id='insuredName']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", InsuredName);
        InsuredName.sendKeys("Venky");
        // Thread.sleep(5000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,300)");
        Thread.sleep(5000);

    }

    @When("I enter the License Plate Code")
    public void i_enter_the_license_plate_code() throws InterruptedException {

        WebElement PlateCode = driver.findElement(By.xpath("//input[@id='licensePlateCode']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", PlateCode);

// Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed (e.g., change 10 to your desired timeout duration in seconds)

        wait.until(ExpectedConditions.elementToBeClickable(PlateCode));

// Click on the element
        PlateCode.click();

// Send keys and press Enter
        PlateCode.sendKeys("A");
        PlateCode.sendKeys(Keys.ENTER);

        Thread.sleep(5000); // Consider removing this sleep if not necessary


    }

    @When("I enter the Vehicle Brand")
    public void i_enter_the_vehicle_brand() throws AWTException, InterruptedException {
        WebElement VechileBrand = driver.findElement(By.xpath("//input[@id='vehicleName']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", VechileBrand);
        VechileBrand.click();
        Thread.sleep(3000);
        VechileBrand.sendKeys("2024");
        Thread.sleep(1000);
        VechileBrand.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }

    @When("I choose the coverage")
    public void i_choose_the_coverage() throws InterruptedException {

        WebElement coverage = driver.findElement(By.xpath("//input[@id='coverageOption' and @type='search']"));

        Actions ac = new Actions(driver);
        ac.moveToElement(coverage).click().perform();
        coverage.sendKeys("C");

        coverage.sendKeys(Keys.ENTER);

        //coverage.click();
        Thread.sleep(2000);
        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                Thread.sleep(1000);  // Adjust the sleep time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

            if (newHeight == lastHeight) {
                break;  // Reached the bottom
            }
            lastHeight = newHeight;
        }
        Thread.sleep(2500);
    }


    @When("I click on the Next Button")
    public void i_click_on_the_next_button() throws InterruptedException {
//
//        driver.findElement(By.xpath("//span[text()='Next']")).click();
//        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait for 10 seconds
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(10000);

    }

    @Then("I should be on the Choose Product Page")
    public void i_should_be_on_the_choose_product_page() throws InterruptedException {

        Thread.sleep(2000);
    }

    @When("I click on TLO Basic")
    public void i_click_on_tlo_basic() throws InterruptedException {

        WebElement tloBasic = driver.findElement(By.xpath("(//span)[text()='Select'][3]"));
        tloBasic.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
    }

    @Then("I should proceed to the next step")
    public void i_should_proceed_to__next_step() throws InterruptedException {

        WebElement NextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
        NextBtn.click();

        Thread.sleep(4000);
    }

    @Then("I  proceed to the next step")
    public void i_should_proceed_to_the_next_step() throws InterruptedException {

        WebElement NextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
        NextBtn.click();

        Thread.sleep(4000);
    }

    @Given("I am on the Additional Protection page")
    public void i_am_on_the_additional_protection_page() {


    }

    @When("I click on the first checkbox")
    public void i_click_on_the_first_checkbox() throws InterruptedException {

        WebElement checkBox = driver.findElement(By.xpath("(//input)[@type=\"checkbox\"][1]"));
        checkBox.click();
        Thread.sleep(1000);
//
//        // Scroll down to load the second page content
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @When("I click on the Add to Cart button")
    public void i_click_on_the_add_to_cart_button() throws InterruptedException {

        // Locate the "Add to Cart" button on the first page
        WebElement addToCartButton = driver.findElement(By.xpath("//span[text()='Add to Cart']"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Move to the "Add to Cart" button
        actions.moveToElement(addToCartButton).perform();

        // Click the "Add to Cart" button
        addToCartButton.click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @When("I am on the Quote Summary page")
    public void i_am_on_the_quote_summary_page() {


    }

    @When("I click on the next button")
    public void I_CLICK_ON_NEXT_BUTTON() throws InterruptedException {


        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
        Thread.sleep(3000);


    }


    @When("i verify image and quote created or not")
    public void verification() throws InterruptedException {
        Thread.sleep(3000);
        // Find the element containing the text
        WebElement textElement = driver.findElement(By.xpath("//b[text()='Quote has been created']"));

        // Get the text from the element
        String actualText = textElement.getText();

        // Verify if the text matches the expected text
        String expectedText = "Quote has been created";
        if (actualText.equals(expectedText)) {
            System.out.println("Text verification passed!");
        } else {
            System.out.println("Text verification failed!");
            Thread.sleep(3000);
        }
    }

    @When("I click on the create policy button")
    public void i_click_on_the_create_policy_button() throws InterruptedException {

        WebElement createPolicyElement = driver.findElement(By.xpath("//span[text()='Create Policy']"));

        createPolicyElement.click();
        Thread.sleep(4000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 300)");
        Thread.sleep(9000);
    }

    @When("I click on the upload national id card")
    public void i_click_on_the_upload_national_id_card() throws InterruptedException {

        WebElement element = driver.findElement(By.xpath("//img)[@class='ant-image-img'][1]"));
        //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Actions a = new Actions(driver);
        a.moveToElement(element).click().perform();

        // driver.findElement(By.xpath("(//img)[@class='ant-image-img'][1]")).click();

        Thread.sleep(8000);
    }

    @When("I upload the document")
    public void i_upload_the_document() throws InterruptedException, AWTException {
        WebElement upload = driver.findElement(By.id("uploadedFile"));
        upload.sendKeys("C:\\Users\\User\\Desktop\\oona_image.jpg");

    }

    @When("I enter ID number")
    public void i_enter_id_number() throws InterruptedException {

        WebElement Id = driver.findElement(By.cssSelector("input[id=\"hv-form-idNumber\"]"));
        Id.click();
        Id.sendKeys("123456");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Dimension landscape = new Dimension(1280, 800);  // Set your desired landscape dimensions
//        driver.manage().window().setSize(landscape);
    }

    @When("I click on the verify button")
    public void i_click_on_the_verify_BUTTON() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//button[text()='Verify']"));

        button.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(4000);

    }

    @When("I enter Chassis Number")
    public void i_enter_chassis_number() {

        WebElement chasisNumberElement = driver.findElement(By.id("ChasisNumber"));
        chasisNumberElement.sendKeys("467876557JJA");

    }

    @When("I enter Engine Number")
    public void i_enter_engine_number() {

        WebElement EngineNumber = driver.findElement(By.id("engineNumber"));
        EngineNumber.sendKeys("56654565JJA");

        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Execute JavaScript to scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @When("I enter Insured's Mobile Phone")
    public void i_enter_insured_s_mobile_phone() {

        WebElement MobileNum = driver.findElement(By.id("insuredPhoneNumber"));
        MobileNum.sendKeys(configprop.getProperty("MobileNum"));

    }

    @When("I enter Insured's Email Address")
    public void i_enter_insured_s_email_address() throws InterruptedException {

        WebElement Email = driver.findElement(By.id("insuredEmailAddress"));
        Email.sendKeys(configprop.getProperty("Email"));
        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Execute JavaScript to scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(8000);

    }

    @When("I click on the next BTN")
    public void i_click_on_the_next_btn() throws InterruptedException {

        WebElement NextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
        NextBtn.click();
        Thread.sleep(3000);
//        // Create a JavascriptExecutor instance
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        // Scroll to the bottom of the page
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(3000);

        // Create a WebDriverWait instance
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed
//
//        // Scroll to the next button
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
//        js.executeScript("arguments[0].scrollIntoView();", nextButton);
//
//        // Wait for the element to be clickable
//        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
//
//        // Click on the next button
//        nextButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                Thread.sleep(1000);  // Adjust the sleep time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

            if (newHeight == lastHeight) {
                break;  // Reached the bottom
            }
            lastHeight = newHeight;
            Thread.sleep(2000);
        }
    }

    @When("I click on click this skip")
    public void i_click_on_click_this_skip() {

        driver.findElement(By.xpath("//span[text()='Skip This Step']")).click();

    }


    @When("Scan Through mobile phone")
    public void scanThroughMobilePhone() {

    }


    @When("verify total amount")
    public void total_amount() {

        // Locate the element containing the total value
        WebElement totalElement = driver.findElement(By.xpath("(//div)[@class=\"thick-font\"][4]"));

        // Get the text of the total value
        String totalText = totalElement.getText();

        // Convert the total text to integer (assuming it's in the format "Rp 1.424.400")
        int total = Integer.parseInt(totalText.replaceAll("[^0-9]", ""));

        // Verify if the total matches the expected value
        if (total == 1424400) {
            System.out.println("Total is correct!");
        } else {
            System.out.println("Total is incorrect!");

        }

        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


    @When("click on checkout")
    public void click_on_checkout() {


        driver.findElement(By.xpath("//span[text()='Checkout']")).click();


    }

    @Given("User is on the checkout page")
    public void user_is_on_the_checkout_page() {

    }

    @When("User proceeds to payment")
    public void user_proceeds_to_payment() {

        WebElement proceedButton = driver.findElement(By.xpath("//span[text()='Proceed to Payment']"));
        proceedButton.click();
    }

    @When("User selects bank transfer option")
    public void user_selects_bank_transfer_option() {

        WebElement BankTransfer = driver.findElement(By.xpath("//span[text()=' Bank Transfer ']"));
        BankTransfer.click();
    }

    @When("User selects virtual account BCA")
    public void user_selects_virtual_account_bca() throws InterruptedException {

        WebElement virtualAccountBCA = driver.findElement(By.xpath("//span[text()='Virtual Account BCA']"));
        virtualAccountBCA.click();
        Thread.sleep(2000);
    }

    @When("User copies the virtual account number")
    public void user_copies_the_virtual_account_number() {
        WebElement VirtualcopyActNum = driver.findElement(By.xpath("//img[@id=\"payment-code-copy-va-code-button\"]"));
        VirtualcopyActNum.click();

    }

    @When("User opens a new tab with the payment link")
    public void user_opens_a_new_tab_with_the_payment_link() {

// Open the original webpage
        driver.get("https://sandbox.doku.com/integration/simulator/bca/inquiry");

        // Get the original window handle
        String originalHandle = driver.getWindowHandle();

        Set<String> handles = driver.getWindowHandles();

        // Switch to the new tab
        for (String handle : handles) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }


    }

    @When("User pastes the virtual account number")
    public void user_pastes_the_virtual_account_number() {

        WebElement paste = driver.findElement(By.xpath("//input[@id=\"vaNumber\"]"));
        paste.sendKeys("1900800000082557");
    }

    @When("User clicks on the inquiry button")
    public void user_clicks_on_the_inquiry_button() {


        WebElement inquiryButton = driver.findElement(By.xpath("//button[text()=' Inquiry ']"));
        inquiryButton.click();
    }

    @When("User clicks on the pay now button")
    public void user_clicks_on_the_pay_now_button() {


        WebElement PayNow = driver.findElement(By.xpath("//button[text()='Pay Now']"));
        PayNow.click();
    }

    @Then("User should see the payment success image")
    public void user_should_see_the_payment_success_image() {

        // Verify text on the new tab
        WebElement textElement = driver.findElement(By.xpath("//h3[text()='Payment Success']"));
        String actualText = textElement.getText();
        String expectedText = "Expected Text";
        if (actualText.equals(expectedText)) {
            System.out.println("Text verification successful!");
        } else {
            System.out.println("Text verification failed!");
        }

    }

    @Then("User is redirected to the original tab")
    public void user_is_redirected_to_the_original_tab() {

        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

    }

    @Then("User should see the payment successful image on the old tab")
    public void user_should_see_the_payment_successful_image_on_the_old_tab() {

        // Verify text on the new tab
        WebElement textElement = driver.findElement(By.xpath("//*[contains(text(),'Payment Successful!')]"));
        String actualText = textElement.getText();
        String expectedText = "Payment Successful!";
        if (actualText.equals(expectedText)) {
            System.out.println("Text verification successful!");
        } else {
            System.out.println("Text verification failed!");
        }
    }

    /////////////////////////////////////////////////////////////////////
    //MOtorVechile

    @When("click on motorcycle")
    public void click_motorCycle() {


        WebElement motorCycle = driver.findElement(By.xpath("//div[text()='Motorcycle']"));
        motorCycle.click();


    }

    @When("I enter the  MC Insured Name")
    public void i_enter_the_mc_insured_name() throws InterruptedException {

        WebElement McInsuredName = driver.findElement(By.xpath("//div[@id='rc-tabs-0-panel-Motorcycle']//input[@id='insuredName']"));
        McInsuredName.sendKeys("jhon");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", McInsuredName);
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        // Scroll vertically to position 400 pixels from the top
        js1.executeScript("scroll(0,400)");
    }

    @When("I enter the MC License Plate Code")
    public void i_enter_the_mc_license_plate_code() throws InterruptedException {

        WebElement MCPlateCode = driver.findElement(By.xpath("(//input)[@type='search' and @id='licensePlateCode' and @autocomplete='off'][2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", MCPlateCode);

// Wait for the element to be visible and clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(MCPlateCode)); // Wait for visibility
        wait.until(ExpectedConditions.elementToBeClickable(MCPlateCode)); // Wait for clickability

// Click on the element
        MCPlateCode.click();

// Send keys and press Enter
        MCPlateCode.sendKeys("A");
        MCPlateCode.sendKeys(Keys.ENTER);

// Consider removing this sleep if not necessary
        Thread.sleep(2000);

    }


    @When("I enter the motorCycle  Brand")
    public void i_enter_the_motor_cycle_brand() throws InterruptedException {
        WebElement MCVechileBrand = driver.findElement(By.xpath("(//input)[@id='vehicleName'][2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", MCVechileBrand);
        MCVechileBrand.click();
        Thread.sleep(3000);
        MCVechileBrand.sendKeys("2024");
        Thread.sleep(5000);
        MCVechileBrand.sendKeys(Keys.ENTER);
        Thread.sleep(2000);


    }

    @When("I choose the  MC coverage")
    public void i_choose_the_mc_coverage() throws InterruptedException {

        WebElement MCcoverage = driver.findElement(By.xpath("(//input)[@id='coverageOption' and @type='search'][2]"));

        Actions ac = new Actions(driver);
        ac.moveToElement(MCcoverage).click().perform();

        MCcoverage.sendKeys(Keys.ENTER);

        //coverage.click();
        Thread.sleep(3000);
        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


    }

    @When("I click on the nextbutton")
    public void i_click_on_the_nextbutton() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(5000);

    }

    @When("I click on Mc TLO Basic")
    public void i_click_on_mc_tlo_basic() {

        WebElement TLOBasic = driver.findElement(By.xpath("//span[text()='Select']"));
        TLOBasic.click();


    }

    @When("I click on the Mc Next Button")
    public void i_click_on_the_mc_next_button() throws InterruptedException {

        WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
        nextBtn.click();

        Thread.sleep(3000);
    }

    @When("click on  MC Quote Summary nextButton")
    public void click_on_quote_summary_next_button() {

        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();

    }

    @When("verify the MC  quote created text")
    public void verify_the_success_and_quote_created_text() {

        // Find the element using the provided XPath
        WebElement quoteCreatedElement = driver.findElement(By.xpath("//b[text()='Quote has been created']"));

        // Verify if the element is displayed
        if (quoteCreatedElement.isDisplayed()) {
            System.out.println("Quote creation message is displayed");
        } else {
            System.out.println("Quote creation message is not displayed");
        }

        // Verify the text of the element
        String actualText = quoteCreatedElement.getText();
        String expectedText = "Quote has been created";
        if (actualText.equals(expectedText)) {
            System.out.println("Correct message is displayed");
        } else {
            System.out.println("Incorrect message is displayed");
            System.out.println("Actual Text: " + actualText);
            System.out.println("Expected Text: " + expectedText);
        }

    }

    @When("click on MC create policy")
    public void click_on_create_policy() throws InterruptedException {

        WebElement CreatePolicy = driver.findElement(By.xpath("//span[text()='Create Policy']"));
        CreatePolicy.click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(3000);


    }

    @When("I click on the upload MC national ID card")
    public void i_click_on_the_upload_national_Id_card() throws InterruptedException {

        WebElement IdCard = driver.findElement(By.xpath("(//img)[@class=\"ant-image-img\"][1]"));
        IdCard.click();
        Thread.sleep(3000);
        // Example of executing JavaScript to click a button that triggers the popup
        // Switch to the alert
//
//        Thread.sleep(1000);

    }

    @When("I upload the mc  Customer document")
    public void i_upload_the_mc_customer_document() throws InterruptedException {

        WebElement uploadfile = driver.findElement(By.id("uploadedFile"));
        uploadfile.sendKeys("C:\\Users\\User\\Desktop\\oona_image.jpg");
        Thread.sleep(10000);
    }


    @When("I click on MC  the verify btn")
    public void click_verify_button() throws InterruptedException {
        WebElement verifyButton = driver.findElement(By.xpath("//button[@class='hv-form-primary-enabled' and @id='hv-form-proceedButton']"));
        verifyButton.click();
        Thread.sleep(4000);

    }

    @When("I enter MC  Chassis num")
    public void chasis_nu() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"ChasisNumber\"]")).sendKeys("64755745385DCF");
        Thread.sleep(1000);

    }

    @When("I enter MC Engine num")
    public void MC_eng_num() throws InterruptedException {

        WebElement En = driver.findElement(By.cssSelector("input[id=\"engineNumber\"]"));
        En.sendKeys("677677648ABC");
        Thread.sleep(1000);

    }

    @When("I enter MC Insured's MobileNum")
    public void mob_num() {
        WebElement phnNum = driver.findElement(By.id("insuredPhoneNumber"));
        phnNum.sendKeys(configprop.getProperty("MobileNum"));

    }

    @When("I enter MC Insured's EmailAddress")
    public void email_entry() throws InterruptedException {
        WebElement email = driver.findElement(By.id("insuredEmailAddress"));
        email.sendKeys(configprop.getProperty("Email"));
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);

    }


    @When("I click MC on the nextBUTTON")
    public void mc_next_button() {

        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();

    }

    @When("click on capture photo")
    public void open_camera() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Capture Photo']")).click();
        Thread.sleep(10000);
    }

    @When("accept popup")
    public void popup() throws InterruptedException {


    }

    @When("click  again capture photo")
    public void agian_capture_photo() throws InterruptedException {

        driver.findElement(By.xpath("(//span)[text()='Capture Photo'][1]")).click();
        Thread.sleep(8000);
    }

    @When("I upload THE document")
    public void i_upload_the_documen() throws InterruptedException {

        WebElement uploadDocument = driver.findElement(By.xpath("//span[text()='Upload Document']"));
        uploadDocument.click();
        String filepath = "C:\\Users\\User\\Desktop\\oona_image.jpg"; // Replace with the actual file path

        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));

        fileInput.sendKeys(filepath);

        Thread.sleep(8000);

    }

    @When("I enter ID number below")
    public void i_enter_iD_number() throws InterruptedException {

        WebElement Id = driver.findElement(By.cssSelector("input[id=\"hv-form-idNumber\"]"));
        Id.click();
        Id.sendKeys("123456");
        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Dimension landscape = new Dimension(1280, 800);  // Set your desired landscape dimensions
//        driver.manage().window().setSize(landscape);
    }

    @When("I click on the verify btn")
    public void i_click_on_the_verify_btn() {


        WebElement verifyButton = driver.findElement(By.xpath("//button[text()='Verify']"));
        verifyButton.click();
    }

    @When("I enter Chassis num")
    public void i_enter_chassis_num() throws InterruptedException {

        WebElement chasisNum = driver.findElement(By.id("ChasisNumber"));
        chasisNum.sendKeys(configprop.getProperty("ChassisNumber"));
        Thread.sleep(2000);

    }

    @When("I enter Engine num")
    public void i_enter_engine_num() {

        WebElement engineNum = driver.findElement(By.id("engineNumber"));
        engineNum.sendKeys(configprop.getProperty("EngineNumber"));
        // an.scrollToBottom(driver);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    @When("I enter Insured's MobileNum")
    public void i_enter_insured_s_mobile_num() {

        WebElement mobNum = driver.findElement(By.id("insuredPhoneNumber"));
        mobNum.sendKeys(configprop.getProperty("MobileNum"));


    }

    @When("I enter Insured's EmailAddress")
    public void i_enter_insured_s_email_addres() {

        WebElement Email = driver.findElement(By.id("insuredEmailAddress"));
        Email.sendKeys(configprop.getProperty("Email"));

        // an.scrollToBottom();


    }

    @When("I click on the nextBUTTON")
    public void i_click_on_the_next_butto() {

        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
    }

    @When("I verify redirection to the next step")
    public void i_verify_redirection_to_the_next_step() {


    }

    @When("I navigate to the checkout page")
    public void i_navigate_to_the_checkout_page() {

        WebElement checkOut = driver.findElement(By.xpath("//span[text()='Checkout']"));
        checkOut.click();

    }

    @When("I click on the Proceed to Payment button")
    public void i_click_on_the_butto(String string) {

        WebElement proceedButton = driver.findElement(By.xpath("//span[text()='Proceed to Payment']"));
        proceedButton.click();

    }

    @When("I select the bank transfer payment option")
    public void i_select_the_bank_transfer_payment_option() {

        WebElement BankTransfer = driver.findElement(By.xpath("//span[text()=' Bank Transfer ']"));
        BankTransfer.click();


    }

    @When("I choose the virtual account BCA option")
    public void i_choose_the_virtual_account_bca_option() throws InterruptedException {

        WebElement virtualAccountBCA = driver.findElement(By.xpath("//span[text()='Virtual Account BCA']"));
        virtualAccountBCA.click();
        Thread.sleep(2000);


    }

    @When("I copy the virtual account number from the page")
    public void i_copy_the_virtual_account_number_from_the_page() throws InterruptedException {

        WebElement VirtualcopyActNum = driver.findElement(By.xpath("//img[@id=\"payment-code-copy-va-code-button\"]"));
        VirtualcopyActNum.click();


    }

    @When("I open a new tab with the provided payment link")
    public void i_open_a_new_tab_with_the_provided_payment_link() {

        // Open the original webpage
        driver.get("https://sandbox.doku.com/integration/simulator/bca/inquiry");

        // Get the original window handle
        String originalHandle = driver.getWindowHandle();

        Set<String> handles = driver.getWindowHandles();

        // Switch to the new tab
        for (String handle : handles) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }


    }


    @When("I paste the copied virtual account number into the payment form")
    public void i_paste_the_copied_virtual_account_number_into_the_payment_form() {

        WebElement VANpaste = driver.findElement(By.xpath("//input[@id=\"vaNumber\"]"));
        VANpaste.sendKeys("1900800000082557");


    }

    @When("I click on the Inquiry button on the payment form")
    public void i_click_on_the_button_on_the_payment_form(String string) {

        WebElement inquiryButton = driver.findElement(By.xpath("//button[text()=' Inquiry ']"));
        inquiryButton.click();

    }

    @When("I click on the Pay Now button")
    public void pay_now_btn() {

        WebElement PayNow = driver.findElement(By.xpath("//button[text()='Pay Now']"));
        PayNow.click();

    }

    @Then("I verify that the payment success image is displayed")
    public void i_verify_that_the_payment_success_image_is_displayed() {
        // Verify text on the new tab
        WebElement textElement = driver.findElement(By.xpath("//h3[text()='Payment Success']"));
        String actualText = textElement.getText();
        String expectedText = "Expected Text";
        if (actualText.equals(expectedText)) {
            System.out.println("Text verification successful!");
        } else {
            System.out.println("Text verification failed!");
        }


    }

    @Then("I switch back to the original tab")
    public void i_switch_back_to_the_original_tab() {


        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();


    }

    @Then("I verify that the payment success image is displayed on the original tab")
    public void i_verify_that_the_payment_success_image_is_displayed_on_the_original_tab() {

        // Verify text on the new tab
        WebElement textElement = driver.findElement(By.xpath("//*[contains(text(),'Payment Successful!')]"));
        String actualText = textElement.getText();
        String expectedText = "Payment Successful!";
        if (actualText.equals(expectedText)) {
            System.out.println("Text verification successful!");
        } else {
            System.out.println("Text verification failed!");
        }


    }


//////////////////////////////////////////////////////////////////////////////////
    //Customer flow CAR (without risk inspection)

    @When("click on customer link")
    public void click_on_customer_link() throws InterruptedException {

        WebElement customerLink = driver.findElement(By.xpath("//img[@class=\"ant-image-img input-img\"]"));
        customerLink.click();
        Thread.sleep(2000);
    }

    @When("open new tab and enter that URL")
    public void open_new_tab_and_enter_that_url() throws InterruptedException {

        driver.get("https://oona-id-dev.salesdrive.app/motor/1p4Nyi");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(10000);


    }

    @When("I enter the Customer Insured Name")
    public void i_enter_the_customer_insured_name() throws InterruptedException {

        WebElement name = driver.findElement(By.id("insuredName"));
        name.sendKeys("jhon");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        Thread.sleep(4000);
    }

    @When("I enter the Customer License Plate Code")
    public void i_enter_the_customer_license_plate_code() throws InterruptedException {

        WebElement PlateCode = driver.findElement(By.xpath("//input[@id='licensePlateCode']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", PlateCode);

// Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed (e.g., change 10 to your desired timeout duration in seconds)

        wait.until(ExpectedConditions.elementToBeClickable(PlateCode));

// Click on the element
        PlateCode.click();

// Send keys and press Enter
        PlateCode.sendKeys("A");
        PlateCode.sendKeys(Keys.ENTER);

        Thread.sleep(3000);


    }

    @When("I enter the Customer Vehicle Brand")
    public void i_enter_the_customer_vehicle_brand() throws InterruptedException {
        WebElement VechileBrand = driver.findElement(By.xpath("//input[@id='vehicleName']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", VechileBrand);
        VechileBrand.click();
        Thread.sleep(3000);
        VechileBrand.sendKeys("BMW X3 sDrive 30 I M Sport 2024");
        Thread.sleep(1000);
        VechileBrand.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }

    @When("I choose Customer the coverage")
    public void i_choose_customer_the_coverage() throws InterruptedException {

        WebElement coverage = driver.findElement(By.xpath("//input[@id='coverageOption' and @type='search']"));

        Actions ac = new Actions(driver);
        ac.moveToElement(coverage).click().perform();

        coverage.sendKeys(Keys.ENTER);

        //coverage.click();
        Thread.sleep(2000);
        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
    }

    @When("I click on the CustomerNext Button")
    public void i_click_on_the_Customer_Next_Button() {

        driver.findElement(By.xpath("//span[text()='Next']")).click();

    }

    @When("click on TLO+ select button")
    public void click_on_tlo_select_button() throws InterruptedException {
        WebElement tlo = driver.findElement(By.xpath("(//span)[text()='Select'][1]"));
        tlo.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
    }

    @When("click on NextButton")
    public void click_on_next_button() throws InterruptedException {

        WebElement nextButn = driver.findElement(By.xpath("(//span)[text()='Next']"));
        nextButn.click();
        Thread.sleep(1000);

    }

    @When("click on first checkBox in Additional protection page")
    public void click_on_first_check_box_in_additional_protection_page() throws InterruptedException {

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @class='ant-checkbox-input']"));
        checkbox.click();

        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
    }

    @When("click on AddTocart Button")
    public void add_to_cart() throws InterruptedException {

        driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @When("click on next button in quote summary page")
    public void click_on_next_button_in_quote_summary_page() {

        driver.findElement(By.xpath("//span[text()='Next']")).click();


    }

    @When("I click on the Customer upload national id card")
    public void i_click_on_the_customer_upload_national_id_card() throws InterruptedException {

        WebElement id = driver.findElement(By.xpath("(//img)[@class='ant-image-img'][1]"));
        id.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
    }

    @When("click on proceed on mobile button")
    public void proceed_on_mobile() {

        WebElement proceedOnMobile = driver.findElement(By.xpath("//span[text()='Proceed on Mobile']"));
        proceedOnMobile.click();
    }

    @When("I upload the Customer document")
    public void i_upload_the_customer_document() {


    }

    @When("I click on the Customer verify button")
    public void i_click_on_the_customer_verify_button() {
    }

    @When("enter ID card number")
    public void enter_ID_cardNumber() {

        WebElement IdCardNum = driver.findElement(By.name("idCardNumber"));
        IdCardNum.sendKeys(configprop.getProperty("IdCardNumber"));

    }

    @When("I enter  Customer Chassis Number")
    public void i_enter_customer_chassis_number() {


        WebElement chasisNum = driver.findElement(By.cssSelector("input[id=\"ChasisNumber\"]"));
        chasisNum.sendKeys(configprop.getProperty("ChassisNumber"));
    }

    @When("I enter  Customer Engine Number")
    public void i_enter_customer_engine_number() {

        WebElement engineNum = driver.findElement(By.id("engineNumber"));
        engineNum.sendKeys(configprop.getProperty("EngineNumber"));

    }

    @When("I enter  Customer Insured's Mobile Phone")
    public void i_enter_customer_insured_s_mobile_phone() {

        WebElement phnNum = driver.findElement(By.id("insuredPhoneNumber"));
        phnNum.sendKeys(configprop.getProperty("MobileNum"));

    }

    @When("I enter Customer Insured's Email Address")
    public void i_enter_customer_insured_s_email_address() throws InterruptedException {

        WebElement email = driver.findElement(By.id("insuredEmailAddress"));
        email.sendKeys(configprop.getProperty("Email"));
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);

    }

    @When("I click Customer on the next BTN")
    public void i_click_customer_on_the_next_btn() {

        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();

    }


    // Scenario: Navigate through Oona website and verify CF MotorCycle(Without Risk protection) product
    // Customer flow MotorCycle Without Risk Protection.

    @When("click on customer MC link")
    public void click_on_customer_mc_link() {

        WebElement link = driver.findElement(By.xpath("//img[@class='ant-image-img input-img']"));
        link.click();
    }

    @When("open new tab and enter that copied URL")
    public void open_new_tab_and_enter_that_copied_url() throws InterruptedException {
        driver.get("https://oona-id-dev.salesdrive.app/motor/GrLpgu");
        Thread.sleep(1000);
        WebElement motorCycle = driver.findElement(By.xpath("//div[@id='rc-tabs-0-tab-Motorcycle']"));
        motorCycle.click();

    }

    @When("I enter the Customer  mc Insured Name")
    public void i_enter_the_customer_mc_insured_name() throws InterruptedException {

        WebElement insuredNAme = driver.findElement(By.xpath("//div[@id='rc-tabs-0-panel-Motorcycle']//input[@id='insuredName']"));
        insuredNAme.sendKeys(configprop.getProperty("InsuredName"));
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(3000);
    }

    @When("I enter the Customer  mc License Plate Code")
    public void i_enter_the_customer_mc_license_plate_code() throws InterruptedException {
        WebElement PlateCode = driver.findElement(By.xpath("(//input)[@id=\"licensePlateCode\"][2]"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", PlateCode);

// Wait for the element to be clickable
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed (e.g., change 10 to your desired timeout duration in seconds)
//
//        wait.until(ExpectedConditions.elementToBeClickable(PlateCode));

// Click on the element= new
        Actions ac = new Actions(driver);
        ac.moveToElement(PlateCode).click();
        //    PlateCode.click();

// Send keys and press Enter
        PlateCode.sendKeys("A");
        PlateCode.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

    }

    @When("I enter the Customer mc Vehicle Brand")
    public void i_enter_the_customer_mc_vehicle_brand() throws InterruptedException {
        WebElement VechileBrand = driver.findElement(By.xpath("//div[@id='rc-tabs-0-panel-Motorcycle']//input[@id='vehicleName']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", VechileBrand);
        VechileBrand.click();
        Thread.sleep(3000);
        VechileBrand.sendKeys("Alessa EX 3000 E 2024");
        Thread.sleep(1000);
        VechileBrand.sendKeys(Keys.ENTER);
        Thread.sleep(1000);


    }

    @When("I choose Customer the mc  coverage")
    public void i_choose_customer_the_mc_coverage() throws InterruptedException {
        WebElement coverage = driver.findElement(By.xpath("//div[@id='rc-tabs-0-panel-Motorcycle']//input[@id='coverageOption']"));

        Actions ac = new Actions(driver);
        ac.moveToElement(coverage).click().perform();

        coverage.sendKeys(Keys.ENTER);

        //coverage.click();
        Thread.sleep(2000);
        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);


    }

    @When("I click on the mc CustomerNext Button")
    public void i_click_on_the_mc_customer_next_button() throws InterruptedException {

        WebElement custNextBtn = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        custNextBtn.click();
        Thread.sleep(3000);

    }

    @When("click on mc TLO Basic select button")
    public void click_on_mc_tlo_select_button() throws InterruptedException {

        WebElement tloBasic = driver.findElement(By.xpath("//span[normalize-space()='Select']"));
        tloBasic.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
    }

    @When("click on mc NextButton")
    public void click_on_mc_next_button() throws InterruptedException {

        WebElement nextButton = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        nextButton.click();
        Thread.sleep(4000);

    }

    @When("click on mc first checkBox in Additional protection page")
    public void click_on_mc_first_check_box_in_additional_protection_page() {


    }

    @When("click on mc AddTocart Button")
    public void click_on_mc_add_tocart_button() {


    }

    @When("click on mc next button in quote summary page")
    public void click_on_mc_next_button_in_quote_summary_page() throws InterruptedException {

        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default next-button-travel']")).click();
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);

    }

    @When("I click mc on the Customer upload national id card")
    public void i_click_mc_on_the_customer_upload_national_id_card() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,300)");
        WebElement nationalIdCard = driver.findElement(By.xpath("//div[@alt='avatar']//div//img[@class='ant-image-img']"));
        nationalIdCard.click();
        Thread.sleep(2000);

    }


    @When("click on proceed on mobile")
    public void proceed_mobile() throws InterruptedException {

        WebElement proceedMobile = driver.findElement(By.xpath("//span[@class='hv-qr-proceed-mobile-text']"));
        proceedMobile.click();
        // wait for 3 minutes
        Thread.sleep(180000);
    }

    @When("I enter mc  Customer Chassis Number")
    public void i_enter_mc_customer_chassis_number() throws InterruptedException {

        driver.findElement(By.xpath("//input[@id=\"ChasisNumber\"]")).sendKeys("64753657455DCF");
        Thread.sleep(1000);
    }

    @When("I enter  mc Customer Engine Number")
    public void i_enter_mc_customer_engine_number() throws InterruptedException {

        WebElement En = driver.findElement(By.cssSelector("input[id=\"engineNumber\"]"));
        En.sendKeys("677577648ABC");
        Thread.sleep(1000);
        // Create a JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Execute JavaScript to scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @When("I enter mc  Customer Insured's Mobile Phone")
    public void i_enter_mc_customer_insured_s_mobile_phone() {

        WebElement MobNum = driver.findElement(By.cssSelector("input[id=\"insuredPhoneNumber\"]"));
        MobNum.sendKeys("7658978781");


    }

    @When("I enter mc Customer Insured's Email Address")
    public void i_enter_mc_customer_insured_s_email_address() {

        WebElement EmailAddress = driver.findElement(By.cssSelector("input[id=\"insuredEmailAddress\"]"));
        EmailAddress.sendKeys("vejewq@gmail.com");

    }

    @When("I click  mc Customer on the next BTN")
    public void i_click_mc_customer_on_the_next_btn() throws InterruptedException {

        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
        Thread.sleep(4000);
    }

    @When("click on skip this step option")
    public void click_on_skip_button() throws InterruptedException {


        WebElement skip = driver.findElement(By.xpath("//span[text()='Skip This Step']"));
        skip.click();
        Thread.sleep(3000);

    }


/////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////
    // Customer flow motorcycle without risk inspection


    @Given("User is on the checkout page cf mcwri")
    public void user_is_on_the_checkout_page_cf_mcwri() {

    }

    @When("User proceeds to payment cf mcwri")
    public void user_proceeds_to_payment_cf_mcwri() {

    }

    @When("User selects bank transfer option cf mcwri")
    public void user_selects_bank_transfer_option_cf_mcwri() {

    }

    @When("User selects virtual account BCA cf mcwri")
    public void user_selects_virtual_account_bca_cf_mcwri() {

    }

    @When("User copies the virtual account number cf mcwri")
    public void user_copies_the_virtual_account_number_cf_mcwri() {

    }

    @When("User opens a new tab with the payment link mcwri")
    public void user_opens_a_new_tab_with_the_payment_link_mcwri() {

    }

    @When("User pastes the virtual account number mcwri")
    public void user_pastes_the_virtual_account_number_mcwri() {

    }

    @When("User clicks on the inquiry button mcwri")
    public void user_clicks_on_the_inquiry_button_mcwri() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on the pay now button mcwri")
    public void user_clicks_on_the_pay_now_button_mcwri() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see the payment success image mcwri")
    public void user_should_see_the_payment_success_image_mcwri() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User is redirected to the original tab mcwri")
    public void user_is_redirected_to_the_original_tab_mcwri() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see the payment successful image on the old tab mcwri")
    public void user_should_see_the_payment_successful_image_on_the_old_tab_mcwri() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////

    @When("click on HOME button")
    public void click_on_Home() throws InterruptedException {

        WebElement Home = driver.findElement(By.xpath("//div[contains(text(),'Home')]"));
        Home.click();
        Thread.sleep(2000);
    }

    @When("Do you have an existing quotation? as NO")
    public void do_you_have_an_existing_quotation_as_no() throws InterruptedException {

        WebElement No = driver.findElement(By.xpath("//span[text()='No']"));
        No.click();
        Thread.sleep(5000);

    }

    @When("click on skip this step in share link page")
    public void click_on_skip_this_step_in_share_link_page() throws InterruptedException {

        WebElement skipThisSTep = driver.findElement(By.xpath("//span[normalize-space()='Skip This Step']"));
        skipThisSTep.click();
        Thread.sleep(4000);

    }

    @When("click on confirm in Property Requirement page")
    public void click_on_confirm_in_property_requirement_page() throws InterruptedException {

        WebElement confirm = driver.findElement(By.xpath("//span[normalize-space()='Confirm']"));
        confirm.click();
        Thread.sleep(2000);


    }

    @When("im in Property Insurance Policy in Dwelling HOuse flow")
    public void im_in_property_insurance_policy_in_dwelling_h_ouse_flow() {


    }

    @When("enter  Insured Name \\(as per ID card)")
    public void enter_insured_name_as_per_id_card() throws InterruptedException {

        WebElement insuredName = driver.findElement(By.xpath("//input[@id='homeInsuredName']"));
        insuredName.sendKeys("venkat");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(1000);
        //  genericUtilities.scrollDown300px();
        // someMethod(gu.scrollDown300px());


    }

    @When("selcct option in Province")
    public void selcct_option_in_province() throws InterruptedException {

        WebElement province = driver.findElement(By.id("homeProvince"));
        province.click();
        province.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(1000);

    }

    @When("selct City Kabupaten")
    public void selct_city_kabupaten() throws InterruptedException {

        WebElement city = driver.findElement(By.id("homecity"));
        city.click();
        city.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }

    @When("enter Sum Insured for Building")
    public void enter_sum_insured_for_building() throws InterruptedException {

        WebElement sumInsured = driver.findElement(By.xpath("//input[@id='insuredAmountforBuilding']"));
        sumInsured.sendKeys("10.000.000.000");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);


    }

    @When("enter Sum Insured for Content")
    public void enter_sum_insured_for_content() {

        WebElement sumINsured = driver.findElement(By.xpath("//input[@id='insuredhomeAmountforpropoerty']"));
        sumINsured.sendKeys("0");


    }

    @When("click on Next button in Property Insurance Policy")
    public void click_on_next_button_in_property_insurance_policy() throws InterruptedException {

        WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
        nextBtn.click();
        Thread.sleep(5000);


    }

    @When("click on FLEXAS select button in Choose Product page")
    public void click_on_flexas_select_button_in_choose_product_page() throws InterruptedException {

        WebElement flexas = driver.findElement(By.xpath("//div[@class='ant-card ant-card-bordered accordian-image']//span[contains(text(),'Select')]"));
        flexas.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);


    }

    @When("click on next button in Choose Product page")
    public void click_on_next_button_in_choose_product_page() throws InterruptedException {

        WebElement nxt = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary next-button-travel']"));
        nxt.click();
        Thread.sleep(4000);


    }

    @When("enable check box in typhoon function")
    public void enable_check_box_in_typhoon_function() {

        WebElement box = driver.findElement(By.xpath("//input[@name='isFloodCoverOpted']"));
        box.click();
    }

    @When("click on next button in Additional Protection page")
    public void click_on_next_button_in_additional_protection_page() throws InterruptedException {


        WebElement nextbtn = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary next-button-travel']"));
        nextbtn.click();
        Thread.sleep(4000);

    }

    @When("I click on nxt button in Quote Summary page")
    public void i_click_on_nxt_button_in_quote_summary_page() throws InterruptedException {

        WebElement nextButton = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        nextButton.click();
        Thread.sleep(5000);

    }

    @When("click on create policy tab")
    public void click_on_create_policy_tab() {

        WebElement createPolicy = driver.findElement(By.xpath("//span[normalize-space()='Create Policy']"));
        createPolicy.click();


    }

    //////////////////////////////////////////////////////////////////////////////
    // Agent onboarding

    @When("click on Invite friends tab")
    public void click_on_invite_friends_tab() throws InterruptedException {


        WebElement invitefriends = driver.findElement(By.xpath("//span[normalize-space()='Invite Friends']"));
        invitefriends.click();
        Thread.sleep(2000);
    }

    @When("And click on copy the code")
    public void and_click_on_copy_the_code() {

        WebElement copyclick = driver.findElement(By.xpath("//img[@class='ant-image-img']"));
        copyclick.click();
    }

    @When("open link in new tab")
    public void open_link_in_new_tab() throws InterruptedException {
        driver.get("https://oona-id-dev.salesdrive.app/withoutReferralLinkRegistration/Mdt7wv");
        Thread.sleep(9000);

    }

    @When("enter mobile number")
    public void enter_mobile_number() throws InterruptedException {
        // WebElement mobileNumberInput = driver.findElement(By.xpath("//input[@id='phonenumber']"));
//        WebElement mobileNumberInput = driver.findElement(By.xpath("//input[@id='phonenumber']")); // Replace with your locator
//        String randomMobileNumber = generateRandomMobileNumberStartingWith9();
//        mobileNumberInput.sendKeys(randomMobileNumber);
//        mobileNumberInput.sendKeys(Keys.ENTER);
//    }
//
//// Add assertion to verify mobile number field is populated if needed
//
//    private String generateRandomMobileNumberStartingWith9() {
//        Random random = new Random();
//        int randomNumber = random.nextInt(900000000) + 100000000; // Generates a 9-digit number
//        return "9" + randomNumber;
        By mobileNumberField = By.xpath("//input[@id='phonenumber']"); // Replace with actual locator

        // Generate a random mobile number
        Random random = new Random();
        int firstThreeDigits = 100 + random.nextInt(799); // Avoids starting with 8 or 9
        int nextThreeDigits = random.nextInt(900) + 100; // Ensures 4 digits
        int lastFourDigits = 1000 + random.nextInt(9000); // Ensures 4 digits

        String mobileNumber = String.format("%03d%03d%04d", firstThreeDigits, nextThreeDigits, lastFourDigits);

        // Enter the random mobile number into the field
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);

    }

    @When("time wait")
    public void time() throws InterruptedException {

        Thread.sleep(7000);
    }


    @When("click on checkbox terms and conditions")
    public void click_on_checkbox_terms_and_conditions() throws InterruptedException {

        Thread.sleep(3000);
        WebElement check = driver.findElement(By.xpath("//input[@class=\"ant-checkbox-input\"]"));
        Actions a = new Actions(driver);
        a.moveToElement(check).click().perform();

    }

    @When("click on next button")
    public void click_on_n_button() {
        WebElement next = driver.findElement(By.xpath("//button[@type='submit']"));
        next.click();
    }

    @When("enter OTP")
    public void enter_otp() {

        // OTP digits array (replace with your OTP digits)
        String[] otpDigits = {"6", "5", "9", "3", "2", "0"};

        // Loop through each OTP input field and enter corresponding digits
        for (int i = 0; i < otpDigits.length; i++) {
            String xpath = "(//input[@class='ant-input ant-input-lg agentOTPInput'])[" + (i + 1) + "]";
            WebElement otpInput = driver.findElement(By.xpath(xpath));
            otpInput.sendKeys(otpDigits[i]);
        }

//        WebElement otp1 = driver.findElement(By.xpath("(//input)[@class=\"ant-input ant-input-lg agentOTPInput\"][1]"));
//        otp1.sendKeys("6");
//        driver.findElement(By.xpath("(//input)[@class=\"ant-input ant-input-lg agentOTPInput\"][2]")).sendKeys("5");
//       driver.findElement(By.xpath("(//input)[@class=\"ant-input ant-input-lg agentOTPInput\"][3]")).sendKeys("9");
//       driver.findElement(By.xpath("(//input)[@class=\"ant-input ant-input-lg agentOTPInput\"][4]")).sendKeys("3");
//       driver.findElement(By.xpath("(//input)[@class=\"ant-input ant-input-lg agentOTPInput\"][5]")).sendKeys("0");
//       driver.findElement(By.xpath("(//input)[@class=\"ant-input ant-input-lg agentOTPInput\"][6]")).sendKeys("5");
    }

    @When("click on submit button")
    public void click_on_submit_button() {


        WebElement submit = driver.findElement(By.xpath("//span[normalize-space()='Submit']"));
        submit.click();
    }

    @When("enter Full name as per KTP KITAS")
    public void enter_full_name_as_per_ktp_kitas() {

        WebElement fullname = driver.findElement(By.xpath("//input[@id='individualFullName']"));
        fullname.sendKeys("venka tesh");
    }

    @When("enter email address")
    public void enter_email_address() throws InterruptedException {

//        WebElement email = driver.findElement(By.xpath("//input[@id='individualEmailaddress']"));
//        email.sendKeys("vnhfhgk@gmail.com");
        // Generate a random email address
        String randomEmail = generateRandomEmail();

        // Find the email input field and enter the random email
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='individualEmailaddress']"));
        emailInput.sendKeys(randomEmail);

    }

    // Method to generate a random email address
    public static String generateRandomEmail() throws InterruptedException {
        String domain = "example.com"; // Replace with your desired domain
        String username = generateRandomString(10); // Generate a random username
        return username + "@" + domain;
    }

    // Method to generate a random string of specified length
    public static String generateRandomString(int length) throws InterruptedException {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();

//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        Thread.sleep(1000);

    }

    @When("click on submit button tab")
    public void click_on_submit_button_tab() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(5000);

    }

    @When("click on No button Card KTP KITAS details now")
    public void click_on_no_button() throws InterruptedException {

        // Find the <span> element with text "No"
        WebElement spanElement = driver.findElement(By.xpath("//span[normalize-space()='No']"));

        // Perform actions with the found element (e.g., click)
        spanElement.click();
        Thread.sleep(9000);
    }

    @When("clcik yes Tax Payer details")
    public void yes_button() throws InterruptedException {
        WebElement YesButton = driver.findElement(By.xpath("(//span[normalize-space()='Yes'])[1]"));
        Actions a = new Actions(driver);
        a.moveToElement(YesButton).click().perform();
        //YesButton.click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Proceed on Mobile']")).click();
        Thread.sleep(100000);
    }


//    @When("click on no btn")
//    public void click_on_no_btn() throws InterruptedException {
//        // Check if the text is visible on the UI
//        WebElement textElement = driver.findElement(By.xpath("//div[normalize-space()='Would you like to provide your Tax Payer details now?']"));
//        if (textElement.isDisplayed()) {
//            // If the text is visible, click on the "No" button
//            WebElement noButton = driver.findElement(By.xpath("//span[normalize-space()='No']"));
//            noButton.click();
//            System.out.println("Clicked on No button.");
//        } else {
//            System.out.println("Text is not visible on the UI.");
//        }
//
//    }

    @When("click on No Butn Bank Account details now")
    public void click_on_no_butn() throws InterruptedException {

        // Find the <span> element with text "No"
        WebElement spanElement = driver.findElement(By.xpath("(//span[text()='No'])[3]"));

        Actions ac = new Actions(driver);
        ac.moveToElement(spanElement).click().perform();

    }
//    @When("click on goto dashboard button")
//    public void click_on_goto_dashboard_button() {
//
//
//        // Find the <div> element with the specific text
//        WebElement divElement = driver.findElement(By.xpath("//div[normalize-space()='Congrats! You are now a member of the Kahoona community!']"));
//
//        // Verify if the element is displayed and contains the expected text
//        if (divElement.isDisplayed() && divElement.getText().equals("Congrats! You are now a member of the Kahoona community!")) {
//            System.out.println("Text verification successful!");
//        } else {
//            System.out.println("Text verification failed!");
//        }

/////////////////////////////////////////////////////////////////////////////
    // Agent on boarding corporate flow with NO.

    @When("click on submit button tab in corporate")
    public void click_on_submit_button_tab_incorporate() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(4000);
    }

    @When("click on corporate tab")
    public void click_on_corporate_tab() {

        WebElement corporate = driver.findElement(By.xpath("//div[text()='Corporate']"));
        corporate.click();
    }
    @When("enter Company Name")
    public void enter_company_name() {

       WebElement companyName = driver.findElement(By.id("corporatecomapanyName"));
       companyName.sendKeys("Delina");
    }
    @When("enter Company Director's Name")
    public void enter_company_director_s_name() {

        WebElement companyDirectorName = driver.findElement(By.id("corporatecompanydirectorname"));
        companyDirectorName.sendKeys("jhon");
    }
    @When("enter Company's PIC Email Address")
    public void enter_company_s_pic_email_address() throws InterruptedException {

        String randomEmail = generateRandomEmail();

        // Find the email input field and enter the random email
        WebElement emailInput = driver.findElement(By.id("corporatepiccompanyemailaddress"));
        emailInput.sendKeys(randomEmail);

    }

    // Method to generate a random email address
    public static String generateRandomEmaildirector() throws InterruptedException {
        String domain = "example.com"; // Replace with your desired domain
        String username = generateRandomString(10); // Generate a random username
        return username + "@" + domain;
    }

    // Method to generate a random string of specified length
    public static String generateRandomStringemail(int length) throws InterruptedException {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();


    }
    @When("click on submit tab button")
    public void click_on_submit_tab_button() throws InterruptedException {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        WebElement submitBtn = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
        submitBtn.click();
        Thread.sleep(4000);
    }


    @When("click on No Company Director's ID Card details")
    public void click_on_no_company_director_s_id_card_details() throws InterruptedException {

        WebElement nobutton = driver.findElement(By.xpath("//span[text()='No']"));
        Actions a = new Actions(driver);
        a.moveToElement(nobutton).click().perform();
        Thread.sleep(1000);
    }
    @When("click on no company’s Taxpayer ID NPWP details")
    public void click_on_no_company_s_taxpayer_id_npwp_details() throws InterruptedException {

        WebElement Nobutton = driver.findElement(By.xpath("//span[text()='No']"));
        Actions a = new Actions(driver);
        a.moveToElement(Nobutton).click().perform();
        Thread.sleep(1000);
    }
    @When("click on No Bank Account details")
    public void click_on_no_bank_account_details() throws InterruptedException {


        // Find and click on the "No" button using Actions class
        WebElement noButton = driver.findElement(By.xpath("//span[text()='No']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(noButton).click().perform();

        // Add a wait to ensure the page has loaded after clicking the button
        Thread.sleep(1000); // You may replace this with WebDriverWait for better synchronization

        // Verify the presence of the congratulatory message using WebDriverWait

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// Wait up to 10 seconds
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Congrats! You are now a member of the Kahoona community!']")));

        // Check if the message is displayed
        if (messageElement.isDisplayed()) {
            System.out.println("Success! Congratulatory message is displayed.");
        } else {
            System.out.println("Error! Congratulatory message is not displayed.");
        }
    }


   @When("click on Yes Company Director's ID Card details")
   public void click_on_yes_company_director_s_id_card_details() throws InterruptedException {
    WebElement yes = driver.findElement(By.xpath("//span[text()='Yes']"));
    yes.click();
    Thread.sleep(1000);

   }
    @When("click on proceed mobile to scan Taxpayer details")
    public void click_on_proceed_mobile_to_scan_taxpayer_details() throws InterruptedException {

        WebElement proceedmble = driver.findElement(By.xpath("//span[text()='Proceed on Mobile']"));
        proceedmble.click();
        Thread.sleep(80000);




        //canvas[@class="idCard__signature"]
    }


    @When("click on continue button")

    public void click_on_continue_button() throws InterruptedException {

        WebElement continueBtn = driver.findElement(By.xpath("//span[text()='Continue']"));
        continueBtn.click();
        Thread.sleep(3000);


    }

    @When("enter canvas signature")
    public void canvas_signature() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement canvas = driver.findElement(By.xpath("//canvas[@class=\"idCard__signature\"]"));

        // Find the canvas element

        // Perform actions on the canvas using Actions class
        Actions builder = new Actions(driver);
        builder.moveToElement(canvas)
                .clickAndHold(canvas)
                .moveByOffset(50, 50) // Example: Move to a point on the canvas (adjust as needed)
                .moveByOffset(100, 100) // Example: Continue drawing the signature
                .release()
                .perform();

        // Optionally, add a small delay to allow canvas interaction
        try {
            Thread.sleep(2000); // Adjust delay as necessary
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("click on submit button after signature")
    public void submitButtin_after_sign() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement sub = driver.findElement(By.xpath("//span[text()='Submit']"));
        sub.click();
        Thread.sleep(4000);
    }
    @When("click on Yes Taxpayer ID taxpayer NPWP details now?")
    public void click_on_yes_taxpayer_id_npwp_details_now() {

        WebElement yes = driver.findElement(By.xpath("//span[text()='Yes']"));
        yes.click();

    }

    @When("click on Proceed Mobile")
    public void proceed_mob() throws InterruptedException {

        WebElement proceedmble = driver.findElement(By.xpath("//span[text()='Proceed on Mobile']"));
        proceedmble.click();
        Thread.sleep(80000);
    }
    @When("click on yes Bank Account details now")
    public void click_on_yes_bank_account_details_now() throws InterruptedException {

        WebElement yes = driver.findElement(By.xpath("//span[text()='Yes']"));
        yes.click();
        Thread.sleep(5000);
    }
    @When("choose bank name")
    public void choose_bank_name() {

        WebElement bankName = driver.findElement(By.id("bankName"));
        bankName.click();
        bankName.sendKeys(Keys.ENTER);

    }
    @When("enter Bank Account Holder's Name")
    public void enter_bank_account_holder_s_name() {

        WebElement bankActHolderName = driver.findElement(By.id("bankAccountHoldersName"));
        bankActHolderName.sendKeys("jhon");
    }
    @When("enter Bank Account Number")
    public void enter_bank_account_number() {

        WebElement bankActNum = driver.findElement(By.id("bankAccountNumber"));
        bankActNum.sendKeys("64563908790");
    }
    @When("click on submitBun")
    public void click_on_submit_bun() {

        WebElement submitBtn = driver.findElement(By.xpath("//span[text()='Submit']"));
        submitBtn.click();

    }


}