Feature: Add to Cart
  As a user
  I want to select product
  So that I can order product

  Scenario: As a user I have to be able order product
    Given I am on the homepage
    When I click button Beli
    Then product in cart increase