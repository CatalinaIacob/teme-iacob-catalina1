package automation_week1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import teme.util.ta_utils.BaseTestClass;


    public class GetSours extends BaseTestClass {
        @Test
        public void MyTest(){
            ChromeOptions chrome = new ChromeOptions();
            chrome.addArguments("--remote-allow-origins=*");

            WebDriver driver = new ChromeDriver(chrome);

            driver.navigate().to("https://www.wantsome.ro/");
       String codSursa = driver.getPageSource(); //get aduce mereu informatiile prezente in acel momemnt pe site//actual result
            System.out.println("codul sursa este:  " + codSursa);

            String expectedText = " Vezi cum te înscrii la Wantsome!";
            boolean pageSourceContainText = codSursa.contains(expectedText);

            System.out.println(pageSourceContainText);

            Assert.assertEquals(  true, pageSourceContainText);

            Assert.assertTrue( pageSourceContainText);
        }
    }


