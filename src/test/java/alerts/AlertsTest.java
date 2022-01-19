package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {

    @Test
    public void testJSAcceptAlert() {

        var alert = homePage.clickJavaScriptAlerts();
        alert.clickAlertButton();
        alert.printAlertText();
        alert.clickToAccept();
        alert.verifyResultTextEqualsTo("You successfully clicked an alert");
    }

    @Test
    public void testJSConfirmTest() {
        var alert = homePage.clickJavaScriptAlerts();
        alert.clickConfirmButton();
        alert.printAlertText();
        alert.clickToAccept();
        alert.verifyResultTextEqualsTo("You clicked: Ok");

        alert.clickConfirmButton();
        alert.clickToCancel();
        alert.verifyResultTextEqualsTo("You clicked: Cancel");
    }

    @Test
    public void testJSPromptTest() {
        var alert = homePage.clickJavaScriptAlerts();
        alert.clickPromptButton();
        alert.printAlertText();
        alert.type("Kole Test 1");
        alert.clickToAccept();
        alert.verifyResultTextEqualsTo("You entered: Kole Test 1");

        alert.clickPromptButton();
        alert.clickToCancel();
        alert.verifyResultTextEqualsTo("You entered: null");

    }
}
