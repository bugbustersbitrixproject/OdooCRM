package step_definitions;

import io.cucumber.java.en.Then;
import pages.SalesPage;
import utilities.BrowserUtils;

public class SalesPageStepDefinitions {

    SalesPage salesPage = new SalesPage();

    @Then("user should navigates to {string} module")
    public void user_should_navigates_to_module(String moduleName) {

        salesPage.navigateTo(moduleName);
    }

    @Then("user should create quotation")
    public void user_should_create_quotation() {

    }
}
