package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // 1 . LI=PRO-WithEkyc
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\ANFIB.feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\ANWB.feature" ,
        features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\ASIP.feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\Aviva Fortune Plus.feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\Aviva Signature Guaranteed Income Plan(NON-POS).feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\Aviva Signature Guaranteed Income Plan(POS).feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\Aviva Signature Monthly Income Plan.feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\Aviva Signature 3D Term Plan(NON-POS).feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\Aviva Signature 3D Term Plan(POS).feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC\\POS Aviva Dhan Suraksha.feature" ,





        // 2. LI=PRO-WithoutEkyc
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\ANFIB.feature",
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\ANWB.feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\ASIP.feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\Aviva Fortune Plus.feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\Aviva Signature Guaranteed Income Plan(NON-POS).feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\Aviva Signature Guaranteed Income Plan(POS).feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\Aviva Signature Monthly Income Plan.feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\Aviva Signature 3D Term Plan(NON-POS).feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\Aviva Signature 3D Term Plan(POS).feature" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc\\POS Aviva Dhan Suraksha.feature" ,




        //3. LI≠PRO- WitheKYC
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\ANFIB.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\ANWB.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\ASIP.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\Aviva Fortune Plus.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\Aviva Signature Guaranteed Income Plan(NON-POS).feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\Aviva Signature Guaranteed Income Plan(POS).feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\Aviva Signature Monthly Income Plan.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\Aviva Signature 3D Term Plan(NON-POS).feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\Aviva Signature 3D Term Plan(POS).feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc\\POS Aviva Dhan Suraksha.feature" ,




        //4. LI≠PRO- WithouteKYC
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc/ANFIB.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc/ANWB.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc\\ASIP.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc\\Aviva Fortune Plus.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc\\Aviva Signature Guaranteed Income Plan(NON-POS).feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc\\Aviva Signature Guaranteed Income Plan(POS).feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc\\Aviva Signature Monthly Income Plan.feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc\\Aviva Signature 3D Term Plan(NON-POS).feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc\\Aviva Signature 3D Term Plan(POS).feature" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc\\POS Aviva Dhan Suraksha.feature" ,




        //Forlder wise paths
        //features = "src\\test\\java\\Features\\LI=PRO-WithEKYC" ,
        //features = "src\\test\\java\\Features\\LI=PRO-WithoutEkyc" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithEkyc" ,
        //features = "src\\test\\java\\Features\\LI≠PRO-WithoutEkyc" ,


        //features = "src\\test\\java\\Features" ,


        //Admin
        //features = "src\\test\\java\\Features\\ADMIN\\Admin(LI=PRO-WithEKYC).feature" ,
        //features = "src\\test\\java\\Features\\ADMIN\\Admin(LI≠PRO-WithEkyc).feature" ,



        dryRun = false,
        glue = "StepDefinitions", monochrome = true,
        tags = "@PRODUCT" ,

        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failedrerun.txt"})



public class testRunner {

    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {


    }

}
