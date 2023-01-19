package com.cydeo.step_definitions;

import com.cydeo.pages.Hasan_US1537_QuickNavigateTaskPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

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

//        int frameNumber = BrowserUtils.switchToIFrameWithElement(taskPage.messageBox);
//        System.out.println("frameNumber= " + frameNumber);


        Driver.getDriver().switchTo().frame(1);
        taskPage.messageBox.sendKeys("To do list");
        Driver.getDriver().switchTo().parentFrame();

    }

    @When("Add an employee name to the Responsible person section")
    public void add_an_employee_name_to_the_responsible_person_section() {
        taskPage.addMoreButton.click();
        taskPage.employeesAndDepartments.click();

        BrowserUtils.waitForVisibility(taskPage.addPeople,30);
        taskPage.addPeople.click();
        BrowserUtils.waitForVisibility(taskPage.addSecondPeople,30);

        taskPage.addSecondPeople.click();
    }

    @When("Click on the send button to send the task")
    public void click_on_the_send_button_to_send_the_task() {
        BrowserUtils.waitFor(2);

        taskPage.sendButton.click();
    }

    @When("Click the TASK on the left side menu")
    public void click_the_task_on_the_left_side_menu() {
        BrowserUtils.waitFor(3);

        BrowserUtils.waitForClickability(taskPage.taskLeftSide,30);
        taskPage.taskLeftSide.click();
    }

    @Then("Verify if the task is high priority")
    public void verify_if_the_task_is_high_priority() {

        taskPage.taskName.click();
        //Find the iframe number:
        int iframeNum = 5;

        List<WebElement> iframes = Driver.getDriver().findElements(By.tagName("iframe"));
        System.out.println("iframes.size() = " + iframes.size());
        for (int i=0; i<iframes.size(); i++){
            // Switch to each frame
            Driver.getDriver().switchTo().frame(i);
            // Check for the web element
            List<WebElement> elements = Driver.getDriver().findElements(By.id("task-detail-important-button"));
            if (elements.size() > 0){
                iframeNum = i;
                System.out.println("iframeNum = " + iframeNum);
                Assert.assertEquals("task-info-panel-important  mutable", taskPage.highPriorityCheck.getAttribute("class"));
            }

            // Switch back to the main page
            Driver.getDriver().switchTo().defaultContent();

        }
//        System.out.println("taskPage.highPriorityCheck.getAttribute(\"class\") = " + taskPage.highPriorityCheck.getAttribute("class"));
    }

    @Then("Verify the task is assigned more than one user")
    public void verify_the_task_is_assigned_more_than_one_user() {

        taskPage.taskName.click();

        //Find the iframe number:
        int iframeNum = 5;

        List<WebElement> iframes = Driver.getDriver().findElements(By.tagName("iframe"));
        System.out.println("iframes.size() = " + iframes.size());
        for (int i=0; i<iframes.size(); i++){
            // Switch to each frame
            Driver.getDriver().switchTo().frame(i);
            // Check for the web element
            List<WebElement> elements1 = Driver.getDriver().findElements(By.xpath("(//*[contains(@id, 'anchor_responsible')])[1]"));
            List<WebElement> elements2 = Driver.getDriver().findElements(By.xpath("//*[normalize-space()='marketing98@cybertekschool.com']"));
            if ((elements1.size() > 0) && (elements2.size() > 0)){
                iframeNum = i;
                System.out.println("iframeNum = " + iframeNum);
                Assert.assertTrue(taskPage.addPeopleCheck.isDisplayed());
                Assert.assertTrue(taskPage.addSecondPeopleCheck.isDisplayed());
            }

            // Switch back to the main page
            Driver.getDriver().switchTo().defaultContent();

        }
    }

    @And("Check task number")
    public void checkTaskNumber() {
        taskPage.taskLeftSide.click();
        countBefore = Integer.parseInt(taskPage.count.getText());

        taskPage.activityStream.click();
        taskPage.taskLink.click();

    }

    @Then("Verify that task is created under MY TASKS table")
    public void verifyThatTaskIsCreatedUnderMYTASKSTable() {
        countAfter = Integer.parseInt(taskPage.count.getText());


        Assert.assertNotEquals(countBefore, countAfter);
    }

    @And("Click Checklist link")
    public void clickChecklistLink() {
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

        Driver.getDriver().switchTo().frame(taskPage.checklistVerifyIframe);

        String expectedText = thingsToDo + " ";
        String actualText = taskPage.checkChecklistAdded.getText();

        Assert.assertEquals(expectedText, actualText);

    }

    @And("Add a deadline")
    public void addADeadline() {
        BrowserUtils.waitForClickability(taskPage.deadlineAdd,10);

        taskPage.deadlineAdd.click();

        taskPage.deadlineYear.click();
        BrowserUtils.waitForClickability(taskPage.selectYear,10);

        taskPage.selectYear.click();

        taskPage.deadlineMonth.click();
        BrowserUtils.waitForClickability(taskPage.selectMonth,10);

        taskPage.selectMonth.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForClickability(taskPage.selectDay,10);

        taskPage.selectDay.click();

        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(taskPage.selectHour).perform();
        taskPage.selectHour.sendKeys("07");
        taskPage.selectMinute.sendKeys("00");

        BrowserUtils.waitFor(2);
        taskPage.selectButton.click();

        BrowserUtils.waitFor(2);

    }
