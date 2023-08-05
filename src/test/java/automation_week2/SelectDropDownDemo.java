package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;

public class SelectDropDownDemo extends BaseTestClass {

    /*1. Verify that the default selected option is "Country...".
    2. Check that Romania is present.
    3. Check that the last option is Zimbabwe.
    4. Check that there are no countries starting with X.
    */

    @Test
    public void selectSingleDropDownPractice() {
        driver.get("https://www.mediacollege.com/internet/samples/html/country-list.html");

        WebElement countryElement = driver.findElement(By.name("country"));
        Select countryDropDown = new Select(countryElement); //am identificat DD
        //il declaram separt printr-o variabila intermediara
        String defaultValue = countryDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals("The default value is not correct", "Country...", defaultValue );

        //2. Check that Romania is present.
        //Get the list of countries

        List<WebElement> dropDownOption = countryDropDown.getOptions();
        //creem o variabila de tip boolean care sa stocheze rezultatul foreach-ului

        boolean isRomaniaFound = false;
        //variabila(sincron cu tipul de data din interirul listei):lista
        for (WebElement currentCountryFromDD :dropDownOption) {
            if(currentCountryFromDD.getText().equals("Romania")) {
                isRomaniaFound = true;
                break;
            }
        }
        Assert.assertTrue("Romania is not part of the list", isRomaniaFound);

        //3. Check that the last option is Zimbabwe.

        int lastDDIndex = dropDownOption.size() -1; //indexul

        String lastCountryName = dropDownOption.get(lastDDIndex).getText();
        Assert.assertEquals("Zimbabue is not on the list", "Zimbabwe", lastCountryName);

        //  4. Check that there are no countries starting with X.

         boolean existsCountryStartsWithX = false;

        for (WebElement currentCountry: dropDownOption) {
            if (currentCountry.getText().startsWith("X")) {
            existsCountryStartsWithX = true;
            break;
        }
        }
        Assert.assertFalse("There are countries starting with x", existsCountryStartsWithX);
       // Assert.assertTrue("There are countries starting with x", !existsCountryStartsWithX); ! negarea metodei

    }

}
