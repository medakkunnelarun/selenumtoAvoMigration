#Author: Akanksha Sahu
@regression @report @premiumReport
Feature: TransactionDetailReportCanned
  I want to verify that premium transaction detail report can be generated
@22.4ReportRerun @runnow
  Scenario: 31989778|Verify transaction detail report-canned
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.PremiumTransactions.TransactionDetailReport"
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.dropdownSelectDate"
    And user clicks on "ReportPage.optionPriorMonthRange"
    And user clicks on "ReportPage.dropdownTransactionType"
    # to do to check sorting for dropdown values
    #And user clicks on "ReportPage.optionAccruedIntPaid"
    And user selects value "#TransactionType" from angular dropdown "ReportPage.drpDwnTransactionType"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    And user selects account "#AccountNumber" on by account tab page
    And user clicks on "ReportPage.tabByRelationship"
    Then verify that user is on "ReportPage" screen
    When user selects relationship "#RelationshipName" and affiliation type "#AffiliationType" on by relationship tab page
    And user clicks on "ReportPage.tabByBranch"
    And user clicks on "ReportPage.tabByBranch"
    When user selects bank name "#BankName" & branch name "#BranchName" on by branch tab page
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.checkboxXLSX"
    When user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonCreateReport"
    And user waits for report to generate
    Then verify element "ReportPage.linkDownloadXLSX" is visible
    And user clicks on "ReportPage.buttonOK"
