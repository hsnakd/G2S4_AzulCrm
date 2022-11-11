package com.cydeo.step_definitions;

import com.cydeo.pages.Hasan_US1537_QuickNavigateTaskPage;
import com.cydeo.pages.Nuri_US1533_PollPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.AnnotatedType;
import java.util.List;

public class Nuri_US1533_Poll_StepDefinitions {

    //@TC1
    //[US007]-[AZLC-1533]-[AC1]-[TC1]
    Nuri_US1533_PollPage pollPage = new Nuri_US1533_PollPage();

    @Given("click on the poll tab on the tab-menu")
    public void click_on_the_poll_tab_on_the_tab_menu() {
        pollPage.pollTab.click();
        BrowserUtils.waitFor(3);
    }


    @Given("user clicks on add more link  on contacts input box.")
    public void user_clicks_on_add_more_link_on_contacts_input_box() {
        pollPage.addMoreContacts.click();
        BrowserUtils.waitFor(1);

    }

    @Given("user clicks on employees and departments tag to add a group of contacts")
    public void user_clicks_on_employees_and_departments_tag_to_add_a_group_of_contacts() {
        pollPage.employeesAndDepartmentsGroupTag.click();
        BrowserUtils.waitFor(1);
    }

    @And("user clicks on {string} and then all employees as contact group")
    public void userClicksOnAndThenAllEmployeesAsContactGroup(String string) {
        pollPage.qaDepartmentGroupTag.click();
        BrowserUtils.waitFor(1);
        pollPage.allEmployeesCheckBox.click();
        BrowserUtils.waitFor(1);
    }



    @Given("user clicks on username {string} as contact name")
    public void user_clicks_on_username_as_contact_name(String string) {
        pollPage.usernameContactName.click();
        BrowserUtils.waitFor(1);
    }

    @Then("verify that employees of {string}  and username {string} is selected as multiple contacts")
    public void verifyThatEmployeesOfAndUsernameIsSelectedAsMultipleContacts(String string0, String string1) {System.out.println(pollPage.qaDepartmentText.getText());

        System.out.println("pollPage.qaDepartmentText.getText() = " + pollPage.qaDepartmentText.getText());
        String expectedGroupText = "QA department";
        String actualGroupText = pollPage.qaDepartmentText.getText();
        Assert.assertEquals(actualGroupText, expectedGroupText);

        System.out.println("pollPage.usernameText.getText() = " + pollPage.usernameText.getText());
        String expectedUsernameText = "hr77@cybertekschool.com";
        String actualUsernameText = pollPage.usernameText.getText();
        Assert.assertEquals(actualUsernameText, expectedUsernameText);


    }









    //@TC2
    //[US007]-[AZLC-1533]-[AC2]-[TC2]

    @Given("user enters a question {string} on question input box  with title {string}")
    public void user_enters_a_question_on_question_input_box(String string, String string2) {
        pollPage.questionBox.sendKeys(string);
        //Driver.getDriver().switchTo().frame( Driver.getDriver().findElement(By.xpath("//div/iframe[@class='bx-editor-iframe']")));
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//div/iframe[@class='bx-editor-iframe']")));
        BrowserUtils.waitFor(2);
        pollPage.pollTitleBox.sendKeys(string2);
        BrowserUtils.waitFor(2);
        Driver.getDriver().switchTo().parentFrame();
    }
    @Given("user enters answers {string} {string} {string} on answer input boxes")
    public void user_enter_answers_on_answer_input_boxes(String string, String string2, String string3) {
        pollPage.answerBox1.sendKeys(string);
        pollPage.answerBox2.sendKeys(string2);
        pollPage.answerBox3.sendKeys(string3);
        BrowserUtils.waitFor(2);
    }


    @Given("user clicks on send button")
    public void user_clicks_on_send_button() {
        pollPage.sendButton.click();
        BrowserUtils.waitFor(2);

    }



