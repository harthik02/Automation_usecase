package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitUtil {

public static void waitForElement(
WebDriver driver,
WebElement element){

WebDriverWait wait =
new WebDriverWait(
driver,
Duration.ofSeconds(10));

wait.until(
ExpectedConditions
.visibilityOf(element));
}
}