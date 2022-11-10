package com.cydeo.step_definitions;

import com.cydeo.pages.Oguz_US1531_AddingMessagePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Oguz_US1531_AddingMessage {
    Oguz_US1531_AddingMessagePage messagePage = new Oguz_US1531_AddingMessagePage();

    //----AC1-------------------------------------------------------

    @When("user remove All employees that writing by default")
    public void user_remove_all_employees_that_writing_by_default() {
        messagePage.allEmployeesCross.click();
    }
    @When("user click the mention button")
    public void user_click_the_button() {
        messagePage.mentionBtn.click();
    }
    @When("user click the Employees and department button")
    public void user_click_the_employees_and_department_button() {
       // BrowserUtils.sleep(3);
        messagePage.addEmployeesAndDepartments.click();
    }
    @When("user click group2.2")
    public void user_click() {
        messagePage.group2_2.click();
    }


    @And("user select any user")
    public void userSelectAnyUser() {
       // BrowserUtils.sleep(2);
        messagePage.helpdesk1.click();
    }

    @Then("user should see selected user in the message body")
    public void userShouldSeeSelectedUserInTheMessageBody() {
        messagePage.helpdesk1InBody.isDisplayed();
    }

    //---AC2---------------------------------------------------------------


    
    
}
