package sk.phenomenix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class InventoryPage {

    private WebDriver driver;

    // Locators
    private By shoppingCartLink = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    private final String part1 = "/html/body/div/div/div/div[2]/div/div/div/div[";
    private final String part2 = "]/div[2]/div[2]/button";

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public boolean isShoppingCardLinkDisplayed() {
        try {
            WebElement element = driver.findElement(shoppingCartLink);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            // If element is not found, it's not displayed
            return false;
        }
    }

    public void clickRandomItemLink() {
        Random randomNumberGenerator = new Random();
        int randomNumber = randomNumberGenerator.nextInt(1, 7);
        By randomLink = By.xpath(part1 + randomNumber + part2);
        driver.findElement(randomLink).click();
    }

    public String shoppingCartLinkText() {
        return driver.findElement(shoppingCartLink).getText();
    }

}
