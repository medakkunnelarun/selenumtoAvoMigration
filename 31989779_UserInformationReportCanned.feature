#Author: Akanksha Sahu
@regression @report @premiumReport
Feature: UserInformationReportCanned
  I want to verify that premium user Information report can be generated
@runnow
  Scenario: 31989779|Verify user information report-canned
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport"
    And verify element "ReportPage.optionPremiumUserInformation" is not visible
    #And user clicks on "ReportPage.buttonNext"
    #And user clicks on "ReportPage.buttonNext"
    #Then verify that user is on "ReportPage" screen
    #And verify text of element "ReportPage.labelSelectAccountsNotification" should be "Account selection is not required for this report, please proceed to next step."
    #When user clicks on "ReportPage.buttonNext"
    #And user clicks on "ReportPage.checkboxXLSX"
    #And user clicks on "ReportPage.buttonNext"
    #And user clicks on "ReportPage.buttonCreateReport"
    #And user waits for report to generate
    #Then verify element "ReportPage.linkDownloadXLSX" is visible
    #And user clicks on "ReportPage.buttonOK"
