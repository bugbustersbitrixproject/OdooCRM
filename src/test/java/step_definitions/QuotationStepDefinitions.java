package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QuotationsPage;

import java.util.List;

public class QuotationStepDefinitions {

QuotationsPage quotationsPage=new QuotationsPage();
    @Then("user able to click first column of the table")
    public void user_able_to_click_first_column_of_the_table() {
     quotationsPage.clickFirstCheckbox();
        Assert.assertTrue(quotationsPage.IsSelectedFirstCheckbox());
    }

    @Then("user able to see this title on Quotation table")
    public void user_able_to_see_this_title_on_Quotation_table(List<String> dataTable) {
   List<String> actualTableTitle=  quotationsPage.tableHeaderContent();
    Assert.assertEquals(actualTableTitle,dataTable);
    }


}
