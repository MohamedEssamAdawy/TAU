package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1Page = By.xpath("//a[contains(.,'Example 1')]");
    private By example2Page = By.xpath("//a[contains(.,'Example 2')]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1Page(){
        clickLink(example1Page);
        return new DynamicLoadingExample1Page (driver);
    }

    public DynamicLoadingExample2Page clickExample2Page(){
        clickLink(example2Page);
        return new DynamicLoadingExample2Page (driver);
    }

    public DynamicLoadingExample2Page DynamicLoadingExample2PageInNewTab(){
        Actions action = new Actions(driver);
        WebElement example2Link =  driver.findElement(example2Page);
        action.keyDown(Keys.CONTROL).click(example2Link).perform();
        return new DynamicLoadingExample2Page(driver);
    }

    private void clickLink (By byElement){
        driver.findElement(byElement).click();
    }

}
