package qa.tests;

import base.baseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;
import utils.constants;

public class LoginPage extends baseTest {
    ElementFetch ele = new ElementFetch();
    LoginPageEvents loginpage = new LoginPageEvents();

    @Test(description = "Masking and unmasking of password")
    public void maskingUnmasking() {
        loginpage.verifyPasswordMaskingAndUnMasking();
    }

    @Test(description = "Verify toaster is shown when logging in with incorrect credentials")
    public void VerifyIncorrectLogin() {
        loginpage.loginWithIncorrectCredentials();
    }

    @Test(description = "Verify Remember Me functionality")
    public void verifyRememberMeFunctionality() {
        loginpage.verifyRememberMeFunctionality();
    }

    }


