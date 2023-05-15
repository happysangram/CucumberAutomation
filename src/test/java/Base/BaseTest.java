package Base;

import SeleniumProject.Context.DependancyInjection;
import SeleniumProject.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class BaseTest {

    private WebDriver driver;
    private final DependancyInjection injection;

public BaseTest(DependancyInjection injection){

    this.injection=injection;
}
    @Before
    public void before(Scenario scenario) throws IOException {

        System.out.println(Thread.currentThread().getId()+"-----------------" + scenario.getName());
        driver= DriverFactory.DriverInitialization(System.getProperty("browser","Chrome"));
        injection.driver=driver;
    }

    @After
    public void after() {
        driver.quit();
    }
}
