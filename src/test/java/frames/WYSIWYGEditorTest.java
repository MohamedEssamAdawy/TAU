package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WYSIWYGEditorTest extends BaseTest {
    @Test
    public void testIndentText(){
        var editorPage = homePage.clickWYSIWYGEditorPage();
        String text1 = "hello";
        String text2 = "World";

        editorPage.clearTextArea();

        editorPage.setTextArea(text1);
        editorPage.clickIncreaseIndentButton();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextArea(),text1+text2,"Error Msg");
    }
}
