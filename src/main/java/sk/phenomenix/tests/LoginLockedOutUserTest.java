package sk.phenomenix.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sk.phenomenix.framework.BaseTest;
import sk.phenomenix.pages.LoginPage;
import sk.phenomenix.pages.MainPage;

public class LoginLockedOutUserTest extends BaseTest {

    @Test
    public void testUnsuccessfulLogin() {
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        MainPage mainPage = loginPage.clickLogin();

        // Verify successful login
        boolean isLoggedIn = mainPage.isShoppingCardLinkDisplayed();
        Assert.assertFalse(isLoggedIn, "User login was successful even if user was locked out");
    }
}
