package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends PageBase{
    public ProductDetails(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"product-price-7643\"]/span")
    public WebElement productDetailsPrice;

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]") WebElement addToCartBtn;

    @FindBy(xpath = "//*[@id=\"html-body\"]/div[3]/header/div[1]/div[2]/div[1]/div[3]/div/ul/li[3]/div/a/span[1]/span") WebElement totalItemsIncart;

    public void AddToCart(){
        addToCartBtn.click();
    }



}
