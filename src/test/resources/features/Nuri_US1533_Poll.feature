@AZLC-1533   @regression
Feature: Poll tab feature
  User Story :
  As a user, As a user, I should be able to open a new poll by clicking on Poll tab under Active Stream.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"


  @AZLC-1533   @TC1
  Scenario:     [TC1] - Verify that user can add users by selecting multiple contacts from Employees and Departments contacts list.
  [AC1] - User should be able to add users by selecting multiple contacts from Employees and Department's contact lists.
    Given click on the poll tab on the tab-menu
    And  user clicks on add more link  on contacts input box.
    And  user clicks on employees and departments tag to add a group of contacts
    And  user clicks on "QA department" and then all employees as contact group
    And  user clicks on username "hr77@cybertekschool.com" as contact name
    Then verify that employees of "QA department"  and username "hr77@cybertekschool.com" is selected as multiple contacts



  @AZLC-1533   @TC2 @smoke
  Scenario:     [TC2] - Verify that user can add questions and multiple answers
  [AC2] - User should be able to add questions and multiple answers
    Given click on the poll tab on the tab-menu
    And user enters a question "how many?" on question input box  with title "poll title?"
    And user enters answers "one" "two" "three" on answer input boxes
    And user clicks on send button
    Then verify that user sees question and answers "how many?" "one" "two" "three" on the message page



  @AZLC-1533   @TC3
  Scenario:      [TC3] - Verify that user can delete questions and multiple answers
[AC3] - User should be able to delete questions and multiple answers.
    Given click on the poll tab on the tab-menu
    And user enters a question "how are you today?" on question input box  with title "share your mood"
    And user enters answers "one" "two" "three" on answer input boxes
    And user clicks on delete x signs inside the input boxes
    Then verify that questionbox is not visible and answer input boxes are empty


  @AZLC-1533   @TC4
  Scenario:        [TC4] - Verify that user can select multiple choice checkbox and provide multiple choices to other attendees.
  [AC4] - User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.

    Given click on the poll tab on the tab-menu
    And user enters a question "how many?" on question input box  with title "polltitle"
    And user enters answers "one" "two" "three" on answer input boxes
    And user clicks on allow multiple choice checkbox
    Then verify that checkbox is selected to allow user multiple choices
    And user clicks on send button
    Then verify that  checkboxes are enabled next to answers


  @AZLC-1533   @TC5
  Scenario:   [TC5] - Verify that user can generate a new poll with mandatory fields.
  [AC5] - User should be able to open a new poll with mandatory fields.

    #Mandatory fields: Message title, recipient, 1 question, 2 answers
    #1Error message[Empty Message Title] : "The message title is not specified"
    #2Error message[Empty Recipient]     : "Please specify at least one person"
    #3Error message[Empty Question]      : "Please specify at least one question."
    #4Error message[Empty Answers]       : "Please specify at least two answers."


    Given click on the poll tab on the tab-menu

   # #1Error message[Empty Message Title] : "The message title is not specified"
       And user enters a question "how many?" on question input box  with title ""
       And user enters answers "one" "two" "three" on answer input boxes
       And user clicks on send button
       Then verify that "The message title is not specified" alert is displayed


    Given navigate back
    Given click on the poll tab on the tab-menu


# #2Error message[Empty Recipient]     : "Please specify at least one person"
    
  #And user enters a question "how many?" on question input box  with title "title of poll"
    And user enters answers "one" "two" "three" on answer input boxes
    And user deletes all recipients
    And user clicks on send button
    Then verify that "Please specify at least one person." alert is displayed

    Given navigate back
    Given click on the poll tab on the tab-menu

#3Error message[Empty Question]      : "Please specify at least one question."
    And user enters a question "" on question input box  with title "title of poll"
    And user enters answers "one" "two" "three" on answer input boxes
    And user clicks on send button
    Then verify that "The question text is not specified." alert is displayed
#
    Given navigate back
    Given click on the poll tab on the tab-menu


#    #4Error message[Empty Answers]       : "Please specify at least two answers."
    And user enters a question "how many?" on question input box  with title "title of poll"
    And user enters answers "" "" "" on answer input boxes
    And user clicks on send button
    Then verify that "The question \"how many?\" has no answers." alert is displayed