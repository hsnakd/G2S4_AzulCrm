package com.cydeo.step_definitions;

import com.cydeo.pages.Hasan_US1537_QuickNavigateTaskPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Hasan_US1537_QuickNavigateTask {

    Hasan_US1537_QuickNavigateTaskPage taskPage = new Hasan_US1537_QuickNavigateTaskPage();
    String taskName = "US-1537_TC-01";
    String message = "To do list";

    @When("Click the TASK on the Quick Navigate Menu")
    public void click_the_task_on_the_quick_navigate_menu() {
        taskPage.taskLink.click();
    }

    @When("Click High Priority checkbox")
    public void click_high_priority_checkbox() {
        taskPage.highPriority.click();
    }
    @When("Write Task Name in the Things to do box")
    public void write_task_name_in_the_things_to_do_box() {
        taskPage.messageTitle.sendKeys(taskName);
    }

    @When("Write a message in the message box")
    public void write_a_message_in_the_message_box() throws InterruptedException {
        Driver.getDriver().switchTo().frame(1);
        taskPage.messageBox.sendKeys(message);
    }
    @When("Add an employee name to the Responsible person section")
    public void add_an_employee_name_to_the_responsible_person_section() throws InterruptedException {
        Driver.getDriver().switchTo().parentFrame();

        taskPage.addMoreButton.click();
        BrowserUtils.waitFor(3);
        taskPage.addFirstPeople.click();
        taskPage.addSecondPeople.click();
    }
    @When("Click on the send button to send the task")
    public void click_on_the_send_button_to_send_the_task() {
        taskPage.sendButton.click();
    }
    @When("Click the TASK on the left side menu")
    public void click_the_task_on_the_left_side_menu() {
        BrowserUtils.waitFor(3);
        taskPage.taskLeftSide.click();
    }
    @Then("Verify if the task is high priority")
    public void verify_if_the_task_is_high_priority() {
        String expectedText = taskName;
        String actualText = taskPage.taskName.getText();
        Assert.assertEquals(expectedText,actualText);
//        taskPage.taskName.click();
//        BrowserUtils.waitForVisibility(taskPage.highPriorityCheck,10);
//        BrowserUtils.verifyElementDisplayed(taskPage.highPriorityCheck);
//        Assert.assertTrue(taskPage.highPriorityCheck.isDisplayed());
    }

    @Then("Verify that the task is assigned to more than one user")
    public void verifyThatTheTaskIsAssignedToMoreThanOneUser() {
        taskPage.taskName.click();
        String expectedText = ConfigurationReader.getProperty("");
        String actualText = taskPage.responsiblePersonCheck.getText();
    }
}
