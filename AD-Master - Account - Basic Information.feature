#Author: Shruti Jagdale
Feature: Verify AD-Master Account-Basic Information Add_EndToEnd Checkout
@f2
Scenario: 38503657|AD-Master Account-Basic Information Add_EndToEnd Checkout
  #initiate form
  When user initiate "#FormName" form flow
  #Select values and submit the form   
  And user waits for "10" seconds 
  When user enters value "#LongName2" in textbox "FormAccountsPage.textBoxLongName2"
  When user enters value "#LongName3" in textbox "FormAccountsPage.textBoxLongName3"                 
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
