@AZLC-1536
Feature: Quick Navigate Menu feature
  User Story :
  As a user, I should be able to assign tasks under Quick Navigate Menu.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"


  Scenario: User should be able to upload multiple files at the same time (Test with max 3 files.).
    When Click the Message on the Quick Navigate Menu
    And User click upload button on message box
    And User click select documents from bitrix box
    Then User select first file
    Then User select second file
    Then User select third file
    Then User click select documents button
    Then User see insert in text button at attached file section
   # Then User click send button


  Scenario: User should be able to upload file in different formats.
    When Click the Message on the Quick Navigate Menu
    And User click upload button on message box
    And User click select documents from bitrix box
    Then User select different format file
    Then User click select documents button
    Then User see insert in text button for different format file


  Scenario: User should be able to upload picture.
    When Click the Message on the Quick Navigate Menu
    And User click upload button on message box
    And User click select documents from bitrix box
    Then User select first file
    Then User click select documents button
    Then User see insert in text button for file

Scenario: User should be able to display the uploaded picture itself in Activity Stream.
  When Click the Message on the Quick Navigate Menu
  And User click upload button on message box
  And User click select documents from bitrix box
  Then User select first file
  Then User click select documents button
  Then User see insert in text button for file
  And User click send button
 Then User see uploaded picture in activity stream

  @wip
    Scenario: User should be able to insert the files and images into text
    When Click the Message on the Quick Navigate Menu
    And User click upload button on message box
    And User click select documents from bitrix box
    Then User select first file
  #  Then User select second file
  #  Then User select third file
    Then User click select documents button
#    Then User see insert in text button at attached file section
When User click insert in text button
    And User see first file at into text


