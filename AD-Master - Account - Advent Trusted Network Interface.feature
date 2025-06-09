#Author: Aditya Bawane
Feature: Verify AD-Master - Account - Advent Trusted Network Interface form 

  @form1
  Scenario: 42592524|AD-Master - Account - Advent Trusted Network Interface form
  #initiate form
  When user initiate "#FormName" form flow
  #Select values and submit the form
  And user selects value "#AdventTrustedNetworkEligible" from angular dropdown "FormAccountsPage.dropdownAdventTrustedNetworkEligible"
  When user enters value "#AdventInvestmentManagerCode1" in textbox "FormAccountsPage.lookupAdventInvestmentManagerCode1"
  And user selects value "#AdventInvestmentManagerCode1" from angular dropdown "FormAccountsPage.lookupAdventInvestmentManagerCode1"
  And user selects value "#CreateMoxyTaxLotFile" from angular dropdown "FormAccountsPage.dropdownCreateMoxyTaxLotFile"
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
