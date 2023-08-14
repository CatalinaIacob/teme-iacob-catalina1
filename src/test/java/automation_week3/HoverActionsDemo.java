package automation_week3;

import org.graalvm.compiler.lir.LIRInstruction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import teme.util.ta_utils.BaseTestClass;

public class HoverActionsDemo extends BaseTestClass {

    @Test
    public void hoverTest() {

        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/login/");

        WebElement titlePage = driver.findElement(By.linkText("My CMS"));

        String initialColor = titlePage.getCssValue("color"); //gri inchis

        String expectedColor = concertCodesToString("48, 48, 48", "1");


        System.out.println("The initial color is: " + initialColor);
        Assert.assertEquals(expectedColor, initialColor);

        //(are, 10, teme)->Cursantul are 10 teme.

        Actions hover = new Actions(driver);
        Action mouseOver = hover.moveToElement(titlePage).build();
        mouseOver.perform();

        String hoverColor = titlePage.getCssValue("color");

        String hoverColorExpected = concertCodesToString("238, 51, 51", "1");
        Assert.assertEquals(hoverColorExpected, hoverColor);

        String fraza =  temeCursant("are", "10", "teme");
        System.out.println(temeCursant("are", "10", "teme" ));

    }

    private String concertCodesToString(String colorCodes, String number) {
        return "rgba("+colorCodes + ", " + number + ")";

        //condittie trecuta la finalul testului daca vreau sa o lfolosesc doar in acest test
        //return tipe -> convert code to string sau altceva ce am nevoie in acel test
        //parametru/argument
    }

    private String temeCursant(String actiune, String numar, String teme){
        return "Cursantul"+ " " +actiune + " " + numar+ " " + teme + ". ";
    }

}
//metode:text,contains, atuni folosim ()
// //p[contains( tex t(), 'prctice')]