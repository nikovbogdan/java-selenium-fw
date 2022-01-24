package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.event.KeyEvent;

public class BasicAuthPage {
    private final WebDriver driver;
    private final static By TEXT = By.xpath("//p");

    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsernameAndPassword(String username, String password) {
        Actions actions = new Actions(driver);
        actions
                .sendKeys(username)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .build().perform();
    }

    public void clickToConfirm() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER);
    }

    public void verifyTextEqualsTo(String expectedText) {
        String actualText = driver.findElement(TEXT).getText();
        Assert.assertEquals(actualText,expectedText,"BUG");
    }
}
