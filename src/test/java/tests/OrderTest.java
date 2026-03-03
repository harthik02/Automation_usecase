package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.*;

public class OrderTest extends BaseTest {

@Test
public void orderFlow(){

// Login
LoginPage login =
        new LoginPage(driver);

login.login(
"standard_user",
"secret_sauce");

// Inventory
InventoryPage inventory =
        new InventoryPage(driver);

inventory.addProduct();
inventory.openCart();

// Cart
CartPage cart =
        new CartPage(driver);

cart.clickCheckout();

// Checkout
CheckoutPage checkout =
        new CheckoutPage(driver);

checkout.enterDetails(
"John",
"Doe",
"520001");

checkout.finishOrder();

// Confirmation Validation
ConfirmationPage confirm =
        new ConfirmationPage(driver);

Assert.assertEquals(
confirm.getConfirmationMessage(),
"Thank you for your order!");

}
}