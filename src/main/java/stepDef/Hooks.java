package stepDef;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {
    //public static WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Launching browser before scenario...");
        initializeBrowser("chrome");
        //driver = new ChromeDriver(); // Initialize WebDriver
        driver.manage().window().maximize(); // Maximize browser
    }
    @After
    public void closing() {
    	closeBrowser();
    }    }

    // Method to get WebDriver instance in step definitions