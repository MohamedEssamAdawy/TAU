package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {
    @Test
    public void testContextClick(){
        var contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.contextClickOnBox();
        assertEquals(contextMenuPage.alert_getText(),"You selected a context menu", "Alert MSG Wrong");
        contextMenuPage.alert_clickToAccept();
    }
}
