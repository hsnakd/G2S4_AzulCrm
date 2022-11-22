@AZLC-1535
Feature: Filter and search function feature
  User Story :
  As a user, I should be able to use "Filter and search" functionality on Active Stream.


  Background: log in page feature
    Given users log in with valid credentials as a "hr"
    When click filter and search function

  #1. User should be able to see default filters as "my activity, work, favorite,announcements, and workflows"
  @AZLC-1535
  Scenario: User should be able to see default filters as "my activity, work, favorite,announcements, and workflows"

  When User clicks the "Filter and search" on the active stream
  Then Verify that user should be able to click "Filter and search" functionality on the Active Stream



  #2. User should be able to add and remove fields.
  @AZLC-1535
  Scenario: User should be able to add and remove fields.
  When User clicks "Add field" function
  And Clicks "Data,Type,Author,To" functions to remove fields
  And Clicks "Favorites,Tag,Exranet" fuctions to add fields
  And Clicks "Reset" function after add and remove process
  Then Verify that fields are moveable




  #3. User should be able to search by specifying the Date,
  @AZLC-1535
  Scenario: User should be able to search by specifying the Date
  When User clicks Date list
  And Search by specifying the date
  And Clicks each options to make sure it works
  Then Verify that search by specifying the Date is working





  #4. User should be able to search by selecting single or multiple types,
  @AZLC-1535
  Scenario: User should be able to search by selecting single or multiple types
  When User selects one or more options in the type function
  And User clicks each types of options
  Then Verify that search by selecting single and multiple types




  #5. User should be able to save the filter.
  @AZLC-1535
  Scenario: User should be able to save the filter
  When User clicks "SAVE FILTER"function
  And User sets the filter name
  And User clicks "SAVE" fuction to save the filter name
  Then Verify that user should be able to save the filter name




  #6. User should be able to restore the default field,
  @AZLC-1535
  Scenario: User should be able to restore the default field
  When User clicks "Restore default field" function
  Then Verify that User should be able to restore the default field





  #7. User should be able to reset filters to default.
  @AZLC-1535
  Scenario: User should be able to reset filters to default
  When User clicks "Configure filter" function
  And User clicks "Reset to default"function
  And User clicks "CONTINUE" to reset filters to default
  Then Verify that user should be able to reset filters to default






