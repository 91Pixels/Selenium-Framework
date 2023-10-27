package TestPages;

import WebPages.LogInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

    WebDriver driver;
    LogInPage loginPage;

    @Before
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        loginPage = new LogInPage(driver);
    }

    @Test
    public void testLogin() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickLogin();
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
