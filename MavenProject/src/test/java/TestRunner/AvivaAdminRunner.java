package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;


import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/Features/ADMIN/Admin(LI≠PRO-WithEkyc).feature",

        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failedrerun.txt"}

)

public class AvivaAdminRunner {

}

