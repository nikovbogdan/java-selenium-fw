package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ContextPage {

    private final static By BOX = By.id("hot-spot");
    private final WebDriver driver;

    public ContextPage(WebDriver driver) {
        this.driver = driver;
    }


    public void rightClickInTheBox() {
        WebElement box = driver.findElement(BOX);

        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
    }

    public void printAlertText() {
        String actualAlertText = driver.switchTo().alert().getText();
        System.out.println(actualAlertText);
    }

    public void verifyAlertTextIs(String expectedText) {
        Assert.assertEquals("You selected a context menu",expectedText,"BUG");
    }

    public void clickAlertConfirmButton() {
        driver.switchTo().alert().accept();
    }
}
