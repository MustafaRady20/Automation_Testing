package Tests;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.Login_CreateAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    HomePage homePage;
    Login_CreateAccountPage loginCreateAccountPage;
    AccountPage accountPage;


    @Test
    public void LoginAndLogout(){

        homePage = new HomePage(driver);
        homePage.Open_login_CreateAccPage();
        loginCreateAccountPage = new Login_CreateAccountPage(driver);
        loginCreateAccountPage.Login("mr2076@gmail.com","Mostafa@123456");

        accountPage = new AccountPage(driver);
        Assert.assertEquals(accountPage.accountUserName.getText(),"Mostafa Rady");
        accountPage.logOut();
        Assert.assertNotEquals(accountPage.accountUserName.getText(),"Mostafa Rady");
    }
}
