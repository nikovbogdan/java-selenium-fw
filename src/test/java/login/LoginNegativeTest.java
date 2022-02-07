package login;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest {

    @Test
    public void testLoginWithInvalidCredentials() {
        var login = homePage.clickFormAuthentication();
        login.enterUsername("tomsmith");
        login.enterPassword("somePassword");
        login.clickLoginButton();
        login.verifyRedMessageIsDisplayed();
    }
}
