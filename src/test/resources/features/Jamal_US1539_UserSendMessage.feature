@AZLC-1539
Feature: Message sending
  User Story :
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"

  @AZLC-1595
  Scenario: User should be able to send a message by filling in the mandatory fields.
    And Nagivate to Activity Stream
    And Navigate to Message Tab on the activity Stream
    And Type your "Message"
    When Click on "Send" button
    Then See your "Message" below


  @AZLC-1596
  Scenario: The message delivery should be to 'All employees' by default and should be changeable.
    And Navigate to Activity Stream.
    And Navigate to Message Tab on the activity Stream
    And Type your "Message"
    When Click on "Send" button
    Then See your "Message" below

  @AZLC-1597
  Scenario: User should be able to cancel sending messages at any time before sending.
    And Navigate to Activity Stream.
    And Navigate to Message Tab on the activity Stream
    And Type your "Message"
    When Click on "Cancel" button
    Then Message is not sent

  @AZLC-1598
  Scenario: User should be able to delete messages after sending.
    And Navigate to Activity Stream.
    And Navigate to Message Tab on the activity Stream
    And Find last sent message
    When Click on "Delete" button
    Then Message has been deleted