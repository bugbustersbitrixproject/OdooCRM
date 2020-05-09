package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;


public class LoginPage extends AbstractPageBase{




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

    public void login(String role){

         if (role.equals("sales manager")){
             emailBox.sendKeys(ConfigurationReader.getProperty("sales_manager1"));
             passwordBox.sendKeys(ConfigurationReader.getProperty("salesmanager_password"),Keys.ENTER);

         }else if(role.equals("expenses manager")){
             emailBox.sendKeys(ConfigurationReader.getProperty("expensesmanager1"));
             passwordBox.sendKeys(ConfigurationReader.getProperty("expensesmanager_password"),Keys.ENTER);

         }else{
             System.out.println("You are entering wrong credentials");
         }

    }
}
