package handels;

import base.BaseTest;
import core.Waiter;
import org.testng.annotations.Test;

public class MultipleWindowsTest extends BaseTest {

    @Test
    public void testMultipleWindowsTest() {
        var multipleWindows = homePage.clickMultipleWindows();
        multipleWindows.clickHereLink();
        multipleWindows.switchToNewTab();
        multipleWindows.verifyTextEqualsTo("New Window");

    }
}
