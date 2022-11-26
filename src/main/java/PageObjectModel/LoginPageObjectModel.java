package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

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
    public void enterEmail() throws IOException {
        Properties loginInfo = new Properties();
        FileReader reader=new FileReader("config/loginInfo.properties");
        loginInfo.load(reader);
        loginInfo.getProperty("Email");
        driver.findElement(EmailInputField()).sendKeys(loginInfo.getProperty("Email"));}
    public void enterPassword() throws IOException {
        Properties loginInfo = new Properties();
        FileReader reader=new FileReader("config/loginInfo.properties");
        loginInfo.load(reader);
        loginInfo.getProperty("Password");
        driver.findElement(PasswordInputField()).sendKeys(loginInfo.getProperty("Password"));}
    public void clickOnLoginButton(){driver.findElement(LoginButton()).click();}

}
