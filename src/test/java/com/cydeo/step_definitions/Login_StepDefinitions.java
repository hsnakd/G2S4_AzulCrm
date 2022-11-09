package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("users log in with valid credentials as a {string}")
    public void usersLogInWithValidCredentialsAsA(String userType) {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        if (userType.equalsIgnoreCase("hr")) {
            loginPage.username.sendKeys(ConfigurationReader.getProperty("hr.username"));
            loginPage.password.sendKeys(ConfigurationReader.getProperty("hr.password"));
        } else if (userType.equalsIgnoreCase("marketing")) {
            loginPage.username.sendKeys(ConfigurationReader.getProperty("marketing.username"));
            loginPage.password.sendKeys(ConfigurationReader.getProperty("marketing.password"));
        } else if (userType.equalsIgnoreCase("helpdesk")) {
            loginPage.username.sendKeys(ConfigurationReader.getProperty("helpdesk.username"));
            loginPage.password.sendKeys(ConfigurationReader.getProperty("helpdesk.password"));
        }
        loginPage.loginButton.click();
        Assert.assertTrue(loginPage.activityStream.isDisplayed());
    }
}
