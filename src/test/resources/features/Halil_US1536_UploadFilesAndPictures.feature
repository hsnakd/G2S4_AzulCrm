@AZLC-1536
Feature: Quick Navigate Menu feature
  User Story :
  As a user, I should be able to assign tasks under Quick Navigate Menu.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"
    When Click the Message on the Quick Navigate Menu
    And User click upload button on message box


  @AZLC-1569
  Scenario: User should be able to upload multiple files at the same time (Test with max 3 files.).

    And User click select documents from bitrix box
    Then User select first file
    Then User select second file
    Then User select third file
    Then User click select documents button
    Then User see insert in text button at attached file section
    And User click send button

  @AZLC-1570  @smoke
  Scenario: User should be able to upload file in different formats.

    And User click select documents from bitrix box
    Then User select different format file
    Then User click select documents button
    Then User see insert in text button for different format file
    And User click send button

  @AZLC-1571
  Scenario: User should be able to upload picture.

    And User click select documents from bitrix box
    Then User select first file
    Then User click select documents button
    Then User see insert in text button for file
    And User click send button

  @AZLC-1572
  Scenario: User should be able to display the uploaded picture itself in Activity Stream.

    And User click select documents from bitrix box
    Then User select first file
    Then User click select documents button
    Then User see insert in text button for file
    And User click send button
    Then User see uploaded picture in activity stream

  @AZLC-1573
  Scenario: User should be able to insert the files and images into text

    And User click select documents from bitrix box
    Then User select first file
    Then User click select documents button
    When User click insert in text button
    And User see first file at into text

  @AZLC-1574
  Scenario: User should be able to allow a recipient to edit documents.

    And User click select documents from bitrix box
    Then User select first file
    Then User click select documents button
    And User click Allow a recipient to edit documents? clickbox

  @AZLC-1575
  Scenario: User should be able to remove files and images at any time before sending.

    And User click select documents from bitrix box
    Then User select first file
    Then User click select documents button
    When User click delete box

  @AZLC-1576
  Scenario: User should be able to rename the file before sending.

    And User click select documents from files and images button and attach photo and click rename button

