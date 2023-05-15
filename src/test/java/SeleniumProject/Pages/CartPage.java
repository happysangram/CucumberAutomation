package SeleniumProject.Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CartPage extends BasePage {
  @FindBy(xpath = "//table/tbody/tr[1]/td[3]/a") private WebElement cartProduct;
  @FindBy(xpath = "//table/tbody/tr[1]/td[5]//child::input[@value='1']") private  WebElement cartQuantity;
  @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']") private WebElement cartBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String expectedCartProduct(){
        String product=wait.until(ExpectedConditions.visibilityOf(cartProduct)).getText();
        return  product;
    }

    public Integer expectedQuantityProduct() throws InterruptedException {
        String quanity= wait.until(ExpectedConditions.visibilityOf(cartQuantity)).getAttribute("value");
        return Integer.parseInt(quanity);
    }

    public CheckOutPage clickCheckoutBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();
        return new CheckOutPage(driver);
    }


}
