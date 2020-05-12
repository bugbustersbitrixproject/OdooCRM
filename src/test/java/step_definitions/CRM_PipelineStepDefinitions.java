package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CRM_Page;


import java.util.List;


public class CRM_PipelineStepDefinitions {

    CRM_Page crm_page = new CRM_Page();


    @Then("user navigates to {string} page Pipeline Modules")
    public void user_navigates_to_page_Pipeline_Modules(String string) {
        crm_page.navigateTo(string);

    }

    @Then("user verifies that page Title is {string}")
    public void user_verifies_that_page_Title_is(String string) {
        Assert.assertEquals(string, crm_page.getTitle());
    }


    @Then("user verifies that page subTitle is {string}")
    public void user_verifies_that_page_subTitle_is(String string) {
        Assert.assertEquals(string, crm_page.getTextPipeline());
    }


    @Then("user verifies that toggle setting is enabled")
    public void user_verifies_that_toggle_setting_is_enabled() {
        Assert.assertTrue(crm_page.isToggleEnabled());
    }

    @Then("user verifies that dropdown-toggle contains following:")
    public void user_verifies_that_dropdown_toggle_contains_following(List<String> dataTable) {
        crm_page.clickToggle();
        System.out.println(dataTable);
        System.out.println(crm_page.getToggleMenu());
        Assert.assertEquals(dataTable, crm_page.getToggleMenu());
    }

}
