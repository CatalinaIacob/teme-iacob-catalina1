package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import teme.util.ta_utils.BaseTestClass;

public class ActionPractice extends BaseTestClass {
    /* ● Go to https://testare-manuala.locdejoacapentruitsti.com/blog/
     * ● Test that if the user types "wantsome" while holding the shift
     * key in the search input, the search will be performed for
     * "WANTSOME" (make the search and find a way to assert).*/
    @Test
    public void actionTest() {
        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/");
        WebElement searchBar = driver.findElement(By.className("search-field"));
        Actions actionSearch = new Actions(driver);
        Action shiftSearch = actionSearch.keyDown(Keys.SHIFT)
                .sendKeys(searchBar, "wantsome")
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build();
        shiftSearch.perform();

        WebElement resultValue = driver.findElement(By.xpath("//h1[@class='archive-title']/span"));

        Assert.assertEquals("The result is not correct", "WANTSOME", resultValue.getText());


    }
}
