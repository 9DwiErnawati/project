Feature: register
As a user
I want to registration
So that I can access my homepage

  Scenario Outline: As a user I have to be able login
    Given I am on the register page
    And I click menu button
    And click register button
    When I input "<fullname>" with "<email>" and "<password>"
    And click register button second
    Then I go to homepage "<result>"
    Examples:
    |      fullname      ||  email               |  password    |    result                             |
    |     kim hwang      || dwierna980@email.com |   Hutan890   |    success                            |
    |                    || dwierna1@email.com   |   123yaya    |     fullname can not empty            |
    |    dwi putri       ||                      |   123yaya    |     email can not empty               |
    |    dwi putri       || dwierna1@email.com   |              |   password can not empty              |
    |                    ||                      |              | fullname/email/password can not empty |
    |    dwi erna        ||  dwierna90@email.com |   Hutan890   |               Gagal                   |
