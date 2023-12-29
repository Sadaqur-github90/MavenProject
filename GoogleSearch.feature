Feature: To test google search functionality.
@Smoke Test
  Scenario: Validate google search is working.
    Given google browser is open
    And user on google search page
    When user enters a "text" in search box.
    And hits enter
    Then user is navigated to the search results.





