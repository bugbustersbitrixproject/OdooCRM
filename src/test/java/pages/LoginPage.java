package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    public void login() {
        emailBox.sendKeys(ConfigurationReader.getProperty("sales_manager1"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("salesmanager_password"), Keys.ENTER);
    }
}
