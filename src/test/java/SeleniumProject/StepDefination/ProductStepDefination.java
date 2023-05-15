package SeleniumProject.StepDefination;

import SeleniumProject.Context.DependancyInjection;
import SeleniumProject.DomainObject.BillingDetails;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class ProductStepDefination {

    private DependancyInjection injection;

    public ProductStepDefination(DependancyInjection injection){

        this.injection=injection;
    }

    @And("I provide the billing details")
    public void iProvideTheBillingDetails(BillingDetails billingDetails) {
        injection.billingDetails=billingDetails;
    }
}
