@AZLC-1537
Feature: Quick Navigate Menu feature
  User Story :
  As a user, I should be able to assign tasks under Quick Navigate Menu.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"
    When Click the TASK on the Quick Navigate Menu



# 1. HR User should be able to create a "High priority" tasks with the mandatory fields.

  Scenario:   HR User should be able to create a "High priority" tasks with the mandatory fields.
    And  Write message title and message
    And Add an employee name to the Responsible person section.
    And  Click on the send button to send the task.
    Then View sending-message displayed on the pop-up.



