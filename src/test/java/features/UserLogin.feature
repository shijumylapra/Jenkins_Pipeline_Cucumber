@Regression
Feature: This feature will validate login scenarios for simplilearn.com

  Scenario: Validate the different login options present on the login screen
    Given I have launched the application
    And I click on the Login link
    Then I see the below login options present on the screen
      | Google   |
      | Facebook |
      | Linkedin |
      | Apple    |
