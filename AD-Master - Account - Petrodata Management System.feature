#Author: Nick
Feature: Verify AD-Master - Account - Petrodata Management System_EndToEnd Checkout


  Scenario: 42584391|AD-Master - Account - Petrodata Management System_EndToEnd Checkout
    #initiate form
    When user initiate "#FormName" form flow
    
    When user enters value "#TRMSEligible" in textbox "FormAccountsPage.lookUpTRMSEligible"
    And user selects value "#TRMSEligible" from angular dropdown "FormAccountsPage.lookUpTRMSEligible"
    When user enters value "#TMMSEligible" in textbox "FormAccountsPage.lookUpTMMSEligible"
    And user selects value "#TMMSEligible" from angular dropdown "FormAccountsPage.lookUpTMMSEligible"
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
