#Feature: login
#As a user
#I want to login
#So that I can access my homepage
#
#Scenario Outline: As a user I have to be able login
#  Given I am on the page
#  And I click menu button
#  When I input "<email>" and "<password>"
#  And click login button
#  Then I go to homepage "<result>"
#  Examples:
#  |  email                |  password     |            result                              |
#  |  bambang789@email.com |   123123123   | success                                        |
#  |                       |   123123123   |  email can not empty                           |
#  |    angin90@email.com  |               |  password can not empty                        |
#  |                       |               | email can not empty/password can not empty     |


