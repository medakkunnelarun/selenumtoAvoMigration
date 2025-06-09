 @regression
Feature: CashProjectionScreenCashAndLiquidAssetSummaryAccordion
  I want to verify cash projection Cash and liquid asset summary Accordion

  # Author  : Nilesh Swami
  # Created : 08/24/2022
  # Updated :
  # Jira ID :
 @RetestMEPlease @1
  Scenario: WRAWUP-T33989|To validate account cash projection screen - Cash and liquid asset summary Accordion
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
    And verify column "Asset Description" is present in "BalancePage.gridCashAndLiquidAssetSummary" grid
    And verify column "Currency" is present in "BalancePage.gridCashAndLiquidAssetSummary" grid
    And verify column "Income Balance" is present in "BalancePage.gridCashAndLiquidAssetSummary" grid
    And verify column "Others Balance" is present in "BalancePage.gridCashAndLiquidAssetSummary" grid
    And verify column "Principal Balance" is present in "BalancePage.gridCashAndLiquidAssetSummary" grid
    And verify column "Total Balance" is present in "BalancePage.gridCashAndLiquidAssetSummary" grid
     Then verify element "BalancePage.dropdownDate" is visible
    When user clicks on "BalancePage.dropdownDate"
    Then verify element "BalancePage.radioButtonOneWeek" is visible
    And verify element "BalancePage.radioButton90Days" is visible
    When user clicks on "BalancePage.radioButton90Days"
    Then verify element "BalancePage.radioButtonChooseDate" is visible
    When user clicks on "BalancePage.buttonDateRefresh"
    And user clicks on "BalancePage.radioButtonAvailable"
    And user clicks on "BalancePage.radioButtonAvailableAll"
    #And verify attribute "value" of element "BalancePage.radioButtonAvailableAll" should be "A"
    #Then verify element "BalancePage.radioButtonAvailableAll" is selected
    When user clicks on "BalancePage.radioButtonGroupByCategory"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "30" seconds
    Then verify cash projection total for column "Principal Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Income Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Others Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
    And verify cash projection total for column "Total Balance" in grid "BalancePage.gridCashAndLiquidAssetSummary"
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
    And verify column "Asset Description" is present in "BalancePage.gridCashAndLiquidAssetSummary" grid
  	And user applies descending sort on column "Asset Description" in grid "BalancePage.gridCashAndLiquidAssetSummary"
   	When user clicks on "CommonMenuPage.buttonPrint"
    Then user clicks on "CommonMenuPage.buttonPrintCurrentPage"
    And user switches to new window
    And verify text "Asset Description" is present in print current page
    And verify text "Principal Balance" is present in print current page
    And verify text "Income Balance" is present in print current page
    And verify text "Others Balance" is present in print current page
    And verify text "Total Balance" is present in print current page
    And verify text "Currency" is present in print current page
    And verify text "Cash and Liquid Asset Summary" is present in print current page
    And user switches back to parent window
    Then verify that user is on "FeeReceivablesPage" screen
    When user clicks on "CommonMenuPage.buttonExportToCSV"
    Then user waits for file "#FileName" to download and save file as "ExportedFile"
    And verify exported csv "#ExportedFile" with grid "BalancePage.gridCashAndLiquidAssetSummary" 
    
    
    Scenario: WRAWUP-T20119|Validate Cash Projection Details return back functionality
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
    And user clicks on "BalancePage.radioButtonAvailableIncome"
    When user clicks on "BalancePage.radioButtonDaily"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "30" seconds
    And user captures text of element "BalancePage.gridCashLiquidAssetSummaryTotalRow" as "CashLiquidAssetSummaryTotalRow"
    And user captures text of element "BalancePage.gridCashProjectionSummaryTotalRow" as "CashProjectionSummaryTotalRow"
    And user clicks on link in column "Date" with index "1" in grid "BalancePage.gridCashProjectionSummary"
    And user waits for grid "BalancePage.gridCashProjectionDetail" to be visible
    And verify element "BalancePage.LinkBackToCashProjection" is visible
    And user clicks on "BalancePage.LinkBackToCashProjection"
    Then verify that user is on "BalancePage" screen
    Then verify element "BalancePage.dropdownDate" is visible
    When user clicks on "BalancePage.dropdownDate"
    And verify attribute "class" of element "BalancePage.radioButton90DaysStatus" should contains "mat-mdc-radio-checked"
    And verify attribute "class" of element "BalancePage.radioButtonOneWeekStatus" should not contains "mat-mdc-radio-checked"
    #When user clicks on "BalancePage.buttonDateRefresh"
    And verify attribute "class" of element "BalancePage.radioButtonAvailable" should contains "mat-mdc-radio-checked"
    And verify attribute "class" of element "BalancePage.radioButtonAvailableIncomeStatus" should contains "mat-mdc-radio-checked"
    And verify attribute "class" of element "BalancePage.radioButtonDailyStatus" should contains "mat-mdc-radio-checked"
    And verify text of element "BalancePage.gridCashLiquidAssetSummaryTotalRow" should be "#CashLiquidAssetSummaryTotalRow"
    And verify text of element "BalancePage.gridCashProjectionSummaryTotalRow" should be "#CashProjectionSummaryTotalRow"
    And user clicks on "CommonMenuPage.linkHomeOffice"
    When user selects an account/client "#AccountNumber" from global search
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.linkBalance"
    Then verify that user is on "BalancePage" screen
    And verify element "BalancePage.tabCashBalanceDetail" is visible
    And verify element "BalancePage.tabCashProjections" is visible
    When user clicks on "BalancePage.tabCashProjections"
    Then verify element "BalancePage.dropdownDate" is visible
    When user clicks on "BalancePage.dropdownDate"
    And verify attribute "class" of element "BalancePage.radioButtonOneWeekStatus" should contains "mat-mdc-radio-checked"
    And verify attribute "class" of element "BalancePage.radioButton90DaysStatus" should not contains "mat-mdc-radio-checked"
    When user clicks on "BalancePage.buttonDateRefresh"
    And verify attribute "class" of element "BalancePage.radioButtonAvailable" should contains "mat-mdc-radio-checked"
    And verify attribute "class" of element "BalancePage.radioButtonDailyStatus" should contains "mat-mdc-radio-checked"
    And verify attribute "class" of element "BalancePage.radioButtonAvailableAllStatus" should contains "mat-mdc-radio-checked"
    
    
     @R
    Scenario: WRAWUP-T31783|To validate security identifier hyperlink on cash projection summary detail screen
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
    When user clicks on "BalancePage.radioButtonOneWeek"
    Then verify element "BalancePage.radioButtonChooseDate" is visible
    When user clicks on "BalancePage.buttonDateRefresh"
    And user clicks on "BalancePage.radioButtonAvailable"
    And user clicks on "BalancePage.radioButtonAvailableIncome"
    When user clicks on "BalancePage.radioButtonDaily"
    And user clicks on "BalancePage.buttonRefresh"
    And user waits for "30" seconds
    And user clicks on link "05/31/2010" of column "Date" in grid "BalancePage.gridCashProjectionSummary"
    #And user clicks on link in column "Date" with index "1" in grid "BalancePage.gridCashProjectionSummary"
    And user waits for grid "BalancePage.gridCashProjectionDetail" to be visible
    And verify column "Cash Change" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Description" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Portfolio Number" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Portfolio Name" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Projection Date" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Security Identifier" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Security Description" is present in "BalancePage.gridCashProjectionDetail" grid
    And user clicks on link in column "Security Identifier" with index "1" in grid "BalancePage.gridCashProjectionDetail"
    Then verify element "BalancePage.dialogSecurityIdentifier" is visible
    Then verify element "BalancePage.dialogSecurityIdentifierlabelName" is visible
    Then verify element "BalancePage.dialogSecurityIdentifierlabelPrice" is visible
    Then verify element "BalancePage.dialogSecurityIdentifierlabelPriceasOf" is visible
    Then verify element "BalancePage.dialogSecurityIdentifierlabelPricingSource" is visible
    Then verify element "BalancePage.dialogSecurityIdentifierlabelMinorSecurityType" is visible
    Then verify element "BalancePage.dialogSecurityIdentifierlabelSecurityProcessingClass" is visible
    Then verify element "BalancePage.dialogSecurityIdentifierlabelTicker" is visible
    Then verify element "BalancePage.dialogSecurityIdentifierButtonClose" is visible
    And user clicks on "BalancePage.dialogSecurityIdentifierButtonClose"
    And verify element "BalancePage.dialogSecurityIdentifier" is not visible
    
    
    
    
    