#Author: Aniket Bhosale
Feature: Verify ADDV_Master_Add Related Accounts

  @RelAcc
  Scenario: 46497284|ADDV_Master_Add Related Accounts
    #initiate form
    When user initiate "#FormName" form flow
    
    #Select values and submit the form
    When user enters value "#MasterAccount" in textbox "FormAccountsPage.lookupMasterAccount"
    And user selects value "#MasterAccount" from angular dropdown "FormAccountsPage.lookupMasterAccount"
    When user enters value "#AccountNumber" in textbox "FormAccountsPage.lookupAccountToAdd"
    And user selects value "#AccountNumber" from angular dropdown "FormAccountsPage.lookupAccountToAdd"
    
    And user clicks on "FormDetailsPage.buttonSubmit"
    Then verify that ticket is submitted successfully and extract ticket id as "TicketID"
    And user clicks on "FormDetailsPage.iconDecisions"
    #And user hovers over element "CommonMenuPage.linkUserRequestList"
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