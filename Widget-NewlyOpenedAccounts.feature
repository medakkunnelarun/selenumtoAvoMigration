
Feature: Widget-NewlyOpenedAccounts
  I want to verify dashboard widget - Newly Opened Accounts

  # Scenario Description : Verify columns are present and data is correct in Newly Opened Accounts widget
  # Jira ID : WRAAUTO-1066
  # Author  : Vishal Sinha
  # Created : 20 Jul 20
  # Updated : 28 Jul 20
  # Defects : Date opened field is not getting validated as the format is ambiguous
  Scenario: 28989040|To validate the visibility of newly opened accounts widget
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetNewlyOpenedAccounts" is visible
    And user scroll to view widget "DashboardPage.widgetNewlyOpenedAccounts"
    When user clicks on "DashboardPage.menuNewlyOpenedAccounts"
    And user clicks on "DashboardPage.optionTop10Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify column "Name" is present in widget "DashboardPage.widgetNewlyOpenedAccounts"
    And verify column "Date Opened" is present in widget "DashboardPage.widgetNewlyOpenedAccounts"
    And verify column "Market Value" is present in widget "DashboardPage.widgetNewlyOpenedAccounts"
    And verify widget "DashboardPage.widgetNewlyOpenedAccounts" with service url "#ServiceUrl"

  #Scenario Description : Verify that cuurency code is displaying properly in Newly Opened Accounts widget
  #Jira ID : WRAAUTO-1066
  #Author  : Vishal Sinha
  #Created : 22 Jul 20
  #Updated : 28 Jul 20
  #Defects : N/A
  Scenario: 28989041|Verify currency code display in newly opened accounts widget
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetNewlyOpenedAccounts" is visible
    And user scroll to view widget "DashboardPage.widgetNewlyOpenedAccounts"
    And verify text "USD" is not present in column "Market Value" in widget "DashboardPage.widgetNewlyOpenedAccounts"
    And verify text "$" is not present in column "Market Value" in widget "DashboardPage.widgetNewlyOpenedAccounts"

  #Scenario Description : Verify that the asterisk on Date for non funded accounts under newly opened widget are visible
  #Jira ID : WRAAUTO-1066
  #Author  : Neeraj Maurya
  #Created : 22 Jul 20
  #Updated : 28 Jul 20
  #Defects : N/A
  Scenario: 28989042|To validate the asterisk on date for non funded accounts under newly opened widget
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetNewlyOpenedAccounts" is visible
    And user scroll to view widget "DashboardPage.widgetNewlyOpenedAccounts"
    And verify zero value in column "Market Value" and asterisk in column "Date Opened" for non-funded accounts present in widget "DashboardPage.widgetNewlyOpenedAccounts" with service url "#ServiceUrl1"
