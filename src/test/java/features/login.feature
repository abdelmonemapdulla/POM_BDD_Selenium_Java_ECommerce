Feature: User login
  Scenario: User enters his credentials and successfully login
    Given User navigate to the website
    When  User navigates to login link
    And user enters his login credentials
    And User clicks on login button
    Then user logged in successfully