package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void testForgotPasswordSubmitPassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        String email = "tau@example.com";
        forgotPasswordPage.setEmailField(email);
        var retrivePage = forgotPasswordPage.clickRetrieveButton();
        assertEquals(retrivePage.getSubmitMsg(),"Your e-mail's been sent!","Submission message is not true");
    }
}
