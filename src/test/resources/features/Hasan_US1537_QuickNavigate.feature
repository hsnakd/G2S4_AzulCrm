@AZLC-1537
Feature: Quick Navigate Menu feature
  User Story :
  As a user, I should be able to assign tasks under Quick Navigate Menu.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"
    When Click the TASK on the Quick Navigate Menu


# 1. HR User should be able to create a "High priority" tasks with the mandatory fields.

  @AZLC-1544 @smoke
  Scenario:   HR User should be able to create a "High priority" tasks with the mandatory fields.
    And Click High Priority checkbox
    And Write Task Name in the Things to do box
    And Write a message in the message box
    And Add an employee name to the Responsible person section
    And Click on the send button to send the task
    And Click the TASK on the left side menu
    Then Verify if the task is high priority


  @AZLC-1545
#  2. HR User should be able to assign a task to more than one user (Test with adding 3 users max.)
  Scenario: HR User should be able to assign a task to more than one user
    And Write Task Name in the Things to do box
    And Write a message in the message box
    And Add an employee name to the Responsible person section
    And Click on the send button to send the task
    And Click the TASK on the left side menu
    Then Verify the task is assigned more than one user


  @AZLC-1546
#  3. When task(s) is(are) created, they can be seen on the count on the homepage under "MY TASKS" table.
  Scenario: When task is created, it can be seen on the count on the homepage under "MY TASKS" table
    And Write Task Name in the Things to do box
    And Write a message in the message box
    And Add an employee name to the Responsible person section
    And Click on the send button to send the task
    And Click the TASK on the left side menu
    Then Verify that task is created under MY TASKS table


  @AZLC-1547
#  4. Checklist should be able to be added while creating a task.
  Scenario: Checklist should be able to be added while creating a task
    And Write Task Name in the Things to do box
    And Write a message in the message box
    And Click Checklist link
    And Write a message in the checklist box
    And Click add link
    And Click on the send button to send the task
    Then Verify that while creating a task checklist is added

  @AZLC-1548
#  5. Deadline should be able to be added while creating a task.
  Scenario: Deadline should be able to be added while creating a task
    And Write Task Name in the Things to do box
    And Write a message in the message box
    And Add a deadline
    And  Click on the send button to send the task
    Then Verify that while creating a task deadline is added

  @AZLC-1549
#  6. Time planning function should be able to be used in the setting of deadline.
  Scenario Outline: Time planning function should be able to be used in the setting of deadline
    And Write Task Name in the Things to do box
    And Write a message in the message box
    And Click Time Planning link
    And Add a start time
    And Add a duration "<duration>" "<time>"
    And  Click on the send button to send the task
    And  Click the TASK on the left side menu
    Then Verify that while creating a task time planning is added
    Examples:
      | duration | time |
      | 15       | days |
