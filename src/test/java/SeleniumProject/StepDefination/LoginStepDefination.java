package SeleniumProject.StepDefination;

import SeleniumProject.Context.DependancyInjection;
import SeleniumProject.Pages.CheckOutPage;
import SeleniumProject.Pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class LoginStepDefination {

    private final WebDriver driver;
    private CheckOutPage checkOutPage;


    public LoginStepDefination(DependancyInjection injection){
        driver=injection.driver;
        checkOutPage= PageFactoryManager.getCheckOutPage(injection.driver);

    }

    @Given("I'm on store page")
    public void i_m_on_store_page() {
        //driver= DriverFactory.getDriver();
      //  new StorePage(driver).LoadUrl("https://askomdch.com/store/");
    }

    @Then("the order is successful")
    public void the_order_is_successful() {
        String title=checkOutPage.getTitle();
        Assert.assertEquals("Checkout – AskOmDch",title);
    }

}
