package context;

import base.BaseTest;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu() {
        var context = homePage.clickContextMenu();
        context.rightClickInTheBox();
        context.printAlertText();
        context.verifyAlertTextIs("You selected a context menu");
        context.clickAlertConfirmButton();


    }
}
