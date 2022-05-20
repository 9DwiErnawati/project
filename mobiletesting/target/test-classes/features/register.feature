Feature: register
As a user
I want to registration
So that I can access my homepage

  Scenario Outline: As a user I have to be able login
    Given I am on the page
    And I click menu button
    And click register button
    When I input "<fullname>" with "<email>" and "<password>"
    And click register button second
    Then I go to homepage "<result>"
    Examples:
    |      fullname      ||  email               |  password    | result                             |
    |    dwi erna        || dwierna90@email.com  |   Hutan890   | success                            |
    |                    || dwierna1@email.com   |   123yaya    |  fullname can not empty            |
    |    dwi putri       ||                      |   123yaya    |  email can not empty               |
    |    dwi putri       || dwierna1@email.com   |              |  password can not empty            |
    |                    ||                      |              |               Gagal                |
    |    dwi erna        ||  dwierna90@email.com |   Hutan890   |               Gagal                |

#Scenario: As a user I have to be able registration
#  Given I am on the page
#  And I click menu button
#  And click register button
#  When I input valid fullname
#  And I input valid email register
#  And I input valid password register
#  And click register button second
#  Then I go to homepage

#  Scenario: As a user I failed login because invalid email
#    Given I am on the page
#    And I click menu button
#    And click register button
#    When I input invalid email register
#    And I input valid password register
#    And click register button second
#    Then I got error message register

#  Scenario: As a user I failed login because invalid data
#    Given I am on the page
#    And I click menu button
#    And click register button
#    When I input invalid email register
#    And I input invalid password register
#    And click register button second
#    Then I got error message register
