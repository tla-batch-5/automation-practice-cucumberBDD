Feature: User DB page tests

  @US-2
  Scenario: Verify title of the page
    Given User opens "User-Mgt" page
    When User clicks on "Access DB" button
    And User switches to new window
    Then Verifies title of the page is "User DB"