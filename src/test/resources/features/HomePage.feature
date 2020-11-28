@homepage
Feature: As a user I should be able to navigate to home page


  Background:
    When User goes to given url


  Scenario Outline: Login with valid <Username>
    And Click to "Account Menu"
    And Click to "Sign in" button
    And Enter the "<Username>" and "<Password>"
    And Verify "Cancel" button is displayed
    And Click to "Sign in" button
    Then Verify "<FullName>" is displayed
    Examples:
      | Username       | Password       | FullName                |
      | hasemployee    | hasemployee    | myname mylastname       |
      | team11admin    | Team11admin    | team11aaaaa team11bbbbb |
      | team11customer | Team11customer | team11 team11b          |
      | team11user     | Team11user     | tulip tulip             |
      | team11manager  | Team11manager  | team11aaa team11bbb     |


  Scenario Outline: Login with IN-VALID <Username>
    And Click to "Account Menu"
    And Click to "Sign in" button
    And Enter the "<Username>" and "<Password>"
    And Verify "Cancel" button is displayed
    And Click to "Sign in" button
    Then Verify "<Alert>" message is displayed
    Examples:
      | Username      | Password     | Alert                                        |
      | jdfkbsdfjs322 | hasemployee  | Please check your credentials and try again. |
      | hasemployee   | ajkfnas      | Did you forget your password?                |
      | jsdfkaj       | quuqhhfn312. | Register a new account                       |
