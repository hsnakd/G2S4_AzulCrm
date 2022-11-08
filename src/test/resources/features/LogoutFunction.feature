@AZLC-1418
Feature: AZULCRM Log out feature
  User Story :
  As a user, I should be able to log out


  Background: log out page feature
    Given users log in with valid credentials

#  1- The user can log out and ends up on the login page.
  @AZLC-1452
  Scenario: user can log out and ends up on the login page
    When user can log out
    Then user ends up on the login page
