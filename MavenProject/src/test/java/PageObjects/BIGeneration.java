package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BIGeneration {
    public WebDriver adriver;

    public BIGeneration(WebDriver bdriver){
        adriver = bdriver;
        PageFactory.initElements(bdriver , this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[1]/span")
    @CacheLookup
    WebElement Click_SelfReference;

    public void ClickOnSelfReference() {
        Click_SelfReference.click();
    }


}
