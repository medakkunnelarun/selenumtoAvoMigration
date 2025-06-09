@regression
Feature: VerifyCashProjectionHeader
  I want to verify cash projection screen

  # Author  : Tushar Gaikwad
  # Created : 02/12/2021
  # Updated :
  # Jira ID :
  
  Scenario: WRAWUP-T30298|To validate cash projection header
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user selects an account/client "#AccountNumber" from global search
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.linkBalance"
    Then verify that user is on "BalancePage" screen
    And verify element "BalancePage.tabCashBalanceDetail" is visible
    And verify element "BalancePage.tabCashProjections" is visible
    When user clicks on "BalancePage.tabCashProjections"
    Then verify that user is on "BalancePage" screen
    And verify text of element "BalancePage.labelInstitutionName" should contain "Institution Name"
    And verify text of element "BalancePage.labelAdministrativeOfficer" should contain "Administrative Officer"
    And verify text of element "BalancePage.labelInvestmentOfficer" should contain "Investment Officer"
    And verify element "BalancePage.labelInvestmentAuthority" is not visible
    And verify element "BalancePage.labelInvestmentObjective" is not visible

  #Gayatri
  @RetestMEPlease 
  Scenario: WRAWUP-T38968|To validate account cash projection summary detail screen
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
    And user waits for "30" seconds
    And user clicks on link in column "Date" with index "1" in grid "BalancePage.gridCashProjectionSummary"
    And user waits for grid "BalancePage.gridCashProjectionDetail" to be visible
    When user clicks on "CommonMenuPage.buttonColumnSettings"
    And user selects all checkboxes in column settings panel
    Then verify that user is on "BalancePage" screen
    #When user perform a page refresh
    Then verify that user is on "BalancePage" screen
    And verify column "Cash Change" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Description" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Portfolio Number" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Portfolio Name" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Projection Date" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Security Identifier" is present in "BalancePage.gridCashProjectionDetail" grid
    And verify column "Security Description" is present in "BalancePage.gridCashProjectionDetail" grid
    #_And verify grid "BalancePage.gridCashProjectionDetail" with service url "#ServiceUrl"
    When user clicks on "BalancePage.buttonExportToCSV"
    Then verify exported file name "#FileName" in downloads
    When user clicks on "BalancePage.buttonPrint"
    Then verify element "BalancePage.buttonPrintCurrentPage" is visible

  #Gayatri 
  @1
  Scenario: WRAWUP-T47521|To validate account cash projection summary-Include check boxes
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
    When user clicks on "BalancePage.checkboxScheduledDisbursements"
    And user clicks on "BalancePage.checkboxScheduledReceipts"
    And user clicks on "BalancePage.checkboxFees"
    And user waits for "30" seconds
    Then verify text "OTHER DISBURSEMENTS" is not present in column "Description" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    And verify text "OTHER RECEIPTS" is not present in column "Description" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    When user clicks on "BalancePage.checkboxScheduledDisbursements"
    And user clicks on "BalancePage.checkboxScheduledReceipts"
    And user clicks on "BalancePage.checkboxFees"
    And user waits for "30" seconds
    Then verify text "OTHER DISBURSEMENTS" is present in column "Description" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
    And verify text "OTHER RECEIPTS" is present in column "Description" in grid "BalancePage.gridCashProjectionSummaryGroupByCategory"
