package automation_week2;

import com.gargoylesoftware.htmlunit.WebWindow;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import teme.util.ta_utils.BaseTestClass;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ContactFunctionalityPractice extends BaseTestClass {

        /*
    1. Identify and fill the Your Name cell.
    2. Identify and fill the Email cell.
    3. Identify and fill the Your Phone cell.
    4. Identify and fill the Subject cell.
    5. Identify and fill the Message cell.
    6. Leave the section Select a topic as it is (with the value “---“)
    7. Select one option from the Where did you find us? For example: Friends.
    8. Select one option from the Your profession area. For example: Sales.
    9. Click Send button.
    Expected results:
    There should be an error displayed. Validate that!
    */

    @Test
    public void verifyIfContactFunctionDoesNotWorkIfAllTheRequiredFieldsAreNotCompleted() {

        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/contact/");

        WebElement name = driver.findElement(By.name("your-name"));
        name.sendKeys("Catalina");

        WebElement email = driver.findElement(By.name("your-email"));
        email.sendKeys("cata@wantsome.ro");

        WebElement phone = driver.findElement(By.xpath("//input[@type = 'tel']"));
        phone.sendKeys("0755558888");

        WebElement subiect = driver.findElement(By.name("your-subject"));
        subiect.sendKeys("Test.");

        WebElement message = driver.findElement(By.name("your-message"));
        message.sendKeys("This is a test.");

        Select topicDD =  new Select(driver.findElement(By.name("Select")));
        topicDD.selectByValue("Technical details");
        List<WebElement> topics = topicDD.getAllSelectedOptions();
        Assert.assertEquals("error", "Technical details", topicDD.getFirstSelectedOption().getText());


        WebElement friendsCheckBox = driver.findElement(By.xpath("//input[@value= 'Friends']"));
        friendsCheckBox.click();

        WebElement salesRadioButton = driver.findElement(By.xpath("//input[@value= 'Sales']"));
        salesRadioButton.click();

        WebElement sendButton = driver.findElement(By.xpath("//input[@value= 'Send']"));
        sendButton.click();



        //Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5));
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;

//        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='wpcf7-f79-p18-o1']/form/div[text()='One or more fields have an error. Please check and try again.']"));
//        String errorMessageText = errorMessage.getText();
//        Assert.assertEquals("Contact is working as expected!", "One or more fields have an error. Please check and try again.", errorMessageText);

        WebElement errorMessage2 = driver.findElement(By.xpath("//div[contains(text(), 'Please try again later.')]"));
        String errorMessage2Text = errorMessage2.getText();
        Assert.assertEquals("The error message is desplayd.", "There was an error trying to send your message. Please try again later.", errorMessage2Text);
 }

/*1. Navigate to the Tools QA site -> https://demoqa.com/select-menu

2. Assert that the Old Style Select Menu contains 11 values.



3. Assert that the default value for Old Style Select Menu is Red.

4. Assert that the Old Style Select Menu contains the White and Black value.

   ---- Create a new list and store these two values. Make assert on size.



5. Retrieve from the Standard multi select DD all the cars except the Audi one.

6. Assert that the list doesn't contain the Audi car, the size should be 3.*/

    @Test
    public void virifyIfDDAreWorkingAsExpected() {
        driver.get("https://demoqa.com/select-menu");
        WebElement colorDDElemet = driver.findElement(By.id("oldSelectMenu"));
        Select colorsDD = new Select(colorDDElemet);
        Assert.assertEquals("Invalid size.",  11, colorsDD.getOptions().size());

        Assert.assertEquals("Default value is not red", "Red", colorsDD.getFirstSelectedOption().getText());
        List<WebElement> allColors = colorsDD.getOptions();
        List<String> selectedColors = new ArrayList<>();
        for (WebElement curentColor: allColors) {
            if(curentColor.getText().equals("White") || curentColor.getText().equals("Black"))
                selectedColors.add(curentColor.getText());

        }
        Assert.assertEquals(2, selectedColors.size() );

        WebElement cars = driver.findElement(By.id("cars"));
        Select carsDD = new Select(cars);

        List<WebElement> allCars = carsDD.getOptions();
        List<String> selectedCars = new ArrayList<>();
        for (WebElement selectCar:allCars) {
            if (!selectCar.getText().equals("Audi"))
                selectedCars.add(selectCar.getText());
        }
        Assert.assertEquals(3, selectedCars.size());
      //  Assert.assertTrue("Audi is on the list", allCars.contains("Volvo"));
        // Assert.assertFalse("Audi is on the list", selectedCars.contains("Audi"));

    }


}