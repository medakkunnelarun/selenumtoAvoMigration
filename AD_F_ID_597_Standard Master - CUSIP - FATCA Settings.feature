#Author: Aditya Bawane
Feature: Verify Standard Master - CUSIP - FATCA Settings : End To End Flow

  @A2
  Scenario: 47552156|Standard Master - CUSIP - FATCA Settings : End To End Flow
  #initiate form
  #When user initiate "#FormName" form flow
  When user initiate "#FormName" form flow without account in focus
  When user enters value "#cusip" in textbox "FormAccountsPage.lookupcusip"
  And user selects value "#cusip" from angular dropdown "FormAccountsPage.lookupcusip"
  When user enters value "#exemptForFATCAWitholding" in textbox "FormAccountsPage.lookupExemptForFATCAWitholding"
  And user selects value "#exemptForFATCAWitholding" from angular dropdown "FormAccountsPage.lookupExemptForFATCAWitholding"
    
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
