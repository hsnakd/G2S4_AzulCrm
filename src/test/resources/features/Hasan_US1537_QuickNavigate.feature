@AZLC-1537
Feature: Quick Navigate Menu feature
  User Story :
  As a user, I should be able to assign tasks under Quick Navigate Menu.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"

    When Click the TASK on the Quick Navigate Menu



# 1. HR User should be able to create a "High priority" tasks with the mandatory fields.
  @AZLC-1544
  Scenario:   HR User should be able to create a "High priority" tasks with the mandatory fields.
    And  Click High Priority checkbox
    And Write Task Name in the Things to do box
    And  Write a message in the message box
    And  Add an employee name to the Responsible person section
    And  Click on the send button to send the task
    And  Click the TASK on the left side menu
    Then Verify if the task is high priority


  @wip
#  2. HR User should be able to assign a task to more than one user (Test with adding 3 users max.)
  Scenario: HR User should be able to assign a task to more than one user
    And Write Task Name in the Things to do box
    And  Write a message in the message box
    And  Add an employee name to the Responsible person section
    And  Click on the send button to send the task
    And  Click the TASK on the left side menu
    Then Verify the task is assigned more than one user


#  3. When task(s) is(are) created, they can be seen on the count on the homepage under "MY TASKS" table.



#  4. Checklist should be able to be added while creating a task.



#  5. Deadline should be able to be added while creating a task.



#  6. Time planning function should be able to be used in the setting of deadline.


