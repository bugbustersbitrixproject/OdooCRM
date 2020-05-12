package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CustomersPage;
import pages.SalesPage;

import java.util.Map;

public class CustomerCreation_StepDefinitions {

    CustomersPage c1=new CustomersPage();
    SalesPage s1=new SalesPage();

    @Then("user should navigates to {string} submodule")
    public void user_should_navigates_to_submodule(String submodule) {

        s1.customerClick();

    }

    @Then("user should verify page title is {string}")
    public void user_should_verify_page_title_is(String title) {

        Assert.assertEquals(title,c1.getTextFromCustomersTitle());

    }

    @Then("user should create new customer with following info")
    public void user_should_create_new_customer_with_following_info(Map<String,String> table) {

        c1.enterName(table.get("Name"));
        c1.enterAddress(table.get("Street"),table.get("Street2"),table.get("City"),table.get("State"),table.get("Zip"),table.get("Country"));
        c1.enterTin(table.get("Tin"));
        c1.enterTags(table.get("Tags"));
        c1.enterJobPosition(table.get("Job Position"));
        c1.enterPhone(table.get("Phone"));
        c1.enterMobile(table.get("Mobile"));
        c1.enterEmail(table.get("Email"));
        c1.enterWebsite(table.get("Website"));
        c1.enterTitle(table.get("Title"));
        c1.enterLanguage(table.get("Language"));

        c1.clickSave();
    }
}
