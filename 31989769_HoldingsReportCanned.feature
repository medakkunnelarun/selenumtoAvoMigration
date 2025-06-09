#Author: Neeraj Maurya
@regression @report @premiumReport
Feature: PremiumHoldingsReport
  I want to verify that premium holdings report can be generated and security idenfier type/value columns are present in the downloaded xlsx report
@22.4ReportRerun 
  Scenario: 31989769|Verify premium holdings report
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.PremiumHoldings.HoldingsReport"
    And user clicks on "ReportPage.buttonNext"
    #And user clicks on "ReportPage.dropdownSelectDate"
    #And user clicks on "ReportPage.optionPriorMonthEnd"
    And user clicks on "ReportPage.dropdownGroupBy"
    And user clicks on "ReportPage.optionGroupByCountry"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    When user selects account "#AccountNumber" on by account tab page
    And user clicks on "ReportPage.tabByRelationship"
    Then verify that user is on "ReportPage" screen
    When user selects relationship "#RelationshipName" and affiliation type "#AffiliationType" on by relationship tab page
    And user clicks on "ReportPage.tabByBranch"
     When user clicks on "ReportPage.tabByBranch"
    Then verify that user is on "ReportPage" screen
    When user selects bank name "#BankName" & branch name "#BranchName" on by branch tab page
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.checkboxXLSX"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    And user captures text of element "ReportPage.labelReportName" as "ReportName"
    When user clicks on "ReportPage.buttonCreateReport"
    And user waits for report to generate
    Then verify element "ReportPage.linkDownloadXLSX" is visible
    When user clicks on "ReportPage.linkDownloadXLSX"
    And user waits for file "#ReportName" to download
    And user clicks on "ReportPage.buttonOK"
    Then verify value "TICKER" is present in column "Security Identifier Type" in excel file "#ReportName"
    And verify column "Security Identifier" is present in downloaded excel file "#ReportName"