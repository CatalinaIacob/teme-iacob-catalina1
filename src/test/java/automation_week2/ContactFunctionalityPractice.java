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

}