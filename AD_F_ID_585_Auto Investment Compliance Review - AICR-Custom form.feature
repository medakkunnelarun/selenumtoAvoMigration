#Author: Shruti Jagdale
Feature: AD_F_ID_585_Auto Investment Compliance Review - AICR : Validate field for Custom form flow


  Scenario: WRAWUP-T18905|AD_F_ID_585_Auto Investment Compliance Review-AICR-Custom form
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
    And user captures value of column "Descriptors" as "Descriptors" for ticket ID "#TicketID" from table "UnityDecisionsPage.tableDecisions"
    Then verify column "Current State" has value "Posted to AddVantage" for ticket ID "#TicketID" in table "UnityDecisionsPage.tableDecisions"
    And user switches to default content
    And user logs out of Unity
    And user closes current browser instance