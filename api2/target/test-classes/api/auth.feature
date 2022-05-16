#Feature: Authentication
#  As an admin
#  I want to create new user
#  So that I can register and login

#  Scenario Outline: POST - As a user I have to be able to create new register
#    Given I set an endpoint for POST new "<fullname>" with "<email>" with "<password>"
#    When I request POST detail user
#    Then I validate the status code is <status code>
#    And Validate the "<message>" after create registration
#    Examples:
#    |     fullname     |       email               |   password     | status code |    message    |
#    |   Alex Understand    |    alexunder17@email.com  |    123123124   |     200     |  success      |
#    |     Dwi Erna     |  Erna2@gmail.com          | Sembilan09%    |     400     |    fail       |
