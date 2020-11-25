Feature: As a user I should be able to navigate to home page


  Background:
    When User goes to given url


  Scenario Outline:
    And Click to "Account Menu"
    And Click to "Sign in" button
    And Enter the "<Username>" and "<Password>"
    And Click to "Sign in" button
    Examples:
      | Username    | Password    |
      | hasemployee | hasemployee |
