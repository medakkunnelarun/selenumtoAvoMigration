#Author: Akanksha Sahu
@regression @report @premiumReport
Feature: Top20AccountBySizeReportCanned
  I want to verify that premium top 20 account by size report can be generated and security idenfier type/value columns are present in the downloaded xlsx report

  Scenario: 31989772|Verify top 20 account by size report-canned
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.PremiumHoldings.Top20AccountsBySize"
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.dropdownSelectDate"
    And user clicks on "ReportPage.optionPriorMonthEnd"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    And verify text of element "ReportPage.labelSelectAccountsNotification" should be "Account selection is not required for this report, please proceed to next step."
    When user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.checkboxXLSX"
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.buttonCreateReport"
    And user waits for report to generate
   Then verify element "ReportPage.linkDownloadXLSX" is visible
   And user clicks on "ReportPage.buttonOK"
   #TODO verify exported excel is not empty
   