Feature: Order
  As a user
  I want to pay product
  So that I can have a product
  Scenario: As a user I have to have product
    Given I am on the login page
    And I input valid email
    And I input valid password
    When click login button
    And I click button Beli
    And product go to order page
    And I am on the homepage order
    Then I click button bayar
    And I go to transaction page