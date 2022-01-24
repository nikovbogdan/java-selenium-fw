package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlesPage {
    private final WebDriver driver;
    private final static By CLICK_LINK = By.cssSelector(".example > a");
    private final static By TEXT = By.xpath("//h3");

    public HandlesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHereLink() {
        driver.findElement(CLICK_LINK).click();
    }

    public void switchToNewTab() {
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));

    }

    public void verifyTextEqualsTo(String expectedText) {
        String actualText = driver.findElement(TEXT).getText();
        Assert.assertEquals(actualText,expectedText,"Bug");
    }
}
