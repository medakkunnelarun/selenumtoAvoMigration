Feature: AD_F_ID_607_ADP Interface - ADP : Validate field for Custom form
  
  I want to verify AD_F_ID_607_ADP Interface - ADP : Validate field for Custom form

  Scenario: WRAWUP-T19265|AD_F_ID_607_ADP Interface-ADP-Custom form
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    When user enters value "#ADPAccNo1" in textbox "FormAccountsPage.textADPAccNum1"
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
    #AMI Validation    
	  And user navigates to url "http://10.7.148.100/wealthportal99"
	  And user enters value "#AMIUserID" in textbox "AMIScreens.textboxUserID"
	  And user enters value "#AMIPWD" in textbox "AMIScreens.textboxPassword"
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
	  And user clicks on link "ADP" correponding to text "ADP INTERFACE" in table "AMIScreens.tblTradeOrders"
	  And verify text "#ADPAccNo1" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#ADPAccNo6" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#ADPAccNo7" is present in table "AMIScreens.tblTradeOrders"
	  
	   