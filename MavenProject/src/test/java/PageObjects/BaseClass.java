package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;
    public LoginPage lp;
    public AddnewLead AN;
    public Properties configprop;
    public GenericUtilities an;

    public String leadId;

    public String ProID;
    WebDriverWait wait;




}
