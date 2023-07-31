package automation_week1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import teme.util.ta_utils.BaseTestClass;

public class Interogation22 extends BaseTestClass {
    @Test

    public void Navigation () {

        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chrome);
        driver.navigate().to("https://www.wantsome.ro/");

        String currentPageTitle = driver.getTitle(); //actual result
        String expextedTitle = "Wantsome - Academia prietenoasă de IT - Cursuri IT România";

        //        if (currentPageTitle.equals(expextedTitle)) {
        //            System.out.println("True, the title is correct");
        //        } else {
        //            System.out.println("False, the title is different");
        //        }

        //        Assert.assertEquals(expected, actual);
        //        Assert.assertEquals(message, expected, actual);

        Assert.assertEquals("Testul meu",  expextedTitle, currentPageTitle);
//navigate to course page
        driver.navigate().to("https://wantsome.ro/cursuri/curs-de-introducere-in-programare/");
        String actualCourseTitle =  driver.getTitle();

        String expectedCourseTitle = "Curs de Introducere în Programare - Wantsome";

        Assert.assertEquals( expectedCourseTitle, actualCourseTitle);

        //back

        driver.navigate().back();
//        // varianta 1 fie iau titlul din nou si il reactualizez
//        currentPageTitle = driver.getTitle();
//        Assert.assertEquals(expextedTitle, currentPageTitle);
//
        //varianata 2 fac un assert, in care iau expected si actual cu get title
        Assert.assertEquals(expextedTitle, driver.getTitle());

        //forward

        driver.navigate().forward();
        Assert.assertEquals(expectedCourseTitle, driver.getTitle());

        //refresh

        driver.navigate().refresh();
        Assert.assertEquals(expectedCourseTitle, driver.getTitle());
    }
}

