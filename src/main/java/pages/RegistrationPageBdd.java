package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Page object model class for Registration Page using BDD 
public class RegistrationPageBdd {
    
    // WebDriver instance to interact with the browser
    public WebDriver driver;

    // Web elements representing the various fields and buttons on the registration page
    @FindBy(id = "gender-male") 
    private WebElement genderMaleRadioButton;
    
    @FindBy(id = "gender-female") 
    private WebElement genderFemaleRadioButton;
    
    @FindBy(id = "FirstName") 
    private WebElement firstNameInput;
    
    @FindBy(id = "LastName") 
    private WebElement lastNameInput;
    
    @FindBy(id = "Email") 
    private WebElement emailInput;
    
    @FindBy(id = "Password")
    private WebElement passwordInput;
    
    @FindBy(id = "ConfirmPassword") 
    private WebElement confirmPasswordInput;
    
    @FindBy(id = "register-button") 
    private WebElement registerButton;
    
    @FindBy(className = "result") 
    private WebElement successMessage;

    // Constructor to initialize WebDriver and bind the web elements using PageFactory
    public RegistrationPageBdd(WebDriver driver) {
        this.driver = driver;
        // Initialize the WebElements defined above with the driver instance
        PageFactory.initElements(driver, this);
    }

    // Method to select the gender (Male or Female) based on the input parameter
    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            // Click the male gender radio button
            genderMaleRadioButton.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            // Click the female gender radio button
            genderFemaleRadioButton.click();
        }
    }

    // Method to enter the first name into the first name input field
    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    // Method to enter the last name into the last name input field
    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    // Method to enter the email into the email input field
    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    // Method to enter the password into the password input field
    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    // Method to enter the confirm password into the confirm password input field
    public void enterConfirmPassword(String password) {
        confirmPasswordInput.sendKeys(password);
    }

    // Method to click the register button to submit the registration form
    public void clickRegisterButton() {
        registerButton.click();
    }

    // Method to check if the success message is displayed after registration
    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}
