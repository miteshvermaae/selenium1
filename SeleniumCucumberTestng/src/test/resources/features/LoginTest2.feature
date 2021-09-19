Feature: logintest2-Test PHp Travels Login Functionality

  @SanityTest
  Scenario: logintest2-User is able to login successfully
    Given user has opened phptravels homepage
    When user clicks login button on home page
    Then Login page is opened having title "Login - PHPTRAVELS"
    And enters following login details
      | username | user@phptravels.com |
      | password | demouser            |
    And clicks login button on login page
    Then user should be navigated to dashboard page

  @XYZTest @SanityTest
  Scenario Outline: logintest2--User is able to login successfully with examples
    Given user has opened phptravels homepage
    When user clicks login button on home page
    Then Login page is opened having title "Login - PHPTRAVELS"
    And enters following login details
      | username | <email> |
      | password | <pass>  |
    And clicks login button on login page
    Then user should be navigated to dashboard page


    Examples:
      | email               | pass     |
      | user@phptravels.com | demouser |
      | user1@phptravels.com | demouser |