Feature: Ratings
  As an admin
  I want to see list of rating products
  So that I can update rating

  Scenario: GET - As a user I have to able to get rating
    Given I set endpoints for GET rating
    When I send GET HTTP request rating
    Then I receive valid HTTP response code 200
    And I receive valid data for rating

  Scenario: POST - As a user I have to be able to create new rating
    Given I set an endpoint for POST new rating
    When I request POST rating product
    Then I validate the status code is 500
    And Validate the data detail after create rating