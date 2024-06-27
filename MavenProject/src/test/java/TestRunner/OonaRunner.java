package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(

// AGENT FLOW //
//features="src/test/java/Features/OONA/AgentFlow/Car (with risk inspection).feature",

        // click upload
//features="src/test/java/Features/OONA/AgentFlow/Car (without risk inspection).feature",
   //  features="src/test/java/Features/OONA/AgentFlow/MotorCycle(without risk inspection).feature",
    //    features="src/test/java/Features/OONA/AgentFlow/MotorCycle (with risk inspection).feature",

        //CUSTOMER FLOW //

      // features="src/test/java/Features/OONA/CustomerFlow/Car(without risk inspection).feature",
//features = "src/test/java/Features/OONA/CustomerFlow/Car (with risk inspection).feature",
//features="src/test/java/Features/OONA/CustomerFlow/MotorCycle(with risk inspection).feature",
//features="src/test/java/Features/OONA/CustomerFlow/MotorCycle (without risk inspection).feature",

   // Agent OnBoarding
        features = "src/test/java/Features/OONA/AgentOnboarding/Corporate.feature",
       // features = "src/test/java/Features/OONA/AgentOnboarding/Individual.feature",
//features = "src/test/java/Features/Pramerica/ToDo.feature",
  // features = "src/test/java/Features/Pramerica/CreateEvent.feature",

        //Home
        //features = "src/test/java/Features/OONA/HomeFlow/DwellingHouse.feature",

        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failedrerun.txt"}

)
public class OonaRunner {

    
}
