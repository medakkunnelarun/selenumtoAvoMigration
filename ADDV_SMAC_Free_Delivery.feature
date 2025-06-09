#Author: Gayatri Powar

Feature: SMAC - Free Delivery
  
  I want to verify ADDV_ADDV_SMAC - Free Delivery form
  
  Scenario: 46497105|ADDV_SMAC - Free Delivery form
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    When user enters value "#cusip" in textbox "FormFreeActivityPage.lookupCusip"
		And user selects value "#cusip" from angular dropdown "FormFreeActivityPage.lookupCusip"
		And user selects value "#portfolio" from angular dropdown "FormFreeActivityPage.dropdownPortfolioAdv"
		And user enters value "#tradeDate" in textbox "FormFreeActivityPage.textBoxtradeDate"
		And user enters value "#settlementDate" in textbox "FormFreeActivityPage.textBoxsettlementDate"
		And user selects value "#feeBase" from angular dropdown "FormFreeActivityPage.dropdownfeeBase"
		And user selects value "#lotSelection" from angular dropdown "FormFreeActivityPage.dropdownlotSelection"
		And user enters value "#units" in textbox "FormFreeActivityPage.textBoxUnits"
		And user selects value "#settlementMethod" from angular dropdown "FormFreeActivityPage.dropdownsettlementMethod"
		When user enters value "#disbursementCode" in textbox "FormFreeActivityPage.lookupdisbursementCode"
		And user selects value "#disbursementCode" from angular dropdown "FormFreeActivityPage.lookupdisbursementCode"
		When user enters value "#settlementLocation" in textbox "FormFreeActivityPage.lookupsettlementLocation"
		And user selects value "#settlementLocation" from angular dropdown "FormFreeActivityPage.lookupsettlementLocation"
		When user enters value "#taxCode" in textbox "FormFreeActivityPage.lookuptaxCode"
		And user selects value "#taxCode" from angular dropdown "FormFreeActivityPage.lookuptaxCode"
		When user enters value "#clearingBroker" in textbox "FormFreeActivityPage.lookupclearingBroker"
		And user selects value "#clearingBroker" from angular dropdown "FormFreeActivityPage.lookupclearingBroker"
		When user enters value "#taxParty" in textbox "FormFreeActivityPage.lookuptaxParty"
		And user selects value "#taxParty" from angular dropdown "FormFreeActivityPage.lookuptaxParty"
		And user enters value "#specialInstructions1" in textbox "FormFreeActivityPage.textBoxspecialInstructions1"
		And user enters value "#commentLine1" in textbox "FormFreeActivityPage.textBoxcommentLine1"
    And user waits for "5" seconds
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

