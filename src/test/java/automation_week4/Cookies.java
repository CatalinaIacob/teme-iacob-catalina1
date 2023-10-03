package automation_week4;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.RemoteWebDriver;
import teme.util.ta_utils.BaseTestClass;

import java.beans.Transient;

public class Cookies extends BaseTestClass {

    @Test
    public void cookieTest() {
        driver.get("https://automationexercise.com/");
        driver.manage().addCookie(new Cookie("Session ID", "386bc09e8f4f2e025eddae123f36f6263096ae49"));
        driver.navigate().refresh();

//        String sesionID = ((RemoteWebDriver)driver).getSessionId().toString();
//        System.out.println("Current session ID is: " + sesionID);
    }
}
