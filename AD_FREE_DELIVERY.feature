#Author: Shilpa Khare
@dynamicForms
Feature: AD-Free Delivery
  I want to AD-Free Delivery form fields

 @ADDVForm6
  Scenario: 38104862|AD-Free Delivery form_EndToEnd Checkout

   #initiate form
    When user initiate "#FormName" form flow
       
    #Select values and submit the form
    #When user enters value "#PortfolioNumber" in textbox "FormTradeProcessingPage.dropdowntblPortfolio"
    
    When user enters value "#CUSIP" in textbox "FormTradeProcessingPage.lookUpCUSIP"
    And user selects value "#CUSIP" from angular dropdown "FormTradeProcessingPage.lookUpCUSIP"
    And user selects value "#PortfolioNumber" from angular dropdown "FormTradeProcessingPage.dropdowntblPortfolio"
    And user enters value "#TradeDate" in textbox "FormTradeActivityPage.textBoxTradeDate"
    And user enters value "#Units" in textbox "FormTradeActivityPage.textBoxUnits"
    And user selects value "#Registration" from angular dropdown "FormTradeProcessingPage.lookUpRegistration"
    And user selects value "#FeeBase" from angular dropdown "FormTradeProcessingPage.dropdownFeeBase"
    And user clicks on "FormDetailsPage.buttonSubmit"
    Then verify that ticket is submitted successfully and extract ticket id as "TicketID"
    And user clicks on "FormDetailsPage.iconDecisions"
    And user clicks on "CommonMenuPage.linkUserRequestList"
    And user switches to frame element "UnityDecisionsPage.frameDecisionsAzure"
    When user logs in with "#InitiatorUserID" if "UnitySSOLoginPage.textBoxUserID" is visible
    And user captures value of column "Descriptors" as "Descriptors" for ticket ID "#TicketID" from table "UnityDecisionsPage.tableDecisions"
    #And user captures value of column "FormName" as "FormName" for ticket ID "#TicketID" from table "UnityDecisionsPage.tableDecisions"
    Then verify column "Current State" has value "Awaiting First Approval" for ticket ID "#TicketID" in table "UnityDecisionsPage.tableDecisions"
    And user switches to default content
    And user logs out of Unity
    And user closes current browser instance
    And user opens new browser
    #approval flow
    And user performs the Approval Flow if required
    #Verification Flow
    And user validate final form status with Initiator ID