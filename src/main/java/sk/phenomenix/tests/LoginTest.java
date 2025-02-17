package sk.phenomenix.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import sk.phenomenix.framework.BaseTest;
import sk.phenomenix.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        // Verify successful login
        boolean isLoggedIn = driver.findElements(By.id("logout")).size() > 0;
        Assert.assertTrue(isLoggedIn, "User login was not successful");
    }
}
