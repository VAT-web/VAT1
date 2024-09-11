package PageObjects;

import PageObjects.AddnewLead;
import PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseClass {

    public WebDriver driver;
    public LoginPage lp;
    public AddnewLead AN;
    public Properties configprop;

    public String leadId;

    public String ProID;




}
