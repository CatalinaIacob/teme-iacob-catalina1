package unboxing_project;

import org.apache.commons.lang3.concurrent.AtomicInitializer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import teme.util.ta_utils.BaseTestClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePageButtonsTests extends BaseTestClass {

    @Test
    public void theLoginButtonIsNotPresentForLoggedUsers() {

        driver.get("http://138.68.69.185:3333/");

        WebElement loginButtoon = driver.findElement
                (By.xpath("//div[text() = 'Login']"));
        loginButtoon.click();
//
//        WebElement loginBox = driver.findElement(By.xpath("//button[text() = 'Login']"));
//        Assert.assertEquals("The button is not displayed", "Login", loginBox.getText());

        WebElement emailField = driver.findElement(By.xpath("//input[@type = 'text' ]"));
        emailField.sendKeys("alexe@exemplu.ro");


        WebElement passwordField = driver.findElement(By.xpath("//input[@type = 'password' ]"));
        passwordField.sendKeys("parola123!");

        WebElement login = driver.findElement(By.xpath("//button[text() = 'Login' ]"));
        login.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        WebElement welcomeMessage = driver.findElement(By.xpath("//section//div[text() = ' Adrian Alexe']"));
//        Assert.assertTrue("The message is not present.", welcomeMessage.isDisplayed());


        WebElement myAccountButton = driver.findElement(By.xpath("//div[text() = 'My account']"));

        Assert.assertEquals("The button is not updated.", "My account", myAccountButton.getText());


    }
}
