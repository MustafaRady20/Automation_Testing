package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath ="//*[@id=\"html-body\"]/div[3]/header/div[1]/div[2]/div[1]/div[3]/div/ul/li[3]/div/a")
    WebElement cartBtn;

    @FindBy(xpath = "//*[@id=\"html-body\"]/div[3]/header/div[1]/div[2]/div[1]/div[3]/div/ul/li[1]/ul/li[1]/a")
    WebElement login_createAccount_page;

    @FindBy(className = "title-category-dropdown")
    WebElement allDepartments_btn;

    @FindBy(xpath = "/html/body/div[3]/header/div[1]/div[2]/div[2]/div/div[1]/div[1]/div/div/ul/li[1]/a") WebElement products;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[5]/div/div/div/div/div[2]/div/div[1]/div/div[3]/div/div/div/a") WebElement productBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[5]/div/div/div/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div[2]/span/span/span") public WebElement productPrice;

    @FindBy(xpath = "//*[@id=\"switcher-language-trigger\"]") WebElement langBtn;

    @FindBy(xpath = "//*[@id=\"switcher-language\"]/div/ul/li/a") WebElement SwitchToEnglishBtn;

    public @FindBy(xpath = "/html/body/div[3]/header/div[1]/div[2]/div[1]/div[3]/div/ul/li[1]/ul/li[1]/a") WebElement LoginLabel;

    public void Open_Product_Details(){
        productBtn.click();
    }
    public void Open_CartPage()
    {
        cartBtn.click();
    }
    public void Open_login_CreateAccPage()
    {
        login_createAccount_page.click();

    }
    public  void Open_MobilesAndElectronics_pages(){
        allDepartments_btn.click();

    }
    public void OpenProductsPage(){
        products.click();
    }

    public void Open_lang_List(){
        langBtn.click();

    }
    public void Switch_Lang(){
        SwitchToEnglishBtn.click();
    }
}


