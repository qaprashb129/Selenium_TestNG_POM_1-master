// LoginTest.java

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPagePOM;
import page.LoginPagePageFactory;

public class LoginTest {
    private WebDriver driver;
    private LoginPagePageFactory loginPagePageFactory;
    private LoginPagePOM loginPagePOM;

    @BeforeMethod
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://20.197.24.53:9011/TracesenseDBSWeb/");
        loginPagePageFactory = new LoginPagePageFactory(driver);
        loginPagePOM = new LoginPagePOM(driver);
    }

    @Test(enabled = true)
    public void loginTestWithPagefactory() {

        loginPagePageFactory.loginintoapplication("mallil@winjit.com","Admin@123");

    }

    @Test(enabled = true)
    public void loginTestwithPOM() {

        loginPagePOM.enterUsername("mallil@winjit.com");
        loginPagePOM.enterPassword("Admin@123");
        loginPagePOM.clickLoginButton();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
