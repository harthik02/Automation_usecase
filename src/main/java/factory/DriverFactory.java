package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initDriver(String browser) {

        if(driver == null) {

            if(browser.equalsIgnoreCase("chrome"))
                driver = new ChromeDriver();

            else if(browser.equalsIgnoreCase("firefox"))
                driver = new FirefoxDriver();
        }

        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
        driver = null;
    }
}