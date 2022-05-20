#Feature: login
#  As a user
#  I want to login
#  So that I can access my homepage
#  Scenario Outline: As a user I have to be able login
#    Given I am on the login page
#    When I input "<email>" and "<password>"
#    And click login button
#    Then I go to homepage "<result>"
#    Examples:
#    |             email               |       password       |        result        |
#    | 195410000mentari@gmail.com      |     September90*     |       success        |
#    |                                 |     September90*     | email is required    |
#    | 195410000mentari@gmail.com      |                      | password is required |
#    |                                 |                      |   email is required  |


#  Scenario: Fail login
#    Given I am on the login page
#    When I input invalid email
#    And I input valid password
#    And click login button
#    Then error message "record not found"
