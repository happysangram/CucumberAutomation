Feature: login
  @Smoke
  Scenario Outline: login
    Given I'm on store page
    And I provide the billing details
      |FirstName|LastName|Address  |City     |ZipCode|Email            |
      |Sangram  |Das     |Bangalore|Bangalore|90011  |Sangram@gmail.com|
    When I add a "blue-shoes" to the cart
    Then I should see <Product Quantity> "Blue Shoes" in the cart
    When I fill the parameter in the cart
    And I click the "Checkout" in the cart
    Then the order is successful

    Examples:
    |Product Quantity|
    |1               |
    |1               |

  @Smoke
  Scenario Outline: login1
    Given I'm on store page
    And I provide the billing details
      |FirstName|LastName|Address  |City     |ZipCode|Email            |
      |Sangram  |Das     |Bangalore|Bangalore|90011  |Sangram@gmail.com|
    When I add a "blue-tshirt" to the cart
    Then I should see <Product Quantity> "Blue Shoes" in the cart
    When I fill the parameter in the cart
    And I click the "Checkout" in the cart
    Then the order is successful

    Examples:
      |Product Quantity|
      |1               |
