package automation_week1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class FirstElement extends BaseTestClass {
@Test
    public void MyCms (){
        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/");

    WebElement  logo = driver.findElement(By.id("logo"));
    String logoText = logo.getText(); //actual
    System.out.println(logoText);

    //intr-un test pot cauta mai multe elemente de identificare, nu sunt limitata.

    WebElement welcomeMessage = driver.findElement(By.className("site-description"));
    String actualResult = welcomeMessage.getText(); //actual result
    String expectedResult = "Practice website for testing sessions"; //expected result
    Assert.assertEquals( expectedResult, actualResult);
    }
}
