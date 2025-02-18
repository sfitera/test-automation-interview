package sk.phenomenix.pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import sk.phenomenix.framework.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        MainPage mainPage = loginPage.clickLogin();

        // Verify successful login
        boolean isLoggedIn = mainPage.isShoppingCardLinkDisplayed();
        Assert.assertTrue(isLoggedIn, "User login was successful");
    }
}
