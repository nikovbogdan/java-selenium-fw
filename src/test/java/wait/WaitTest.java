package wait;

import base.BaseTest;
import org.testng.annotations.Test;

public class WaitTest extends BaseTest {

    @Test
    public void testHidden() {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStartButton();
        loadingPage.verifyLoadedTextIs("Hello World!");
    }

    @Test
    public void testVisible() {
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStartButton();
        loadingPage.verifyLoadedTextIs("Hello World!");

    }
}
