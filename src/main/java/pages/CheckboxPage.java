package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class CheckboxPage {

    private final WebDriver driver;
    private final static By CHECKBOX_1 = By.xpath("//input[@type='checkbox'][1]");
    private final static By CHECKBOX_2 = By.xpath("//input[@type='checkbox'][2]");

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void markFirstCheckbox() {
        if (!driver.findElement(CHECKBOX_1).isSelected())
        driver.findElement(CHECKBOX_1).click();
    }

    public void markSecondCheckbox() {
        if (!driver.findElement(CHECKBOX_2).isSelected())
            driver.findElement(CHECKBOX_2).click();
    }

    public void verifyFirstCheckboxIsSelected() {
        Assert.assertTrue(driver.findElement(CHECKBOX_1).isSelected());
    }

    public void verifySecondCheckboxIsSelected() {
        Assert.assertTrue(driver.findElement(CHECKBOX_2).isSelected());
    }

    public void unmarkFirstCheckbox() {
        if (driver.findElement(CHECKBOX_1).isSelected())
            driver.findElement(CHECKBOX_1).click();
    }

    public void unmarkSecondCheckbox() {
        if (driver.findElement(CHECKBOX_2).isSelected())
            driver.findElement(CHECKBOX_2).click();
    }

    public void verifyFirstCheckboxIsNotSelected() {
        Assert.assertFalse(driver.findElement(CHECKBOX_1).isSelected());
    }

    public void verifySecondCheckboxIsNotSelected() {
        Assert.assertFalse(driver.findElement(CHECKBOX_2).isSelected());
    }
}
