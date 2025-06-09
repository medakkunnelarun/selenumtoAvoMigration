#Author: Shruti Jagdale
Feature: AD_F_ID_594_Standard Master - CUSIP - ADP Interface  : Validate field for Custom form
  I want to verify AD_F_ID_594_Standard Master - CUSIP - ADP Interface  : Validate field for Custom form feature file


Scenario: WRAWUP-T24555|AD_F_ID_594_Standard Master-CUSIP-ADP Interface-Custom form
#initiate form
When user initiate "#FormName" form flow without account in focus
#Select values and submit the form
And user enters value "#cusip" in textbox "FormAccountsPage.lookupcusip"
And user selects value "#cusip" from angular dropdown "FormAccountsPage.lookupcusip"
And user enters value "#NetMatrixLevel" in textbox "FormAccountsPage.lookupNetMatrixLevel"
And user selects value "#NetMatrixLevel" from angular dropdown "FormAccountsPage.lookupNetMatrixLevel"
#Attach Document
And user attach a document in the document section
#Submit and user List Verification
And user clicks on "FormDetailsPage.buttonSubmit"
Then verify that ticket is submitted successfully and extract ticket id as "TicketID"
And user clicks on "FormDetailsPage.iconDecisions"
And user clicks on "CommonMenuPage.linkUserRequestList"
And user switches to frame element "UnityDecisionsPage.frameDecisionsAzure"
When user logs in with "#InitiatorUserID" if "UnitySSOLoginPage.textBoxUserID" is visible
And user waits for "7" seconds
And user captures value of column "Descriptors" as "Descriptors" for ticket ID "#TicketID" from table "UnityDecisionsPage.tableDecisions"
And user waits for "7" seconds
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
And user navigates to url "http://10.7.148.100/wealthportal99"
And user enters value "#AMIUserID" in textbox "AMIScreens.textboxUserID"
And user enters value "#AMIPWD" in textbox "AMIScreens.textboxPassword"
And user clicks on "AMIScreens.btnOk"
And verify that user is on "AMIScreens" screen
And user switches to frame element "AMIScreens.frameCommonMenu"
And user switches to frame element "DefaultContent"
And user switches to frame element "AMIScreens.frameCommonMenu"
And user clicks on "AMIScreens.linkMasters"
And user waits for "2" seconds
And user clicks on "AMIScreens.labelSecurityCusip"
And user switches to frame element "DefaultContent"
And user switches to frame element "AMIScreens.frameMainSec"
And user enters value "#cusip" in textbox "AMIScreens.textboxCusip"
And user clicks on "AMIScreens.buttonOk"
And user clicks on link "ADP" correponding to text "ADP INTERFACE" in table "AMIScreens.tblTradeOrders"
And verify text "#AMINetMatrixLevel" is present in table "AMIScreens.tblTradeOrders"
	    
	    