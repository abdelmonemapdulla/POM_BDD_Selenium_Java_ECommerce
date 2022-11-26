package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjectModel {
    //Variables
    private WebDriver driver;

    //Constructor
    public HomePageObjectModel(WebDriver driver){this.driver=driver;}

    //Locators
    private By loginTab(){return By.cssSelector(".ico-login");}
    private By MyAccountTab(){return By.linkText("My account");}

    //Methods
    public void clickOnLoginTab(){driver.findElement(loginTab()).click();}
    public boolean MyAccountDisplay(){return (driver.findElement(MyAccountTab()).isEnabled());}





}
