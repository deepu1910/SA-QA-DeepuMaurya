package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class PurchaseFlowTest extends BaseTest {

    @Test
    public void testHappyPathPurchase() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        InventoryPage inventory = new InventoryPage(driver);
        inventory.addItemToCart();
        inventory.goToCart();

        CartPage cart = new CartPage(driver);
        cart.clickCheckout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.fillCheckoutDetails("John", "Doe", "12345");
        checkout.continueCheckout();
        checkout.finishCheckout();

        ConfirmationPage confirmation = new ConfirmationPage(driver);
        Assert.assertEquals(confirmation.getConfirmationMessage(), "Thank you for your order!");
    }
}
