Feature: Google Search

  Scenario: Validate Google Search text field

    Given I open a browser
    And I navigate to www.google.com
    Then I validate the search text field
