Feature: Add products to Wish List

  Background: User is logged in
    Given I navigate to Login page
    When I enter 'accountfortestinglogin@mailinator.com', '111111' and submit it
    Then I see 'My Account' message

  Scenario: Add monitors to WishList
    Given I click at COMPONENTS on top menu
    When I click on MONITORS
    And I add all products to WishList
    And I navigate to WishList page
    Then I see list of products