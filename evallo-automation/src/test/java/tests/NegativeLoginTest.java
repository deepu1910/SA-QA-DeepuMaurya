package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class NegativeLoginTest extends BaseTest {

    @Test
    public void testLockedOutUserLogin() {
        LoginPage login = new LoginPage(driver);
        login.login("locked_out_user", "secret_sauce");

        String expectedError = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(login.getErrorMessage(), expectedError);
    }
}
