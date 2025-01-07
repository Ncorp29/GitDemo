package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage {

	public AddToCart(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;


	@FindBy(xpath = "//button[@class='btn btn-primary']//i[@class='fa fa-shopping-cart']")
	WebElement addtocart;
	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement addtocart1;
	/*@FindBy(xpath = "//input[@id='input-option225']")
	WebElement txtdeliverydate;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement txtquantity;
	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement btnAddToCart;*/
	
	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	

	public void clickcart() {
		addtocart.click();
	}
	
	/*public void setDeliveryDate(String delivery) {
		txtdeliverydate.sendKeys("2024-02-21");
	}
	
	public void settxtquantity(String qnt) {
		txtquantity.sendKeys("5");
	}

	public void clickAddCart() {
		btnAddToCart.click();
	}*/
	
	public void clickcarts() {
		addtocart1.click();
	}
}
 