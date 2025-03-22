package pages;

import base.BaseTest;
import utilities.ConfigReader;
import org.openqa.selenium.By;

// This class extends BaseTest to use WebDriver and other methods
public class LoginPage extends BaseTest {
    
    // Creating an instance of ConfigReader to fetch data (like email and password) from the config file
    ConfigReader config = new ConfigReader();

    // Defining locators for the login page elements
    public By loginLink = By.linkText("Log in");
    public By emailField = By.id("Email"); 
    public By passwordField = By.id("Password"); 
    public By loginButton = By.cssSelector("input.button-1.login-button"); 
    
    // Method to log in the user
    public void loginUser() {
        driver.findElement(loginLink).click();
        
        driver.findElement(emailField).sendKeys(config.getProperty("email"));
        
        driver.findElement(passwordField).sendKeys(config.getProperty("password"));
        
        driver.findElement(loginButton).click();
        
        System.out.println("Login successful");
    }
}
