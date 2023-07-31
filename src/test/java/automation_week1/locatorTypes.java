package automation_week1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;


public class locatorTypes extends BaseTestClass {

        @Test

        public void findLocatorById() {
            //accesare site
            driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/login/");
            //identificare element web dupa un anumit tip de locator -By Id
            WebElement checkBox = driver.findElement(By.id("rememberme"));
            //verificare
            Assert.assertFalse("Verify if check bos is selected ", checkBox.isSelected());
            // actiune
            checkBox.click();
            //verificare rezultatul actiunii
            Assert.assertTrue(checkBox.isSelected());

        }

        @Test

        public void findLocatorByClass () {
            driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/login/");
            WebElement searchBar = driver.findElement(By.className("search-field"));

            String actualPlaceholder = searchBar.getAttribute("placeholder");
          //  String expectedPlaceholder = "Search …";
            Assert.assertEquals( "Search …", actualPlaceholder);
        }

        @Test
        public void findLocatorByName () {
            driver.get( "https://testare-manuala.locdejoacapentruitsti.com/blog/login/");
            WebElement inputUsername = driver.findElement(By.name("log"));
            WebElement inputPassword = driver.findElement(By.name("pwd"));
            Assert.assertEquals("text", inputUsername.getAttribute("type"));
            Assert.assertEquals("passwor", inputPassword.getAttribute("type"));

        }

        @Test

        public void findElementByLinkText (){
            driver.get ("https://testare-manuala.locdejoacapentruitsti.com/blog/");

            //identificam elementul web dorit pe care vom face interogarea
            WebElement linkDecember = driver.findElement(By.linkText("December 2019"));

            //facem verificarea de care avem nevoie, verificam linkul din spatele textului afisat pe site
            Assert.assertEquals( "https://testare-manuala.locdejoacapentruitsti.com/blog/2019/12/", linkDecember.getAttribute("href"));
        }
        @Test
        public void findElementByPartialLinkText() {
            driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/");
            //caut elementul care contine "ber2018" -  find element identificat primul gasit care contine "ber 2018";

            WebElement firstBer2018 = driver.findElement(By.partialLinkText("ber 2018"));
            Assert.assertEquals("December 2018", firstBer2018.getText());

            List<WebElement> listaLinkuri = driver.findElements(By.partialLinkText("ber 2018"));

           // List<WebElement> listaLinkuri = (List<WebElement>) driver.findElement(By.partialLinkText("ber 2018"));

            int expectedResults = 3;

            Assert.assertEquals( expectedResults, listaLinkuri.size());

            Assert.assertEquals("December 2018", listaLinkuri.get(0).getText());
            Assert.assertEquals("November 2018", listaLinkuri.get(1).getText());
            Assert.assertEquals("October 2018", listaLinkuri.get(2).getText());


        }

        @Test

    public void findElementExpectedClass (){
            driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/login/");
            WebElement emailImput = driver.findElement(By.xpath("//*[@name='log']"));

            Assert.assertEquals( "", emailImput.getAttribute("value"));


            WebElement searchBox = driver.findElement(By.xpath("//*[@class='search-field']"));

            String actualPlaceholder = searchBox.getAttribute("placeholder");
            //  String expectedPlaceholder = "Search …";
            Assert.assertEquals( "Search …", actualPlaceholder);
        }

    }

