package SeleniumProject.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

    private static CartPage cartPage;
    private static CheckOutPage checkOutPage;
    private static StorePage storePage;

    public static CartPage getCartPage(WebDriver driver){
        return cartPage== null?new CartPage(driver):cartPage;
    }

    public static CheckOutPage getCheckOutPage(WebDriver driver){
        return checkOutPage== null?new CheckOutPage(driver):checkOutPage;
    }

    public static StorePage getStorePage(WebDriver driver){
        return storePage== null?new StorePage(driver):storePage;
    }

}
