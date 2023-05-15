package SeleniumProject.StepDefination;

import SeleniumProject.Context.DependancyInjection;
import SeleniumProject.DomainObject.BillingDetails;
import SeleniumProject.DomainObject.ProductDetails;
import SeleniumProject.Pages.CartPage;
import SeleniumProject.Pages.CheckOutPage;
import SeleniumProject.Pages.PageFactoryManager;
import SeleniumProject.Pages.StorePage;
import SeleniumProject.apis.CartApi;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class CartStepDefination {

    private final WebDriver driver;

    private final BillingDetails billingDetails;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;
    private StorePage storePage;
    private DependancyInjection injection;

    public CartStepDefination(DependancyInjection injection){
        this.injection=injection;
        this.driver=injection.driver;
        this.billingDetails=injection.billingDetails;
        cartPage= PageFactoryManager.getCartPage(injection.driver);
        checkOutPage= PageFactoryManager.getCheckOutPage(injection.driver);
        storePage=PageFactoryManager.getStorePage(injection.driver);

    }

    @When("I fill the parameter in the cart")
    public void i_fill_the_parameter_in_the_cart() {
        CheckOutPage checkOutPage= cartPage.clickCheckoutBtn();
        checkOutPage.setBillingAddress(billingDetails);

    }

    @When("I click the {string} in the cart")
    public void i_click_the_in_the_cart(String string) {
        checkOutPage.clickPlaceOrderBtn();
    }


    @Then("I should see {int} {string} in the cart")
    public void i_should_see_in_the_cart(Integer Quantity, String ProductValue) throws InterruptedException {

        Assert.assertEquals(Quantity,cartPage.expectedQuantityProduct());
        Assert.assertEquals(ProductValue,cartPage.expectedCartProduct());
    }


    @When("I add a {productDetails} to the cart")
    public void i_add_a_to_the_cart(ProductDetails productDetails) throws IOException {
       storePage.addtoCart(productDetails.getProductName());
//        CartApi cartApi=new CartApi(injection.cookieDetails.getCookies());
//        cartApi.addToCart(1215,1);
//        injection.cookieDetails.setCookies(cartApi.getCookies());
//        injection.cookieDetails.injectCookies(injection.driver);
        storePage.clickViewCartLink();
    }
}
