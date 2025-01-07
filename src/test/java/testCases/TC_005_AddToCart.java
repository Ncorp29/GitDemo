package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCart;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_005_AddToCart extends BaseClass
{

	@Test
	public void verify_login()
	{
		logger.info("**** Starting TC_002_LoginTest  ****");
		logger.debug("capturing application debug logs....");
		//try
		//{
		//Home page
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on myaccount link on the home page..");
		hp.clickLogin(); //Login link under MyAccount
		logger.info("clicked on login link under myaccount..");
		
		//Login page
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin(); //Login button
		logger.info("clicked on login button..");
		hp.clickwishlist();
		logger.info("clicked to wishlist items");
		hp.clickaddtocart();
		logger.info("clicked add to cart");
		/*AddToCart lp1=new AddToCart(driver);
		logger.info("Entering delivery date and quentity");
		lp1.setDeliveryDate(p.getProperty("delivery"));
		lp1.settxtquantity(p.getProperty("qnt"));
		lp1.clickcart();*/
		hp.clickaddtocart1();
		logger.info("item added successfully");
		logger.info("**** Finished TC_002_AddToWishlistTest  ****");
	}
}
