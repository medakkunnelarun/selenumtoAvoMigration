#Author: Aditya Bawane
Feature: Verify Master - CUSIP - FATCA Settings: End to End Rejection flow

  @A2
  Scenario: 47552158|AD_F_ID_597_Master - CUSIP - FATCA Settings: End to End Rejection flow
  #initiate form
  #When user initiate "#FormName" form flow
  When user initiate "#FormName" form flow without account in focus
  When user enters value "#cusip" in textbox "FormAccountsPage.lookupcusip"
  And user selects value "#cusip" from angular dropdown "FormAccountsPage.lookupcusip"
  When user enters value "#exemptForFATCAWitholding" in textbox "FormAccountsPage.lookupExemptForFATCAWitholding"
  And user selects value "#exemptForFATCAWitholding" from angular dropdown "FormAccountsPage.lookupExemptForFATCAWitholding"
    
 #Attach Document
  And user attach a document in the document section
  #Submit and user List Verification
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
  
  #Rejection Flow
  And user performs the Rejection Flow with "Reject to Initiator"
  #Rejection Verification
  And user validate rejected form status with Initiator ID for "Reject to Initiator"
  #reinitiate Ticket for editing
  And user initiate the Editing Flow
  #Edit feilds for your forms
  Then user waits for "5" seconds
  When user enters value "#Newcusip" in textbox "FormAccountsPage.lookupcusip"
  Then user waits for "5" seconds
  And user selects value "#Newcusip" from angular dropdown "FormAccountsPage.lookupcusip"
  When user enters value "#NewexemptForFATCAWitholding" in textbox "FormAccountsPage.lookupExemptForFATCAWitholding"
  And user selects value "#NewexemptForFATCAWitholding" from angular dropdown "FormAccountsPage.lookupExemptForFATCAWitholding"
  And user clicks on "FormDetailsPage.buttonSubmit"
  And user accepts the alert
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
  #AMI
  And user navigates to url "http://10.7.148.100/wealthportal95"
	And user enters value "E5672710" in textbox "AMIScreens.textboxUserID"
	And user enters value "#PP" in textbox "AMIScreens.textboxPassword"
	And user clicks on "AMIScreens.btnOk"
	And verify that user is on "AMIScreens" screen
	And user switches to frame element "AMIScreens.frameCommonMenu"
	#ADP
	And user switches to frame element "DefaultContent"
	And user switches to frame element "AMIScreens.frameCommonMenu"
	And user clicks on "AMIScreens.linkMasters"
	And user waits for "2" seconds
	And user clicks on "AMIScreens.labelSecurityCusip"
	And user switches to frame element "DefaultContent"
	And user switches to frame element "AMIScreens.frameMainSec"
	And user enters value "#Newcusip" in textbox "AMIScreens.textboxCusip"
	And user clicks on "AMIScreens.buttonOk"
	And user clicks on link "FATCA" correponding to text "FATCA SETTINGS" in table "AMIScreens.tblTradeOrders"
	And verify text "#NewexemptForFATCAWitholding" is present in table "AMIScreens.tblTradeOrders"
	
	