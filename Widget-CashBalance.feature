
Feature: Widget-CashBalance
  I want to verify dashboard widget - Cash Balance

  # Scenario Description : Verify the navigation on clicking the hyperlink for account
  # Jira ID : N/A
  # Author  : Neeraj Maurya
  # Created : 03 Sep 20
  # Updated : 03 Sep 20
  # Defects : N/A
  Scenario: 28989056|To validate the navigation on clicking the hyperlink for account
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetCashBalance" is visible
    When user clicks on "DashboardPage.menuCashBalance"
    And user clicks on "DashboardPage.optionTop10Accounts"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetCashBalance"
    When user captures value with index "0" in column "Name" from widget "DashboardPage.widgetCashBalance" as "AccountName"
    And user clicks on link in column "Name" with index "0" in widget "DashboardPage.widgetCashBalance"
    Then verify that user is on "BalancePage" screen
    And verify text of element "BalancePage.labelAccountName" should contain "#AccountName"
    And verify element "BalancePage.tabCashBalanceDetail" is visible

  # Scenario Description : Verify the navigation on clicking the hyperlink for client
  # Jira ID : N/A
  # Author  : Neeraj Maurya
  # Created : 03 Sep 20
  # Updated : 03 Sep 20
  # Defects : N/A
  Scenario: 28989060|To validate the navigation on clicking the hyperlink for client
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetCashBalance" is visible
    And user scroll to view widget "DashboardPage.widgetCashBalance"
    When user clicks on "DashboardPage.menuCashBalance"
    And user clicks on "DashboardPage.optionTop10Clients"
    Then verify that user is on "DashboardPage" screen
    And user clicks on link in column "Name" with index "0" in widget "DashboardPage.widgetCashBalance"
    Then verify that user is on "ClientDetailsPage" screen
    And verify element "ClientDetailsPage.tabClientInformation" is visible

  # Scenario Description : Verify the navigation between the charts view and list view
  # Jira ID : WRAAUTO-1395
  # Author  : Neeraj Maurya
  # Created : 17 Sep 20
  # Updated : 17 Sep 20
  # Defects : N/A
  Scenario: 28989054|To validate the navigation between charts view and list view
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    Then verify widget "DashboardPage.widgetCashBalance" is visible
    And user scroll to view widget "DashboardPage.widgetCashBalance"
    When user clicks on "DashboardPage.linkListChartCashBalance" if visible
    Then verify that user is on "DashboardPage" screen
    And verify element "DashboardPage.linkBarChartCashBalance" is visible
    And verify element "DashboardPage.linkDonutChartCashBalance" is visible
    When user clicks on "DashboardPage.linkDonutChartCashBalance"
    Then verify that user is on "DashboardPage" screen
    And verify element "DashboardPage.donutChartCashBalance" is visible
    When user clicks on "DashboardPage.linkBarChartCashBalance"
    Then verify that user is on "DashboardPage" screen
    And verify element "DashboardPage.barChartCashBalance" is visible
    When user clicks on "DashboardPage.linkListChartCashBalance"
    Then verify that user is on "DashboardPage" screen
    And verify element "DashboardPage.listChartCashBalance" is visible

  # Scenario Description : Verify that Cash Balance widget is getting updated as per selected set of accounts
  # Jira ID : WRAAUTO-1392
  # Author  : Neeraj Maurya
  # Created : 17 Sep 20
  # Updated : 17 Sep 20
  # Defects : N/A
  Scenario: 28989052|Validate the ability to select different set of accounts (10, 20 or 30)
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetCashBalance" is visible
    And user scroll to view widget "DashboardPage.widgetCashBalance"
    When user clicks on "DashboardPage.menuCashBalance"
    And user clicks on "DashboardPage.optionTop10Accounts"
    And user clicks on "DashboardPage.linkListChartTopMarketValue" if visible
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetCashBalance" with service url "#ServiceUrl"
    When user clicks on "DashboardPage.menuCashBalance"
    And user clicks on "DashboardPage.optionTop20Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetCashBalance" with service url "#ServiceUrl1"
    When user clicks on "DashboardPage.menuCashBalance"
    And user clicks on "DashboardPage.optionTop30Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetCashBalance" with service url "#ServiceUrl2"

  # Scenario Description : Verify that Cash Balance widget is getting updated as per selected set of clients
  # Jira ID : WRAAUTO-1392
  # Author  : Neeraj Maurya
  # Created : 17 Sep 20
  # Updated : 17 Sep 20
  # Defects : N/A
  Scenario: 28989064|Validate the ability to select different set of clients (10, 20 or 30)
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    Then user waits for element "DashboardPage.menuCashBalance" to be visible
    And user scroll to view widget "DashboardPage.widgetCashBalance"
    When user clicks on "DashboardPage.menuCashBalance"
    And user clicks on "DashboardPage.optionTop10Clients"
    And user clicks on "DashboardPage.linkListChartTopMarketValue" if visible
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetCashBalance" with service url "#ServiceUrl"
    When user clicks on "DashboardPage.menuCashBalance"
    And user clicks on "DashboardPage.optionTop20Clients"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetCashBalance" with service url "#ServiceUrl1"
    When user clicks on "DashboardPage.menuCashBalance"
    And user clicks on "DashboardPage.optionTop30Clients"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetCashBalance" with service url "#ServiceUrl2"
