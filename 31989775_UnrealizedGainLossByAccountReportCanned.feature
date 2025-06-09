@regression @report @premiumReport
Feature: UnrealizedGainLossByAccountReportCanned
  I want to verify premium unrealized gain loss by account report
@22.4ReportRerun
  Scenario: 31989775|Verify unrealized gain loss by account report-canned
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.PremiumHoldings.UnrealizedGainLossByAccount"
    And user clicks on "ReportPage.buttonNext"
    Then verify element "ReportPage.dropdownSelectDate" is visible
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    When user selects account "#AccountNumber" on by account tab page
    And user clicks on "ReportPage.tabByRelationship"
    Then verify that user is on "ReportPage" screen
    When user selects relationship "#RelationshipName" and affiliation type "#AffiliationType" on by relationship tab page
    And user clicks on "ReportPage.tabByBranch"
     And user clicks on "ReportPage.tabByBranch"
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
