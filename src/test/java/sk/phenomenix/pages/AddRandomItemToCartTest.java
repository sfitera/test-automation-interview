package sk.phenomenix.pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import sk.phenomenix.framework.BaseTest;


public class AddRandomItemToCartTest extends BaseTest {


    @Test
    public void testAddRandomItemToCart() {
        driver.get("https://www.saucedemo.com");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.clickRandomItemLink();

        Assert.assertEquals(inventoryPage.shoppingCartLinkText(), "1");

    }

}
