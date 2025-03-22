package pages;

import base.BaseTest;
import utilities.ConfigReader;
import org.openqa.selenium.By;

// Extending the BaseTest class to inherit the WebDriver and other methods
public class CartPage extends BaseTest {
    
    // Creating an instance of ConfigReader to read data from configuration file
    ConfigReader config = new ConfigReader();
    
    // Defining locators for login functionality
    public By loginLink = By.linkText("Log in");
    public By emailField = By.id("Email");
    public By passwordField = By.id("Password");
    public By loginButton = By.cssSelector("input.button-1.login-button");
    
    // Defining locators for apparel and shoes section and product selection
    public By shoes = By.linkText("Apparel & Shoes");
    public By firstproduct = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]");

    // Defining locator for shopping cart link
    public By shoppingcart = By.linkText("Shopping cart");

    // Method for logging in, adding a product to the cart, and navigating to the cart page
    public void ApparelandShoes() {
        
        driver.findElement(loginLink).click();
        
        
        driver.findElement(emailField).sendKeys(config.getProperty("email"));
        
        driver.findElement(passwordField).sendKeys(config.getProperty("password"));
        
        driver.findElement(loginButton).click();
        System.out.println("Login successful");

        driver.findElement(shoes).click();
        
        driver.findElement(firstproduct).click();
        System.out.println("Added to cart successful");

        driver.findElement(shoppingcart).click();
        System.out.println("Successfully entered into cart");
    }
}
