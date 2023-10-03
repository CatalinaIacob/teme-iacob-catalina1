package unboxing_project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import teme.util.ta_utils.BaseTestClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Favorites extends BaseTestClass {

    @Test
    public void addAHotelToFavoritesList() throws InterruptedException {

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

        WebElement searchBar = driver.findElement
                (By.xpath("//input[@class = 'outline-none p-2 sm:text-lg w-full']"));
        searchBar.sendKeys("Hotel Brasov");
        searchBar.submit();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement hotel = driver.findElement(By.xpath("//body//div[text() = 'Hotel Brasov']"));
        //Assert.assertTrue("The hotel is not the search one.", hotel.isDisplayed());

        WebElement heartForFavorites = driver.findElement(By.name("heart-outline"));
        heartForFavorites.click();

        WebElement bookingLogo = driver.findElement(By.xpath("//div[text() = 'Booking']"));
        bookingLogo.click();


        WebElement logoutButton = driver.findElement(By.xpath("//button//ion-icon[@name = 'log-out-outline']"));

        logoutButton.click();


    }

}
