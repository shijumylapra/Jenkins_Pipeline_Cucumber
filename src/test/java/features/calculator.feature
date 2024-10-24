@Calculator
Feature: this is a feature test for calculator

  Scenario: this scenario wii test addition of two numbers
    Given Two numbers 10.50 and 10.40
    When Add those two numbers
    Then Result should be 20.90

  Scenario: this scenario wii test addition of two numbers
    Given Two numbers 56.12 and 11.25
    When Subtract those two numbers
    Then Result should be 44.87

  Scenario: this scenario wii test addition of two numbers
    Given Two numbers 52.63 and 17.52
    When Divide those two numbers
    Then Result should be 3.00

  Scenario Outline: This Scenario will test addition of two numbers
    Given Two numbers <num1> and <num2>
    When Add those two numbers
    Then Result should be <result>

    Examples:
      | num1  | num2  | result |
      | 12.20 | 21.70 | 33.9  |
      | 30.32 | 21.17 | 51.49  |
      | 11.40 | 11.20 | 22.60  |
      | 32.65 | 22.52 | 55.17  |

  Scenario: This Scenario will add two or more numbers and validate the results
    Given I have below numbers
      | 100 |
      | 125 |
      |  33 |
      |  41 |
      |   7 |
    When I add above numbers
    Then Result should be 306