//
//    @Then("Verify that while creating a task deadline is added")
//    public void verifyThatWhileCreatingATaskDeadlineIsAdded() {
//        Driver.getDriver().navigate().refresh();
//
//        BrowserUtils.waitForClickability(taskPage.deadlineTask,20);
//        taskPage.deadlineTask.click();
//
//        Driver.getDriver().switchTo().frame(0);
//
//        BrowserUtils.waitFor(5);
//
//        String expectedText = "05/03/2023 07:00 pm";
//        String actualText = taskPage.checkDeadline.getText();
//        BrowserUtils.waitFor(5);
//
//        Assert.assertEquals(expectedText, actualText);
//    }

    @Then("Verify that while creating a task deadline is added")
    public void verifyThatWhileCreatingATaskDeadlineIsAdded() {
        Driver.getDriver().navigate().refresh();

        BrowserUtils.waitForClickability(taskPage.deadlineTask,20);
        taskPage.deadlineTask.click();

        //Find the iframe number:
        int iframeNum = 0;

        List<WebElement> iframes = Driver.getDriver().findElements(By.tagName("iframe"));
        System.out.println("iframes.size() = " + iframes.size());
        for (int i=0; i<iframes.size(); i++){
            // Switch to each frame
            Driver.getDriver().switchTo().frame(i);
            // Check for the web element
            List<WebElement> elements = Driver.getDriver().findElements(By.id("task-detail-deadline"));
            if (elements.size() > 0){
                iframeNum = i;
                System.out.println("iframeNum = " + iframeNum);

                String expectedText = "05/03/2023 07:00 pm";
                String actualText = taskPage.checkDeadline.getText();

                Assert.assertEquals(expectedText, actualText);
            }
            // Switch back to the main page
            Driver.getDriver().switchTo().defaultContent();

        }

    }

    @And("Click Time Planning link")
    public void clickTimePlanningLink() {
//        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.waitFor(2);
        taskPage.timePlanning.click();
        BrowserUtils.waitFor(2);
        taskPage.timePlanning.click();
    }

    @And("Add a start time")
    public void addAStartTime() {
        BrowserUtils.waitFor(5);

//        BrowserUtils.waitForClickability(taskPage.startTime,20);

        taskPage.startTime.click();

        taskPage.deadlineYear.click();
//        BrowserUtils.waitFor(2);
        BrowserUtils.waitFor(2);

//        BrowserUtils.waitForClickability(taskPage.selectYear,10);
        taskPage.selectYear.click();
//        BrowserUtils.waitFor(2);
        BrowserUtils.waitFor(2);

        taskPage.deadlineMonth.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForClickability(taskPage.selectMonth,20);

        taskPage.selectMonth.click();
        BrowserUtils.waitFor(2);

        taskPage.selectDay.click();

        taskPage.selectHour.sendKeys("09");
        taskPage.selectMinute.sendKeys("00");

//        BrowserUtils.waitFor(2);
        taskPage.selectButton.click();

//        BrowserUtils.waitFor(2);

    }


    @And("Add a duration {string} {string}")
    public void addADuration(String duration, String time) {
//        BrowserUtils.waitFor(3);

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

        taskPage.timePlanningTask.click();

        //Find the iframe number:
        int iframeNum = 0;

        List<WebElement> iframes = Driver.getDriver().findElements(By.tagName("iframe"));
        System.out.println("iframes.size() = " + iframes.size());
        for (int i=0; i<iframes.size(); i++){
            // Switch to each frame
            Driver.getDriver().switchTo().frame(i);
            // Check for the web element
            List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//*[text()='05/03/2023 09:00 am']"));
            if (elements.size() > 0){
                iframeNum = i;
                System.out.println("iframeNum = " + iframeNum);

                String expectedText = "05/03/2023 09:00 am";
                String actualText = taskPage.checkStartTimePlanningAdded.getText();
//                System.out.println("taskPage.checkStartTimePlanningAdded.getText() = " + taskPage.checkStartTimePlanningAdded.getText());
                Assert.assertEquals(expectedText, actualText);

            }
            // Switch back to the main page
            Driver.getDriver().switchTo().defaultContent();

        }

    }



}

