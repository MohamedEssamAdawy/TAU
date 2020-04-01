package horizontalslider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTest {
    @Test
    public void testSlideUntilValue4(){
        double requiredValue = 4;
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        var sliderContainer = horizontalSliderPage.clickOnSlider();
        double currentValue = sliderContainer.getCurrentValue();
        while (currentValue!= requiredValue){

            if (currentValue < requiredValue){
                sliderContainer.slideRight();
            }else{
                sliderContainer.slideLeft();
            }
            currentValue = sliderContainer.getCurrentValue();
        }
        assertEquals(currentValue,requiredValue,"Text is wrong");
    }


}
