package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;

import static org.junit.Assert.assertFalse;

public class DropDownPractice extends BaseTestClass {

    /*
            1. Navigate to the site: https://www.mediacollege.com/internet/samples/html/state-list.html
            2. Check that Arizona is present.
            3. Check if the list contains at least one state ending with “k”.
    */
    @Test
    public void VerifyDropDownFunctionality () {

        driver.get("https://www.mediacollege.com/internet/samples/html/state-list.html");

       // 2. Check that Arizona is present.

        WebElement stateElement = driver.findElement(By.name("state"));
        Select countryDropDown = new Select(stateElement);

        List<WebElement> dropDownOption = countryDropDown.getOptions();
        boolean isArizonaPresent = false;

        for (WebElement currentCountryFromDD : dropDownOption) {
            if (currentCountryFromDD.getText().equals("Arizona")) {
                isArizonaPresent = true;
                break;

            }
        }
        Assert.assertTrue("Arizona is not present on the list", isArizonaPresent);

      //  3. Check if the list have the last state ending with “k”.

        int lastDDIndex = dropDownOption.size() -1;
        String lastCountryName = dropDownOption.get(lastDDIndex).getText();

        boolean lastCountryEndsWithK = false;
        for (WebElement currentCountry: dropDownOption) {
            if (currentCountry.getText().endsWith("k")) {
                lastCountryEndsWithK = true;
                break;
            }

            Assert.assertFalse("The last country ends with K", lastCountryEndsWithK);
        }
    }
}
