package chapter1;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }
    public void findElementByLinkText(String text){
        WebElement foundElement = driver.findElement(By.linkText(text));
        foundElement.click();
        System.out.println("Element Found");
    }

    public void findElementsByLinkText(String text){
        List<WebElement> listElements = driver.findElements(By.cssSelector(text));
        System.out.println("Menu Elements are :: " + listElements.size());
    }

    public void quitChrome(){
        driver.quit();
    }



    public static void main(String args[]){
        Exercise test = new Exercise();
        test.setUp();
        test.findElementByLinkText("Shifting Content");
        test.findElementByLinkText("Example 1: Menu Element");
        test.findElementsByLinkText("ul > li");
        test.quitChrome();
    }
}
