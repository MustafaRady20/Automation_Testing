package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageBase{
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"block-collapsible-nav\"]/ul/ul/li[8]/a")
    WebElement logOutBtn;

    @FindBy(xpath = "/html/body/div[3]/header/div[1]/div[2]/div[1]/div[3]/div/ul/li[1]/ul/li[1]/a") public WebElement accountUserName;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]") WebElement editInfo;

    @FindBy(xpath = "//*[@id=\"firstname\"]") WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastname\"]") WebElement lastName;

    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button") WebElement saveChanges;

    public void open_Edit_Page(){
        editInfo.click();
    }
    public void  changeInfo(String fName,String lName){
        firstName.clear();
        firstName.sendKeys(fName);
        lastName.clear();
        lastName.sendKeys(lName);
        saveChanges.click();
    }
    public void logOut(){
        logOutBtn.click();
    }



}
