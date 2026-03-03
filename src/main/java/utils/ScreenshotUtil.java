package utils;

import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

public static void captureScreenshot(
WebDriver driver,
String testName){

try{

TakesScreenshot ts =
(TakesScreenshot)driver;

File src = ts.getScreenshotAs(
OutputType.FILE);

File dest = new File(
"./Screenshots/" +
testName + ".png");

FileHandler.copy(src,dest);

}catch(Exception e){
e.printStackTrace();
}
}
}