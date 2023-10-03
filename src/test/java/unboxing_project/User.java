package unboxing_project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import teme.util.ta_utils.BaseTestClass;

import java.util.concurrent.TimeUnit;

public class User extends BaseTestClass {

    @BeforeMethod
    public void login() {
        driver.get("http://138.68.69.185:3333/");

        WebElement loginButtoon = driver.findElement
                (By.xpath("//div[text() = 'Login']"));
        loginButtoon.click();

        WebElement loginBox = driver.findElement(By.xpath("//button[text() = 'Login']"));
        Assert.assertEquals("The button is not displayed", "Login", loginBox.getText());

        WebElement emailField = driver.findElement(By.xpath("//input[@type = 'text' ]"));
        emailField.sendKeys("alexe@exemplu.ro");


        WebElement passwordField = driver.findElement(By.xpath("//input[@type = 'password' ]"));
        passwordField.sendKeys("parola123!");

        loginBox.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement welcomeMessage = driver.findElement
                (By.xpath("//section//div[text() = ' Adrian Alexe']"));
        Assert.assertTrue("The message is not present.", welcomeMessage.isDisplayed());

    }


     @AfterMethod
public void logout() {

         WebElement logoutButton = driver.findElement(By.xpath("//button//ion-icon[@name = 'log-out-outline']"));
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView();", logoutButton);
         logoutButton.click();
    }
}
