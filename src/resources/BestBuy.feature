Feature: Login feature

  Scenario: BestBuy Login with valid credentials

    Given I navigate to www.bestbuy.com
    And I click on Account signin button
    When I enter UserID and Password
    And I CLICK on Signin button
    Then I should go to home page

    Scenario: BestBuy Login with invalid credentials

      Given I navigate to www.bestbuy.com
      And I click on Account signin button
      When I enter wrong UserID and password
      And I click on Signin button
      Then I Should see error message