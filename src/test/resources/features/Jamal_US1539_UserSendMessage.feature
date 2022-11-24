@AZLC-1539
Feature: Message sending
  User Story :
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"

  @AZLC-1595 @smoke  #passed
  Scenario: User should be able to send a message by filling in the mandatory fields.
    And Type your Message
    When Click on Send button
    Then See your Message below


  @AZLC-1596 #passed
  Scenario: The message delivery should be to 'All employees' by default and should be changeable.
    When Find on Sender All employees
    Then See AllEmployees as a recipient vy default


  @AZLC-1597 #passed
  Scenario: User should be able to cancel sending messages at any time before sending.
    And Type your Message2
    When Click on Cancel button
    Then Verify Message is not sent



  @AZLC-1598
  Scenario: User should be able to delete messages after sending.
    And Find last sent message
    When Click on Delete button
    Then Verify Message deleted

