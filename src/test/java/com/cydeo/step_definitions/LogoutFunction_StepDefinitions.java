package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.LogoutPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class LogoutFunction_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();


    @Given("users log in with valid credentials")
    public void users_log_in_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        loginPage.username.sendKeys("hr1@cybertekschool.com");
        loginPage.password.sendKeys("UserUser");
        loginPage.loginButton.click();
//        Assert.assertTrue(dashboardPage.activityStream.isDisplayed());
    }
    @When("user can log out")
    public void user_can_log_out() {
        logoutPage.profileUsername.click();
        logoutPage.logout.click();
    }
    @Then("user ends up on the login page")
    public void user_ends_up_on_the_login_page() {
        String exp = "Authorization";
        String act = loginPage.authorization.getText();
        Assert.assertEquals(exp, act);
    }

    @Then("user can not go to the home page by clicking the step back button")
    public void user_can_not_go_to_the_home_page_by_clicking_the_step_back_button() {
        Driver.getDriver().navigate().back();

        String expectedTitle = "Authorization";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user close the open tabs")
    public void user_close_the_open_tabs() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('https://google.com','_blank');");

        BrowserUtils.switchWindowAndClose("azulcrm");

        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('https://qa.azulcrm.com/','_blank');");

        BrowserUtils.switchWindowAndClose("google");


    }
    @Then("user must be logged out")
    public void user_must_be_logged_out() {
        Assert.assertFalse(logoutPage.activityStream.isDisplayed());
    }



}
