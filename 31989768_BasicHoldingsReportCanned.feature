#Author: neeraj.maurya
@regression @report @premiumReport
Feature: BasicHoldingsReportCanned
  I want to verify premium basic holdings report

  Scenario: 31989768|Verify basic holdings report-canned
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.PremiumHoldings.HoldingsBasic"
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.dropdownSelectDate"
    And user clicks on "ReportPage.optionPriorMonthEnd"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    When user selects account "#AccountNumber" on by account tab page
    And user clicks on "ReportPage.tabByRelationship"
    Then verify that user is on "ReportPage" screen
    When user selects relationship "#RelationshipName" and affiliation type "#AffiliationType" on by relationship tab page
    When user clicks on "ReportPage.tabByBranch"
    Then verify that user is on "ReportPage" screen
    Then user selects bank name "#BankName" & branch name "#BranchName" on by branch tab page
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.checkboxXLSX"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonCreateReport"
    And user waits for report to generate
    Then verify element "ReportPage.linkDownloadXLSX" is visible
    And user clicks on "ReportPage.buttonOK"
