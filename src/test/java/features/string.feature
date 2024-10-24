Feature: String operations

  Scenario: To compare the values of two strings
    Given First string is "SHIJU"
    And Second string is "SHIJU"
    When Compare two strings
    Then I should get the result as "matching"

  Scenario Outline: To compare the values of two strings using examples
    Given First string is "<str1>"
    And Second string is "<str2>"
    When Compare two strings
    Then I should get the result as "<result>"

    Examples:
      | str1    | str2   | result       |
      | AMALA   | AMALA  | matching     |
      | SHUBHA  | SETH   | mismatching  |
      | ANILA   | ANITHA | mismatching  |
