package login.form;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest {
    
    WebDriver driver;

    @Test
    public void testLoginWithInvalidCredentials() {
        var login = homePage.clickFormAuthentication();
        login.enterUsername("tomsmith");
        login.enterPassword("somePassword");
        login.clickLoginButton();
        login.verifyRedMessageIsDisplayed();
    }
}