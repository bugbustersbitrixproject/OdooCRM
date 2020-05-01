package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    @When("user enters with valid credentials")
    public void user_enters_with_valid_credentials() {
        loginPage.login();
    }

    @Then("user should see main page")
    public void user_should_see_main_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Odoo"));
    }
}
