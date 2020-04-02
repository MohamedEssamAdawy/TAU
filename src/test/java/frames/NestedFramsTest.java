package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramsTest extends BaseTest {
    @Test
    public void testNestedFramesLeft_Bottom(){
        var framesPage = homePage.clickFramePage();
        var nestedFramesPage = framesPage.clickNestedFramePage();

        nestedFramesPage.clickOnLeftFrame();
        assertEquals(nestedFramesPage.getTextInLeftFrame(),"LEFT","Wrong Frame Text");
        nestedFramesPage.clickOnBottomFrame();
        assertEquals(nestedFramesPage.getTextInBottomFrame(),"BOTTOM","Wrong Frame Text");
    }
}
