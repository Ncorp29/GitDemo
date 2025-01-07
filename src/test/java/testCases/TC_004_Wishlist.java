package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_004_Wishlist extends BaseClass
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
		logger.info("clicked on ligin button..");
		hp.clicklnkLaptops();
		logger.info("clicked to notebook and laptop");
		hp.clicklnkshowall();
		logger.info("clicked to showAll");
		
		hp.clickaddwishlist();
		logger.info("Item added to wishlist");
		
		
		logger.info("**** Finished TC_002_AddToWishlistTest  ****");
	}
}
