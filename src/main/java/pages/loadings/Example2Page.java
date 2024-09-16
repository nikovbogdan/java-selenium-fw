package pages.loadings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Example2Page {

    private final WebDriver driver;
    public final static By START_BUTTON = By.tagName("button");
    public final static By LOADING = By.id("loading");
    public final static By LOADED_TEXT = By.id("finish");

    public Example2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton() {
        driver.findElement(START_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(LOADING)));
    }

    public void verifyLoadedTextIs(String expectedText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOADED_TEXT));
        Assert.assertEquals(driver.findElement(LOADED_TEXT).getText(),expectedText);
    }
}
