 Feature: Holdings UI for holdings filter
  I want to verify UI for holdings filter
 
@todo
 Scenario: 28740456|Verify UI for holdings filter
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    Then user selects an account/client "#AccountNumber" from global search
    When user clicks on "CommonMenuPage.linkHoldings"
    Then verify that user is on "HoldingsPage" screen
    And validate that element "HoldingsPage.dropdownHoldings" is visible
    When user clicks on "HoldingsPage.dropdownHoldings"
    And validate that element "HoldingsPage.optionListByCategory" is visible
    And validate that element "HoldingsPage.optionListBySecurity" is visible
    And user clicks on "HoldingsPage.optionListByCategory"