Feature: Widget-LargeCashReceipts
  I want to verify dashboard widget - Newly Opened Accounts

  # Scenario Description : Verify columns are present and data is correct in Large Cash Receipts widget
  # Author  : Neeraj Maurya
  # Created : 09 Feb 21
  # Updated : 09 Feb 21
  
  Scenario: 29666248|To validate the visibility of large cash receipt widget
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetLargeCashReceipts" is visible
    And user scroll to view widget "DashboardPage.widgetLargeCashReceipts"
    When user clicks on "DashboardPage.menuLargeCashReceipts" using js
    And user clicks on "DashboardPage.option10Days"
    Then verify that user is on "DashboardPage" screen
    And verify column "Name" is present in widget "DashboardPage.widgetLargeCashReceipts"
    And verify column "Date" is present in widget "DashboardPage.widgetLargeCashReceipts"
    And verify column "Amount" is present in widget "DashboardPage.widgetLargeCashReceipts"
    And verify widget "DashboardPage.widgetLargeCashReceipts" with service url "#ServiceUrl"