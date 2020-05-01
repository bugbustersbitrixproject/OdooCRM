package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.security.auth.login.Configuration;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    private WebElement emailBox;

    @FindBy(id = "password")
    private WebElement passwordBox;

    /**
     * Method to login, version #1
     * Login as a default user
     * Credentials will be retrieved from configuration.properties file
     */
    public void login() {
        emailBox.sendKeys(ConfigurationReader.getProperty("sales_manager1"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("salesmanager_password"), Keys.ENTER);
    }

    /**
     * Method to login, version #2
     * Login as a specific user
     *
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password, Keys.ENTER);
    }
}
