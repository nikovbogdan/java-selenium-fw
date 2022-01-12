package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginPage {

    private static final By USERNAME = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BUTTON = By.cssSelector(".radius");
    private static final By RED_MESSAGE = By.cssSelector(".flash.error");
    private static final By GREEN_MESSAGE = By.cssSelector(".flash.success");

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void enterUsername(String username) {
        driver.findElement(USERNAME).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void verifyGreenMessageIsDisplayed() {
        Assert.assertTrue(driver.findElement(GREEN_MESSAGE).isDisplayed());
    }

    public void verifyRedMessageIsDisplayed() {
        Assert.assertTrue(driver.findElement(RED_MESSAGE).isDisplayed());
    }
}
