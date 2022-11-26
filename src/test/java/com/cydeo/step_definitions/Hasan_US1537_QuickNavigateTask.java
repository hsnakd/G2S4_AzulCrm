package com.cydeo.step_definitions;

import com.cydeo.pages.Hasan_US1537_QuickNavigateTaskPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Hasan_US1537_QuickNavigateTask {

    Hasan_US1537_QuickNavigateTaskPage taskPage = new Hasan_US1537_QuickNavigateTaskPage();
    String taskName = "US-1537_TC-01";
    String thingsToDo = "US-1537 TC-04 Things To Do";
    int countBefore;
    int countAfter;


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
        taskPage.messageBox.sendKeys("To do list");
    }

    @When("Add an employee name to the Responsible person section")
    public void add_an_employee_name_to_the_responsible_person_section() throws InterruptedException {
        Driver.getDriver().switchTo().parentFrame();

        taskPage.addMoreButton.click();
        BrowserUtils.waitFor(1);
        taskPage.addPeople.click();
        BrowserUtils.waitFor(1);
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

        taskPage.taskName.click();
        Driver.getDriver().switchTo().frame(2);
        BrowserUtils.waitFor(5);

        Assert.assertEquals("High Priority", taskPage.highPriorityCheck.getText());
    }

    @Then("Verify the task is assigned more than one user")
    public void verify_the_task_is_assigned_more_than_one_user() {
        taskPage.taskName.click();

        BrowserUtils.waitFor(2);

        Driver.getDriver().switchTo().frame(2);

        String expectedPeopleCheck = "helpdesk1@cybertekschool.com";
        String actualPeopleCheck = taskPage.addPeopleCheck.getText();

        String expectedSecondPeopleCheck = "marketing99@cybertekschool.com";
        String actualSecondPeopleCheck = taskPage.addSecondPeopleCheck.getText();

        BrowserUtils.waitFor(2);

        Assert.assertEquals(expectedPeopleCheck, actualPeopleCheck);

        BrowserUtils.waitFor(5);

        Assert.assertEquals(expectedSecondPeopleCheck, actualSecondPeopleCheck);


    }


    @And("Check task number")
    public void checkTaskNumber() {
        taskPage.taskLeftSide.click();
        countBefore = Integer.parseInt(taskPage.count.getText());

        BrowserUtils.waitFor(2);
        taskPage.activityStream.click();
        BrowserUtils.waitFor(2);
        taskPage.taskLink.click();

    }

    @Then("Verify that task is created under MY TASKS table")
    public void verifyThatTaskIsCreatedUnderMYTASKSTable() {
        countAfter = Integer.parseInt(taskPage.count.getText());
//        System.out.println("countBefore = " + countBefore);
//        System.out.println("countAfter = " + countAfter);
        BrowserUtils.waitFor(5);

        Assert.assertNotEquals(countBefore, countAfter);
    }

    @And("Click Checklist link")
    public void clickChecklistLink() {
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.waitFor(3);
        taskPage.checkList.click();
    }

    @And("Write a message in the checklist box")
    public void writeAMessageInTheChecklistBox() {
        taskPage.checklistThingsToDo.sendKeys(thingsToDo);
    }

    @And("Click add link")
    public void clickAddLink() {
        taskPage.checklistAdd.click();
    }

    @Then("Verify that while creating a task checklist is added")
    public void verifyThatWhileCreatingATaskChecklistIsAdded() {
        BrowserUtils.waitFor(5);

        taskPage.checklistTask.click();

        Driver.getDriver().switchTo().frame(1);

        BrowserUtils.verifyElementDisplayed(taskPage.checkChecklistAdded);

        String expectedText = thingsToDo + " ";
        String actualText = taskPage.checkChecklistAdded.getText();
        BrowserUtils.waitFor(5);

        Assert.assertEquals(expectedText, actualText);
    }

    @And("Add a deadline")
    public void addADeadline() {
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.waitFor(2);

        taskPage.deadlineAdd.click();
        BrowserUtils.waitFor(2);

        taskPage.deadlineYear.click();
        BrowserUtils.waitFor(2);

        taskPage.selectYear.click();
        BrowserUtils.waitFor(2);

        taskPage.deadlineMonth.click();
        BrowserUtils.waitFor(2);

        taskPage.selectMonth.click();
        BrowserUtils.waitFor(2);

        taskPage.selectDay.click();

//        taskPage.selectTime.click();

        BrowserUtils.waitFor(2);
        taskPage.selectButton.click();

        BrowserUtils.waitFor(2);

    }

    @Then("Verify that while creating a task deadline is added")
    public void verifyThatWhileCreatingATaskDeadlineIsAdded() {
        BrowserUtils.waitFor(2);
        taskPage.deadlineTask.click();
        BrowserUtils.waitFor(2);

        Driver.getDriver().switchTo().frame(1);

        BrowserUtils.waitFor(2);

        String expectedText = "05/03/2023 07:00 pm";
        String actualText = taskPage.checkDeadline.getText();
        BrowserUtils.waitFor(5);

        Assert.assertEquals(expectedText, actualText);
    }

    @And("Click Time Planning link")
    public void clickTimePlanningLink() {
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.waitFor(2);
        taskPage.timePlanning.click();
        BrowserUtils.waitFor(2);
        taskPage.timePlanning.click();
    }

    @And("Add a start time")
    public void addAStartTime() {

        taskPage.startTime.click();

        taskPage.deadlineYear.click();
        BrowserUtils.waitFor(2);

        taskPage.selectYear.click();
        BrowserUtils.waitFor(2);

        taskPage.deadlineMonth.click();
        BrowserUtils.waitFor(2);

        taskPage.selectMonth.click();
        BrowserUtils.waitFor(2);

        taskPage.selectDay.click();

//        taskPage.selectTime.click();

        BrowserUtils.waitFor(2);
        taskPage.selectButton.click();

        BrowserUtils.waitFor(2);

    }


    @And("Add a duration {string} {string}")
    public void addADuration(String duration, String time) {
        BrowserUtils.waitFor(3);

        if (time.equalsIgnoreCase("days")) {
            taskPage.durationTime.sendKeys(duration);
        }else if (time.equalsIgnoreCase("hours")) {
            taskPage.durationHours.click();
            taskPage.durationTime.sendKeys(duration);
        }else if (time.equalsIgnoreCase("minutes")) {
            taskPage.durationMins.click();
            taskPage.durationTime.sendKeys(duration);
        }
    }

    @Then("Verify that while creating a task time planning is added")
    public void verifyThatWhileCreatingATaskTimePlanningIsAdded() {
        BrowserUtils.waitFor(1);
        taskPage.timePlanningTask.click();
        BrowserUtils.waitFor(2);

        Driver.getDriver().switchTo().frame(2);

        BrowserUtils.waitFor(2);

        String expectedText = "05/03/2023 09:00 am";
        String actualText = taskPage.checkStartTimePlanningAdded.getText();
        BrowserUtils.waitFor(5);

        Assert.assertEquals(expectedText, actualText);
    }


}

