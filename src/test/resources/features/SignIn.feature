@Unit
Feature: Sign in
  ​

  Background: 
    Given User is on retail website homepage
    When User click on the login link

  @login
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'ehsan@tekschool.us' and password 'Ehs@School1'
    And User click on login button
    Then User should be logged in into Account

  @createNewAccount
  Scenario: Verify user can create an account into retail website
    And User click on create new Account button
    And Use fill the signUp information with below  data
      | name  | email              | password    | confirmPassword |
      | Ehsan | Ehsan@tekschool.us | Ehs@School1 | Ehs@School1     |
    And User click on signUp button
    Then User should be logged into account page
