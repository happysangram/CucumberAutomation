package SeleniumProject.DomainObject;

import SeleniumProject.Utils.CookieUtils;
import io.restassured.http.Cookies;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CookieDetails {
    private io.restassured.http.Cookies cookies;

    public Cookies getCookies() {
        return cookies;
    }

    public void setCookies(Cookies cookies) {
        this.cookies = cookies;
    }

    public void injectCookies(WebDriver driver){

        List<Cookie> seleniumCookie=new CookieUtils().convertRestAssuredCookieToSeleniumCookie(cookies);
        int i=0;
        for(Cookie cookie:seleniumCookie){
            driver.manage().addCookie(cookie);
        }
        driver.navigate().refresh();
    }
}
