package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class Login_CreateAccountPage extends PageBase{
    public Login_CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[4]/div[2]/div/div[2]/div/div/a")
    WebElement new_Account;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(id = "send2")
    WebElement SubmitBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[1]/div/div[2]/div[2]/a") WebElement singByGoogle;

    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/form/span/section/div/div/div/div/ul/li[1]/div") WebElement signByGoogleBtn;

    public void  Open_CreateAccount_page(){
        new_Account.click();
    }

    public void login_With_Google(){
        singByGoogle.click();
        signByGoogleBtn.click();
    }
    public void Login(String mail,String pass){
        email.sendKeys(mail);
        password.sendKeys(pass);

        SubmitBtn.click();
    }


}
