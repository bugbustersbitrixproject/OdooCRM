package pages;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import utilities.BrowserUtils;

import utilities.Driver;

import java.util.List;



public class CRM_Page extends AbstractPageBase {


    @FindBy(xpath = "(//i[@class='fa fa-gear'])[1]")
    private WebElement toggle;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[3]/li")
    private List<WebElement> toggleMenu;

    @FindBy(xpath = "//table/thead/tr/th")
    private List<WebElement> headingList;

    @FindBy(css = "body > div.o_main > div.o_main_content > div.o_control_panel > ol > li")
    private WebElement pipeline;

    public String getTextPipeline() {
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.wait(4);
        return pipeline.getText();
    }

    public String getTitle() {
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.wait(5);
        return Driver.getDriver().getTitle();
    }


    public boolean isToggleEnabled() {
        return toggle.isEnabled();
    }

    public void clickToggle() {
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.clickWithJS(toggle);

    }


    public List<String> getToggleMenu() {
        BrowserUtils.waitForPageToLoad(20);
        return BrowserUtils.getTextFromWebElements(toggleMenu);

    }

    @FindBy(xpath = "(//span[@class='o_kanban_quick_add']/i )[1]")
    private WebElement newBtn;

}