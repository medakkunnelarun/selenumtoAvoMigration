@regression @report @premiumReport
Feature: PortfolioSummaryReportCanned
  I want to verify premium portfolio summary report

  @sanity @22.4ReportRerun
  Scenario: 31989763|Verify portfolio summary report-canned
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user navigates to reports screen
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonAddNew"
    And user selects report category "PremiumReport.PremiumAccounts.PortfolioSummary"
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.dropdownSelectDate"
    And user clicks on "ReportPage.optionPreviousDate"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    When user selects account "#AccountNumber" on by account tab page
    And user clicks on "ReportPage.tabByRelationship"
    Then verify that user is on "ReportPage" screen
    When user selects relationship "#RelationshipName" and affiliation type "#AffiliationType" on by relationship tab page
    And user clicks on "ReportPage.tabByBank"
    Then verify that user is on "ReportPage" screen
    When user clicks on radio button of "#BankName" on by bank tab page
    And user clicks on "ReportPage.tabByBranch"
    Then verify that user is on "ReportPage" screen
    When user selects bank name "#BankName" & branch name "#BranchName" on by branch tab page
    And user clicks on "ReportPage.buttonNext"
    And user clicks on "ReportPage.checkboxXLSX"
    And user clicks on "ReportPage.buttonNext"
    Then verify that user is on "ReportPage" screen
    And user captures text of element "ReportPage.labelReportName" as "ReportName"
    When user clicks on "ReportPage.buttonCreateReport"
   Then verify element "ReportPage.linkDownloadXLSX" is visible
   When user clicks on "ReportPage.linkDownloadXLSX"
   And user waits for file "#ReportName" to download
   And user clicks on "ReportPage.buttonOK"
   Then verify value "Santos,Alan" is present in column "Relationship Name" in excel file "#ReportName"
   Then verify value "1040004467" is present in column "Account Number" in excel file "#ReportName"
   Then verify value "IBM" is present in column "Security Identifier" in excel file "#ReportName"
    Then verify value "ORCL" is present in column "Security Identifier" in excel file "#ReportName" 
    And user clicks on "ReportPage.linkBackToReports"
    Then verify that user is on "ReportPage" screen  
    And user clicks on "ReportPage.tabCompleted"
    Then verify that user is on "ReportPage" screen
    When user clicks on "ReportPage.buttonSearch"
    And user enters value "#ReportName" in textbox "ReportPage.textboxSearch"
    And verify text "Complete" is present in column "Status" in grid "ReportPage.reportGrid"
   
   
