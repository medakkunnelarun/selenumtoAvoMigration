#Author: Aditya Bawane
Feature: Verify AD_F_ID_606_Historical Market Value - HMV : End to End Rejection flow

  Scenario: 48121386|AD_F_ID_606_Historical Market Value - HMV : End to End Rejection flow
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    When user enters value "#BlockNumber" in textbox "FormAccountsPage.lookupblockNumber"
    And user selects value "#BlockNumber" from angular dropdown "FormAccountsPage.lookupblockNumber"
    And user selects value "#Months" from angular dropdown "FormAccountsPage.dropdownHMVMonths"
    And user selects value "#Days" from angular dropdown "FormAccountsPage.dropdownHMVDays"
    And user selects value "#Years" from angular dropdown "FormAccountsPage.dropdownHMVYears"
    And user selects value "#Frequency" from angular dropdown "FormAccountsPage.dropdownHMVFrequency"
    And user enters value "#OccursEvery" in textbox "FormAccountsPage.txtHMVOccursEvery"
    And user waits for "5" seconds
    And user enters value "#LevelOfS" in textbox "FormAccountsPage.txtLevelOfService"
    
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
  	And user enters value "#NewLevelOfS" in textbox "FormAccountsPage.txtLevelOfService"
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
		And user clicks on "AMIScreens.linkMasterAccountMaster"
		And user switches to frame element "DefaultContent"
		And user switches to frame element "AMIScreens.frameMainSec"
		And user enters value "#AccountNumber" in textbox "AMIScreens.textboxAccount"
		And user clicks on "AMIScreens.buttonOk"
		And user clicks on link "HMV" correponding to text "HISTORICAL MARKET VALUE" in table "AMIScreens.tblTradeOrders"
		And verify text "#AMIDate" is present in table "AMIScreens.tblTradeOrders"
		Then verify text "#NewLevelOfS" is present in table "AMIScreens.tblTradeOrders"
		