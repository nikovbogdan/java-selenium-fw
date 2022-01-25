package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class HorizontalSliderPage {

    private final static By SLIDER = By.xpath("//input[@type='range']");
    private final static By SLIDER_VALUE = By.id("range");
    private final WebDriver driver;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnSlider() {
        driver.findElement(SLIDER).click();
    }

    public void setToPosition(double position) throws Exception {
            if (position<0 || position>5){
                throw new Exception("Position is not between 0 and 5");
            }

        double token;

        while (true) {
            String sliderValue = driver.findElement(SLIDER_VALUE).getText();
            double sliderResult = Double.parseDouble(sliderValue);
            token = sliderResult;

            if (sliderResult == position) {
                break;
            }
            if (sliderResult > position) {
                driver.findElement(SLIDER).sendKeys(Keys.ARROW_LEFT);
            } else {
                driver.findElement(SLIDER).sendKeys(Keys.ARROW_RIGHT);
            }

        }
        Assert.assertEquals(token,position);
    }
}
