package Tests;

import Pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PageLanguageTest extends TestBase {
    HomePage homePage;

    @Test
    public void PageChanegeLanguage (){
        homePage = new HomePage(driver);
        homePage.Open_lang_List();
        homePage.Switch_Lang();
        Assert.assertEquals(homePage.LoginLabel.getText(),"Login");

    }
}
