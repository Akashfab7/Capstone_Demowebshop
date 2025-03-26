package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import base.BaseTest;
import utilities.ConfigReader;
import utilities.ReportManager;
public class CartPage1 extends BaseTest {
	//reading data from properties file
    ConfigReader config = new ConfigReader();
    //registering purpose
    public By registerLink = By.linkText("Register");
    public By genderMale = By.id("gender-male");
    public By firstNameField = By.id("FirstName");
    public By lastNameField = By.id("LastName");
    public By emailField1 = By.id("Email");
    public By passwordField1 = By.id("Password");
    public By confirmPasswordField = By.id("ConfirmPassword");
    public By registerButton = By.id("register-button");
   // public By logoutButtons= By.cssSelector(".ico-logout");
    public By errorMessage = By.xpath("//li[normalize-space()='The specified email already exists']");
    //public By logoutButtons= By.cssSelector(".ico-logout");
   //login purpose
    public By loginLink = By.linkText("Log in");
    public By emailField = By.id("Email");
    public By passwordField = By.id("Password");
    public By loginButton = By.cssSelector("input.button-1.login-button");
    //electronics
    // from here changes have been done
    //public By Electronics = By.linkText("Electronics");
    //public By cellphone = By.linkText("Cell phones");
   
    public By shoes = By.linkText("Apparel & Shoes");
    public By firstproduct = By.xpath("//div[@class='product-grid']//div[3]//div[1]//div[2]//div[3]//div[2]//input[1]");
    //public By secondproduct = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]");
   
    //Locating the shoppipng cart link
    public By shoppingcart = By.linkText("Shopping cart");
    
    // what ever we have to do the changes rom here
    public By deleteCheckbox = By.xpath("//input[@name='removefromcart']");
    public By updatecart = By.xpath("//input[@name='updatecart']");
    public By searchproduct=By.xpath("//input[@type='text']");
    
