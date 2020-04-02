package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class JavascriptTest extends BaseTest {
    @Test
    public void testScrollUntilTableView(){
        homePage.clickLargeAndDeepDOMPage().ScrollToViewTable();
    }

    @Test
    public void testScrollPageTo5thParagraph(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);

    }

    @Test
    public void testEnableMultipleAttForDropDown(){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.enableMultipleAtt();
        dropDownPage.selectFromDropDown("Option 1");
        dropDownPage.selectFromDropDown("Option 2");
        boolean isBothSelected = dropDownPage.getSelectedOptions().contains("Option 1") &&
                dropDownPage.getSelectedOptions().contains("Option 2");
        assertTrue(isBothSelected,"Both not selected");
    }
}
