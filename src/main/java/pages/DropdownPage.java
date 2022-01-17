package pages;

import core.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownPage {

    private final WebDriver driver;
    private final static By DROPDOWN = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOption1() {
        WebElement dropDownElement = driver.findElement(DROPDOWN);
        Select dd = new Select(dropDownElement);
        dd.selectByIndex(1);
    }

    public void verifyOption1IsSelected() {
        WebElement dropDownElement = driver.findElement(DROPDOWN);
        Select dd = new Select(dropDownElement);
        Assert.assertEquals(dd.getFirstSelectedOption().getText(), "Option 1");
    }

    public void selectOption2() {
        WebElement dropDownElement = driver.findElement(DROPDOWN);
        Select dd = new Select(dropDownElement);
        dd.selectByVisibleText("Option 2");
    }

    public void verifyOption2IsSelected() {
        WebElement dropDownElement = driver.findElement(DROPDOWN);
        Select dd = new Select(dropDownElement);
        Assert.assertEquals(dd.getFirstSelectedOption().getText(), "Option 2");
    }
}
