Feature: Widget-Overdrafts
  I want to verify dashboard widget - Overdrafts

  # Scenario Description : Verify columns are present and data is correct in Overdrafts widget
  # Jira ID : 
  # Author  :Vishal Sinha
  # Created : 17 Nov 20
  # Updated : 
  # Defects : GPD-3491544
  
  Scenario: 28989039|To validate the visibility of Overdrafts
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetOverdrafts" is visible
    And user scroll to view widget "DashboardPage.widgetOverdrafts"
    When user clicks on "DashboardPage.menuOverDrafts"
    And user clicks on "DashboardPage.optionTop10Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify column "Name" is present in widget "DashboardPage.widgetOverdrafts"
    And verify column "Amount Overdrawn" is present in widget "DashboardPage.widgetOverdrafts"
    And verify widget "DashboardPage.widgetOverdrafts" with service url "#ServiceUrl"

  # Scenario Description : Verify that cuurency code is displaying properly in Overdrafts widget
  # Jira ID : WRAAUTO-1066
  # Author  : Neeraj Maurya
  # Created : 30 Jul 20
  # Updated : 30 Jul 20
  # Defects : N/A
  
  Scenario: 28989043|To validate the currency code for Overdrafts for advantage
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetOverdrafts" is visible
    And user scroll to view widget "DashboardPage.widgetOverdrafts"
    And verify currency code is not present in the values of column "Market Value" in widget "DashboardPage.widgetOverdrafts"
    
     # Author  : Shilpa Khare
    @testme 
    Scenario: 40207414|Widget - Overdraft : Validate Export feature
   Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetOverdrafts" is visible
    And user scroll to view widget "DashboardPage.widgetOverdrafts"
    When user clicks on "DashboardPage.menuOverDrafts" using js
    #And user clicks on "DashboardPage.optionTop10Portfolios"
    And user clicks on "DashboardPage.optionTop10Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify column "Name" is present in widget "DashboardPage.widgetOverdrafts"
    And verify column "Amount Overdrawn" is present in widget "DashboardPage.widgetOverdrafts"
    And verify widget "DashboardPage.widgetOverdrafts" with service url "#ServiceUrl1"
		And user clicks on "DashboardPage.exportOverdraft"
		And user waits for file "#ReportName" to download
		##And verify exported csv "#ReportName" with service url "#ServiceUrl1"
    When user clicks on "DashboardPage.menuOverDrafts" using js
    #And user clicks on "DashboardPage.optionTop20Portfolios"
    And user clicks on "DashboardPage.optionTop20Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify column "Name" is present in widget "DashboardPage.widgetOverdrafts"
    And verify column "Amount Overdrawn" is present in widget "DashboardPage.widgetOverdrafts"
    And verify widget "DashboardPage.widgetOverdrafts" with service url "#ServiceUrl2"
		And user clicks on "DashboardPage.exportOverdraft"
		And user waits for file "#ReportName" to download
		##And verify exported csv "#ReportName" with service url "#ServiceUrl2"
    When user clicks on "DashboardPage.menuOverDrafts" using js
    And user clicks on "DashboardPage.optionTop30Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify column "Name" is present in widget "DashboardPage.widgetOverdrafts"
    And verify column "Amount Overdrawn" is present in widget "DashboardPage.widgetOverdrafts"
   And verify widget "DashboardPage.widgetOverdrafts" with service url "#ServiceUrl3"
		And user clicks on "DashboardPage.exportOverdraft"
		And user waits for file "#ReportName" to download
		##And verify exported csv "#ReportName" with service url "#ServiceUrl3"
