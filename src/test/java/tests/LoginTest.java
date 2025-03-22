package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {
    	initializeBrowser(browser);
        loginPage = new LoginPage();
    }

    @Test
    public void testUserLogin() {
        loginPage.loginUser();
    }
//it will execute the after the test 
    @AfterMethod
    public void closeDownbrowser() {
        closeBrowser();
    }
}