Feature: AccountCashBalance
  I want verify Account Cash Balance Details

  # Author: Moises Vargas
  @1
    Scenario: WRAWUP-T36674|To validate Account Cash Balance screen
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And user selects an account/client "#AccountNumber" from global search
    Then verify that user is on "AccountDetailsPage" screen
    And user clicks on "CommonMenuPage.linkBalance"
    Then verify that user is on "BalancePage" screen
    And verify element "BalancePage.tabCashBalanceDetail" is visible
    And verify element "BalancePage.tabCashProjections" is visible
    And user clicks on "CommonMenuPage.buttonColumnSettings"
    And user selects all checkboxes in column settings panel
    #When user clicks on "BalancePage.buttonSave"
    Then verify that user is on "BalancePage" screen
    And user clicks on "CommonMenuPage.buttonColumnSettings"   
    And verify element "BalancePage.checkboxAccountNumber" is visible
    And verify element "BalancePage.checkboxAvailableCash" is visible
    And verify element "BalancePage.checkboxCashReserves" is visible
    And verify element "BalancePage.checkboxInvested" is visible
    And verify element "BalancePage.checkboxLinesOfCredit" is visible
    And verify element "BalancePage.checkboxTotal" is visible
    And verify element "BalancePage.checkboxUninvested" is visible
    And verify element "BalancePage.buttonSave" is visible
    And user clicks on "BalancePage.checkboxAccountNumber"
    And user clicks on "BalancePage.checkboxCashReserves"
    And user clicks on "BalancePage.checkboxAvailableCash"
    When user clicks on "BalancePage.buttonSave"
    Then verify element "BalancePage.headerInvested" is visible
    And verify element "BalancePage.headerLinesOfCredit" is visible
    And verify element "BalancePage.headerUninvested" is visible
    And verify element "BalancePage.headerTotal" is visible
    #And user clicks on "CommonMenuPage.buttonColumnSettings"
    #And user clicks on "BalancePage.checkboxInvested"
    #And user clicks on "BalancePage.checkboxLinesOfCredit"
    #And user clicks on "BalancePage.checkboxTotal"
    #And user clicks on "BalancePage.checkboxUninvested"
    #When user clicks on "BalancePage.buttonSave"
    Then verify element "BalancePage.headerPortfolioName" is visible
    And verify element "BalancePage.headerPortfolioNumber" is visible
    And user clicks on "BalancePage.buttonExportToCSV"
    Then user waits for file "#FileName" to download and save file as "AccountCashDetail"
    And verify exported csv "#AccountCashDetail" with grid "BalancePage.gridCashBalanceDetail"
    And user clicks on "BalancePage.buttonPrint"
    And user clicks on "BalancePage.buttonPrintCurrentPage"
    #And user switches to new window
    Then verify text "Portfolio Number" is present in print current page
    Then verify text "Portfolio Name" is present in print current page
    #And user switches back to parent window
    #And user switches to default content
    Then verify that user is on "BalancePage" screen
    #And user waits for "5" seconds

@RR 
  Scenario: WRAWUP-T11803|To validate Account Cash Balance Details Page
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And user selects an account/client "#AccountNumber" from global search
    Then verify that user is on "AccountDetailsPage" screen
    And user clicks on "CommonMenuPage.linkBalance"
    Then verify that user is on "BalancePage" screen
    When user clicks on link "2099006335.I" of column "Portfolio Number" in grid "BalancePage.gridCashBalanceDetail"
    And verify element "BalancePage.panelCashDetail" is visible
    And verify element "BalancePage.panelSweepDetail" is visible
    And verify element "BalancePage.panelSweepHoldingsSummary" is visible
    #And user clicks on "BalancePage.panelCashDetail"
    And verify element "BalancePage.labelCashReserves" is visible
    And verify element "BalancePage.labelLinesOfCredit" is visible
    And verify element "BalancePage.labelCashManagement" is visible
    And verify element "BalancePage.labelGoodFedFunds" is visible
    And verify element "BalancePage.labelAvailableFunds" is visible
    And verify element "BalancePage.labelTotalAvailableCash" is visible
    And user clicks on "BalancePage.panelSweepDetail"
    And verify element "BalancePage.labelCurrentSweepStrategyNumberKey" is visible
    And verify element "BalancePage.labelCurrentSweepStrategyAbbreviationKey" is visible
    And verify element "BalancePage.labelCurrentSweepStrategyKey" is visible
    And verify element "BalancePage.labelNextSweepStrategyNumberKey" is visible
    And verify element "BalancePage.labelNextSweepStrategyAbbreviationKey" is visible
    And verify element "BalancePage.labelNextSweepStrategyKey" is visible
    And user clicks on "BalancePage.panelSweepHoldingsSummary"
    And verify element "BalancePage.headerSecurityName" is visible
    And verify element "BalancePage.headerAmount" is visible
