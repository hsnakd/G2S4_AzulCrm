
Feature: Message Function oguz

  User Story: I should be able to add link, insert video, mention, quote, add tag in message

  Acceptance Criteria

  1. User should be able to add mentions about only department employees.
  2. User should be able to attach link to specified text.
  3. User should be able to insert YouTube and Vimeo video.
  4. User should be able to add quotes.
  5. User should be able to add tags in message.
  6. User should be able to remove tags before sending the message

  Background: log in page feature
    Given users log in with valid credentials as a "helpdesk"
    When user clicks message button


  @AZLC-1580
  Scenario: user should be able to add mentions about only department employees
    When  user remove All employees that writing by default
    And   user click the mention button
    And   user click the Employees and department button
    And   user click group2.2
    And   user select any user
    Then  user should see selected user in the message body


  @AZLC-1582
  Scenario: User should be able to attach link to specified text.
    When user click link button
    And  user write text name
    And  user write text link
    And  user click save button
    Then message body contain link text


  @AZLC-1581
  Scenario:  User should be able to insert YouTube and Vimeo video.
    When user click insert video button
    And user enter video url to source button
    And user click save button
    Then message body contain video link


  @AZLC-1583
  Scenario:  User should be able to add quotes.
    When  user click add quotes button
    And   user write something in there
    Then  user should see the quote in the text body


  @AZLC-1584
  Scenario: User should be able to add tags in message.
    When user click the add tag button
    And  user write enter any string
    And user enter add button
    Then user should see the tag in the tag area


  @AZLC-1585  @smoke
  Scenario: User should be able to remove tags before sending the message
    When user click the add tag button
    And  user write enter any string
    And user enter add button
    And user remove the tag
    Then tag is removed in the tag area


