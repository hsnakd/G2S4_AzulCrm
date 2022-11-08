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










//
//    @Given("users on the login page")
//    public void users_on_the_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
//    }
//
//    @When("users type username {string}  as a {string}")
//    public void users_type_username_as_a(String username, String string2) {
//        loginPage.username.sendKeys(username);
//    }
//
//    @And("users type password {string}")
//    public void usersTypePassword(String password) {
//        loginPage.password.sendKeys(password);
//    }
//
//    @And("users click to the sign in button")
//    public void users_click_to_the_sign_in_button() {
//        loginPage.loginButton.click();
//    }
//
//    @Then("users on the dashboard page")
//    public void usersOnTheDashboardPage() {
//        Assert.assertTrue(loginPage.activityStream.isDisplayed());
//    }
//
//    @Then("users see the incorrect {string} displayed")
//    public void usersSeeTheIncorrectDisplayed(String expectedResult) {
//        String actualResult = loginPage.incorrectLoginMessage.getText();
//        Assert.assertEquals(expectedResult,actualResult);
//    }
//
//
//    @Then("users see the empty {string} displayed")
//    public void usersSeeTheEmptyDisplayed(String expectedResult) {
//        String actualResult = loginPage.incorrectLoginMessage.getText();
//        Assert.assertEquals(expectedResult,actualResult);
//    }
//
//
//    @When("users click forgot your password link")
//    public void usersClickForgotYourPasswordLink() {
//        loginPage.forgotPassword.click();
//    }
//
//    @Then("User land on the {string} page")
//    public void userLandOnThePage(String expectedResult) {
//        String actualResult = loginPage.getPassword.getText();
//        Assert.assertEquals(expectedResult,actualResult);
//    }
//
//    @When("users click remember me link")
//    public void usersClickRememberMeLink() {
//        loginPage.rememberMeLink.click();
//    }
//
//    @When("users check remember link exists")
//    public void usersCheckRememberLinkExists() {
//        Assert.assertTrue(loginPage.rememberMeLink.isDisplayed());
//    }
//
//    @Then("User should see the remember me link is clickable")
//    public void userShouldSeeTheRememberMeLinkIsClickable() {
//        Assert.assertFalse(loginPage.rememberMeCheckBox.isSelected());
//        loginPage.rememberMeCheckBox.click();
//        Assert.assertTrue(loginPage.rememberMeCheckBox.isSelected());
//    }
//
//    @Then("users should see the password in bullet signs")
//    public void usersShouldSeeThePasswordInBulletSigns() {
//        String expectedResult = "password";
//        String actualResult = (loginPage.password.getAttribute("type"));
//        Assert.assertEquals(expectedResult,actualResult);
//    }
//
//
//    @And("users hit enter to login")
//    public void usersHitEnterToLogin() {
//        loginPage.password.sendKeys("" + Keys.ENTER);
//    }
//
//    @Then("users can see their own {string} in the profile menu")
//    public void usersCanSeeTheirOwnInTheProfileMenu(String expectedResult) {
//        String actualResult = loginPage.profileUsername.getText();
//        Assert.assertEquals(expectedResult,actualResult);
//    }
}
