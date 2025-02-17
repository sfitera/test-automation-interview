package sk.phenomenix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    // Locators
    private By shoppingCartLink = By.xpath("//a[@data-test='shopping-cart-link']");

    // Constructor
    public MainPage(WebDriver driver) {
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
}
