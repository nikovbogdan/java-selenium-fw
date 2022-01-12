package login;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTestPositive extends BaseTest {

    @Test
    public void loginWithValidCredentials(){
        var login = homePage.clickFormAuthentication();
        login.enterUsername("tomsmith");
        login.enterPassword("SuperSecretPassword!");
        login.clickLoginButton();
        login.verifyGreenMessageIsDisplayed();
    }

}
