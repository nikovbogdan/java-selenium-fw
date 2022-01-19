package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AlertsPage {

    private final WebDriver driver;
    private final static By ALERT = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private final static By CONFIRM = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private final static By PROMPT = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    private final static By RESULT = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertButton(){
        driver.findElement(ALERT).click();
    }

    public void clickConfirmButton(){
        driver.findElement(CONFIRM).click();
    }

    public void clickPromptButton(){
        driver.findElement(PROMPT).click();
    }


    public void printAlertText() {
        String actualAlertText = driver.switchTo().alert().getText();
        System.out.println(actualAlertText);
    }

    public void clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void verifyResultTextEqualsTo(String expectedText) {
        String actualText = driver.findElement(RESULT).getText();
        Assert.assertEquals(actualText,expectedText,"BUG");
    }

    public void clickToCancel() {
        driver.switchTo().alert().dismiss();
    }

    public void type(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
}
