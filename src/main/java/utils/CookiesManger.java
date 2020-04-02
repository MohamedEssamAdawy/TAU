package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookiesManger {
    private WebDriver driver;

    public CookiesManger(WebDriver driver){
        this.driver = driver;
    }

    public void setCookie(String name, String value, String domain){
        Cookie cookie = new Cookie.Builder(name,domain).
                domain(domain).build();
    }

    public Cookie getCookie(String name){
        return driver.manage().getCookieNamed(name);
    }
    public void deleteCookie(Cookie deletedCookie){
        driver.manage().deleteCookie(deletedCookie);
    }

    public boolean isCookieDeleted(String deletedCookieName){
        var cookies = driver.manage().getCookies();
        cookies.forEach(System.out::println);
        for (Cookie cookie : cookies){
            if(deletedCookieName.equals(cookie.getName())){
                return false;
            }
        }
        return true;
    }
}
