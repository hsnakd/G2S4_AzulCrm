@AZLC-1530
Feature: Message Box File and Picture upload
  User Story :
  User should be able to upload multiple files at the same time (Test with max 3 files.).


  Background: log in page feature
    Given users log in with valid credentials as a "hr"
    When  user clicks message button



# 1. User should be able to upload multiple files at the same time (Test with max 3 files.).
  @AZLC-1530
  Scenario:   HR User should be able to upload multiple files at the same time (Test with max 3 files.).

    And user clicks upload button
    And  user clicks select from bitrix
    And  user adds first file
    And  user adds second file
    And  user adds third file
    And user clicks Select Document button
    Then Verify InsertInText is visible





 # 2. User should be able to upload files in different formats.

 # 3. User should be able to upload pictures.

 # 4. User should be able to display the uploaded picture itself in Activity Stream.

 # 5. User should be able to insert the files and images into the text

 # 6. User should be able to allow a recipient to edit documents.

 # 7. User should be able to remove files and images at any time before sending.

 # 8. User should be able to rename the file before sending it.
