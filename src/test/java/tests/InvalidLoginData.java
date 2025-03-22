package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;
import utilities.InvalidExcelReader;

public class InvalidLoginData extends BaseTest {
    //WebDriver driver;

    @BeforeMethod
    public void setUp() {
        initializeBrowser("chrome");
    }

    @Test(dataProvider = "InvalidCredentialsProvider", dataProviderClass = InvalidExcelReader.class)
    public void testInvalidLogin(String email, String password) {
        try {
        	driver.findElement(By.linkText("Log in")).click();
        	Thread.sleep(3000);
        	BaseTest.driver.findElement(By.id("Email")).click();
        	BaseTest.driver.findElement(By.id("Email")).clear();
            driver.findElement(By.id("Email")).sendKeys(email);
            driver.findElement(By.id("Password")).click();
            driver.findElement(By.id("Password")).clear();
            driver.findElement(By.id("Password")).sendKeys(password);

            driver.findElement(By.cssSelector("input.button-1.login-button")).click();

            String errorMessage = driver.findElement(By.cssSelector(".validation-summary-errors")).getText();
            Assert.assertTrue(errorMessage.contains("Login was unsuccessful. Please correct the errors and try again."),
                    "Expected error message not displayed!");
            System.out.println("Test Passed - Invalid Login: " + email + " | " + (password.isEmpty() ? "[BLANK]" : password));
        } catch (Exception e) {
            System.out.println("Test Failed for Email: " + email + " | Password: " + password);
            System.out.println("Error: " + e.getMessage());
        }
    }
    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}