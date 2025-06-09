#Author: Aniket Bhosale
Feature: Verify ADDV_Master - Plan Master - Regulatory Processing - REG form
@MasterPlan

  Scenario: 46497261|ADDV_Master_Plan Master_Regulatory Processing_REG
     #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    
    When user enters value "#PlanNumber" in textbox "FormAccountsPage.lookupPlanNumber"
    And user selects value "#PlanNumber" from angular dropdown "FormAccountsPage.lookupPlanNumber"
    When user enters value "#RptUnderOmniTaxNum" in textbox "FormRelationshipPage.lookuprtpUnderOmniTaxNum"
    And user selects value "#RptUnderOmniTaxNum" from angular dropdown "FormRelationshipPage.lookuprtpUnderOmniTaxNum"
    And user enters value "#PatriotActId" in textbox "FormRelationshipPage.textBoxPatriotActId"
 
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

