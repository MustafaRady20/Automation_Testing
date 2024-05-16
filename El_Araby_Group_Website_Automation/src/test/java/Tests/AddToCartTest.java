package Tests;

import Pages.HomePage;
import Pages.ProductDetails;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase{

    HomePage homePage;
    ProductDetails productDetails;
    ProductsPage productsPage;
   @Test
    public void AddItemToCartTest(){
       homePage = new HomePage(driver);
       homePage.Open_MobilesAndElectronics_pages();
       homePage.OpenProductsPage();
       productsPage = new ProductsPage(driver);
       productsPage.AddItemToCart();

   }
}
