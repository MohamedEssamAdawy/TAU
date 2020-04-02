package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
    private WebDriver driver;
    private By topIFrame = By.xpath("//frame[@name='frame-top']");
    private By bottomIFrame = By.xpath("//frame[@name='frame-bottom']");
    private By leftIFrame = By.xpath("//frame[@name='frame-left']");
    private By frameBody = By.xpath("/html/body");
    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnLeftFrame(){
        WebElement topIFrameElement = driver.findElement(topIFrame);
        driver.switchTo().frame(topIFrameElement);
        WebElement leftIFrameElement = driver.findElement(leftIFrame);
        driver.switchTo().frame(leftIFrameElement);
    }

    public String getTextInLeftFrame(){
        String textFrame = driver.findElement(frameBody).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return textFrame;
    }
    public void clickOnBottomFrame(){
        WebElement bottomIFrameElement = driver.findElement(bottomIFrame);
        driver.switchTo().frame(bottomIFrameElement);
    }

    public String getTextInBottomFrame(){
        String textFrame = driver.findElement(frameBody).getText();
        driver.switchTo().parentFrame();
        return textFrame;
    }



}
