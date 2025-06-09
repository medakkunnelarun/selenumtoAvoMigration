#Author: Palash Saxena
Feature: AD-Standard Master-Master Account-Tax Information
  I want to AD-Standard Master-Master Account-Tax Information

  Scenario: 47532687|AD-Standard Master-Master Account-Tax Information Submit form only with Mandatory fields
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    #When user enters value "#PortfolioNumber" in textbox "FormTradeProcessingPage.dropdowntblPortfolio"
    When user enters value "#MasterAccount" in textbox "FormAccountsPage.lookupMasterAccount"
    And user selects value "#MasterAccount" from angular dropdown "FormAccountsPage.lookupMasterAccount"
    And user waits for "20" seconds
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
