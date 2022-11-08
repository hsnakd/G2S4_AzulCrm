package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.LogoutPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginFunction_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();


    @Given("users on the login page")
    public void users_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }

    @When("users type username {string}  as a {string}")
    public void users_type_username_as_a(String username, String string2) {
        loginPage.username.sendKeys(username);
    }

    @And("users type password {string}")
    public void usersTypePassword(String password) {
        loginPage.password.sendKeys(password);
    }

    @And("users click to the sign in button")
    public void users_click_to_the_sign_in_button() {
        loginPage.loginButton.click();
    }

    @Then("users on the dashboard page")
    public void usersOnTheDashboardPage() {
        Assert.assertTrue(logoutPage.activityStream.isDisplayed());
    }

    @Then("users see the incorrect {string} displayed")
    public void usersSeeTheIncorrectDisplayed(String expectedResult) {
        String actualResult = loginPage.incorrectLoginMessage.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


    @Then("users see the empty {string} displayed")
    public void usersSeeTheEmptyDisplayed(String expectedResult) {
        String actualResult = loginPage.incorrectLoginMessage.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


    @When("users click forgot your password link")
    public void usersClickForgotYourPasswordLink() {
        loginPage.forgotPassword.click();
    }

    @Then("User land on the {string} page")
    public void userLandOnThePage(String expectedResult) {
        String actualResult = loginPage.getPassword.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("users click remember me link")
    public void usersClickRememberMeLink() {
        loginPage.rememberMeLink.click();
    }

    @When("users check remember link exists")
    public void usersCheckRememberLinkExists() {
        Assert.assertTrue(loginPage.rememberMeLink.isDisplayed());
    }

    @Then("User should see the remember me link is clickable")
    public void userShouldSeeTheRememberMeLinkIsClickable() {
        Assert.assertFalse(loginPage.rememberMeCheckBox.isSelected());
        loginPage.rememberMeCheckBox.click();
        Assert.assertTrue(loginPage.rememberMeCheckBox.isSelected());
    }

    @Then("users should see the password in bullet signs")
    public void usersShouldSeeThePasswordInBulletSigns() {
        String expectedResult = "password";
        String actualResult = (loginPage.password.getAttribute("type"));
        Assert.assertEquals(expectedResult,actualResult);
    }


    @And("users hit enter to login")
    public void usersHitEnterToLogin() {
        loginPage.password.sendKeys("" + Keys.ENTER);
    }

    @Then("users can see their own {string} in the profile menu")
    public void usersCanSeeTheirOwnInTheProfileMenu(String expectedResult) {
       String actualResult = logoutPage.profileUsername.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

}
