package pages;

import base.BaseTest;
import utilities.ConfigReader;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// This class extends BaseTest to inherit the WebDriver and other functionalities
public class RegistrationPage extends BaseTest {
    
    // Creating an instance of ConfigReader to fetch data
    ConfigReader config = new ConfigReader();
    
    // Defining locators for the registration page elements
    public By registerLink = By.linkText("Register"); 
    public By genderMale = By.id("gender-male");
    public By firstNameField = By.id("FirstName"); 
    public By lastNameField = By.id("LastName"); 
    public By emailField = By.id("Email"); 
    public By passwordField = By.id("Password"); 
    public By confirmPasswordField = By.id("ConfirmPassword"); 
    public By registerButton = By.id("register-button"); 
    public By errorMessage = By.xpath("//li[normalize-space()='The specified email already exists']"); 
    public By loginLink = By.linkText("Log in"); 

    // Method to register a user
    public void registerUser() {
        driver.findElement(registerLink).click();
        
        driver.findElement(genderMale).click();
        
        driver.findElement(firstNameField).sendKeys(config.getProperty("firstname"));
        
        driver.findElement(lastNameField).sendKeys(config.getProperty("lastname"));
        
        driver.findElement(emailField).sendKeys(config.getProperty("email"));
        
        driver.findElement(passwordField).sendKeys(config.getProperty("password"));
        
        driver.findElement(confirmPasswordField).sendKeys(config.getProperty("password"));
        
        driver.findElement(registerButton).click();
        
        // Handling the case when the email already exists (error message is displayed)
        try {
            // Trying to find the error message if the email is already in use
            WebElement errorElement = driver.findElement(errorMessage);
            
            // If the error message is displayed, print a message and navigate to the login page
            if (errorElement.isDisplayed()) {
                System.out.println("Email already exists...");
                driver.findElement(loginLink).click(); 
            }
        } catch (NoSuchElementException e) {
            
            System.out.println("Registration successful.");
        }
    }
}
