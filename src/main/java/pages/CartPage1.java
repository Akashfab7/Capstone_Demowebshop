package pages;
import base.BaseTest;
import utilities.ConfigReader;
import utilities.ReportManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
public class CartPage1 extends BaseTest {
	
	// Creating an instance of ConfigReader to fetch properties
    ConfigReader config = new ConfigReader();
 
    // Register purpose - Defining locators for the registration page elements
    public By registerLink = By.linkText("Register");
    public By genderMale = By.id("gender-male");
    public By firstNameField = By.id("FirstName");
    public By lastNameField = By.id("LastName");
    public By emailField1 = By.id("Email");
    public By passwordField1 = By.id("Password");
    public By confirmPasswordField = By.id("ConfirmPassword");
    public By registerButton = By.id("register-button");
    public By errorMessage = By.xpath("//li[normalize-space()='The specified email already exists']");
   
    //login purpose-- Defining locators for the login page elements
    public By loginLink = By.linkText("Log in");
    public By emailField = By.id("Email");
    public By passwordField = By.id("Password");
    public By loginButton = By.cssSelector("input.button-1.login-button");
    
    // Add to cart purpose - Defining locators for the apparel and shoes section
    public By shoes = By.linkText("Apparel & Shoes");
   
    public By firstproduct = By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]");
    
    // Locating the shopping cart link
    public By shoppingcart = By.linkText("Shopping cart");
   
	
    // Method to register, login, and add an item to the cart
	public void ApparelandShoes() {
		
		// TODO Auto-generated method stub
		try {
			// Creating a report for registering
        	ReportManager.createTest("Registering");
        	driver.findElement(registerLink).click();
        	ReportManager.getTest().pass(" click register Successful");
            driver.findElement(genderMale).click();
            ReportManager.getTest().pass(" gender Successful");
            driver.findElement(firstNameField).sendKeys(config.getProperty("firstname"));
            ReportManager.getTest().pass(" firsrtname entered Successful");
            driver.findElement(lastNameField).sendKeys(config.getProperty("lastname"));
            ReportManager.getTest().pass(" Lastname entered Successful");
            driver.findElement(emailField1).sendKeys(config.getProperty("email"));
            ReportManager.getTest().pass(" email entered Successful");
            driver.findElement(passwordField1).sendKeys(config.getProperty("password"));
            ReportManager.getTest().pass(" password entered Successful");
            
            driver.findElement(confirmPasswordField).sendKeys(config.getProperty("password"));
            ReportManager.getTest().pass(" confirm password entered Successful");
            
            driver.findElement(registerButton).click();
            ReportManager.getTest().pass(" clicked on register Successful");
         // Creating a report for login
        	ReportManager.createTest("log in");
        	
            driver.findElement(loginLink).click();
            ReportManager.getTest().log(Status.INFO, "Clicked on Login link");
            
            driver.findElement(emailField).sendKeys(config.getProperty("email"));
            ReportManager.getTest().log(Status.INFO, "Entered Email");
            driver.findElement(passwordField).sendKeys(config.getProperty("password"));
            ReportManager.getTest().log(Status.INFO, "Entered Password");
            driver.findElement(loginButton).click();
            ReportManager.getTest().pass(" Login Successful");
         // Creating a report for adding products to the cart
            ReportManager.createTest("Add Apparel&Shoes to Cart");
            driver.findElement(shoes).click();
            ReportManager.getTest().log(Status.INFO, "Navigated to Apparel & Shoes");
            
            driver.findElement(firstproduct).click();
            ReportManager.getTest().pass(" First Product Added to Cart");
         // Creating a report for entering the cart
            ReportManager.createTest("entering to cart page");
            driver.findElement(shoppingcart).click();
            ReportManager.getTest().pass("Successfully Entered Shopping Cart");
        } 
		// In case of any exception, log the failure in the report
        catch (Exception e) {
            ReportManager.getTest().fail(" Test Failed: " + e.getMessage());
        }
    }
		
	}
		
	
