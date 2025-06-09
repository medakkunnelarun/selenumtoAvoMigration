#Author: Sindhu Mohan
@regression @report @premiumreport
Feature: ForeignAccountsReportCanned
  Verify Foreign Accounts Report Canned - Premium

  Scenario: 31989762|Verify foreign accounts report-canned
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.PremiumAccounts.ForeignAccounts"
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.dropdownSelectDate"
    And user clicks on "ReportPage.optionPriorMonthEnd"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    And verify text of element "ReportPage.labelSelectAccountsNotification" should be "Account selection is not required for this report, please proceed to next step."
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.checkboxXLSX"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonCreateReport"
    And user waits for report to generate
    Then verify element "ReportPage.linkDownloadXLSX" is visible
    And user clicks on "ReportPage.buttonOK"
