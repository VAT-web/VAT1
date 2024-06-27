package PageObjects;

import StepDefinitions.OonaSteps;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class GenericUtilities {
    public WebDriver driver;
    public WebDriverWait wait;


    public GenericUtilities() {
        this.driver = driver;
    }

    public GenericUtilities(WebDriver driver, OonaSteps oonaSteps) {

    }


    public WebElement getElementByXpath(String locator) {
        return driver.findElement(By.xpath(locator));
    }

    public List<WebElement> getElementsByXpath(String locator) {
        return driver.findElements(By.xpath(locator));
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fullScreen() {
        driver.manage().window().maximize();
    }

    public void navigate(String url) {
        driver.get(url);
    }

    public WebElement waitUntilElementToBeClickeble(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return getElementByXpath(locator);
    }

    public WebElement waitVisibilityOfElement(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void scrollToForkfulMarket() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
                getElementByXpath("//h2[contains(text(),'Forkful Market')]"));
    }


    public WebElement waitUntillElementToBeClickable(String locator) {

        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public void sendKeysJSAlternative() {
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("document.getElementById('gsc-i-id1').value='apple'");
    }

    public List<WebElement> waitUntillElementsToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }

    public void scrollDown100px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
    }

    public void scrollDown200px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
    }

    public WebDriver scrollDown300px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
       return null;

    }

    public void scrollDown400px() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,400)");

    }

    public void scrollDown500px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public void scrollDown600px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
    }

    public void scrollDown700px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
    }

    public void scrollDown800px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
    }

    public void scrollDown900px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
    }

    public void scrollDown1000px() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToTop() {
        JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
        jsExecuter.executeScript("window.scrollTo(0,document.body.scrollTop)");
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public void waitForElementAppears(String locator, int seconds) {
        for (int i = 0; i < seconds; i++) {
            if (driver.findElements(By.xpath(locator)).size() > 0) {
                break;
            } else {
                sleep(1);
                System.out.println("No such element  \n  The X-Path name of the locator is: " + locator);
            }
        }
    }

    public WebElement getElementByCssLocator(String cssLocator) {
        WebElement getElementByCssLocator = driver.findElement(By.cssSelector(cssLocator));
        return getElementByCssLocator;
    }

    public List<WebElement> getElementsByCssLocators(String cssLocator) {
        List<WebElement> getElementsByCssLocator = driver.findElements(By.cssSelector(cssLocator));
        return getElementsByCssLocator;
    }

    public void navigateBackInBrowser() {
        driver.navigate().back();
    }

    public WebElement getSrcOfTheElement(String cssLocator) {
        WebElement getSrc = driver.findElement(By.cssSelector(cssLocator));
        return getSrc;
    }

    public void waitForElementDisappear(String locator) {
        for (int i = 0; i < 8; i++) {
            if (driver.findElements(By.xpath(locator)).size() == 0) {
                sleep(1);
                Assert.assertTrue(true);
                System.out.println("The element disappear");
                break;
            } else {
                Assert.assertTrue(false);
                sleep(1);
            }
        }
    }

    public void changeResolutionTo1024x768() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("resolution","1024x768");
    }
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void type(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

public void fileUpload (){

    File uploadFile = new File("src/test/resources/selenium-snapshot.png");

    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
    fileInput.sendKeys(uploadFile.getAbsolutePath());
    driver.findElement(By.id("file-submit")).click();
}

public void  anotherMethodScrollDown(){

    Actions actions = new Actions(driver);
    actions.moveByOffset(0, 200).perform();
}

public void randomNum() throws InterruptedException {

//    String randomMobileNumber = generateRandomMobileNumberStartingWith9();
//    mobileNumberInput.sendKeys(randomMobileNumber);
//    mobileNumberInput.sendKeys(Keys.ENTER);
//    Thread.sleep(7000);
//}
//
//// Add assertion to verify mobile number field is populated if needed
//
//    private String generateRandomMobileNumberStartingWith9() throws InterruptedException {
//        Random random = new Random();
//        int randomNumber = random.nextInt(900000000) + 100000000;
//        return "9" + randomNumber;
}
}