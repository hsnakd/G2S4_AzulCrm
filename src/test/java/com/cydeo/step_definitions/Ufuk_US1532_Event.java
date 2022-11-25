package com.cydeo.step_definitions;

import com.cydeo.pages.Ufuk_US1532_EventPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.ElementVisitor;
import java.util.Objects;


public class Ufuk_US1532_Event {

    Ufuk_US1532_EventPage eventPage=new Ufuk_US1532_EventPage();
    @When("user clicks event button")
    public void user_clicks_event_button() {
       eventPage.eventButton.click();
        BrowserUtils.sleep(2);


            }
    //TC1
    @When("user clicks on Event start date and select a day   {string}")
    public void user_clicks_on_event_start_date_and_select_a_day(String string) {
       BrowserUtils.sleep(1);
        eventPage.startDate.clear();
        eventPage.startDate.click();
        eventPage.startDate.sendKeys(string);
        eventPage.startDate.click();
        BrowserUtils.sleep(2);

    }

    @When("user clicks on Event start time and select a time  {string}")
    public void user_clicks_on_event_start_time_and_select_a_time(String string) {
        BrowserUtils.sleep(1);
        eventPage.startTime.clear();
        eventPage.startTime.sendKeys(string);
        BrowserUtils.sleep(1);
        BrowserUtils.sleep(2);

    }

    @When("user clicks on Event end day and select a day      {string}")
    public void user_clicks_on_event_end_day_and_select_a_day(String string) {
        BrowserUtils.sleep(1);
        eventPage.finishDate.clear();
        eventPage.finishDate.click();
        BrowserUtils.sleep(2);


    }
    @When("user clicks on Event end time and select a time    {string}")
    public void user_clicks_on_event_end_time_and_select_a_time(String string) {
        BrowserUtils.sleep(1);
        eventPage.finishTime.clear();
        eventPage.finishTime.click();
        eventPage.finishTime.sendKeys(string);
        BrowserUtils.sleep(2);


      }


    @Then("verify that event start finish dates are added")
    public void verify_that_event_start_finish_dates_are_added() {
        Assert.assertTrue(eventPage.startDate.isDisplayed());
        Assert.assertTrue(eventPage.finishDate.isDisplayed());
        Assert.assertTrue(eventPage.startTime.isDisplayed());
        Assert.assertTrue(eventPage.finishTime.isDisplayed());


    }


     //TC2
    @When("user clicks on All day checkbox")
    public void user_clicks_on_all_day_checkbox() {
        BrowserUtils.sleep(1);
       eventPage.allDay.click();
        BrowserUtils.sleep(1);
       }

    @Then("verify that All day is selected")
    public void verify_that_all_day_is_selected() {
        Assert.assertTrue(eventPage.allDay.isSelected());

    }


    //TC3
    @When("user clicks on Specify time zone link")
    public void user_clicks_on_specify_time_zone_link() {
        eventPage.timeZoneCheck.click();
        BrowserUtils.sleep(1);

    }

    @When("user clicks and select time zone1  {string}")
    public void user_clicks_and_select_time_zone1(String string) {
        eventPage.timeZone1.click();
        BrowserUtils.sleep(2);
        Select dropZone1= new Select(eventPage.timeZone1);
        dropZone1.selectByValue(string);
        BrowserUtils.sleep(2);

    }

    @When("user clicks and select time zone2  {string}")
    public void user_clicks_and_select_time_zone2(String string) {
        eventPage.timeZone2.click();
        BrowserUtils.sleep(2);
        Select dropZone2= new Select(eventPage.timeZone2);
        dropZone2.selectByValue(string);
        BrowserUtils.sleep(2);

    }

    @Then("verify that time zones are selected {string}, {string}")
    public void verifyThatTimeZonesAreSelected(String arg0, String arg1) {
        String expZone1=arg0;
        String expZone2=arg1;
        Select dropZone1= new Select(eventPage.timeZone1);
        Assert.assertEquals(expZone1,dropZone1.getFirstSelectedOption().getText());
        Select dropZone2= new Select(eventPage.timeZone2);
        Assert.assertEquals(expZone2,dropZone2.getFirstSelectedOption().getText());

    }





