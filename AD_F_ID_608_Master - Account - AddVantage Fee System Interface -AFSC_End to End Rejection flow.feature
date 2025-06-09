#Author: Aniket Bhosale
Feature: Verify Master - Account - AddVantage Fee System Interface -AFSC_End to End Rejection flow

  
  Scenario: 47552174|AD_F_ID_608_Master - Account - AddVantage Fee System Interface-AFSC_End to End Rejection flow
  #initiate form
  When user initiate "#FormName" form flow
  #Select values and submit the form  
  And user selects value "#IncludeInFeeSyaytemFile" from angular dropdown "FormAccountsPage.dropdownIncludeInFeeSystemFile"
  And user selects value "#IncludeAccruedIncome" from angular dropdown "FormAccountsPage.dropdownIncludeAccruedIncome"
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
 		
     And user selects value "#IncludeAccruedIncomeNew" from angular dropdown "FormAccountsPage.dropdownIncludeAccruedIncome"
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
  
   #AMI Validation    
	  And user navigates to url "http://10.7.148.100/wealthportal95"
	  And user enters value "E5691018" in textbox "AMIScreens.textboxUserID"
	  And user enters value "" in textbox "AMIScreens.textboxPassword"
	  And user clicks on "AMIScreens.btnOk"
	  And verify that user is on "AMIScreens" screen
	  And user switches to frame element "AMIScreens.frameCommonMenu"
	  And user clicks on "AMIScreens.linkMasters"
	  And user waits for "2" seconds
	  And user clicks on "AMIScreens.linkMasterAccountMaster"
	  And user switches to frame element "DefaultContent"
	  And user switches to frame element "AMIScreens.frameMainSec"
	  And user enters value "#AccountNumber" in textbox "AMIScreens.textboxAccount"
	  And user clicks on "AMIScreens.btnOkMasterAcc"
	  
	  And user clicks on link "AFSC" correponding to text "ADVANTAGE FEE SYSTEM INTERFACE" in table "AMIScreens.tblTradeOrders"
	  And verify text "#IncludeInFeeSyaytemFileAMI" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#IncludeAccruedIncomeAMI" is present in table "AMIScreens.tblTradeOrders"
	  