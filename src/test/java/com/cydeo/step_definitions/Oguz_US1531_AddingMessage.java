package com.cydeo.step_definitions;

import com.cydeo.pages.Oguz_US1531_AddingMessagePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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


    @When("user click link button")
    public void userClickLinkButton() {
        messagePage.linkBtn.click();
    }

    @And("user write text name")
    public void userWriteTextName() {
        messagePage.linkTextBox.sendKeys("this text in order for test");
    }

    @And("user write text link")
    public void userWriteTextLink() {
        messagePage.linkUrlBox.sendKeys("https://docs.google.com/document/d/1WngspGGhOBrJDjmbXVQsIQVs386ca2121IbEqJmq1bw/edit");
    }

    @And("user click save button")
    public void userClickSaveButton() {
        BrowserUtils.sleep(2);
        messagePage.saveLinkBtn.click();
        System.out.println("save btn click");
    }

    @Then("message body contain link text")
    public void messageBodyContainLinkText() {
        Driver.getDriver().switchTo().frame(messagePage.messageBodyIframe);
        System.out.println("messagePage.linkTextInBody.getText() = " + messagePage.linkTextInBody.getText());
        Driver.getDriver().switchTo().defaultContent();
    }


    //----AC3--------------------------------------------------------------------------


    @When("user click insert video button")
    public void userClickInsertVideoButton() {
        messagePage.insertVideBtn.click();
    }

    @And("user click video source button")
    public void userClickVideoSourceButton() {
        BrowserUtils.waitForVisibility(messagePage.linkUrlBox,10);
        messagePage.linkUrlBox.click();
    }

    @And("user enter valid video URL")
    public void userEnterValidVideoURL() {
        messagePage.linkUrlBox.sendKeys("https://vimeo.com/757945187");
        BrowserUtils.sleep(3);
    }

    @Then("message body contain video link")
    public void messageBodyContainVideoLink() {

    }


    //-----AC4----------------------------------------------------------------------

    @When("user click add quotes button")
    public void userClickAddQuotesButton() {
        messagePage.quoteBtn.click();
    }



    @And("user write something in there")
    public void userWriteSomethingInThere() {
        Driver.getDriver().switchTo().frame(messagePage.messageBodyIframe);
        messagePage.quoteTextArea.sendKeys("deneme");
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("user should see the quote in the text body")
    public void userShouldSeeTheQuoteInTheTextBody() {
        Driver.getDriver().switchTo().frame(messagePage.messageBodyIframe);
        Assert.assertTrue(messagePage.blockquote.getText().contains("deneme"));
    }

    //-----AC5--------------------------------------------------------------


    @When("user click the add tag button")
    public void userClickTheAddTagButton() {
        messagePage.tagBtn.click();
        BrowserUtils.sleep(2);
    }

    @And("user write enter any string")
    public void userWriteEnterAnyString() {
        messagePage.tagTextBox.sendKeys("group2-2");
        BrowserUtils.sleep(2);
    }

    @And("user enter add button")
    public void userEnterAddButton() {
        messagePage.addTagBtn.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should see the tag in the tag area")
    public void userShouldSeeTheTagInTheTagArea() {
        Assert.assertEquals(messagePage.tagsArea.getText(),"group2-2");
    }






}
