@AZLC-1533
Feature: Poll tab feature
  User Story :
  As a user, As a user, I should be able to open a new poll by clicking on Poll tab under Active Stream.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"


  @DisplayName("TC1:AddMultipleContactsFromBulkList")
  @AZLC-1533   @TC1_US07   @wip
  Scenario:     [TC1] - Verify that user can add users by selecting multiple contacts from Employees and Departments contacts list.
  [AC1] - User should be able to add users by selecting multiple contacts from Employees and Department's contact lists.

    Given click on the poll tab on the tab-menu
    And  user clicks on add more link  on contacts input box.
    And  user clicks on employees and departments tag to add a group of contacts
    And  user clicks on "QA department" and then all employees as contact group
    And  user clicks on username "hr77@cybertekschool.com" as contact name
    Then verify that employees of "QA department"  and username "hr77@cybertekschool.com" is selected as multiple contacts


  @DisplayName("TC2:AddMultipleContactsFromBulkList")
  @AZLC-1533   @TC2_US07
  Scenario:     [TC2] - Verify that user can add questions and multiple answers
  [AC2]-User should be able to add questions and multiple answers


    Given click on the poll tab on the tab-menu
    And  user clicks on add more link  on contacts input box.
    And  user clicks on employees and departments tag to add a group of contacts
    And  user clicks on "QA department" and then all employees as contact group
    And  user clicks on username "hr77@cybertekschool.com" as contact name
    Then verify that employees of "QA department"  and username "hr77@cybertekschool.com" is selected as multiple contacts


