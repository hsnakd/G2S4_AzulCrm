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


public class Ufuk_US1532_Event {

    Ufuk_US1532_EventPage eventPage=new Ufuk_US1532_EventPage();

    @When("user clicks event button")
    public void user_clicks_event_button() {
       eventPage.eventButton.click();
        BrowserUtils.sleep(2);


            }
    //@AC1-TC1
    @When("user clicks on Event start date and select a day   {string}")
    public void user_clicks_on_event_start_date_and_select_a_day(String string) {
       /* BrowserUtils.sleep(1);
        eventPage.startDate.clear();
        eventPage.startDate.click();
        eventPage.startDate.sendKeys(string);
        eventPage.startDate.click();
        BrowserUtils.sleep(2);*/

    }

    @When("user clicks on Event start time and select a time  {string}")
    public void user_clicks_on_event_start_time_and_select_a_time(String string) {
        /*BrowserUtils.sleep(1);
        eventPage.startTime.clear();
        eventPage.startTime.sendKeys(string);
        BrowserUtils.sleep(1);
        eventPage.startSetTime.click();
        BrowserUtils.sleep(2);*/

    }

    @When("user clicks on Event end day and select a day      {string}")
    public void user_clicks_on_event_end_day_and_select_a_day(String string) {
       /* BrowserUtils.sleep(1);
        eventPage.finishDate.clear();
        eventPage.finishDate.click();
        eventPage.finishDate.sendKeys(string);
        eventPage.finishDate.click();
        BrowserUtils.sleep(2); */


    }
    @When("user clicks on Event end time and select a time    {string}")
    public void user_clicks_on_event_end_time_and_select_a_time(String string) {
        /*BrowserUtils.sleep(1);
        eventPage.finishTime.clear();
        eventPage.finishTime.click();
        eventPage.finishTime.sendKeys(string);
        BrowserUtils.sleep(1);
        eventPage.finishSetTime.click();
        BrowserUtils.sleep(1);*/
    }


    @Then("verify that event start finish dates are added")
    public void verify_that_event_start_finish_dates_are_added() {

    }


     //@AC1-TC2      OK.
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


    //@AC1-TC3
    @When("user clicks on Specify time zone link")
    public void user_clicks_on_specify_time_zone_link() {

    }

    @When("user clicks and select time zone1  {string}")
    public void user_clicks_and_select_time_zone1(String string) {

    }

    @When("user clicks and select time zone2  {string}")
    public void user_clicks_and_select_time_zone2(String string) {

    }

    @Then("verify that time zones are selected")
    public void verify_that_time_zones_are_selected() {

    }

     //@AC2
    @When("user clicks on count inputbox and enter count  {string}")
    public void user_clicks_on_count_inputbox_and_enter_count(String string) {

    }

    @When("user clicks on timeunit dropdown and select timeunit {string}")
    public void user_clicks_on_timeunit_dropdown_and_select_timeunit(String string) {

    }

    @Then("verify that reminder is setted")
    public void verify_that_reminder_is_setted() {

    }


    // @AC3
    @When("user cliks on Event Location dropdown and select a room  {string}")
    public void user_cliks_on_event_location_dropdown_and_select_a_room(String string) {

    }


    @Then("verify that meeting room is selected")
    public void verify_that_meeting_room_is_selected() {

    }


    //@AC4  OK.
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

    // @AC5  OK.
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



    // @AC6   OK.
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