    @Then("verify that user sees question and answers {string} {string} {string} {string} on the message page")
    public void verifyThatUserSeesQuestionAndAnswersOnTheMessagePage(String string, String string2, String string3, String string4) {

        BrowserUtils.waitFor(2);
        System.out.println(" verify that user sees question and answers message page");


        String expectedQuestion = string;
        String expectedAnswer1 = string2;
        String expectedAnswer2 = string3;
        String expectedAnswer3 = string4;

        String actualQuestion = pollPage.addedPollQuestion.getText();
        String actualAnswer1 = pollPage.addedPollAnswer1.getText();
        String actualAnswer2 = pollPage.addedPollAnswer2.getText();
        String actualAnswer3 = pollPage.addedPollAnswer3.getText();

        System.out.println("actualQuestion = " + actualQuestion);
        System.out.println("actualAnswer1 = " + actualAnswer1);
        System.out.println("actualAnswer2 = " + actualAnswer2);
        System.out.println("actualAnswer3 = " + actualAnswer3);

        Assert.assertEquals(actualQuestion, expectedQuestion);
        Assert.assertEquals(actualAnswer1, expectedAnswer1);
        Assert.assertEquals(actualAnswer2, expectedAnswer2);
        Assert.assertEquals(actualAnswer3, expectedAnswer3);

    }





    //@TC3
    //[US007]-[AZLC-1533]-[AC3]-[TC3]

    @Given("user clicks on delete x signs in input boxes")
    public void user_clicks_on_delete_x_signs_in_input_boxes() {
        System.out.println("user clicks on delete x signs in input boxes");

        System.out.println("pollPage.questionBox.getAttribute(\"value\") = " + pollPage.questionBox.getAttribute("value"));

        pollPage.XQuestion.click();
        BrowserUtils.waitFor(2);
        Alert alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.waitFor(3);
        alert.accept();
        BrowserUtils.waitFor(2);

/*
        pollPage.XQuestion.click();
        BrowserUtils.waitFor(2);
        alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.waitFor(2);
        alert.accept();
        BrowserUtils.waitFor(2);
*/



    }
    @Then("verify that questionbox is not visible and answer input boxes are empty")
    public void verify_that_question_and_answer_input_boxes_are_empty() {
        BrowserUtils.waitFor(3);

        System.out.println("verify that question and answer input boxes are empty");
        //System.out.println("pollPage.questionBox1.isDisplayed() = " + pollPage.questionBox1.isDisplayed());

        //if QuestionBox is removed from the page, it can not be found by findelement method.
        List<WebElement> isWebElementThere = Driver.getDriver().findElements(By.xpath("//input[@id='question_0']"));
        System.out.println("isWebElementThere = " + isWebElementThere);
        System.out.println("isWebElementThere.size() = " + isWebElementThere.size());

        Assert.assertTrue(isWebElementThere.size()==0);

    }




    //TC4
    //[US007]-[AZLC-1533]-[AC4]-[TC4]

    @Given("user clicks on allow multiple choice checkbox")
    public void user_clicks_on_allow_multiple_choice_checkbox() {
        System.out.println("user clicks on allow multiple choice checkbox");
        pollPage.allowMultipleChoiceCheckbox.click();
    }


    @Then("verify that checkbox is selected to allow user multiple choices")
    public void verify_that_checkbox_is_selected_to_allow_user_multiple_choices() {
        System.out.println("verify that checkbox is selected to allow user multiple choices");
    }


    @Then("verify that  checkboxes are enabled next to answers")
    public void verify_that_checkboxes_are_enabled_next_to_answers() {
        System.out.println("verify that  checkboxes are enabled next to answers");
        System.out.println("pollPage.answer1Text.getText() = " + pollPage.answer1Text.getText());

        System.out.println("pollPage.answer1CheckBox.isEnabled() = " + pollPage.answer1CheckBox.isEnabled());

    }


}//endclass