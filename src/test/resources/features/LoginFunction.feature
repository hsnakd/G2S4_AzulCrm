#@AZLC-1407
#Feature: AZULCRM Log in feature
#  User Story :
#  As a user, I should be able to log in
#
#
#  Background: log in page feature
#    Given users on the login page
#
##  1-All users can log in with valid credentials
##  (We have 3 types of users such as HR user, Marketing user, Helpdesk user).
#  @AZLC-1442
#  Scenario Outline: Log in with valid credentials
#    When users type username "<username>"  as a "<userType>"
#    And users type password "<password>"
#    And users click to the sign in button
#    Then users on the dashboard page
#
#    Examples:
#      | userType  | username                       | password |
#      | HR        | hr1@cybertekschool.com         | UserUser |
#      | MARKETING | marketing99@cybertekschool.com | UserUser |
#      | HELPDESK  | helpdesk1@cybertekschool.com   | UserUser |
