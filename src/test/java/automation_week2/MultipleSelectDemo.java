package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;

public class MultipleSelectDemo extends BaseTestClass {

    @Test
    public void multipleSelectDDTest() {

        driver.get("http://output.jsbin.com/osebed/2");
        Select fruitsDD = new Select(driver.findElement(By.id("fruits"))); //type = WebElement
        fruitsDD.deselectAll();

        //select using the option by values

        fruitsDD.selectByValue("grape");
        fruitsDD.selectByIndex(2);

        //verify if selected values are grape and orange

        List<WebElement> selectedFruits = fruitsDD.getAllSelectedOptions();

        Assert.assertEquals("Grape is not on the list", "Grape", selectedFruits.get(1).getText());
        Assert.assertEquals("Orange is not on the list", "Orange", selectedFruits.get(0).getText());

        Assert.assertEquals(2, selectedFruits.size());

       fruitsDD.deselectByValue("grape"); //HTML
        fruitsDD.deselectByVisibleText("Grape");

        Assert.assertEquals("Orange", selectedFruits.get(0).getText());
        Assert.assertEquals(2, selectedFruits.size());

        fruitsDD.deselectAll();
    }
}
