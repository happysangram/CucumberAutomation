package SeleniumProject.factory;

import SeleniumProject.Constants.Endpoints;
import SeleniumProject.DomainObject.ProductDetails;
import SeleniumProject.Utils.ConfigLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class DriverFactory {

   // private static  ThreadLocal<WebDriver> driver=new ThreadLocal<>();


    public static WebDriver DriverInitialization(String browser) throws IOException {
        WebDriver driver;
            switch (browser){
                case "Chrome"->{
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                case "Firefox"->{
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                }
                default -> throw new IllegalStateException("INVALID Browser");
            }


            driver.get(ConfigLoader.getInstance().getBaseUrl());
            driver.manage().window().maximize();

           // DriverFactory.driver.set(driver);
        return driver;
    }

//    public static WebDriver getDriver() {
//        return driver.get();
//    }

}
