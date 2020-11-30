Feature: Login to OpenCard Demo site

  Scenario: Login with valid credentials
    Given I navigate to Login page
    When I enter 'accountfortestinglogin@mailinator.com', '111111' and submit it
    Then I see 'My Account' message

