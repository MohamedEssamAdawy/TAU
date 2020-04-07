package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.className("sliderContainer");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public SliderContainer clickOnSlider(){
        WebElement sliderElement = driver.findElement(slider);
        return new SliderContainer(sliderElement);
    }


    public class SliderContainer{
        WebElement slider;
        private By currentValue = By.id("range");
        private By input = By.tagName("input");
        public SliderContainer(WebElement slider){
            this.slider = slider;
        }

        public double getCurrentValue() {
            return Double.parseDouble(driver.findElement(currentValue).getText());
        }
        public void slideRight(){
            (driver.findElement(input)).sendKeys(Keys.ARROW_RIGHT);
        }

        public void slideLeft(){
            (driver.findElement(input)).sendKeys(Keys.ARROW_LEFT);
        }
    }
}
