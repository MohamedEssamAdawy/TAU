package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("FieldCanBeLocal")
public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIFrameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By indentButton = By.cssSelector("#mceu_12 button");

    public WYSIWYGEditorPage(WebDriver driver){
        this.driver=driver;
    }

    public void clearTextArea (){
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea (String text){
        switchToTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextArea (){
        switchToTextArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void clickIncreaseIndentButton(){
        driver.findElement(indentButton).click();
    }
    private void switchToTextArea(){
        driver.switchTo().frame(editorIFrameID);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
