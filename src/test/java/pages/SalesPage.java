package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPage extends AbstractPageBase {

    @FindBy(xpath = "(//li[@class='active']//a//span[@class='oe_menu_text'][contains(text(),'Sales')]")
    private WebElement salesModule;

    @FindBy(xpath = "//button[@accesskey='c']")
    private WebElement create;

    @FindBy(xpath ="//button[@class='btn btn-sm btn-default o_button_import']")
    private WebElement importBtn;

    @FindBy(xpath = "//div[@class='o_searchview']")
    private WebElement searchBox;

    @FindBy(xpath = "//li[@class='active']//span[@class='oe_menu_text'][contains(text(),'Quotations')]")
    private WebElement quotations;

    @FindBy(xpath = "//li[@class='active']//span[@class='oe_menu_text'][contains(text(),'Orders')]")
    private WebElement orders;

    @FindBy(xpath = "//li[@class='active']//span[@class='oe_menu_text'][contains(text(),'Customers')]")
    private WebElement customers;

    @FindBy(xpath = "//li//span[@class='oe_menu_text'][contains(text(),'Orders to Invoice')]")
    private WebElement ordersToInvoice;

    @FindBy(xpath = "//li//span[@class='oe_menu_text'][contains(text(),'Orders to Upsell')]")
    private WebElement ordersToUpsell;

    @FindBy(xpath = "(//ul//li//span[@class='oe_menu_text'][contains(text(),'Products')])[1]")
    private WebElement products;

    @FindBy(xpath = "(//ul//li//span[@class='oe_menu_text'][contains(text(),'Pricelists')])[1]")
    private WebElement pricelist;

    @FindBy(xpath = "(//ul//li//span[@class='oe_menu_text'][contains(text(),'Sales')])[4]")
    private  WebElement sales;

    @FindBy(xpath = "(//ul//li//span[@class='oe_menu_text'][contains(text(),'Sales Channels')])[3]")
    private  WebElement salesChannelsReporting;

    @FindBy(xpath = "//ul//li//span[@class='oe_menu_text'][contains(text(),'All Channels Sales Orders')]")
    private WebElement allChannelsSalesOrders;

    @FindBy(xpath = "(//ul//li//span[@class='oe_menu_text'][contains(text(),'Sales Channels')])[4]")
    private WebElement salesChannelsConfiguration;



    public void clickSales(){

        salesModule.click();
    }



}
