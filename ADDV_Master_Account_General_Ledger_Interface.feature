#Author: Gayatri Powar

Feature: ADDV_Master_Account_General_Ledger_Interface
  
  I want to verify ADDV-Master - Account - General Ledger Interface form

  Scenario: 45010741|ADDV-Master - Account - General Ledger Interface
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    When user enters value "#costCenterNumber" in textbox "FormAccountsPage.lookupcostCenterNumber"
    And user selects value "#costCenterNumber" from angular dropdown "FormAccountsPage.lookupcostCenterNumber"
    When user enters value "#excludeFromGLInterface" in textbox "FormAccountsPage.lookupexcludeFromGLInterface"
    And user selects value "#excludeFromGLInterface" from angular dropdown "FormAccountsPage.lookupexcludeFromGLInterface"
    And user waits for "5" seconds
    And user clicks on "FormDetailsPage.buttonSubmit"
    Then verify that ticket is submitted successfully and extract ticket id as "TicketID"
    And user clicks on "FormDetailsPage.iconDecisions"
    And user clicks on "CommonMenuPage.linkUserRequestList"
    And user switches to frame element "UnityDecisionsPage.frameDecisionsAzure"
    When user logs in with "#InitiatorUserID" if "UnitySSOLoginPage.textBoxUserID" is visible
    And user captures value of column "Descriptors" as "Descriptors" for ticket ID "#TicketID" from table "UnityDecisionsPage.tableDecisions"
    Then verify column "Current State" has value "Awaiting First Approval" for ticket ID "#TicketID" in table "UnityDecisionsPage.tableDecisions"
    And user switches to default content
    And user logs out of Unity
    And user closes current browser instance
    And user opens new browser
    #approval flow
    And user performs the Approval Flow if required
    #Verification Flow
    And user validate final form status with Initiator ID
