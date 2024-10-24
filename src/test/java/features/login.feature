@user_login
Feature: This feature will validate the login scenarios for simplilearn.com

  @Ignore
  Scenario Outline: Validate the Login failure scenario using scenario outline
    Given I have launched the application
    And I click on the Login link
    When I enter the user name as "<UserName>"
    And I enter the password as "<Password>"
    And I click on the Login button
    Then I should get the error message as "<ErrorMessage>"
    Examples:
      | UserName    | Password | ErrorMessage                                       |
      | user1@gmail.com | Abc@1234 | The email or password you have entered is invalid. |
      | user2@gmail.com | Pqr@1234 | The email or password you have entered is invalid. |

  Scenario: Validate Login failure function
    Given I have launched the application
    And I click on the Login link
    When I enter the Username
    And I enter the Password
    And I click on the Login button
    Then I should get the error message as "The email or password you have entered is invalid."

# @US_1001 @Regression
  Scenario: Validate the Login failure scenario using parameters
    Given I have launched the application
    And I click on the Login link
    When I enter the user name as "user3@gmail.com"
    And I enter the password as "Abc@1234"
    And I click on the Login button
    Then I should get the error message as "The email or password you have entered is invalid."
