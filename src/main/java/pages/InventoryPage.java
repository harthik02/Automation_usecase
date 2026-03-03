package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class InventoryPage {

WebDriver driver;

@FindBy(id="add-to-cart-sauce-labs-backpack")
WebElement addToCartBtn;

@FindBy(className="shopping_cart_link")
WebElement cartIcon;

public InventoryPage(WebDriver driver){
this.driver = driver;
PageFactory.initElements(driver,this);
}

public void addProduct(){
addToCartBtn.click();
}

public void openCart(){
cartIcon.click();
}
}