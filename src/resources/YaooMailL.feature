Feature: Login feature

  Scenario: Yahoo Mail Login with valid credentials

    Given I navigate to www.yahoomail.com
    When I enter Email
    And  I click on Next button
    Then I should go to next page to Enter password
    When I enter Password
    And  I click on Next button
    Then I should go to mail home page

  Scenario: Yahoo Mail Login with invalid credentials

    Given I navigate to www.yahoomail.com
    When I enter Email
    And  I click on Next button
    Then I should go to next page to Enter password
    When I enter wrong Password
    And  I click on Next button
    Then I should see the error message
