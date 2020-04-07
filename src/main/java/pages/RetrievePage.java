package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrievePage {
    private WebDriver driver;
    private By submitMsg = By.id("content");

    public RetrievePage(WebDriver driver){
        this.driver = driver;
    }
    public String getSubmitMsg(){
        return driver.findElement(submitMsg).getText();
    }
}
