package sk.phenomenix.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import sk.phenomenix.framework.BaseTest;

public class LoginLockedOutUserTest extends BaseTest {

    private final By messagePath = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");

    @Test
    public void testUnsuccessfulLogin() {
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        MainPage mainPage = loginPage.clickLogin();


        String errorMessage = driver.findElement(messagePath).getText();
        Assert.assertEquals(errorMessage, "Epic sadface: Sorry, this user has been locked out.");

        // Verify successful login
        boolean isLoggedIn = mainPage.isShoppingCardLinkDisplayed();
        Assert.assertFalse(isLoggedIn, "Epic sadface: Sorry, this user has been locked out.");

    }
}


