 Feature: Holdings UI for holdings filter
  I want to verify UI for holdings filter
 
@todo
 Scenario: 28740457|Verify holdings grid
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    Then user selects an account/client "#AccountNumber" from global search
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.linkHoldings"
    Then verify that user is on "HoldingsPage" screen
    When user clicks on "HoldingsPage.dropdownGroupBy"
    And user clicks on "HoldingsPage.optionGroupByMajorSecurity"
    Then verify that user is on "HoldingsPage" screen
    And verify grid "HoldingsPage.holdingsGrid" is visible
    Then user clicks on "CommonMenuPage.buttonColumnSettings"
    And validate that element "HoldingsPage.checkboxBaseCurrency" is visible
    And validate that element "HoldingsPage.checkboxBookValueBase" is visible
    And validate that element "HoldingsPage.checkboxCurrentFace" is visible
    And validate that element "HoldingsPage.checkboxEquivalenceFactor" is visible
    And validate that element "HoldingsPage.checkboxEstimatedAnnualIncomeBase" is visible
    #And validate that element "HoldingsPage.checkboxEstimatedAnnualIncomeLocal" is visible
    And validate that element "HoldingsPage.checkboxEstimatedAnnualIncomeRate" is visible
    #And validate that element "HoldingsPage.checkboxEstimatedUnrealizedGainLossBase" is visible
    And validate that element "HoldingsPage.checkboxFactorValid" is visible
    #And validate that element "HoldingsPage.checkboxFederalCostBase" is visible
    #And validate that element "HoldingsPage.checkboxFederalCostLocal" is visible
    And validate that element "HoldingsPage.checkboxMarketValueBase" is visible
    #And validate that element "HoldingsPage.checkboxMarketValueLocal" is visible
    And validate that element "HoldingsPage.checkboxMajorSecurityCode" is visible
    And validate that element "HoldingsPage.checkboxLocalCurrency" is visible
    And validate that element "HoldingsPage.checkboxMinorSecurity" is visible
    And validate that element "HoldingsPage.checkboxPercent" is visible
    And validate that element "HoldingsPage.checkboxPortfolioNumber" is visible
    And validate that element "HoldingsPage.checkboxPriceBase" is visible
    #And validate that element "HoldingsPage.checkboxPriceLocal" is visible
    And validate that element "HoldingsPage.checkboxSecurityAlphaSort" is visible
    And validate that element "HoldingsPage.checkboxSecurityIdentifierNumber" is visible
    And validate that element "HoldingsPage.checkboxSecurityIdentifierType" is visible
    And validate that element "HoldingsPage.checkboxTicker" is visible
    And validate that element "HoldingsPage.checkboxUnits" is visible
    #And validate that element "HoldingsPage.checkboxUnrealizedGainLossLocal" is visible
    And user deselects all checkboxes in column settings panel
    And user waits for grid "HoldingsPage.holdingsGrid" to be visible
    Then verify column "Group By" is present in "HoldingsPage.holdingsGrid" grid
    Then verify column "Security Description" is present in "HoldingsPage.holdingsGrid" grid
    Then verify column "Security Identifier" is present in "HoldingsPage.holdingsGrid" grid
    Then user clicks on "CommonMenuPage.buttonColumnSettings"
    And user clicks on "HoldingsPage.checkboxBaseCurrency"
    And user clicks on "HoldingsPage.checkboxUnits"
    And user clicks on "CommonMenuPage.buttonSaveColumnSettings"
    Then verify that user is on "HoldingsPage" screen
    And user waits for grid "HoldingsPage.holdingsGrid" to be visible
    Then verify column "Base Currency" is present in "HoldingsPage.holdingsGrid" grid
    Then verify column "Units" is present in "HoldingsPage.holdingsGrid" grid 
    And user perform a page refresh
    When user clicks on "CommonMenuPage.buttonExportToCSV"
    And user waits for file "#FileName" to download and save file as "ExportedFile"
    Then verify exported csv "#ExportedFile" with expandable grid "HoldingsPage.holdingsGrid"
    When user clicks on "CommonMenuPage.buttonPrint"
    Then user clicks on "CommonMenuPage.buttonPrintCurrentPage"
    And user switches to new window
    And verify text "Group By" is present in print current page
    And verify text "Security Description" is present in print current page
    And verify text "Security Identifier" is present in print current page
    And user switches back to parent window