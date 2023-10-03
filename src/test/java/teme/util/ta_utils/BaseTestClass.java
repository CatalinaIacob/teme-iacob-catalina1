package teme.util.ta_utils;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTestClass {
    public WebDriver driver;

    @Before
    public void setUpTest() {
        //   System.setProperty("webdriver.chrome.driver", DriversPath.getDriverDirPath() + "chromedriver" + DriversPath.getDriverExtension());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        if (SystemUtils.IS_OS_WINDOWS) {
            driver.manage().window().maximize();
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
