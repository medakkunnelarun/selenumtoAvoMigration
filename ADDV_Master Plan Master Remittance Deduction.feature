#Author: Aditya Bawane
Feature: Verify Master - Plan Master - Remittance Deduction

  @dynamicForms20242 
  Scenario: 46497246|ADDV | Master - Plan Master - Remittance Deduction - RD_End to End workflow
    #initiate form
    When user initiate "#FormName" form flow
    When user enters value "#PlanNumber" in textbox "FormPlanMastersPage.lookUpPlanNumber"
    And user selects value "#PlanNumber" from angular dropdown "FormPlanMastersPage.lookUpPlanNumber"
    When user enters value "#BlockNumber" in textbox "FormPlanMastersPage.lookUpBlockNumber"
    And user selects value "#BlockNumber" from angular dropdown "FormPlanMastersPage.lookUpBlockNumber"
    When user enters value "#DeductionCode" in textbox "FormPlanMastersPage.lookUpDeductionCode"
    And user selects value "#DeductionCode" from angular dropdown "FormPlanMastersPage.lookUpDeductionCode"
    When user enters value "#ControlAcctNum" in textbox "FormPlanMastersPage.lookUpControlAcctNum"
    
    
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
    
    
    
    
