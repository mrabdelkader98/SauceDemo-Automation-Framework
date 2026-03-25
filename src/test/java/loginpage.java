import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
    WebDriver driver;
    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
By productsTitle = By.xpath("//*[text()='Products']");
By errorMessage = By.xpath("//*[@data-test='error']");
    public loginpage(WebDriver driver){this.driver=driver;}
public void EnterUserName (String user){driver.findElement(username).sendKeys(user);};
public void EnterPassword (String pass){driver.findElement(password).sendKeys(pass);};
public void ClickLoginBtn (){driver.findElement(loginBtn).click();};
    public boolean isProductsTitleDisplayed() {
        return driver.findElement(productsTitle).isDisplayed();
    }
    public String getErrorMessageText(){
        return driver.findElement(errorMessage).getText();
    }
}
