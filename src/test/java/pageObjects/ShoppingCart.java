package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {

    WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By quantityField = By.name("quantity");
    By deliveryDateField = By.id("input-delivery-date");
    By addToCartButton = By.id("button-cart");
    By checkoutButton = By.linkText("Checkout");

    // Actions
    public void setQuantity(int quantity) {
        driver.findElement(quantityField).clear();
        driver.findElement(quantityField).sendKeys(String.valueOf(quantity));
    }

    public void selectDeliveryDate(String date) {
        driver.findElement(deliveryDateField).sendKeys(date);
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void navigateToShoppingCart() {
        driver.findElement(checkoutButton).click();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
