package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

import java.util.concurrent.TimeUnit;

public class CreateContactPractice extends BaseTestClass {

   /* 1. Navigate to the site: https://thinking-tester-contact-list.herokuapp.com/
   2. Login into the app.
   3. Click on the button add a new contact.
   4. Fill the first name, last name, email, city, country.
   5. Click on submit button.
   6. Assert that the contact is created.
             */
    @Test
    public void VerifyIfYouCanCreateANewContact() {

        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("test2@fake.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("myPassword");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.submit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;

       // WebElement logoutButton = driver.findElement(By.xpath("//button[text() = 'Logout']"));
        WebElement addUser = driver.findElement(By.xpath("//*[text() = 'Click on any contact to view the Contact Details']"));
        Assert.assertEquals("Invalid login", "Click on any contact to view the Contact Details", addUser.getText());

        WebElement addContactButton = driver.findElement(By.id("add-contact"));
        addContactButton.click();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Ana");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Maria");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ana@maria.ro");

        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Iasi");

        WebElement country = driver.findElement(By.id("country"));
        country.sendKeys("Romania");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement newName = driver.findElement(By.xpath("//td[text() = 'Ana Maria']"));
        Assert.assertEquals("The new contact is not displayed", "Ana Maria", newName.getText() );
    }
}
