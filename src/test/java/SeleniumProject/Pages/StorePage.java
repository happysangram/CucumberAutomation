package SeleniumProject.Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {

   @FindBy(xpath = "//button[text()='Add to cart']") private WebElement addToCartBtn;
   @FindBy(xpath="//div[@class='woocommerce-message']//ancestor::a[text()='View cart']") private WebElement viewCart;
    public StorePage(WebDriver driver) {
        super(driver);
    }

    public StorePage addtoCart(String productname){
       By productBtn= By.xpath("//div[@class=\"astra-shop-thumbnail-wrap\"]//ancestor::a[@href=\"https://askomdch.com/product/"+productname+"/\"]");
       wait.until(ExpectedConditions.elementToBeClickable(productBtn)).click();
       wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
       return this;
    }
    public StorePage clickViewCartLink(){
       wait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
       return this;
    }


}
