@regression
Feature: CashProjectionScreenSummary
  I want to verify To account cash projection screen - summary

  # Author  : Nilesh Swami
  # Created : 08/24/2022
  # Updated :
  # Jira ID :
  @RetestMEPlease @1
  Scenario: WRAWUP-T28367|To validate account cash projection screen - summary
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user selects an account/client "#AccountNumber" from global search
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.linkBalance"
    Then verify that user is on "BalancePage" screen
    And verify element "BalancePage.tabCashBalanceDetail" is visible
    And verify element "BalancePage.tabCashProjections" is visible
    When user clicks on "BalancePage.tabCashProjections"
    Then verify element "BalancePage.dropdownDate" is visible
    And verify element "BalancePage.dropdownPortfolio" is visible
    And verify element "BalancePage.panelDisplaySettings" is visible
    And verify element "BalancePage.panelCashAndLiquidAssetSummary" is visible
    And verify element "BalancePage.panelCashProjectionSummary" is visible
    #When user clicks on "BalancePage.panelCashAndLiquidAssetSummary"
    Then verify that user is on "BalancePage" screen
    Then verify element "BalancePage.dropdownDate" is visible
    When user clicks on "BalancePage.dropdownDate"
    Then verify element "BalancePage.radioButtonOneWeek" is visible
    And verify element "BalancePage.radioButtonOneWeek" is visible
    When user clicks on "BalancePage.radioButtonOneWeek"
    Then verify element "BalancePage.radioButtonChooseDate" is visible
    When user clicks on "BalancePage.buttonDateRefresh"
    And user clicks on "BalancePage.radioButtonAvailable"
    And user clicks on "BalancePage.radioButtonAvailableAll"
    #Then verify element "BalancePage.radioButtonAvailableAll" is selected
    #When user clicks on "BalancePage.radioButtonGroupByCategory"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "10" seconds
    And verify column "Date" is present in "BalancePage.gridCashProjectionSummary" grid
    And verify column "Cash Increase" is present in "BalancePage.gridCashProjectionSummary" grid
    And verify column "Cash Decrease" is present in "BalancePage.gridCashProjectionSummary" grid
    And verify column "Net Change" is present in "BalancePage.gridCashProjectionSummary" grid
    And verify column "Daily Balance" is present in "BalancePage.gridCashProjectionSummary" grid
    Then verify element "BalancePage.checkboxScheduledDisbursements" is visible
    Then verify element "BalancePage.checkboxScheduledReceipts" is visible
    Then verify element "BalancePage.checkboxFees" is visible
    Then verify cash projection total for column "Cash Increase" in grid "BalancePage.gridCashProjectionSummary"
    And verify cash projection total for column "Cash Decrease" in grid "BalancePage.gridCashProjectionSummary"
    And verify cash projection total for column "Net Change" in grid "BalancePage.gridCashProjectionSummary"
    And user applies descending sort on column "Date" in grid "BalancePage.gridCashProjectionSummary"
    And user applies descending sort on column "Cash Increase" in grid "BalancePage.gridCashProjectionSummary"
    And user applies descending sort on column "Cash Decrease" in grid "BalancePage.gridCashProjectionSummary"
    And user applies descending sort on column "Net Change" in grid "BalancePage.gridCashProjectionSummary"
    And user applies descending sort on column "Daily Balance" in grid "BalancePage.gridCashProjectionSummary"
    When user clicks on "BalancePage.buttonPrintCashProjectionSummay"
    Then user clicks on "CommonMenuPage.buttonPrintCurrentPage"
    And user switches to new window
    And verify text "Date" is present in print current page
    And verify text "Cash Increase" is present in print current page
    And verify text "Cash Decrease" is present in print current page
    And verify text "Net Change" is present in print current page
    And verify text "Daily Balance" is present in print current page
    And verify text "Cash Projection Summary" is present in print current page
    And user switches back to parent window
    Then verify that user is on "FeeReceivablesPage" screen
    When user clicks on "CommonMenuPage.buttonExportToCSV"
