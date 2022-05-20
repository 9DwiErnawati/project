Feature: Comments
  As a user
  I want to add comments products
  So that I can update comments products

  Scenario: GET - As a user I have to able to get comments
    Given I set endpoints for GET comments
    When I send GET HTTP request comments
    Then I receive valid HTTP response code 200
    And I receive valid data for comments

  Scenario: POST - As a user I have to be able to create new comments
    Given I set an endpoint for POST new comments
    When I request POST comments products
    Then I validate the status code is 200
    And Validate the data detail after create comments