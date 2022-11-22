@AZLC-1530
Feature: Message Box File and Picture upload
  User Story :
  User should be able to upload multiple files at the same time (Test with max 3 files.).


  Background: log in page feature
    Given users log in with valid credentials as a "hr"
    When  user clicks message button



# 1. User should be able to upload multiple files at the same time (Test with max 3 files.).
  @AZLC-1552 @smoke
  Scenario:   HR User should be able to upload multiple files at the same time (Test with max 3 files.).

    And user clicks upload button
    And  user clicks select from bitrix
    And  user adds first file
    And  user adds second file
    And  user adds third file
    And user clicks Select Document button
    Then Verify InsertInText is visible





 # 2. User should be able to upload files in different formats.
  @AZLC-1553
  Scenario:   HR User should be able to upload multiple files at the same time (Test with max 3 files.).

    And user clicks upload button
    And  user clicks select from bitrix
    And  user adds first file
    And  user adds second file
    And  user adds third file
    And user clicks Select Document button
    Then Verify InsertInText is visible


 # 3. User should be able to upload pictures.
  @AZLC-1554
  Scenario: HR User should be able to upload pictures
  And user clicks upload button
  And user clicks select from bitrix
  And user clicks first picture
  And user clicks second picture
  And user clicks third picture
  And user clicks Select Document button
  Then Verify all pictures are visible as attached files



 # 4. User should be able to display the uploaded picture itself in Activity Stream.
  @AZLC-1555
  Scenario: User should be able to display the uploaded picture itself in Activity Stream.
    And user clicks upload button
    And user clicks select from bitrix
    And user clicks first picture
    And user clicks second picture
    And user clicks third picture
    And user clicks Select Document button
    And user clicks selected pictures from attached files
    Then Verify all pictures are visible in Activity Stream

 # 5. User should be able to insert the files and images into the text

  @AZLC-1556
  Scenario: User should be able to insert the files and images into the text.
    And user clicks upload button
    And user clicks select from bitrix
    And user clicks first picture
    And user clicks second picture
    And user clicks third picture
    And user clicks Select Document button
    And user clicks insertInText button for all files
    Then Verify all pictures are visible as attached files


 # 6. User should be able to allow a recipient to edit documents.
  @AZLC-1557
  Scenario:   HR User should be able to allow a recipient to edit documents.

    And user clicks upload button
    And  user clicks select from bitrix
    And  user adds first file
    And  user adds second file
    And  user adds third file
    And user clicks Select Document button
    And user clicks Allow recipient to edit documents button
    Then Verify Allow recipient to edit documents button is clicked


 # 7. User should be able to remove files and images at any time before sending.
  @AZLC-1559
  Scenario: User should be able to remove files and images at any time before sending.
    And user clicks upload button
    And user clicks select from bitrix
    And user clicks first picture
    And user clicks second picture
    And user clicks third picture
    And user clicks Select Document button
    Then remove button should be enabled



 # 8. User should be able to rename the file before sending it.
  @AZLC-1558
  Scenario: User should be able to rename the file before sending it.

    And user clicks upload button
    And user selects file to upload
    And user points the mouse next to uploaded file
    Then a pencil sign to edit the file should show up

