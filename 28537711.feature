 Feature: Holdings transaction summary link
  I want to verify transaction summary link
 
@todo @1
 Scenario: 28537711|Verify transaction summary link in Account Holdings
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    Then user selects an account/client "#AccountNumber" from global search
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.linkActivity"
    Then verify that user is on "ActivityPage" screen
    When user clicks on "ActivityPage.dropdownDate"
    And user clicks on "ActivityPage.optionLast12Months"
    And user waits for grid "ActivityPage.gridActivityHistory" to be visible
    And user clicks on "CommonMenuPage.buttonColumnSettings"
    And user deselects all checkboxes in column settings panel
    And user clicks on "CommonMenuPage.buttonColumnSettings"
    And user clicks on "ActivityPage.checkboxSecurityDescription"
    And user clicks on "ActivityPage.checkboxUnits"
    And user clicks on "ActivityPage.buttonSaveFilterGrid"
    And user waits for grid "ActivityPage.gridActivityHistory" to be visible
    When user clicks on "CommonMenuPage.linkHoldings"
    Then verify that user is on "HoldingsPage" screen
    Then user clicks on "CommonMenuPage.buttonColumnSettings"
    And user deselects all checkboxes in column settings panel
    And user waits for grid "HoldingsPage.holdingsGrid" to be visible
    And user clicks on "HoldingsPage.linkExpandAll" if visible
    And user perform a page refresh
    #And user clicks on "HoldingsPage.linkNextPage"
    And user waits for grid "HoldingsPage.holdingsGrid" to be visible
    When user clicks on "HoldingsPage.dropdownGroupBy"
    And user clicks on "HoldingsPage.optionGroupByMajorIndustry"
    Then verify that user is on "HoldingsPage" screen
    And user clicks on link "#SecurityDescription" of column "Security Description" in grid "HoldingsPage.holdingsGrid"
    And user waits for element "HoldingsPage.buttonTransactionSummary" to be visible
    And user clicks on "HoldingsPage.buttonTransactionSummary"
    Then verify that user is on "ActivityPage" screen
    And user waits for grid "ActivityPage.gridActivityHistory" to be visible
    When user clicks on "ActivityPage.dropdownDate"
    And user clicks on "ActivityPage.optionLast12Months"
    And user waits for grid "ActivityPage.gridActivityHistory" to be visible
    Then verify text "#SecurityDescription" is present in all the values of column "Security Description" in grid "ActivityPage.gridActivityHistory"