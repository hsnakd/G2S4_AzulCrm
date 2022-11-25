@AZLC-1532
Feature: AzulCrm Event Create
  User Story :  As a user, I should be able to create events by clicking on Event tab under Activity Stream.

  Acceptance Criterias:
  1. User should be able to add Event start and ending date and time, select "All day" and specify the time zone.
  2. User should be able to set reminder.
  3. User should be able to select the event location from the dropdown.
  4. User should be able to add members by selecting contacts individually or adding groups and departments.
  5. User should be able to send messages by filling the mandatory fields.
  6. User should be able to cancel sending event at any time before sending.

  Accounts type is: hr

  Background: log in page feature
    Given users log in with valid credentials as a "hr"
    When  user clicks event button


  @AZLC-1600
  Scenario Outline: User should be able to add Event start and end date and time
    When  user clicks on Event start date and select a day   "<startdate>"
    And   user clicks on Event start time and select a time  "<starttime>"
    And   user clicks on Event end day and select a day      "<enddate>"
    And   user clicks on Event end time and select a time    "<endtime>"
    Then  verify that event start finish dates are added
    Examples:
      | startdate   | starttime | enddate    | endtime   |
      | 11/28/2023  |04:00 am   | 11/28/2022 | 05:15 am  |



  @AZLC-1601
   Scenario: User should be able to select All day
    When   user clicks on All day checkbox
    Then  verify that All day is selected


  @AZLC-1602  @smoke
   Scenario Outline: User should be able to specify the time zone
    When   user clicks on Specify time zone link
    And    user clicks and select time zone1  "<zone1>"
    And    user clicks and select time zone2  "<zone2>"
    Then   verify that time zones are selected "<zone1txt>", "<zone2txt>"

     Examples:
       | zone1              | zone2            |   zone1txt                    |    zone2txt                 |
       | Europe/Helsinki    |Europe/Vilnius    |(UTC +02:00) Europe/Helsinki   | (UTC +02:00) Europe/Vilnius |


  @AZLC-1603
  Scenario Outline: User should be able to set reminder
    When  user clicks on count inputbox and enter count  "<count>"
    And   user clicks on timeunit dropdown and select timeunit "<timeunit>"
    Then  verify that reminder is setted   "<count>","<timeunitxt>"

     Examples:
      | count     | timeunit     |    timeunitxt  |
      | 2         | hour         |      hours     |



  @AZLC-1604
  Scenario Outline: User should be able to select the event location from the dropdown
    When  user cliks on Event Location dropdown and select a room  "<room>"
    Then  verify that meeting room is selected    "<room>"

    Examples:
      | room                            |
      | Central Meeting Room            |



  @AZLC-1605
  Scenario Outline: User should be able to add members by selecting contacts individually or adding groups and departments
    When  user clicks on Members inputbox and enter a username "<usernam>"
    And   user clicks on Members inputbox and enter a groupname  "<groupname>"
    Then  verify that member is added "<usernam>"
    Then  verify that member is added groupname "<groupname>"

    Examples:
      | usernam                         | groupname                  |
      | hr22@cybertekschool.com         | QA department              |



  @AZLC-1606
  Scenario Outline: User should be able to send messages by filling the mandatory fields
    When  user clicks on Event name  inputbox and enter a name  "<eventname>"
    And   user clicks on Send button
    Then  verify that Event is sended "<eventname1>"

    Examples:
      | eventname             | eventname1       |
      | Sprint planning       | Sprint planning  |


  @AZLC-1607
  Scenario: User should be able to cancel sending event at any time before sending
    When  user clicks on Cancel Button
    Then  verify that Event is cancelled