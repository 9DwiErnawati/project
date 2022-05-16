Feature: logout
  As a user
  I want to logout
  So that I can out from homepage
  Scenario: As a user I have to be able logout
    Given I am on the login page
    And I input valid email
    And I input valid password
    When click login button
    And I am on the homepage
    And I click button icon
    And I click button logout
    Then I go to login page