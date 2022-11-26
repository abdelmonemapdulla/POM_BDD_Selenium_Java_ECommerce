package Stepdefs;

import PageObjectModel.HomePageObjectModel;
import PageObjectModel.LoginPageObjectModel;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginSteps {
    //Variables
    private WebDriver driver;
    HomePageObjectModel homePage;
    LoginPageObjectModel loginPage;



    @Given("User navigate to the website")
    public void user_navigate_to_the_website() {
       driver = new ChromeDriver();
       driver.navigate().to("https://demo.nopcommerce.com/");
       driver.manage().window().maximize();
    }
    @When("User navigates to login link")
    public void user_navigates_to_login_link() {
        homePage = new HomePageObjectModel(driver);
        homePage.clickOnLoginTab();
    }
    @And("user enters his login credentials")
    public void user_enters_his_login_credentials() {
        loginPage = new LoginPageObjectModel(driver);
        loginPage.enterEmail();
        loginPage.enterPassword();
    }
    @And("User clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage = new LoginPageObjectModel(driver);
        loginPage.clickOnLoginButton();
    }
    @Then("user logged in successfully")
    public void user_logged_in_successfully() {
        homePage = new HomePageObjectModel(driver);
        Assert.assertEquals(true,homePage.MyAccountDisplay());
    }

}
