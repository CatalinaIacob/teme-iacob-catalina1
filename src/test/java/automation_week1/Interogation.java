package automation_week1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import teme.util.ta_utils.BaseTestClass;

public class Interogation extends BaseTestClass {
    @Test
    public void Navigation () {
        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--remote-allow-arigins=*");
        WebDriver driver = new ChromeDriver(chrome);

        driver.navigate().to("https://www.wantsome.ro");

        String currentPageTitle = driver.getTitle(); //actual result
        String expectedTitle = "Wantsome - Academia prietenoasa de IT";

        if(currentPageTitle.equals(expectedTitle)) {
            System.out.println("True, the title is correct");
        } else{
            System.out.println("False, the title is defferent");
        }

    }
}
