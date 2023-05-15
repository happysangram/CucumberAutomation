package SeleniumProject.Pages;

import Base.BasePage;
import SeleniumProject.DomainObject.BillingDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CheckOutPage extends BasePage {
    @FindBy(xpath = "//input[@id='billing_first_name']") private WebElement firstName;
    @FindBy(xpath = "//input[@id='billing_last_name']") private WebElement lastName;
    @FindBy(xpath = "//input[@id='billing_address_1']") private WebElement billingAddress;
    @FindBy(xpath = "//input[@id='billing_city']") private WebElement billingCity;
    @FindBy(xpath = "//input[@id='billing_postcode']") private WebElement billingPostCode;
    @FindBy(xpath = "//input[@id='billing_email']") private WebElement billingEmail;
    @FindBy(xpath = "//button[@id='place_order']") private WebElement placeOrder;

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public CheckOutPage setName(String name){
       WebElement firstname= wait.until(ExpectedConditions.visibilityOf(firstName));
        firstname.clear();
        firstname.sendKeys(name);
       return this;
    }
    public CheckOutPage setTitle(String title){
        WebElement lastname= wait.until(ExpectedConditions.visibilityOf(lastName));
        lastname.clear();
        lastname.sendKeys(title);
        return this;
    }

    public CheckOutPage setAddress(String address_){
        WebElement address= wait.until(ExpectedConditions.visibilityOf(billingAddress));
        address.clear();
        address.sendKeys(address_);
        return this;
    }
    public CheckOutPage setCity(String city_){
        WebElement city= wait.until(ExpectedConditions.visibilityOf(billingCity));
        city.clear();
        city.sendKeys(city_);
        return this;
    }
    public CheckOutPage setZip(String zip_){
        WebElement postCode= wait.until(ExpectedConditions.visibilityOf(billingPostCode));
        postCode.clear();
        postCode.sendKeys(zip_);
        return this;
    }
    public CheckOutPage setEmail(String email_){

        WebElement email= wait.until(ExpectedConditions.visibilityOf(billingEmail));
        email.clear();
        email.sendKeys(email_);
        return this;
    }

    public void clickPlaceOrderBtn()  {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(placeOrder)).click();
    }
    public String getTitle(){
       return driver.getTitle();
    }

    public CheckOutPage setBillingAddress(BillingDetails billingDetails){
        return  setName(billingDetails.getFirstName()).
                setTitle(billingDetails.getLastName()).
                setAddress(billingDetails.getAddress()).
                setCity(billingDetails.getCity()).
                setZip(billingDetails.getZip()).
                setEmail(billingDetails.getEmail());

    }

}
