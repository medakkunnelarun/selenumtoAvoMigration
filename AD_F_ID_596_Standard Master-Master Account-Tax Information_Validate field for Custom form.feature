#Author: Palash Saxena
Feature: AD-Standard Master-Master Account-Tax Information-Custom Form
  I want to AD-Standard Master-Master Account-Tax Information-Custom Form

  Scenario: 47532685|AD-Standard Master-Master Account-Tax Information Submit custom Form
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    #When user enters value "#PortfolioNumber" in textbox "FormTradeProcessingPage.dropdowntblPortfolio"
    When user enters value "#MasterAccount" in textbox "FormAccountsPage.lookupMasterAccount"
    And user selects value "#MasterAccount" from angular dropdown "FormAccountsPage.lookupMasterAccount"
    And user waits for "5" seconds
    When user enters value "#TaxStatus" in textbox "FormAccountsPage.lookuptaxStatus"
    And user selects value "#TaxStatus" from angular dropdown "FormAccountsPage.lookuptaxStatus"
    And user enters value "#textnewTaxYearEnd" in textbox "FormAccountsPage.textnewTaxYearEnd"
   When user enters value "#lookupTaxGainTo" in textbox "FormAccountsPage.lookupTaxGainTo"
   And user selects value "#lookupTaxGainTo" from angular dropdown "FormAccountsPage.lookupTaxGainTo"
    When user enters value "#lookupTaxIncomeTo" in textbox "FormAccountsPage.lookupTaxIncomeTo"
   And user selects value "#lookupTaxIncomeTo" from angular dropdown "FormAccountsPage.lookupTaxIncomeTo"
    And user selects value "#dropdownnoTaxReporting" from angular dropdown "FormAccountsPage.dropdownnoTaxReporting"
    And user selects value "#dropdownnootherReqForms" from angular dropdown "FormAccountsPage.dropdownnootherReqForms"
    And user selects value "#dropdownnothTaxReports" from angular dropdown "FormAccountsPage.dropdownnothTaxReports"
    And user selects value "#dropdownntaxLetter1" from angular dropdown "FormAccountsPage.dropdownntaxLetter1"
    And user selects value "#dropdownntaxLetter2" from angular dropdown "FormAccountsPage.dropdownntaxLetter2"
    And user selects value "#dropdownntaxLetter3" from angular dropdown "FormAccountsPage.dropdownntaxLetter3"
    And user clicks on "FormDetailsPage.buttonSubmit"
    Then verify that ticket is submitted successfully and extract ticket id as "TicketID"
    And user clicks on "FormDetailsPage.iconDecisions"
    And user clicks on "CommonMenuPage.linkUserRequestList"
    And user switches to frame element "UnityDecisionsPage.frameDecisionsAzure"
    When user logs in with "#InitiatorUserID" if "UnitySSOLoginPage.textBoxUserID" is visible
    And user captures value of column "Descriptors" as "Descriptors" for ticket ID "#TicketID" from table "UnityDecisionsPage.tableDecisions"
    #And user captures value of column "FormName" as "FormName" for ticket ID "#TicketID" from table "UnityDecisionsPage.tableDecisions"
    Then verify column "Current State" has value "Awaiting First Approval" for ticket ID "#TicketID" in table "UnityDecisionsPage.tableDecisions"
    And user switches to default content
    And user logs out of Unity
    And user closes current browser instance
    And user opens new browser
    #approval flow
    And user performs the Approval Flow if required
    #Verification Flow
    And user validate final form status with Initiator ID
