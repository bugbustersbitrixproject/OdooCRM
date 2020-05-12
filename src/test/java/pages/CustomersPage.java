package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;

public class CustomersPage extends AbstractPageBase {

    @FindBy(xpath = "//button[contains (text(),'Create')]")
    private WebElement create;

    @FindBy(xpath = "//button[contains (text(),'Import')]")
    private WebElement importBtn;

    @FindBy(xpath = "//h1//input")
    private WebElement name;

    @FindBy(xpath = "//input[@name='street']")
    private WebElement streetBox;

    @FindBy(xpath = "//input[@name='street2']")
    private WebElement street2Box;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityBox;

    @FindBy(xpath = "//div[@name='state_id']")
    private WebElement stateBox;

    @FindBy(xpath = "//input[@name='zip']")
    private WebElement zipBox;

    @FindBy(xpath = "//div[@name='country_id']")
    private WebElement countryBox;

    @FindBy(xpath = "//input[@name='vat']")
    private WebElement tinBox;

    @FindBy(xpath = "//label[text()='Tags']/../following-sibling::td//input']")
    private WebElement tagsBox;

    @FindBy(xpath = "//input[@name='function']")
    private WebElement jobPositionBox;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phoneBox;

    @FindBy(xpath = "//input[@name='mobile']")
    private WebElement mobileBox;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailBox;

    @FindBy(xpath = "//input[@name='website']")
    private WebElement websiteBox;

    @FindBy(xpath = "//label[text()='Title']/../following-sibling::td//input")
    private WebElement titleBox;

    @FindBy(xpath = "//select[@name='lang']")
    private WebElement languageBox;

    @FindBy(xpath = "//button[@accesskey='s']")
    private WebElement save;

     @FindBy(xpath = "//button[@accesskey='j']")
     private WebElement discard;


    @FindBy(xpath = "//li[@class='active' and text()='Customers']")
    private WebElement customersTitle;




    public void clickCreate(){

        wait.until(ExpectedConditions.elementToBeClickable(create)).click();
        BrowserUtils.wait(2);
    }

    public void enterName(String customerName){

        name.sendKeys(customerName);

    }

    public void enterAddress(String street1, String street2, String city,String state,String zip,String country){
        streetBox.sendKeys(street1);
        street2Box.sendKeys(street2);
        cityBox.sendKeys(city);
        stateBox.sendKeys(state, Keys.ENTER);
        zipBox.sendKeys(zip);
        countryBox.sendKeys(country, Keys.ENTER);
    }

    public void enterTin(String tin){

        tinBox.sendKeys(tin);
    }

   public void enterTags(String tag){

        tagsBox.sendKeys(tag, Keys.ENTER);
   }

   public void enterJobPosition(String position){

        jobPositionBox.sendKeys(position);
   }

   public void enterPhone(String phoneNum){

        phoneBox.sendKeys(phoneNum);
   }

   public void  enterMobile(String mobileNum){

        mobileBox.sendKeys(mobileNum);
   }

   public void enterEmail(String email){

        emailBox.sendKeys(email);
   }

   public void enterWebsite(String website){

        websiteBox.sendKeys(website);
   }

   public void enterTitle(String title){

        titleBox.sendKeys(title, Keys.ENTER);
   }

   public void enterLanguage(String language){

       Select laguageS=new Select(languageBox);
       laguageS.selectByValue(language);

   }


   public void clickSave(){

        save.click();
   }

    public String getTextFromCustomersTitle(){

        return customersTitle.getText();
    }
}
