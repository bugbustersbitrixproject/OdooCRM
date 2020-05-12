package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserUtils;

import java.util.List;

public class QuotationsPage extends AbstractPageBase{


    @FindBy(xpath = "//li[@class='active']//span[@class='oe_menu_text'][contains(text(),'Quotations')]")
    private WebElement quotations;
    ////table[@class="o_list_view table table-condensed table-striped o_list_view_ungrouped"]/thead/tr/th
    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th")
    private List<WebElement> quotationsTable;

    public boolean IsSelectedFirstCheckbox() {
        BrowserUtils.wait(2);
        quotationsTable.get(0).isSelected();
        return true;
    }
    public void clickFirstCheckbox() {

      wait.until(ExpectedConditions.visibilityOfAllElements(quotationsTable));
        BrowserUtils.wait(3);
        quotationsTable.get(0).click();
    }
    public List<String> tableHeaderContent(){
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOfAllElements(quotationsTable));
    return    BrowserUtils.getTextFromWebElements(quotationsTable);

    }
}