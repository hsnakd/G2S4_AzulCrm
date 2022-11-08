package com.cydeo.step_definitions;

import com.cydeo.pages.Hasan_US1537_QuickNavigateTaskPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hasan_US1537_QuickNavigateTask {

    Hasan_US1537_QuickNavigateTaskPage taskPage = new Hasan_US1537_QuickNavigateTaskPage();

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
        taskPage.messageTitle.sendKeys("US-1537 / TC-01");
    }
    @When("Write a message in the message box")
    public void write_a_message_in_the_message_box() throws InterruptedException {
//        Driver.getDriver().switchTo().frame(taskPage.bxEditorIframe);
        taskPage.messageBox.sendKeys("To do list");
        Thread.sleep(5000);
    }
    @When("Add an employee name to the Responsible person section")
    public void add_an_employee_name_to_the_responsible_person_section() {

    }
    @When("Click on the send button to send the task")
    public void click_on_the_send_button_to_send_the_task() {

    }
    @When("Click the TASK on the left side menu")
    public void click_the_task_on_the_left_side_menu() {

    }
    @Then("Verify if the task is high priority")
    public void verify_if_the_task_is_high_priority() {

    }
}
