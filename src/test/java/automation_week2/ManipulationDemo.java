package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import teme.util.ta_utils.BaseTestClass;

public class ManipulationDemo extends BaseTestClass { //principiul mostenirii

    @Test
    public void verifyIfLoginWorkAsExpectedWithValidCredentials (){
        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/login/");
        WebElement usernameTextbox = driver.findElement(By.id("user_login"));
        usernameTextbox.clear();
        usernameTextbox.sendKeys("cursant1");

        WebElement passwordTextbox = driver.findElement(By.id("user_pass"));
        passwordTextbox.clear();
        passwordTextbox.sendKeys("Tester123");

        WebElement loginButon = driver.findElement(By.id("wppb-submit"));
        loginButon.click();

        WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Logout']"));

        Assert.assertEquals("Invalid login!", "Logout", logoutButton.getText());




    }

    @Test

    public void verifyIfRegisterWorksByFillingTheMandatoryFields(){

        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/register/");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Wantsome2208199");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("wansome2208199@want.com");

        WebElement passw1 = driver.findElement(By.id("passw1"));
        passw1.sendKeys("Want1234!");

        WebElement passw2 = driver.findElement(By.id("passw2"));
        passw2.sendKeys("Want1234!");

        WebElement registerButton =  driver.findElement(By.id("register"));
        registerButton.submit(); //submit=click=actiunea de inregistare

        WebElement registerSuccessfullyMessage = driver.findElement(By.xpath("//p[contains(text(), 'successfully created!')]"));
        String actualRegisterMessage =  registerSuccessfullyMessage.getText();
        Assert.assertEquals("The register is not working! ", "The account Wantsome2208199 has been successfully created!", actualRegisterMessage);



    }

}
