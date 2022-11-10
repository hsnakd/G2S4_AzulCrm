Feature: Message Function

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


  @AC1
  Scenario: user should be able to add mentions about only department employees
    When  user remove All employees that writing by default
    And   user click the mention button
    And   user click the Employees and department button
    And   user click group2.2
    And   user select any user
    Then  user should see selected user in the message body