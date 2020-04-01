package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {
    @Test
    public void testUploadFile(){
        var fileUploadPage = homePage.clickFileUploadPage();
        String absPath = "C:\\Users\\moham\\Pictures\\PresentationSamples\\1.png";
        fileUploadPage.uploadFile(absPath);
        assertEquals(fileUploadPage.getUploadedText(),"1.png","Wrong File");
    }
}
