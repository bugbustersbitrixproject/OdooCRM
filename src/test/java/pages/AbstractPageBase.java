package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtils;
import utilities.Driver;

/**
 * This class will be extended by page classes
 * And common web elements/locators can be stored here
 */
public abstract class AbstractPageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);
    protected Actions actions = new Actions(driver);

    //username at the top right corner
    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    private WebElement username;

    //make a link between WebDriver and Page Class
    public AbstractPageBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    /**
     * This method is using to navigate between modules
     * Automation clicks element by JavaScript
     * Because according to web browser's window size, some elements hide under "More" tab
     * And it is dynamic, to avoid that we used clickWithJS() method (It comes from BrowserUtils)
     * @param module accepts module name to navigate (at the top of main page)
     */
    public void navigateTo(String module) {
        String moduleXpath = "//div[@class='navbar-collapse collapse']//span[@class='oe_menu_text' and contains(text(),'" + module + "')]";
        WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));
        //to click all module elements event it is under "More" tab
        BrowserUtils.clickWithJS(moduleElement);
    }


    /**
     * This method is using to get the name of account owner from right top corner
     * @return account owner's full name as a String
     *
     */

    public String getUsername() {
        return username.getText();
    }

}
