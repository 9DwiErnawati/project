#Feature: Products
#  As an admin
#  I want to see list of products
#  So that I can update products

#  Scenario: GET - As a user I have to able to get detail products
#    Given I set endpoints for GET detail products
#    When I send GET HTTP request products
#    Then I receive valid HTTP response code 200
#    And I receive valid data for detail products

#  Scenario: GET - As a user I can get detail product by ID
#    Given I set endpoints for GET ID detail products
#    When I send GET HTTP request ID products
#    Then I receive valid HTTP response code 200
#    And I receive valid data for ID products

#  Scenario: POST - As a user I have to be able to create new products
#    Given I set an endpoint for POST new products
#    When I request POST detail data products
#    Then I validate the status code is 200
#    And Validate the data detail after create products
