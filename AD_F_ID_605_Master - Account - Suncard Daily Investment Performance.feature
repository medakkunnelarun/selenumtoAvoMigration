#Author: Aditya Bawane

Feature: Master - Account - Suncard Daily Investment Performance
  I want to verify Master - Account - Suncard Daily Investment Performance : End To End Flow feature file

  
  Scenario: 48683827|AD_F_ID_605_Master - Account - Suncard Daily Investment Performance : End To End Flow
  #initiate form
  When user initiate "#FormName" form flow
  #Select values and submit the form
  And user selects value "#SuncardDailyParticipation" from angular dropdown "FormAccountsPage.dropdownSuncardDailyParticipation"
  #Then user clicks on "FormAccountsPage.toggleClearDate"
  And user selects value "#DateMonths" from angular dropdown "FormAccountsPage.dropdownValuationDateAndCycleDateMonths"
  Then user press ESC button
  And user selects value "#DateDays" from angular dropdown "FormAccountsPage.dropdownValuationDateAndCycleDateDays"
  Then user press ESC button
  And user selects value "#DateYears" from angular dropdown "FormAccountsPage.dropdownValuationDateAndCycleDateYears"
  Then user press ESC button
  Then user enters value "#DateOccursEvery" in textbox "FormAccountsPage.textboxValuationDateAndCycleDateOccursEvery"
  And user selects value "#DateFrequency" from angular dropdown "FormAccountsPage.dropdownValuationDateAndCycleDateFrequency"
  Then user enters value "#SuncardParticipantCode" in textbox "FormAccountsPage.textboxSuncardParticipantCode"
    
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
	And user clicks on "AMIScreens.linkMasterAccountMaster"
	And user switches to frame element "DefaultContent"
	And user switches to frame element "AMIScreens.frameMainSec"
	And user enters value "#AccountNumber" in textbox "AMIScreens.textboxAccount"
	And user clicks on "AMIScreens.buttonOk"
	And user clicks on link "SDIP" correponding to text "SUNCARD DAILY INVESTMENT PERFORMANCE" in table "AMIScreens.tblTradeOrders"
	And verify text "#NewSuncardDailyParticipation" is present in table "AMIScreens.tblTradeOrders"
	And verify text "#SuncardParticipantCode" is present in table "AMIScreens.tblTradeOrders"
	And verify text "#Date" is present in table "AMIScreens.tblTradeOrders"
	
	
	    
	    