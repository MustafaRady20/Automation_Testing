package Tests;

import Pages.CreateAccount;
import Pages.HomePage;
import Pages.Login_CreateAccountPage;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccountTest extends TestBase{
    HomePage homePage;
    CreateAccount createAccount;
    Login_CreateAccountPage loginCreateAccountPage;

    @Test
    public void Create_Account(){
        homePage=new HomePage(driver);
        homePage.Open_login_CreateAccPage();
        loginCreateAccountPage = new Login_CreateAccountPage(driver);
        loginCreateAccountPage.Open_CreateAccount_page();
        createAccount =new CreateAccount(driver);
        createAccount.CreateNewAccount("Mostafa","Rady","mostafarady516@gmail.com","123@123M55","123@123M55");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        createAccount.SaveNewAccount();


    }
}
