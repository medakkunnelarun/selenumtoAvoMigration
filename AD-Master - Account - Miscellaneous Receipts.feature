#Author: Aditya Bawane
Feature: Verify AD-Master - Account - Miscellaneous Receipts

  @dynamicForms30 @ynotyou
  Scenario: 42584266|AD-Master - Account - Miscellaneous Receipts_EndToEnd Checkout
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    When user enters value "#BlockNumber" in textbox "FormAccountsPage.textboxBlockNumber"
    And user selects value "#BlockNumber" from angular dropdown "FormAccountsPage.textboxBlockNumber"
    Then user enters value "#fromWhoReceived" in textbox "FormAccountsPage.textboxFromWhoReceived"
    When user selects value "#cycleDateMonths" from angular dropdown "FormAccountsPage.lookupReceiptcycleDateMonths"
    And user press ESC button
    When user selects value "#cycleDateDays" from angular dropdown "FormAccountsPage.lookupReceiptcycleDateDays"
    And user press ESC button
    When user selects value "#cycleDateYears" from angular dropdown "FormAccountsPage.lookupReceiptcycleDateYears"
    And user press ESC button
    When user enters value "#cycleDateOccursEvery" in textbox "FormAccountsPage.lookupReceiptcycleDateOccursEvery"
    Then user selects value "#cycleDateFrequency" from angular dropdown "FormAccountsPage.lookupReceiptcycleDateFrequency"
    And user enters value "50%" in textbox "FormAccountsPage.textboxIncomeAmount"
    Then user enters value "#fromWhoReceived" in textbox "FormAccountsPage.textboxFromWhoReceived"
    And user clicks on "FormDetailsPage.buttonSubmit"
    Then verify that ticket is submitted successfully and extract ticket id as "TicketID"
    And user clicks on "FormDetailsPage.iconDecisions"
    #And user hovers over element "CommonMenuPage.linkUserRequestList"
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
