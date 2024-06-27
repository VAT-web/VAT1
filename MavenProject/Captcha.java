public class Captcha {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("debuggerAddress", "localhost:9494");

        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://wecare-uat.tataaig.com/login");  //aq1
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[1]/div/div[2]/div/div[3]")).click();

        driver.findElement(By.id("input-40")).sendKeys("Masterone");
        driver.findElement(By.id("input-43")).sendKeys("Iorta@2021");

        WebElement imageelement  = driver.findElement(By.xpath("(//div[contains(@class,'v-image v-responsive')]//div)[3]"));
        File src = imageelement.getScreenshotAs(OutputType.FILE);
        String path = "C:\\Users\\User\\Health\\MavenProject";

        FileHandler.copy(src, new File(path));

        Thread.sleep(2000);

        ITessaract Image = new Tessaract ();
    }
}
