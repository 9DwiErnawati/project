Feature: register
  As a user
  I want to registration
  So that I can login
  Scenario: As a user I have to be able registration
    Given I am on the register page
    When I input valid fullname
    And I input valid email
    And I input valid password
    And click register button
    Then I go to login page

  Scenario: Fail registration
    Given I am on the register page
    When I input valid fullname
    And I input same email
    And I input valid password
    And click register2 button
    Then warning message "ERROR: duplicate key value violates unique constraint "users_email_key" (SQLSTATE 23505)"