package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import teme.util.ta_utils.BaseTestClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice extends BaseTestClass {

    @Test
    public void verifySearchFunctionality() {

        //metoda= testul este o metoda ce niciodata nu va returna eva. ci daor va face actiuni in consola

        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/login/");
        WebElement searchBar = driver.findElement(By.className("search-field"));
        searchBar.clear();
        searchBar.sendKeys("cafea");

        WebElement searchBautton = driver.findElement(By.xpath("//button[@class='search-submit']"));
        searchBautton.click();

        WebElement errorMessage = driver.findElement(By.className("page-title"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals("The error message is not displayed", "Nothing Found", errorMessage.getText());

    }

    @Test
    public void selectStateDropDown() {

        driver.get("https://www.mediacollege.com/internet/samples/html/state-list.html");
        WebElement stateElement = driver.findElement(By.name("state"));

        Select dropDD = new Select(stateElement);
        dropDD.selectByValue("ZZ");
        Assert.assertEquals("None", dropDD.getFirstSelectedOption().getText());

        List<WebElement> stateList = dropDD.getOptions();
        List<String> selectedState = new ArrayList<>();
        for (WebElement selectState : stateList) {
            if (selectState.getText().endsWith("k"))
                selectedState.add(selectState.getText());
             //   System.out.println(selectState.getText());
        }
          Assert.assertEquals(2, selectedState.size());
        }
          //Assert.assertTrue(currentStateEndsLater);



//        List<String> selectedState = new ArrayList<>();
//        selectedState.add("New York");
//        selectedState.add("New Brunswick");
//
//        Assert.assertEquals(2, selectedState.size());

    }



