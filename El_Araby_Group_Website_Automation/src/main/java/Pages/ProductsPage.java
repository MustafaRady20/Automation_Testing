package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[3]/main/div[3]/div[1]/div[6]/div[3]/ol/li[1]/div/div[2]/div[2]/div/div[1]/form/button")
    WebElement AddToCart;

    @FindBy(xpath = "/html/body/div[8]/aside[3]/div[2]/div/div/div/div[3]/button[2]") WebElement goToCartPage;


    public void AddItemToCart(){
        AddToCart.click();
    }

}
