package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {

    WebDriver driver;

    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By shippingMethodRadioButton = By.name("shipping_method");
    By continueButton = By.id("button-shipping-method");

    // Actions
    public void selectShippingMethod(String method) {
        // Assuming that the shipping method is a radio button or dropdown
        if (method.equalsIgnoreCase("Flat Shipping Rate")) {
            driver.findElement(shippingMethodRadioButton).click();
        }
        // Add more conditions here if there are different shipping methods
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
}
