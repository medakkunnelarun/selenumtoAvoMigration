@regression @report @premiumReport
Feature: ReverseStep1SameReport
  I want to verify ReverseStep1SameReport
@NewPremium @Kyu1 @runnow
  Scenario: 40710813|Verify report is generated successfully when coming back to Step 1 and selecting same Report - All Premium Report
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.PremiumCashHoldings.CashReport"
    And user clicks on "ReportPage.buttonNext"
    And user waits for "5" seconds
    And user clicks on "ReportPage.buttonBack"
    And user selects report category "PremiumReport.PremiumCashHoldings.CashReport"
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.dropdownSelectDate"
    And user clicks on "ReportPage.optionPriorMonthEnd"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    #When user deselects checkbox "ReportPage.checkboxBookOfBusiness"
    When user selects account "#AccountNumber" on by account tab page
    And user clicks on "ReportPage.tabByRelationship"
    Then verify that user is on "ReportPage" screen
    When user selects relationship "#RelationshipName" and affiliation type "#AffiliationType" on by relationship tab page
    And user clicks on "ReportPage.tabByBranch"
    And user waits for "2" seconds
    When user clicks on "ReportPage.tabByBranch"
    Then verify that user is on "ReportPage" screen
    When user selects bank name "#BankName" & branch name "#BranchName" on by branch tab page
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.checkboxXLSX"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonCreateReport"
    And user waits for report to generate
   Then verify element "ReportPage.linkDownloadXLSX" is visible
   And user clicks on "ReportPage.buttonOK"