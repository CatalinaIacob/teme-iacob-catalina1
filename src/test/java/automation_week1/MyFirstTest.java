package automation_week1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyFirstTest {

    @Test

    public void WebsiteNavigation() {

        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chrome);

        driver.get("https://www.emag.ro/cart/products?ref=cart");


    }

    @Test
    public void WebsiteNavigation2() {
        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chrome);

        driver.navigate().to("https://www.wantsome.ro");
    }

}

