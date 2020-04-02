package cookies;

import base.BaseTest;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CookiesTest extends BaseTest {
    @Test
    public void testIfCookieDeleted(){
        String cookieName = "optimizelyBuckets";
        Cookie deleteThisCookie = getCookiesManger().getCookie(cookieName);
        getCookiesManger().deleteCookie(deleteThisCookie);
        assertTrue(getCookiesManger().isCookieDeleted(cookieName),"Cookie Still Found");
    }
}
