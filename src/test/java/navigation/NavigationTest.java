package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTest extends BaseTest {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingPage().clickExample1Page();
        getWindowManger().goBack();
        getWindowManger().refreshPage();
        getWindowManger().goForward();
        getWindowManger().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindowPage().clickHere();
        getWindowManger().switchToTab("New Window");
    }

    @Test
    public void testFindStartButtonInNewTab(){
        var example2Page = homePage.clickDynamicLoadingPage().DynamicLoadingExample2PageInNewTab();
        getWindowManger().switchToNext();
        assertTrue(example2Page.foundStartButton(),"Start button not found");
    }
}
