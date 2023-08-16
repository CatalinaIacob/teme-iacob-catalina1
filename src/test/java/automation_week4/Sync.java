package automation_week4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

import java.util.concurrent.TimeUnit;

public class Sync extends BaseTestClass {

    @Test
    public void noSyncronizationDemo() {

        driver.get("https://demoqa.com/dynamic-properties");
        WebElement invisibleButton = driver.findElement(By.id("visibleAfter"));

        Assert.assertTrue(invisibleButton.isDisplayed());

    }

    @Test
    public void hardCodeSleep() throws InterruptedException {
        driver.get("https://demoqa.com/dynamic-properties");
        Thread.sleep(6*1000);

        WebElement invisibleButton = driver.findElement(By.id("visibleAfter"));

        Assert.assertTrue(invisibleButton.isDisplayed());
    }

    @Test
    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


        driver.get("https://demoqa.com/dynamic-properties");
        WebElement invisibleButton = driver.findElement(By.id("visibleAfter"));

        Assert.assertTrue(invisibleButton.isDisplayed());
    }

}
