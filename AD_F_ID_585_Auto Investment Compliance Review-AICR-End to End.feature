#Author: Shruti Jagdale
Feature: VerifyAD_F_ID_585_Auto Investment Compliance Review - AICR : End to End flow


  Scenario: WRAWUP-T21059|AD_F_ID_585_Auto Investment Compliance Review-AICR:End to End flow
    #initiate form
    When user initiate "#FormName" form flow
    When user enters value "#ReturnExpectation" in textbox "FormAccountsPage.lookUpReturnExpectation"
    And user selects value "#ReturnExpectation" from angular dropdown "FormAccountsPage.lookUpReturnExpectation"
    When user enters value "#RiskTolerance" in textbox "FormAccountsPage.lookUpRiskTolerance"
    And user selects value "#RiskTolerance" from angular dropdown "FormAccountsPage.lookUpRiskTolerance"
    When user enters value "#InvestmentHorizon" in textbox "FormAccountsPage.lookUpInvestmentHorizon"
    And user selects value "#InvestmentHorizon" from angular dropdown "FormAccountsPage.lookUpInvestmentHorizon"
    When user enters value "#LiquidityNeeds" in textbox "FormAccountsPage.lookUpLiquidityNeeds"
    And user selects value "#LiquidityNeeds" from angular dropdown "FormAccountsPage.lookUpLiquidityNeeds"
    When user enters value "#LegalRestriction" in textbox "FormAccountsPage.textBoxLegalRestrictions"
    When user enters value "#SpecialComment" in textbox "FormAccountsPage.textBoxSpecialComments"
    When user enters value "#AICRDate" in textbox "FormAccountsPage.dateLastAICRDate"
    When user enters value "#EstFedWth" in textbox "FormAccountsPage.textBoxEstFedWth"
    And user clicks on "FormDetailsPage.buttonSubmit"
    Then verify that ticket is submitted successfully and extract ticket id as "TicketID"
    And user clicks on "FormDetailsPage.iconDecisions"
    And user clicks on "CommonMenuPage.linkUserRequestList"
    And user switches to frame element "UnityDecisionsPage.frameDecisionsAzure"
    When user logs in with "#InitiatorUserID" if "UnitySSOLoginPage.textBoxUserID" is visible
    And user waits for "5" seconds
    And user captures value of column "Descriptors" as "Descriptors" for ticket ID "#TicketID" from table "UnityDecisionsPage.tableDecisions"
    And user waits for "5" seconds
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
	  And user clicks on link "AICR" correponding to text "AUTOMATED INVESTMENT COMPLIANCE REVIEW" in table "AMIScreens.tblTradeOrders"
	  And verify text "#ReturnExpectationAMI" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#RiskToleranceAMI" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#InvestmentHorizonAMI" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#LiquidityNeedsAMI" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#EstFedWthAMI" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#LegalRestriction" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#SpecialComment" is present in table "AMIScreens.tblTradeOrders"
	  And verify text "#AICRDate" is present in table "AMIScreens.tblTradeOrders"
	  
	  
	  
	  
	  
	  