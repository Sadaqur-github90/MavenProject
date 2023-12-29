Feature: Test to Amazon homepage
  Scenario: Search Box Testing
    Given I am at Amazon homepage
    When  I click on search box
    And   I write "handbag" into search box
    Then  I click on search
