package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import base.BaseTest;
import pages.RegistrationPageBdd;
import java.util.List;
import java.util.Map;

public class Registrationbdd extends BaseTest {
    private RegistrationPageBdd registrationPage;
	

    @Given("I am on the Demo Web Shop registration page")
    public void iAmOnTheDemoWebShopRegistrationPage() {
        driver.get("https://demowebshop.tricentis.com/register");
        registrationPage = new RegistrationPageBdd(driver);
    }

    @When("i enter {string} as the first name")
    public void i_enter_as_the_first_name(String firstName) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	registrationPage.enterFirstName(firstName);
    }

    @When("i enter {string} as the last name")
    public void i_enter_as_the_last_name(String lastName) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	registrationPage.enterLastName(lastName);
    }

    @When("i select {string} as the gender")
    public void i_select_as_the_gender(String gender) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	registrationPage.selectGender(gender);
    }

    @When("i enter the following credentials:")
    public void i_enter_the_following_credentials(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //throw new io.cucumber.java.PendingException();
    	 List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
         for (Map<String, String> row : credentials) {
             registrationPage.enterEmail(row.get("Email"));
             registrationPage.enterPassword(row.get("Password"));
             registrationPage.enterConfirmPassword(row.get("Confirm Password"));

    }
    }


    @When("I click the {string} button")
    public void iClickTheButton(String buttonName) {
        if (buttonName.equalsIgnoreCase("Register")) {
            registrationPage.clickRegisterButton();
        }
    }
}