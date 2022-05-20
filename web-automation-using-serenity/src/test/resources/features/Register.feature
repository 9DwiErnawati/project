Feature: register
  As a user
  I want to registration
  So that I can login
  Scenario Outline: As a user I have to be able registration
    Given I am on the register page
    When I input "<fullname>" with "<email>" and "<password>"
    And "<click>" register button
    Then I go to login page "<result>"
    Examples:
    |   fullname   |             email              |    password    | click     |   result        |
    |    kusuma    |      19094990tari@gmail.com    |  September90*  | success   |  success        |
    |              | 195410079dwiernawati@gmail.com |  September90*  |           | fullname required   |
    | Dwi Ernawati |                                |  September90*  |           | email required     |
    | Dwi Ernawati | 195410079dwiernawati@gmail.com |                |           | password required   |
    |              |                                |                |           |  fullname required   |
    | Dwi Ernawati | 195410079dwiernawati@gmail.com |  September90*  |           |error duplicate email |
