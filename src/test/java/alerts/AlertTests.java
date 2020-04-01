package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTest {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResultText(),"You successfuly clicked an alert","Wrong Result");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert not correct");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerPrompt();
        String text = "Good Job Mohammed !";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResultText(),"You entered: "+text,"Results text incorrect");
    }
}
