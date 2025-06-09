@regression
Feature: VerifyCashProjectionScreenDisplaySettings
  I want to verify cash projection screen display setting

  # Author  : Tushar Gaikwad
  # Created : 02/12/2021
  # Updated :
  # Jira ID :
  
  Scenario: WRAWUP-T10080|To validate account cash projection screen-Display settings
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
    And verify element "BalancePage.labelCashToShow" is visible
    And verify element "BalancePage.labelDisplay" is visible
    And verify element "BalancePage.buttonRefresh" is visible
    And verify element "BalancePage.radioButtonAvailableAll" is visible
    And verify element "BalancePage.radioButtonAvailableIncome" is visible
    And verify element "BalancePage.radioButtonAvailablePrincipal" is visible
    And verify element "BalancePage.radioButtonDaily" is visible
    And verify element "BalancePage.radioButtonGroupByCategory" is visible
    #And verify element "BalancePage.radioButtonAvailableAll" is selected

  # Author	: Rupali
  @RetestMEPlease @1
  Scenario: WRAWUP-T44252|To validate account Cash projection screen
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
    And verify default date in cash projection should display 8 calender days
    When user clicks on "BalancePage.dropdownDate"
    Then verify element "BalancePage.radioButtonOneWeek" is visible
    And verify element "BalancePage.radioButton30Days" is visible
    And verify element "BalancePage.radioButton60Days" is visible
    And verify element "BalancePage.radioButton90Days" is visible
    And verify element "BalancePage.radioButtonChooseDate" is visible
    And user clicks on "BalancePage.radioButton30Days"
    When user clicks on "BalancePage.buttonDateRefresh"
    Then verify that user is on "BalancePage" screen
    # Need to verify grid
