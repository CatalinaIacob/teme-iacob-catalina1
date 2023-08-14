package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import teme.util.ta_utils.BaseTestClass;

import javax.swing.*;
//move to element, mutarea adentiei dintr-un loc in altul, nu mutarea texrului
//noua clasa de logica action
//value nu e un selector By.selector

public class MultipleSelectActionsDemo  extends BaseTestClass {

    @Test
    public void multipleSelectWithAction(){
        driver.get("http://output.jsbin.com/osebed/2");

        WebElement bananaElement = driver.findElement(By.xpath("//select/option[@value='banana']"));
        WebElement appleElement = driver.findElement(By.xpath("//select/option[@value='apple']"));

        Actions actionOnFruits = new Actions(driver);

        Action combinedActions = actionOnFruits.keyDown(Keys.CONTROL)
                .click(bananaElement)
                .click(appleElement)
                .keyUp(Keys.CONTROL)
                .build();

        combinedActions.perform(); //running the whole code (21-27)

        Assert.assertTrue("Banana is not selected", bananaElement.isSelected());
        Assert.assertTrue("Apple is not selected", appleElement.isSelected());



    }
}
