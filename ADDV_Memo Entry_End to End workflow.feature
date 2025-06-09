#Author: Aniket Bhosale
Feature: Verify ADDV_Memo Entry_End to End workflow

  @Memo
  Scenario: 46497239|ADDV_Memo Entry_End to End workflow
    #initiate form
    When user initiate "#FormName" form flow
    
    #Select values and submit the form
    When user enters value "#CUSIP" in textbox "FormAccountsPage.lookupcusip"
    And user selects value "#CUSIP" from angular dropdown "FormAccountsPage.lookupcusip"
    And user enters value "#Description" in textbox "FormAccountsPage.textboxDescription"
    And user enters value "#EffectiveDate" in textbox "FormAccountsPage.textBoxEffectiveDate"
    And user enters value "#Amount" in textbox "FormAccountsPage.lookupAmount"
    When user enters value "#DisbCode" in textbox "FormAccountsPage.lookupDisbursementCode"
    And user selects value "#DisbCode" from angular dropdown "FormAccountsPage.lookupDisbursementCode"
    When user enters value "#TaxCode" in textbox "FormRelationshipPage.lookUpTaxCode"
    And user selects value "#TaxCode" from angular dropdown "FormRelationshipPage.lookUpTaxCode"
    
    
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