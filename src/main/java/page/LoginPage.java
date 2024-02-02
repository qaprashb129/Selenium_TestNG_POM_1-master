package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath("//button[text()=' Sign in ']")).click();
    }
}
