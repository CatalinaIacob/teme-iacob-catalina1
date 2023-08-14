package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class AlertDemo extends BaseTestClass {

    @Test

    public void alertTest() {

        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
        WebElement alertBoxButton = driver.findElement(By.id("alertBox"));
        alertBoxButton.click();

        //how to work with alert?
        Alert alertBoxPopup = driver.switchTo().alert();

        //asser the alert message

        String actualMessage= alertBoxPopup.getText();
        String expectedMessage= "This is a simple alert box! \n"
                + "You can't escape from me until you click 'OK'!" ;

        Assert.assertEquals("The text inside popup is wrong!", expectedMessage, actualMessage);

        alertBoxPopup.accept();

        WebElement confirmBoxButton = driver.findElement(By.id("confirmBox"));
        confirmBoxButton.click();

        Assert.assertEquals("The site inside  pupup is wrong!", "Click 'OK' or 'Cancel'.", alertBoxPopup.getText());
    }
}
