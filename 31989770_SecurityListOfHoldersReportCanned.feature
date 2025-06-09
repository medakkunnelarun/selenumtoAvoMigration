#Author: Sindhu Mohan
@regression @report @premiumReport
Feature: SecurityListOfHoldersReportCanned
  Verify Security ListOfHolders Report Canned

  Scenario: 31989770|Verify security list of holders report-canned
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.StandardHoldings.SecurityListOfHolders"
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.dropdownSelectDate"
    And user clicks on "ReportPage.optionPriorMonthEnd"
    And user clicks on "ReportPage.dropdownFilterBy"
    And user clicks on "ReportPage.optionCusip"
    And user clicks on "ReportPage.textBoxSearchAdditionalFilter"
    And user enters value "#Cusip" in textbox "ReportPage.textBoxSearchAdditionalFilter"
    And user selects value "#Cusip" from angular dropdown "ReportPage.textBoxSearchAdditionalFilter"
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
