#Author: vishal.sinha
@regression @report @premiumReport
Feature: AssetDiversificationByPeriodReportCanned
  I want to verify asset diversification period canned report
	@22.4ReportRerun
  Scenario: 31989765|Verify asset diversification canned report
      Given user logs in to unity application with "#UserID"
    	Then verify that user is on "DashboardPage" screen
      When user navigates to reports screen
      Then verify that user is on "ReportPage" screen
      When user clicks on "ReportPage.buttonAddNew"
      Then verify that user is on "ReportPage" screen
      When user clicks on "ReportPage.dropdownCategory"
      When user clicks on "ReportPage.optionPremiumReport"
      When user clicks on "ReportPage.optionStandardHoldings"
      When user clicks on "ReportPage.optionAssetDiversificationByPeriod"
      When user clicks on "ReportPage.buttonNext"
      Then verify that user is on "ReportPage" screen
      When user clicks on "ReportPage.dropdownSelectDate"
      When user clicks on "ReportPage.optionPriorMonthEnd2"
      When user clicks on "ReportPage.buttonNext"
      Then verify that user is on "ReportPage" screen
      Then user selects account "#AccountNumber1" on by account tab page
      When user clicks on "ReportPage.tabByRelationship"     
      Then user selects relationship "#RelationshipName" and affiliation type "#AffiliationType" on by relationship tab page
      And user waits for "5" seconds
      When user clicks on "ReportPage.tabByBank"
      #Then verify that user is on "ReportPage" screen
      #When user clicks on radio button of "#BankName" on by bank tab page
      When user clicks on "ReportPage.tabByBranch"
      Then verify that user is on "ReportPage" screen
      Then user selects bank name "#BankName" & branch name "#BranchName" on by branch tab page
      When user clicks on "ReportPage.buttonNext"
      Then user waits for element "ReportPage.buttonNext" to be visible
      When user clicks on "ReportPage.checkboxXLSX"
      When user clicks on "ReportPage.buttonNext"
      Then verify that user is on "ReportPage" screen
      When user clicks on "ReportPage.buttonCreateReport"
      Then user waits for element "ReportPage.buttonOK" to be visible
      Then verify element "ReportPage.linkDownloadXLSX" is visible
      When user clicks on "ReportPage.buttonOK"
          