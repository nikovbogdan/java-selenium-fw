package addremove;

import base.BaseTest;
import org.testng.annotations.Test;

public class AddRemoveElementTest extends BaseTest {

    @Test
    public void testAddRemoveElement() {
        var addRemove = homePage.clickAddRemove();
        addRemove.clickOnButton(4);
        addRemove.verifyRemoveButtonsCount();
        addRemove.removeButtons(2);
        addRemove.verifyRemoveButtonsCount();
        addRemove.removeAllButtons();

    }
}
