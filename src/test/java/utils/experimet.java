package utils;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import teme.util.ta_utils.BaseTestClass;

import java.util.concurrent.TimeUnit;

public class experimet extends BaseTestClass {
    @BeforeMethod
    @AfterMethod

    @Test
    public void favorites() {
        //driver.get("http://138.68.69.185:3333/");
        WebElement searchBar = driver.findElement
                (By.xpath("//input[@class = 'outline-none p-2 sm:text-lg w-full']"));
        searchBar.sendKeys("Hotel Brasov");
        searchBar.submit();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement hotel = driver.findElement(By.xpath("//body//div[text() = 'Hotel Brasov']"));
        //  Assert.assertTrue("The hotel is not the search one.", hotel.isDisplayed());

        WebElement heartForFavorites = driver.findElement(By.name("heart-outline"));
        heartForFavorites.click();
        WebElement bookingLogo = driver.findElement(By.xpath("//div[text() = 'Booking']"));
        bookingLogo.click();
    }
}

