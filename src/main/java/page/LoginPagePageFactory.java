package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPagePageFactory {
    public WebDriver driver;

    // NEW COMMENT ADDED FOR GIT UNSTAGE TO STAGE > COMMIT AND PUSH

    public LoginPagePageFactory(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='VendorGrid']/div[2]/div[4]/div[3]/div[1]/div/div[2]")
    public List<WebElement> allVendorsSubmitted;

    @FindBy(css="input[name='email']")
    WebElement emailid;

    @FindBy(css = "input[name='password']")
    WebElement pass;

    @FindBy(xpath = "//button[text()=' Sign in ']")
    WebElement signinbtn;


    public void loginintoapplication(String emailadd, String passd) {
        pass.sendKeys(passd);
        emailid.sendKeys(emailadd);
        signinbtn.click();
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
