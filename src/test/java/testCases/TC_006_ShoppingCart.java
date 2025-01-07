package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ShoppingCart;
import pageObjects.CheckoutPage;
import pageObjects.PaymentPage;
import testBase.BaseClass;

public class TC_006_ShoppingCart extends BaseClass {

    @Test
    public void verify_shopping_cart_checkout() {
        try {
            // Step 1: Go to "My Account" and click "Login"
            HomePage homePage = new HomePage(driver);
            homePage.clickMyAccount();
            logger.info("Clicked on MyAccount Link");
            homePage.clickLogin();
            // Step 2: Click on Login and log in using dummy credentials
            LoginPage loginPage = new LoginPage(driver); // Removed duplicate initialization
            loginPage.setEmail("xyz290403@gmail.com");  // Set the dummy email
            loginPage.setPassword("ABC@123");   // Set the dummy password
            loginPage.clickLogin();  // Click the Login button
            logger.info("Logged in with dummy credentials");

            // Step 3: Navigate to "Laptops" and click on a product to add to the wishlist
            homePage.clicklnkLaptops();
            logger.info("Navigated to Laptops & Notebooks");
            homePage.clicklnkshowall();
            logger.info("Navigated to Showall");
            homePage.clickaddwishlist();  // Add the product to the wishlist
            logger.info("Added product to wishlist");
            homePage.clickwishlist();     // Go to wishlist
            logger.info("Navigated to wishlist");
            homePage.clickaddtocart();    // Add the product to cart
            logger.info("Added product from wishlist to cart");
            homePage.clickaddtocart1();    // Add the product to cart
            logger.info("Successfully added to cart");
            
            homePage.clickshopping();
            logger.info("clicked to shopping cart");;
            // Step 4: Set quantity to 5 and choose a delivery date, then add to cart
            ShoppingCart cartPage = new ShoppingCart(driver);
            cartPage.setQuantity(5);  // Set the quantity to 5
            cartPage.selectDeliveryDate("2025-01-15");  // Set delivery date (example)
            cartPage.clickAddToCart();
            logger.info("Set quantity to 5 and added item to cart");
          
            // Step 5: Go to "Shopping Cart" and click "Checkout"
            cartPage.navigateToShoppingCart();
            cartPage.clickCheckout();
            logger.info("Clicked on Checkout from shopping cart");
            /*homePage.clickcheckout();
            logger.info("clicked to checkout");
            
            homePage.clickcontinue();
            logger.info("clicked to continue");*/
            // Step 6: Fill in dummy checkout information and click "Continue"
            CheckoutPage checkoutPage = new CheckoutPage(driver);
            checkoutPage.fillCheckoutForm("John", "Doe", "john.doe@example.com", "1234567890", "123 Main Street", "New York", "10001", "United States");
            checkoutPage.clickContinue();
            logger.info("Filled in checkout information and clicked Continue");

            // Step 7: Choose payment method (use dummy info)
            PaymentPage paymentPage = new PaymentPage(driver);
            paymentPage.selectPaymentMethod("Credit Card");
            paymentPage.fillCardDetails("4111111111111111", "12/25", "123");
            paymentPage.clickContinue();
            logger.info("Entered payment details and clicked Continue");

            // Step 8: Click on "Confirm Order"
            paymentPage.clickConfirmOrder();
            logger.info("Clicked on Confirm Order");

            // Step 9: Validate confirmation message
            String confirmationMsg = paymentPage.getConfirmationMessage();
            Assert.assertEquals(confirmationMsg, "Your order has been successfully processed!", "Order confirmation message mismatch");

        } catch (Exception e) {
            logger.info("Test failed due to: " + e.getMessage());
            Assert.fail();
        }
        logger.info("Finished TC_006_ShoppingCartCheckout.");
    }
}
