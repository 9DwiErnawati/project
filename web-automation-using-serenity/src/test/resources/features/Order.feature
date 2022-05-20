Feature: Order
  As a user
  I want to selected product
  So that I can see data transaction, increase and decrease product

  Scenario Outline: As a user I can see data transaction, increase and decrease product
    Given I am on the login page
    And I input "<email>" and "<password>"
    And click login button
    When I click button Beli
    And I click button cart
    And I click button "<select>"
    Then I go to transaction page "<result>"
    Examples:
      |          email             |    password    |    select    |        result                     |
      | 195410000mentari@gmail.com |   September90* |    bayar     |  transaction page                 |
      | 195410000mentari@gmail.com |   September90* |  increase    |  product increase                 |
      | 195410000mentari@gmail.com |   September90* |  decrease    |  error message product is empty   |
