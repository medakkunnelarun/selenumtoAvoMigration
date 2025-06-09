
Feature: Widget-TopMarketValue
  I want verify widget - Top Market Value

  # Scenario Description : Verify the navigation between the charts view and list view
  # Jira ID : WRAAUTO-1396
  # Author  : Neeraj Maurya
  # Created : 03 Sep 20
  # Updated : 08 Sep 20
  # Defects : N/A
  Scenario: 28989055|To validate the navigation between charts view and list view
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    Then verify widget "DashboardPage.widgetTopMarketValue" is visible
    And user scroll to view widget "DashboardPage.widgetTopMarketValue"
    When user clicks on "DashboardPage.linkListChartTopMarketValue" if visible
    Then verify that user is on "DashboardPage" screen
    And verify element "DashboardPage.linkBarChartTopMarketValue" is visible
    And verify element "DashboardPage.linkDonutChartTopMarketValue" is visible
    When user clicks on "DashboardPage.linkDonutChartTopMarketValue"
    Then verify that user is on "DashboardPage" screen
    And verify element "DashboardPage.linkBarChartTopMarketValue" is visible
    When user clicks on "DashboardPage.linkBarChartTopMarketValue"
    Then verify that user is on "DashboardPage" screen
    And verify element "DashboardPage.barChartTopMarketValue" is visible
    When user clicks on "DashboardPage.linkListChartTopMarketValue"
    Then verify that user is on "DashboardPage" screen
    And verify element "DashboardPage.listChartTopMarketValue" is visible

  # Scenario Description : Verify bar chart data for accounts
  # Jira ID : WRAAUTO-1396
  # Author  : Neeraj Maurya
  # Created : 08 Sep 20
  # Updated : 08 Sep 20
  # Defects : N/A
  @failing2
  Scenario: 28989061|Validate bar chart data for accounts
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    Then verify widget "DashboardPage.widgetTopMarketValue" is visible
    And user scroll to view widget "DashboardPage.widgetTopMarketValue"
    When user clicks on "DashboardPage.menuTopMarketValue"
    And user clicks on "DashboardPage.optionTop10Accounts"
    And user clicks on "DashboardPage.linkListChartTopMarketValue" if visible
    Then verify that user is on "DashboardPage" screen
    And verify bar chart in widget "DashboardPage.widgetTopMarketValue" for columns "Name" and "Market Value"

  # Scenario Description : Verify bar chart data for clients
  # Jira ID : WRAAUTO-1396
  # Author  : Neeraj Maurya
  # Created : 08 Sep 20
  # Updated : 08 Sep 20
  # Defects : N/A
  Scenario: 28989062|Validate bar chart data for clients
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    Then verify widget "DashboardPage.widgetTopMarketValue" is visible
    And user scroll to view widget "DashboardPage.widgetTopMarketValue"
    When user clicks on "DashboardPage.menuTopMarketValue"
    And user clicks on "DashboardPage.optionTop10Clients"
    And user clicks on "DashboardPage.linkListChartTopMarketValue" if visible
    Then verify that user is on "DashboardPage" screen
    And verify element "DashboardPage.linkBarChartTopMarketValue" is visible
    And verify element "DashboardPage.linkDonutChartTopMarketValue" is visible
    Then verify bar chart in widget "DashboardPage.widgetTopMarketValue" for columns "Name" and "Market Value"

  # Scenario Description : Verify that Top Market Value widget is getting updated as per selected set of accounts
  # Jira ID : GPD-3471530
  # Author  : Neeraj Maurya
  # Created : 08 Sep 20
  # Updated : 08 Sep 20
  # Defects : N/A
  Scenario: 28989050|Validate the ability to select different set of accounts (10, 20 or 30)
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" is visible
    And user scroll to view widget "DashboardPage.widgetTopMarketValue"
    When user clicks on "DashboardPage.menuTopMarketValue"
    And user clicks on "DashboardPage.optionTop10Accounts"
    And user clicks on "DashboardPage.linkListChartTopMarketValue" if visible
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" with service url "#ServiceUrl"
    When user clicks on "DashboardPage.menuTopMarketValue"
    And user clicks on "DashboardPage.optionTop20Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" with service url "#ServiceUrl1"
    When user clicks on "DashboardPage.menuTopMarketValue"
    And user clicks on "DashboardPage.optionTop30Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" with service url "#ServiceUrl2"

  # Scenario Description : Verify that Top Market Value widget is getting updated as per selected set of clients
  # Jira ID : GPD-3471530
  # Author  : Neeraj Maurya
  # Created : 08 Sep 20
  # Updated : 08 Sep 20
  # Defects : N/A
  Scenario: 28989051|Validate the ability to select different set of clients (10, 20 or 30)
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" is visible
    And user scroll to view widget "DashboardPage.widgetTopMarketValue"
    When user clicks on "DashboardPage.menuTopMarketValue" using js
    And user clicks on "DashboardPage.optionTop10Clients"
    And user clicks on "DashboardPage.linkListChartTopMarketValue" if visible
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" with service url "#ServiceUrl"
    When user clicks on "DashboardPage.menuTopMarketValue"
    And user clicks on "DashboardPage.optionTop20Clients"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" with service url "#ServiceUrl1"
    When user clicks on "DashboardPage.menuTopMarketValue"
    And user clicks on "DashboardPage.optionTop30Clients"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" with service url "#ServiceUrl2"

  # Scenario Description : Verify the navigation on clicking the hyperlink for account
  # Jira ID : WRAAUTO-1394
  # Author  : Neeraj Maurya
  # Created : 17 Sep 20
  # Updated : 17 Sep 20
  # Defects : N/A
  Scenario: 28989053|To validate the navigation on clicking the hyperlink for account
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And user clicks on "DashboardPage.linkListChartTopMarketValue" if visible
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" is visible
    And user scroll to view widget "DashboardPage.widgetTopMarketValue"
    When user clicks on "DashboardPage.menuTopMarketValue"
    And user clicks on "DashboardPage.optionTop10Accounts"
    Then verify that user is on "DashboardPage" screen
    When user captures value with index "0" in column "Name" from widget "DashboardPage.widgetTopMarketValue" as "AccountName"
    And user clicks on link in column "Name" with index "0" in widget "DashboardPage.widgetTopMarketValue"
    Then verify that user is on "HoldingsPage" screen

  # Scenario Description : Verify the navigation on clicking the hyperlink for client
  # Jira ID : WRAAUTO-1394
  # Author  : Neeraj Maurya
  # Created : 17 Sep 20
  # Updated : 17 Sep 20
  # Defects : N/A
  Scenario: 28989063|To validate the navigation on clicking the hyperlink for client
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And user clicks on "DashboardPage.linkListChartTopMarketValue" if visible
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetTopMarketValue" is visible
    And user scroll to view widget "DashboardPage.widgetTopMarketValue"
    When user clicks on "DashboardPage.menuTopMarketValue"
    And user clicks on "DashboardPage.optionTop10Clients"
    Then verify that user is on "DashboardPage" screen
    And user clicks on link in column "Name" with index "0" in widget "DashboardPage.widgetTopMarketValue"
    Then verify that user is on "ClientDetailsPage" screen
    And verify element "ClientDetailsPage.tabClientInformation" is visible
