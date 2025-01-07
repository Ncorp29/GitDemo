package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By firstNameField = By.id("input-payment-firstname");
    By lastNameField = By.id("input-payment-lastname");
    By emailField = By.id("input-payment-email");
    By phoneField = By.id("input-payment-telephone");
    By addressField = By.id("input-payment-address-1");
    By cityField = By.id("input-payment-city");
    By postCodeField = By.id("input-payment-postcode");
    By countryDropdown = By.id("input-payment-country");
    By regionDropdown = By.id("input-payment-zone");
    By continueButton = By.id("button-payment-address");

    // Actions
    public void fillCheckoutForm(String fName, String lName, String email, String phone, String addr, String city, String postCode, String country) {
        driver.findElement(firstNameField).sendKeys(fName);
        driver.findElement(lastNameField).sendKeys(lName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(addressField).sendKeys(addr);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(postCodeField).sendKeys(postCode);
        driver.findElement(countryDropdown).sendKeys(country);
        driver.findElement(continueButton).click();
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
}
