package SeleniumProject.Context;

import SeleniumProject.DomainObject.BillingDetails;
import SeleniumProject.DomainObject.CookieDetails;
import io.restassured.http.Cookies;
import org.openqa.selenium.WebDriver;

public class DependancyInjection {

    public WebDriver driver;
    public BillingDetails billingDetails;
    public CookieDetails cookieDetails;

    public  DependancyInjection(){
        cookieDetails=new CookieDetails();
        cookieDetails.setCookies(new Cookies());
    }
}
