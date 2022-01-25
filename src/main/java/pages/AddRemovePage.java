package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddRemovePage {

    int counter;

    private final WebDriver driver;
    private final static By ADD_BUTTON = By.xpath("//button[contains(text(),'Add Element')]");
    private final static By REMOVE_BUTTON = By.cssSelector(".added-manually");

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButton(int clicks) {
        for (int j = 0; j < clicks; j++) {
            driver.findElement(ADD_BUTTON).click();
            counter++;
        }
    }

    public void verifyRemoveButtonsCount() {
        int size = driver.findElements(REMOVE_BUTTON).size();
        Assert.assertEquals(size, counter);
    }

    public void removeButtons(int numberOfButtons) {
        for (int i = 0; i < numberOfButtons; i++) {
            driver.findElement(REMOVE_BUTTON).click();
            counter--;
        }
    }

    public void removeAllButtons() {
        int size = driver.findElements(REMOVE_BUTTON).size();
        removeButtons(size);
        counter = 0;
    }
}
