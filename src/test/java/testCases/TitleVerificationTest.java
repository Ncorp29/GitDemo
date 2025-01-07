package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.TitleVerificationPage;
import testBase.BaseClass;

public class TitleVerificationTest extends BaseClass{

    WebDriver driver;
    TitleVerificationPage titleVerificationPage;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver (Assuming you have set the WebDriver path)
        driver = new ChromeDriver();
        titleVerificationPage = new TitleVerificationPage(driver);
    }

    @Test
    public void testTitleVerification() {
        // Open the web page
        driver.get("https://tutorialsninja.com/demo/");

        // Expected title for the webpage
        String expectedTitle = "Example Domain";

        // Verify if the title is correct
        Assert.assertTrue(titleVerificationPage.isTitleCorrect(expectedTitle), "Title verification failed!");
    }

    // Close the driver after tests
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
