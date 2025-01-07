package pageObjects;

import org.openqa.selenium.WebDriver;

public class TitleVerificationPage {
    
    private WebDriver driver;

    // Constructor
    public TitleVerificationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to get the title of the current page
    public String getPageTitle() {
        return driver.getTitle();
    }

    // Method to verify if the title matches the expected title
    public boolean isTitleCorrect(String expectedTitle) {
        String actualTitle = getPageTitle();
        return actualTitle.equals(expectedTitle);
    }
}