     //TC4
    @When("user clicks on count inputbox and enter count  {string}")
    public void user_clicks_on_count_inputbox_and_enter_count(String string) {
        eventPage.remindCount.click();
        eventPage.remindCount.clear();
        BrowserUtils.sleep(1);
        eventPage.remindCount.sendKeys(string+Keys.ENTER);
        BrowserUtils.sleep(2);

    }

    @When("user clicks on timeunit dropdown and select timeunit {string}")
    public void user_clicks_on_timeunit_dropdown_and_select_timeunit(String string) {
        eventPage.remindUnit.click();
        Select timeUnitdrop= new Select(eventPage.remindUnit);
        timeUnitdrop.selectByValue(string);
        BrowserUtils.sleep(1);

    }

    @Then("verify that reminder is setted   {string},{string}")
    public void verifyThatReminderIsSetted(String arg0, String arg1) {
        String expCount=arg0;
        String expUnit=arg1;
        Select timeUnitdrop= new Select(eventPage.remindUnit);
        Assert.assertTrue(expCount,eventPage.remindCount.isDisplayed());
        Assert.assertEquals(expUnit,timeUnitdrop.getFirstSelectedOption().getText());





    }


    // TC5
    @When("user cliks on Event Location dropdown and select a room  {string}")
    public void user_cliks_on_event_location_dropdown_and_select_a_room(String string) {
        eventPage.eventLocation.click();
        BrowserUtils.sleep(1);
        eventPage.eventLocation.clear();
        BrowserUtils.sleep(1);
        eventPage.eventLocation.sendKeys(string);
        BrowserUtils.sleep(1);

    }


    @Then("verify that meeting room is selected    {string}")
    public void verifyThatMeetingRoomIsSelected(String arg0) {
        Assert.assertTrue(eventPage.eventLocation.isDisplayed());

    }


    //TC6
    @When("user clicks on Members inputbox and enter a username {string}")
    public void user_clicks_on_members_inputbox_and_enter_a_username(String string) {
        eventPage.membersLink.click();
        BrowserUtils.sleep(1);
        eventPage.members.sendKeys(string);
        BrowserUtils.sleep(2);
        eventPage.members.sendKeys(Keys.ENTER);
        BrowserUtils.sleep(1);

    }

    @When("user clicks on Members inputbox and enter a groupname  {string}")
    public void user_clicks_on_members_inputbox_and_enter_a_groupname(String string) {
         eventPage.members.sendKeys(string);
        BrowserUtils.sleep(1);
        eventPage.members.sendKeys(Keys.ENTER);
        BrowserUtils.sleep(1);


    }
    @Then("verify that member is added {string}")
    public void verify_that_member_is_added(String string) {
       String expMem= Driver.getDriver().findElement(By.xpath("(//span[@class='feed-event-destination-text'])[1]")).getText();
       Assert.assertEquals(string,expMem);
      }

    @Then("verify that member is added groupname {string}")
    public void verifyThatMemberIsAddedGroupname(String string) {
        String expMem= Driver.getDriver().findElement(By.xpath("(//span[@class='feed-event-destination-text'])[2]")).getText();
        Assert.assertEquals(string,expMem);

    }

    // TC7
    @When("user clicks on Event name  inputbox and enter a name  {string}")
    public void user_clicks_on_event_name_inputbox_and_enter_a_name(String string) {
         eventPage.eventName.click();
         BrowserUtils.sleep(1);
         eventPage.eventName.sendKeys(string);
         BrowserUtils.sleep(1);

    }
    @When("user clicks on Send button")
    public void user_clicks_on_send_button() {
     eventPage.sendButton.click();
     BrowserUtils.sleep(1);

    }

    @Then("verify that Event is sended {string}")
    public void verify_that_event_is_sended(String string) {
       Assert.assertEquals(string,eventPage.eventDisplay.getText());


    }



    // TC8
    @When("user clicks on Cancel Button")
    public void user_clicks_on_cancel_button() {
        eventPage.cancelButton.click();
        BrowserUtils.sleep(1);

    }
    @Then("verify that Event is cancelled")
    public void verify_that_event_is_cancelled() {
        Assert.assertFalse(eventPage.cancelButton.isDisplayed());
        BrowserUtils.sleep(1);


    }


}
