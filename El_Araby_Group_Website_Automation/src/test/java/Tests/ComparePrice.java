package Tests;

import Pages.HomePage;
import Pages.ProductDetails;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparePrice extends TestBase{
    HomePage homePage;
    ProductDetails productDetails;
    @Test
    public void ComparePriceTest(){
        homePage = new HomePage(driver);
//        String ProductPriceInHomePage= homePage.productPrice.getText();
        homePage.Open_Product_Details();
        productDetails = new ProductDetails(driver);
//        String ProductPriceInProductDetailsPage=productDetails.productDetailsPrice.getText();
        Assert.assertEquals(productDetails.productDetailsPrice.getText(),homePage.productPrice.getText());

    }
}
