#Author: Shilpa Khare

@tag
Feature: Holdings Grid - Security Identifier and Type_Defect_U 2023.5

  @tag1 
  Scenario: 46375138|Validate the Security Identifire Type Column is hide for Account. 
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    Then user selects an account/client "#AccountNumber" from global search
    When user clicks on "CommonMenuPage.linkHoldings"
    Then verify that user is on "HoldingsPage" screen
    And verify grid "HoldingsPage.holdingsGrid" is visible
    And verify column "Security Identifire Type" should not present in "HoldingsPage.holdingsGrid" grid
    Then user clicks on "CommonMenuPage.buttonColumnSettings"
    And verify element "HoldingsPage.checkboxSecurityIdentifierType" is not visible
    And user clicks on "CommonMenuPage.buttonSaveColumnSettings"
    Then verify that user is on "HoldingsPage" screen
    And user waits for grid "HoldingsPage.holdingsGrid" to be visible
    When user clicks on "CommonMenuPage.buttonPrint"
    Then user clicks on "CommonMenuPage.buttonPrintCurrentPage"
    And user switches to new window
    And verify text "Security Identifire Type" is not present in print current page
    And user switches back to parent window
    When user clicks on "CommonMenuPage.buttonExportToCSV"
    #And user waits for file "#FileName" to download
    And user waits for file "#FileName" to download and save file as "ExportedFile"
    And verify column "Security Identifire Type" is not present in downloaded excel file "#ExportedFile"
    
    @1
    Scenario: 46375139|Validate the Security Identifire Number Column is hide for Account. 
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    Then user selects an account/client "#AccountNumber" from global search
    When user clicks on "CommonMenuPage.linkHoldings"
    Then verify that user is on "HoldingsPage" screen
    And verify grid "HoldingsPage.holdingsGrid" is visible
    And verify column "Security Identifire Number" should not present in "HoldingsPage.holdingsGrid" grid
    Then user clicks on "CommonMenuPage.buttonColumnSettings"
    And verify element "HoldingsPage.checkboxSecurityIdentifierNumber" is not visible
    And user clicks on "CommonMenuPage.buttonSaveColumnSettings"
    Then verify that user is on "HoldingsPage" screen
    And user waits for grid "HoldingsPage.holdingsGrid" to be visible
    When user clicks on "CommonMenuPage.buttonPrint"
    Then user clicks on "CommonMenuPage.buttonPrintCurrentPage"
    And user switches to new window
    And verify text "Security Identifire Number" is not present in print current page
    And user switches back to parent window
    When user clicks on "CommonMenuPage.buttonExportToCSV"
    #And user waits for file "#FileName" to download
    And user waits for file "#FileName" to download and save file as "ExportedFile"
    And verify column "Security Identifire Number" is not present in downloaded excel file "#ExportedFile"

 