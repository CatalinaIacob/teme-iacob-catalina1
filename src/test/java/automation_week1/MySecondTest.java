package automation_week1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import teme.util.ta_utils.BaseTestClass;

public class MySecondTest extends BaseTestClass {

    @Test
    public void WebsiteNavigation () {

        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chrome);

        driver.get("https://www.emag.ro/");
    }

    @Test

    public void WebsiteNavigation2 () {

        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chrome);

        driver.get("https://www.wantsome.ro/");

    }

    @Test

    public void WebsiteNavigation3 () {

        driver.navigate().to("https://www.wantsome.ro/");
    }
}
