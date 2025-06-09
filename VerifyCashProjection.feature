@regression
Feature: VerifyCashProjection
  I want to verify cash projection screen

  # Verify cash projection
  # Author  : Shilpa Khare
  # Created : 13 Sept 21
  # Updated :
  # Jira ID :
    
  Scenario: WRAWUP-T49103| To validate account cash projection screen-Display-Group by Category
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
    When user clicks on "BalancePage.dropdownDate"
    Then verify element "BalancePage.radioButtonOneWeek" is visible
    And verify element "BalancePage.radioButton90Days" is visible
    When user clicks on "BalancePage.radioButton90Days"
    Then verify element "BalancePage.radioButtonChooseDate" is visible
    When user clicks on "BalancePage.buttonDateRefresh"
    And user clicks on "BalancePage.radioButtonAvailable"
    And user clicks on "BalancePage.radioButtonAvailableAll"
    #Then verify element "BalancePage.radioButtonAvailableAll" is selected
    When user clicks on "BalancePage.radioButtonGroupByCategory"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "30" seconds
    Then verify cash projection total for column "Principal Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Others Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Total Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Cash" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    And verify cash projection total for column "Principal Cash" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    And user clicks on "BalancePage.radioButtonAvailable"
    And user clicks on "BalancePage.radioButtonAvailableIncome"
    When user clicks on "BalancePage.radioButtonGroupByCategory"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "30" seconds
    Then verify cash projection total for column "Principal Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Others Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Total Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Cash" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    And verify cash projection total for column "Principal Cash" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    And user clicks on "BalancePage.radioButtonAvailable"
    And user clicks on "BalancePage.radioButtonAvailablePrincipal"
    When user clicks on "BalancePage.radioButtonGroupByCategory"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "30" seconds
    Then verify cash projection total for column "Principal Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Others Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Total Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Cash" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    And verify cash projection total for column "Principal Cash" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    When user clicks on "BalancePage.checkboxScheduledDisbursements"
    And user clicks on "BalancePage.checkboxScheduledReceipts"
    And user clicks on "BalancePage.checkboxFees"
    And user waits for "30" seconds
    Then verify text "scheduled disbursements" is not present in column "Description" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    And verify text "scheduled receipts" is not present in column "Description" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    
    @RetestMEPlease @1
    Scenario: WRAWUP-T8868|To validate account cash projection screen-Display-Daily
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
    When user clicks on "BalancePage.dropdownDate"
    Then verify element "BalancePage.radioButtonOneWeek" is visible
    And verify element "BalancePage.radioButton90Days" is visible
    When user clicks on "BalancePage.radioButton90Days"
    Then verify element "BalancePage.radioButtonChooseDate" is visible
    When user clicks on "BalancePage.buttonDateRefresh"
    And user clicks on "BalancePage.radioButtonAvailable"
    And user clicks on "BalancePage.radioButtonAvailableAll"
    #Then verify element "BalancePage.radioButtonAvailableAll" is selected
    When user clicks on "BalancePage.radioButtonDaily"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "30" seconds
    Then verify cash projection total for column "Principal Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Others Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Total Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And user clicks on "BalancePage.radioButtonAvailable"
    And user clicks on "BalancePage.radioButtonAvailableIncome"
    When user clicks on "BalancePage.radioButtonDaily"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "30" seconds
    Then verify cash projection total for column "Principal Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Others Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And user clicks on "BalancePage.radioButtonAvailable"
    And user clicks on "BalancePage.radioButtonAvailablePrincipal"
    When user clicks on "BalancePage.radioButtonDaily"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "30" seconds
    Then verify cash projection total for column "Principal Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Others Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Total Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    
