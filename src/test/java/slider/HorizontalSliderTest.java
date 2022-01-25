package slider;

import base.BaseTest;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testHorizontalSlider() throws Exception {
        var slider = homePage.clickHorizontalSlider();
        slider.clickOnSlider();
        slider.setToPosition(4);
    }
}
