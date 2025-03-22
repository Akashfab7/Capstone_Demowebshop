package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\Aakash\\eclipse-workspace\\DemoWebShop\\src\\main\\java\\features\\Registration.feature", // Path to feature files
    glue = {"stepDef"}, // Package containing your Step Definitions
    plugin = {"pretty", "html:target/cucumber-reports", }
    // "pretty" generates readable output in the console

    
    
)
public class RegisterRunBdd extends AbstractTestNGCucumberTests {
}