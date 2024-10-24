@Hash
Feature: Calculate multiple values

Scenario: Validate the bill amount of the purchased items
Given Below items are added to the cart
| Coffee    |  50.26 |
| Burger    | 150.26 |
| Chocolate |  10.26 |
When I do the checkout
Then Result should be 210.78

  Scenario: Validate the bill amount of the purchased items with quantity
    Given Below items, price and qty are added to the cart
      | Coffee    |  50.00 | 5 |
      | Burger    | 150.26 | 2 |
      | Chocolate |  10.26 | 6 |
    When I do the item checkout
    Then Result should be 612.08
