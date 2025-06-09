#Author: Aniket Bhosale
Feature: Verify ADDV_Master_Account_Statements_End_To_End_Flow form
@stmt
  Scenario: 47552153|ADDV_Master_Account_Statements_End_To_End_Flow
     #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    
    
    When user enters value "#BlockNumber" in textbox "FormRelationshipPage.lookupBlockNumber"
    And user selects value "#BlockNumber" from angular dropdown "FormRelationshipPage.lookupBlockNumber"
    And user enters value "#Numberofcopies" in textbox "FormAccountsPage.textBoxNumberOfCopies"
    And user enters value "#ExpirationDate" in textbox "FormRelationshipPage.dateExpirationDate"
    When user enters value "#StatementType" in textbox "FormRelationshipPage.lookupStatementType"
    And user selects value "#StatementType" from angular dropdown "FormRelationshipPage.lookupStatementType"
    When user enters value "#DispositionCode" in textbox "FormCashProcessingPage.lookupSrcdispositionCode"
    And user selects value "#DispositionCode" from angular dropdown "FormCashProcessingPage.lookupSrcdispositionCode"
    And user enters value "#HouseholdNumber" in textbox "FormRelationshipPage.txthouseholdNumber"
    And user enters value "#MonthsSuppressedfromprinting" in textbox "FormRelationshipPage.txtmonthsSuppressedFromPrinting"
 
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

