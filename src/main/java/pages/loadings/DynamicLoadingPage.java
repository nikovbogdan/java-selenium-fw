package pages.loadings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private final WebDriver driver;
    private final static By EXAMPLE_1 = By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]");
    private final static By EXAMPLE_2 = By.xpath("//a[contains(text(),'Example 2: Element rendered after the fact')]");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page clickExample1() {
        driver.findElement(EXAMPLE_1).click();
        return new Example1Page(driver);
    }

    public Example2Page clickExample2() {
        driver.findElement(EXAMPLE_2).click();
        return new Example2Page(driver);
    }
}
