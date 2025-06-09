#Author: Akanksha Sahu
@regression @report @premiumReport
Feature: Top20RelationshipBySizeReportCanned
  I want to verify that premium top 20 relationship by size report can be generated

  Scenario: 31989774|Verify top 20 relationship by size report-canned
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.PremiumHoldings.Top20RelationshipBySize"
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
