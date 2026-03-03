package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import factory.DriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser){

        driver =
        DriverFactory.initDriver(browser);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}