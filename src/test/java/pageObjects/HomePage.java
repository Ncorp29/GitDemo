package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;

@FindBy(linkText = "Login")   // Login link added in step5
WebElement linkLogin;

@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") 
WebElement lnkLogout;

@FindBy(xpath="//a[normalize-space()='Laptops & Notebooks']") 
WebElement lnkLaptops;

@FindBy(xpath="//a[normalize-space()='Show AllLaptops & Notebooks']") 
WebElement lnkShowall;
@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[2]//i[1]")
WebElement lnkfirstitem;
@FindBy(xpath = "//span[normalize-space()='Wish List (1)']")
WebElement lnkwishlist;
@FindBy(xpath = "//button[@class='btn btn-primary']//i[@class='fa fa-shopping-cart']")
WebElement lnkaddtocart;

@FindBy(xpath = "//button[@id='button-cart']")
WebElement lnkaddtocart1;

@FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
WebElement lnkshoppingcart;

@FindBy(xpath = "//a[@class='btn btn-primary']")
WebElement lnkbtncheckout;

@FindBy(xpath = "//a[@class='btn btn-primary']")
WebElement lnkbtncontinue;

public void clickMyAccount()
{
	lnkMyaccount.click();
}

public void clickRegister()
{
	lnkRegister.click();
}


public void clickLogin()    // added in step5
{
	linkLogin.click();
}

public void clicklnkLogout() {
	// TODO Auto-generated method stub
	
	lnkLogout.click();
}



public void clicklnkshowall() {
	lnkShowall.click();
}

public void clicklnkLaptops() {
	// TODO Auto-generated method stub
	lnkLaptops.click();
}

public void clickaddwishlist() {
	// TODO Auto-generated method stub
	lnkfirstitem.click();
}

public void clickwishlist() {
	// TODO Auto-generated method stub
	lnkwishlist.click();
}

public void clickaddtocart() {
	// TODO Auto-generated method stub
	lnkaddtocart.click();
}

public void clickaddtocart1() {
	// TODO Auto-generated method stub
	lnkaddtocart1.click();
}
public void clickshopping() {
	// TODO Auto-generated method stub
	lnkshoppingcart.click();
}

public void clickcheckout() {
	// TODO Auto-generated method stub
	lnkbtncheckout.click();
}
public void clickcontinue() {
	// TODO Auto-generated method stub
	lnkbtncontinue.click();
}


}
