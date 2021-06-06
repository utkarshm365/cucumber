Feature: Login Feature

	@smoketest
  Scenario: check login with valid credentials
  
    Given user is on login page
    When user enter username
    And user enter password
    And click on login button
    Then user navigate to home page
    
