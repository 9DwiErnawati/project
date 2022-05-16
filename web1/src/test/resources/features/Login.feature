Feature: login
  As a user
  I want to login
  So that I can access my homepage
  Scenario: As a user I have to be able login
    Given I am on the login page
    When I input valid email
    And I input valid password
    And click login button
    Then I go to homepage

  Scenario: Fail login
    Given I am on the login page
    When I input invalid email
    And I input valid password
    And click login button
    Then error message "record not found"
