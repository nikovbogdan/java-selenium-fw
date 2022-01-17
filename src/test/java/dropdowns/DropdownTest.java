package dropdowns;

import base.BaseTest;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdowns() {
        var dropdowns = homePage.clickDropdown();
        dropdowns.selectOption1();
        dropdowns.verifyOption1IsSelected();

        dropdowns.selectOption2();
        dropdowns.verifyOption2IsSelected();
    }
}
