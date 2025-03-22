package tests;

import base.BaseTest;
import pages.CartPage;
import pages.LoginPage;
import pages.RegistrationPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    RegistrationPage registerPage;
    LoginPage loginPage;
	CartPage cartpage;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {
        initializeBrowser(browser);
        registerPage = new RegistrationPage();
        loginPage = new LoginPage();
        cartpage =new CartPage();
    }

    @Test(priority = 1)
    public void testUserRegistration() {
        registerPage.registerUser();
    }
    
    @Test(priority = 2)
    public void testUserLogin() {
        loginPage.loginUser();
    }
    @Test(priority = 3)
    public void testingthecart() {
        cartpage.ApparelandShoes();
    }

    @AfterMethod
    public void closeDown() {
        closeBrowser();
    }
}