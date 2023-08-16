package automation_week4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import teme.util.ta_utils.BaseTestClass;

import java.time.Duration;

public class ExplicitWait extends BaseTestClass {

    @Test
    public void explicitWait() {
        driver.get("https://demoqa.com/dynamic-properties");

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement invisibleButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

        Assert.assertTrue(invisibleButton.isDisplayed());

   }
    @Test
    public void enableButton() {
    driver.get("https://demoqa.com/dynamic-properties");
    WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(30));
    WebElement inactivButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        Assert.assertTrue(inactivButton.isEnabled());
}
}
