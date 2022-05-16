Feature: Transaction
  As an admin
  I want to get detail user
  So that I can update the user data

  Scenario: POST - As a user I have to be able to generate token
    Given I set an endpoint for POST generate token
    When I request POST generate token
    Then I validate the status code is 200
    And validate the data detail after generate token

  Scenario: GET - As a user I can get all data transaction
    Given I set endpoints for GET detail transactions
    When I request GET all transactions
    Then I validate the status code is 200
    And validate the data detail after transactions