package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
    public WebDriver driver;
    public LoginPagePOM(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username) {
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(username);
    }
    public void enterPassword(String password) {
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
    }

    public void clickLoginButton()
    {
        driver.findElement(By.xpath("//button[text()=' Sign in ']")).click();
    }

}
