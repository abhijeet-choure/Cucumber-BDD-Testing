Feature: As a user,
         I want to login to the application
         So that I can see the home page.

  Scenario: Verify if login is successful when entered correct username and password
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is logged into application

    