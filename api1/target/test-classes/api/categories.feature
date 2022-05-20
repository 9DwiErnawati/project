Feature: Categories
  As an admin
  I want to see list of categories
  So that I can update categories

  Scenario: GET - As a user I have to able to get detail categories
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail categories

  Scenario Outline: POST - As a user I have to be able to create new categories
    Given I set an endpoint for POST new categories
    When I request POST detail "<categories>"
    Then I validate the status code is <status code>
    And Validate the data detail after create categories
    Examples:
    | categories   | status code |
    | kesehatan    |    200      |

