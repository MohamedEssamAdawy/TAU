package keypesses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTest {
    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResultField(),
                "You entered: BACK_SPACE","BACK_SPACE not Entered");
    }
    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }

}
