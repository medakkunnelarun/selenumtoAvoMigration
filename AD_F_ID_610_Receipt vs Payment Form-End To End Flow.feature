#Author : Shruti Jagdale
Feature: Validation of AD_F_ID_610_Receipt vs Payment Form : End To End Flow

Scenario: WRAWUP-T24151|AD_F_ID_610_Receipt vs Payment Form:End To End Flow

#initiate form
When user initiate "#FormName" form flow
#Select values and submit the form
And user enters value "#CUSIP" in textbox "FormTradeProcessingPage.lookUpCUSIP"
And user selects value "#CUSIP" from angular dropdown "FormTradeProcessingPage.lookUpCUSIP"
And user enters value "#BookValue" in textbox "FormTradeProcessingPage.textBoxBookValue"
And user selects value "#Portfolio" from angular dropdown "FormTradeProcessingPage.dropDownPortfolio"
And user enters value "#TradeDate" in textbox "FormTradeActivityPage.textBoxTradeDate"
And user enters value "#Broker" in textbox "FormTradeProcessingPage.lookUpBroker"
And user selects value "#Broker" from angular dropdown "FormTradeProcessingPage.lookUpBroker"
And user enters value "#FundCode" in textbox "FormTradeProcessingPage.lookUpFundsCode"
And user selects value "#FundCode" from angular dropdown "FormTradeProcessingPage.lookUpFundsCode"
And user enters value "#Registration" in textbox "FormTradeProcessingPage.lookUpRegistration"
And user selects value "#Registration" from angular dropdown "FormTradeProcessingPage.lookUpRegistration"
And user selects value "#FeeBase" from angular dropdown "FormTradeProcessingPage.dropdownFeeBase"
And user selects value "#CoveredNonC" from angular dropdown "FormTradeProcessingPage.dropdownCoveredNonCovered"
And user enters value "#TradeS" in textbox "FormTradeProcessingPage.lookUpTradeService"
And user selects value "#TradeS" from angular dropdown "FormTradeProcessingPage.lookUpTradeService"
And user enters value "#PricePerUnit" in textbox "FormTradeProcessingPage.textBoxPricePerUnit"
And user enters value "#Comment" in textbox "FormTradeProcessingPage.textBoxCommentLine2"
And user enters value "#Unit" in textbox "FormTradeProcessingPage.txtUnits"
And user enters value "#Purchase" in textbox "FormTradeProcessingPage.txtPurchasePrice"
And user enters value "#Commission" in textbox "FormTradeProcessingPage.textCommissions"
And user enters value "#OthC" in textbox "FormTradeProcessingPage.textBoxOtherCharges"
#Attach Document
And user attach a document in the document section
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