package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class ConfirmationPage {

WebDriver driver;

@FindBy(className="complete-header")
WebElement confirmationMsg;

public ConfirmationPage(WebDriver driver){
this.driver = driver;
PageFactory.initElements(driver,this);
}

// ✅ THIS METHOD MUST EXIST
public String getConfirmationMessage(){
    return confirmationMsg.getText();
}
}