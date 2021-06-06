@google
Feature: google search test

  Scenario: check google search
    Given open browser
    And user is on google page
    When enter text in search box
    And hit enter
    Then navigate to search page
