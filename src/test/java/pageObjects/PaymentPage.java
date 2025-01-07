package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By paymentMethodRadioButton = By.name("payment_method");
    By creditCardOption = By.id("payment-method-credit-card");
    By cardNumberField = By.id("input-payment-card-number");
    By cardExpiryField = By.id("input-payment-card-expiry");
    By cardCVVField = By.id("input-payment-card-cvv");
    By continueButton = By.id("button-payment-method");
    By confirmOrderButton = By.id("button-confirm");

    // Actions
    public void selectPaymentMethod(String method) {
        if (method.equalsIgnoreCase("Credit Card")) {
            driver.findElement(paymentMethodRadioButton).click();  // Selecting payment method
            driver.findElement(creditCardOption).click();  // Choose Credit Card option
        }
        // Add more conditions here for other payment methods
    }

    public void fillCardDetails(String cardNumber, String expiryDate, String cvv) {
        driver.findElement(cardNumberField).sendKeys(cardNumber);
        driver.findElement(cardExpiryField).sendKeys(expiryDate);
        driver.findElement(cardCVVField).sendKeys(cvv);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void clickConfirmOrder() {
        driver.findElement(confirmOrderButton).click();
    }

    public String getConfirmationMessage() {
        // This is just an example, modify based on your confirmation message locator
        By confirmationMessage = By.xpath("//div[@class='alert alert-success']");
        return driver.findElement(confirmationMessage).getText();
    }
}
