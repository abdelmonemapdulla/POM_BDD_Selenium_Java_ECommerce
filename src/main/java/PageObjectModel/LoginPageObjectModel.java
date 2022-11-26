package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjectModel {
    //Variables
    private WebDriver driver;

    //Constructor
    public LoginPageObjectModel(WebDriver driver){this.driver=driver;}

    //Locators
    private By EmailInputField(){return By.id("Email");}
    private By PasswordInputField(){return By.id("Password");}
    private By LoginButton(){return By.xpath("//button[@class='button-1 login-button']");}

    //Methods
    public void enterEmail(){driver.findElement(EmailInputField()).sendKeys("abdelmonemapdulla@gmail.com");}
    public void enterPassword(){driver.findElement(PasswordInputField()).sendKeys("Test123");}
    public void clickOnLoginButton(){driver.findElement(LoginButton()).click();}

}