    public By shoes1 = By.linkText("Apparel & Shoes");
    //public By cellphones = By.linkText("Cell phones");
    public By firstproducts = By.xpath("//div[@class='product-grid']//div[3]//div[1]//div[2]//div[3]//div[2]//input[1]");
    public By shoppingcarts =By.linkText("Shopping cart");
    public By quantity =By.xpath("(//input[@type='text'])[2]");
    public By updatecart1 = By.xpath("//input[@name='updatecart']");
    public By termsCheckbox = By.id("termsofservice");
    public By checkout = By.xpath("//button[@id='checkout']");
    public By selectAddressDropDown = By.xpath("//select[@id='billing-address-select']");
    public By company = By.cssSelector("input[id='BillingNewAddress_Company']");
    public By country = By.cssSelector("select[id='BillingNewAddress_CountryId']");
    public By city = By.cssSelector("input[id='BillingNewAddress_City']");
    public By address = By.cssSelector("input[id='BillingNewAddress_Address1']");
    public By pincode = By.cssSelector("input[id='BillingNewAddress_ZipPostalCode']");
    public By mobile = By.cssSelector("input[id='BillingNewAddress_PhoneNumber']");
    public By continue1 = By.xpath("(//input[@type='button'])[2]");
    public By continue2 = By.xpath("(//input[@type='button'])[3]");
    public By continue3 = By.xpath("(//input[@type='button'])[4]");
    public By continue4 = By.xpath("(//input[@type='button'])[5]");
    public By continue5 = By.xpath("(//input[@type='button'])[6]");
    public By continue6 = By.xpath("(//input[@type='button'])[7]");
    public By continue7 = By.xpath("(//input[@type='button'])");
    public By account = By.xpath("(//a[@class='account'])[1]");
    public By orders = By.xpath("(//a[@class='inactive'])[2]");
    public By details = By.cssSelector("input[type='button']");
    //logout
   public By logoutButton= By.cssSelector(".ico-logout");
    public void ApparelandShoes() {
    	
         // Starting the report for extent report
        try {
			
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
			  System.out.println("successfully registerd");
			 // driver.findElement(logoutButtons).click();
			  
			  
			  ReportManager.createTest("log in"); 
			  driver.findElement(loginLink).click();
			  ReportManager.getTest().log(Status.INFO, "Clicked on Login link");
			  driver.findElement(emailField).sendKeys(config.getProperty("email"));
			  ReportManager.getTest().log(Status.INFO, "Entered Email");
			  driver.findElement(passwordField).sendKeys(config.getProperty("password"));
			  ReportManager.getTest().log(Status.INFO, "Entered Password");
			  driver.findElement(loginButton).click();
			  ReportManager.getTest().pass(" Login Successful");
			  
			  
			  
			  ReportManager.createTest("Add Apperal & shoes to Cart");
			  driver.findElement(shoes).click();
			  ReportManager.getTest().log(Status.INFO,"Navigated to Apperal & shoes  Category"); 
			  //driver.findElement(cellphone).click();
			  //ReportManager.getTest().log(Status.INFO, "Selected 'Cell Phones' Category");
			  driver.findElement(firstproduct).click();
			  ReportManager.getTest().pass(" First Product Added to Cart");
			  //driver.findElement(secondproduct).click();
			  //ReportManager.getTest().pass("Second Product Added to Cart");
			  driver.findElement(shoppingcart).click();
			  ReportManager.getTest().pass("Successfully Entered Shopping Cart");
			    
			  
			  ReportManager.createTest("deleting the Cart");
			   driver.findElement(deleteCheckbox).click();
		        driver.findElement(updatecart).click();
		        ReportManager.getTest().pass("Shopping Cart deleted");
		        driver.findElement(searchproduct).click();
		        driver.findElement(searchproduct).sendKeys("blue jeans",Keys.ENTER);
		        driver.findElement(shoes1).click();
		        //driver.findElement(cellphones).click();
		        driver.findElement(firstproducts).click();
		        //driver.findElement(secondproducts).click();
		        System.out.println("added to cart successful");
		        driver.findElement(shoppingcarts).click();
		        driver.findElement(quantity).click();
		        driver.findElement(quantity).clear();
		        driver.findElement(quantity).sendKeys("3",Keys.ENTER);
		        driver.findElement(updatecart1).click();
		        System.out.println("okkkk");
		        
		        ReportManager.createTest("going to checkout");
		        driver.findElement(termsCheckbox).click();
		        ReportManager.getTest().pass("CLICKED TERMS AND CONDIONS");
		        System.out.println("clicked on checkbox");
		        
		        driver.findElement(checkout).click();
		        System.out.println("done");
		        ReportManager.getTest().pass("CHECKOUT HAD DONE AND PAYMENT ALSO");
		        
		        Select select = new Select(driver.findElement(selectAddressDropDown));
			    select.selectByVisibleText("New Address");
		        driver.findElement(company).sendKeys(config.getProperty("company"));
		        driver.findElement(country).click();
		        driver.findElement(country).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		        driver.findElement(country).click();
		        driver.findElement(city).sendKeys(config.getProperty("City"));
		        ReportManager.getTest().pass("city entered");
		        driver.findElement(address).sendKeys(config.getProperty("Address"));
		        ReportManager.getTest().pass("address entered");
		        driver.findElement(pincode).sendKeys(config.getProperty("Pincode"));
		        ReportManager.getTest().pass("pin code enterd");
		        driver.findElement(mobile).sendKeys(config.getProperty("Mobile"));
		        ReportManager.getTest().pass("mobile number entered");
		        driver.findElement(continue1).click();
		        Thread.sleep(2000);
		        driver.findElement(continue2).click();
		        Thread.sleep(2000);
		        driver.findElement(continue3).click();
		        Thread.sleep(2000);
		        driver.findElement(continue4).click();
		        Thread.sleep(2000);
		        driver.findElement(continue5).click();
		        Thread.sleep(2000);
		        driver.findElement(continue6).click();
		        Thread.sleep(3000);
		        driver.findElement(continue7).click();
		        Thread.sleep(3000);
		        driver.findElement(account).click();
		        Thread.sleep(3000);
		        driver.findElement(orders).click();
		        ReportManager.getTest().pass("going to orders");
		        Thread.sleep(3000);
		        driver.findElement(details).click();
		        ReportManager.getTest().pass("payment and order information");

			 
            
				
				  ReportManager.createTest("Invalid login data");
				  driver.findElement(logoutButton).click();
				  driver.findElement(loginLink).click();
				  ReportManager.getTest().log(Status.INFO, "Clicked on Login link");
				  driver.findElement(loginButton).click();
				  ReportManager.getTest().pass(" Login Successful");
				  //driver.findElement(logoutButton).click();
				  ReportManager.getTest().pass(" Logout Successful");
				 
            
            
            
        } 
        //if try fail it gives an test failed message in catch
        catch (Exception e) {
            ReportManager.getTest().fail(" Test Failed: " + e.getMessage());
        }
    }
}