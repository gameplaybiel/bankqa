package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Métodos para interagir com elementos da página
    public void enterUsername(String username){
        WebElement usernameField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("username"))
        );
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password){
        WebElement passwordField = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("password"))
    );
    passwordField.clear();
    passwordField.sendKeys(password);
    }

    public void clickLogin(){
        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("loginBtn"))
        );
        loginButton.click();
    }
}
