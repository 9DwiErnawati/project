Feature: Transaction
  As an admin
  I want to get detail user
  So that I can update the user data

  Scenario: POST - As an admin I have to be able to create transaction
    Given I set an endpoint for POST create transaction
    When I request POST create transaction
    Then I validate the status code is 200
    And validate the data detail after create transaction

  Scenario: GET - As a user I can get all data transaction
    Given I set endpoints for GET detail transactions
    When I request GET all transactions
    Then I validate the status code is 200
    And validate the data detail after transactions