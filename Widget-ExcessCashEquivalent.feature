Feature: Widget-ExcessCashEquivalent
  I want to verify dashboard widget - Excess Cash Equivalent

  # Scenario Description : Verify navigation on clicking the hyperlink for accounts in Excess Cash Equivalent widget
  # Jira ID : WRAAUTO-1398
  # Author  : Neeraj Maurya
  # Created : 31 Aug 20
  # Updated : 01 Sep 20
  # Defects : N/A
  @testnow
  Scenario: 28989057|To validate the navigation on clicking the account hyperlink in excess cash equivalent widget
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetExcessCashEquivalent" is visible
    When user clicks on "DashboardPage.menuExcessCashEquivalent"
    And user clicks on "DashboardPage.optionTop10ByAmount"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetExcessCashEquivalent"
    When user clicks on link in column "Name" with index "0" in widget "DashboardPage.widgetExcessCashEquivalent"
    Then verify that user is on "BalancePage" screen
    And verify element "BalancePage.tabCashBalanceDetail" is visible
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetExcessCashEquivalent" is visible
    When user clicks on "DashboardPage.menuExcessCashEquivalent"
    And user clicks on "DashboardPage.optionTop10ByPercentage"
    Then verify that user is on "DashboardPage" screen
    When user clicks on link in column "Name" with index "0" in widget "DashboardPage.widgetExcessCashEquivalent"
    Then verify that user is on "BalancePage" screen
    And verify element "BalancePage.tabCashBalanceDetail" is visible
