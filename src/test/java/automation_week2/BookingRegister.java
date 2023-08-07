package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;

public class BookingRegister extends BaseTestClass {

    @Test
    public void VerifyRegisterSection() {
        driver.get("http://138.68.69.185/");
        WebElement registerButton = driver.findElement(By.xpath("//div[text() = 'Register']"));
        registerButton.click();

        WebElement createAccountPage = driver.findElement(By.xpath("//div[text() = 'Create a new account!']"));
        Assert.assertEquals("The page is not found.", "Create a new account!", createAccountPage.getText());

        WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder = 'Enter your First Name']"));
        firstNameField.sendKeys("Miki");

        WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder = 'Enter your Last Name']"));
        lastNameField.sendKeys("Mimi");

        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder = 'Enter your email']"));
        emailField.sendKeys("mimi@miki.ro");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder = 'Enter your password']"));
        password.sendKeys("Mimi1234");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@placeholder = 'Confirm password']"));
        confirmPassword.sendKeys("Mimi1234");

//        WebElement countryDropDown = driver.findElement(By.xpath("//div[@class='css-ackcql']"));
//        Select countryDropDown = new Select(countryDropDown);
//        countryDropDown.selectByIndex(3);
////sau
//        List<WebElement> dropDownOption = countryDropDown.getOptions();
//        boolean isRomaniaFound = false;
//        for (WebElement currentCountryFromDD :dropDownOption) {
//            if(currentCountryFromDD.getText().equals("Romania")) {
//                isRomaniaFound = true;
//                break;
//            }
//        }
//        Assert.assertTrue("Romania is not part of the list", isRomaniaFound);
        //nu am reusit sa gasesc o varianata uica de identificare pentru DropDownCountry

        WebElement register = driver.findElement(By.xpath("//button[text() = 'Register']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", register);
        register.click();

        WebElement myAccount = driver.findElement(By.xpath("//div[text() = 'My account']"));
        Assert.assertEquals("Account is not register.", "My account", myAccount.getText());

        //cod eroare 500

    }
}
