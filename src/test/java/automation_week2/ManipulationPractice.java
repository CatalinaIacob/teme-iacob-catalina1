package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class ManipulationPractice extends BaseTestClass {

    /*
     * Navigate to https://www.saucedemo.com/
     * Perform the login by filling in the username and password and clicking the login button
     * Verify if the login action is redirecting the user to the products' page
     * From the products page add the first item to the cart
     * Go to the cart page
     * Assert that the product is present on the cart page
     */
    private final String  CART_PAGE_TITLE = "Your Cart";
    @Test
    public void manipulationPracticeTest(){

        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type = 'submit']"));

        loginButton.click();

        WebElement productsPageTitle = driver.findElement(By.className("title"));

        Assert.assertEquals( "Invalid login.", "Products", productsPageTitle.getText());

        WebElement addToCart= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();

        WebElement removeButton = driver.findElement(By.xpath("//button[text() = 'Remove']"));

        Assert.assertEquals("Add to card invalid.", "Remove", removeButton.getText());

        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();

        WebElement cartPageTitle = driver.findElement(By.xpath("//span[text() = 'Your Cart']"));
        Assert.assertEquals("Wrong page!", CART_PAGE_TITLE, cartPageTitle.getText());

        WebElement continueShoppingOption = driver.findElement(By.id("continue-shopping"));
        Assert.assertEquals("The option is not displayed", "Continue Shopping", continueShoppingOption.getText());

        WebElement productFromCart = driver.findElement(By.className("inventory_item_name"));
        Assert.assertEquals("The product is not displayd", "Sauce Labs Backpack", productFromCart.getText());
    }
}
