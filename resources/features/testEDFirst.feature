Feature: Verify the basic functionality of ED

  Scenario: I could book a table easily
    Given I navigate to easydiner
    And Select a city
    And Select date and time
    When I click on book now
    Then It should navigate to payment page

  Scenario: Close browser
    Then I close browser
