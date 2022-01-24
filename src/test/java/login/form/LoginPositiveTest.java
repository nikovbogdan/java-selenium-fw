package login.form;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginPositiveTest extends BaseTest {

    @Test
    public void loginWithValidCredentials(){
        var login = homePage.clickFormAuthentication();
        login.enterUsername("tomsmith");
        login.enterPassword("SuperSecretPassword!");
        login.clickLoginButton();
        login.verifyGreenMessageIsDisplayed();
    }

}
