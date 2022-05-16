Feature: Home
  As a user
  I want to order and see detail product
  So that I can have a product
  Scenario: As a user I have to be able order product
    Given I am on the home pages
    When I click button Beli
    Then product go to order page

  Scenario: As a user I have to be able see detail product
    Given I am on the home page
    When I click button Detail
    Then I can see detail product
