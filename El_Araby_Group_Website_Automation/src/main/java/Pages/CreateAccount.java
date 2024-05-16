package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class CreateAccount extends PageBase{
    public CreateAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstname")
    WebElement firstName;

    @FindBy(id = "lastname")
    WebElement lastName;

    @FindBy(id = "email_address")
    WebElement email;

    @FindBy(id = "password") WebElement password;

    @FindBy(id = "password-confirmation") WebElement pass_Confirmation;


    @FindBy(css = ".submit") WebElement submitBtn;

    public void CreateNewAccount(String fName,String lName,String Email,String pass,String confirmPass){
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        email.sendKeys(Email);
        password.sendKeys(pass);
        pass_Confirmation.sendKeys(confirmPass);

    }

    public void SaveNewAccount(){
        System.out.println(submitBtn);
        submitBtn.click();
    }


}
