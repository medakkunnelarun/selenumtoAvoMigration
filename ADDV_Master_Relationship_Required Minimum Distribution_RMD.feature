#Author: Aniket Bhosale
Feature: Verify ADDV_Master_Relationship_Required Minimum Distribution_RMD form
@RMD

  Scenario: 46497056|ADDV_Master_Relationship_Required Minimum Distribution_RMD form
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    
    When user selects value "#AccountNumber" from angular dropdown "FormRelationshipPage.lookupaccountLookup"
   When user enters value "#InterestedParty" in textbox "FormRelationshipPage.lookupInterestedParty"
   And user waits for "5" seconds
    And user selects value "#InterestedParty" from angular dropdown "FormRelationshipPage.lookupInterestedParty"
    When user selects value "#Relationship" from angular dropdown "FormRelationshipPage.dropdownselectRelationship"
    And user enters value "#YTDRMDPayments" in textbox "FormRelationshipPage.txtytdRmdPayments"
    
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
    