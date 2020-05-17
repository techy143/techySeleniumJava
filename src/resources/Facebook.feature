# This is a Feature ( # means comment )
  Feature: Login feature

  Scenario: Facebook Login with valid credentials

    Given I navigate to www.facebook.com
    When I enter Email and Password
    And  I click on login button
    Then I should go to Facebook home page

  Scenario: Facebook Login with invalid credentials

    Given I navigate to www.facebook.com
    When I enter wrong Email and Password
    And  I click on login button
    Then I should see the error message

