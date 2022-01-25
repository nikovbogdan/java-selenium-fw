package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.loadings.DynamicLoadingPage;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public CheckboxPage clickCheckboxes() {
        clickLink("Checkboxes");
        return new CheckboxPage(driver);
    }

    public DropdownPage clickDropdown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new  AlertsPage(driver);
    }

    public ContextPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextPage(driver);
    }

    public HandlesPage clickMultipleWindows() {
        clickLink("Multiple Windows");
        return new HandlesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AddRemovePage clickAddRemove() {
        clickLink("Add/Remove Elements");
        return new AddRemovePage(driver);
    }
}
