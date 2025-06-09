#Author: Aditya
Feature: Verify AD-Master - Account - Charitable Trust Processing_EndToEnd Checkout

  @dynamicForms52
  Scenario: 42584260|AD-Master - Account - Charitable Trust Processing _EndToEnd Checkout
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    When user enters value "#textboxPayoutPercent" in textbox "AccountDetailsPage.textboxPayoutPercent"
    When user enters value "#textboxFirstPaymentDateOfYear" in textbox "AccountDetailsPage.textboxFirstPaymentDateOfYear"
    When user enters value "#PaymentFrequency" in textbox "AccountDetailsPage.dropdownPaymentFrequency"
    When user selects value "#PaymentFrequency" from angular dropdown "AccountDetailsPage.dropdownPaymentFrequency"
    When user enters value "#ComputeValueDate" in textbox "AccountDetailsPage.textboxComputeValueDate"
    When user enters value "#CharitableType" in textbox "AccountDetailsPage.dropdownCharitableType"
    When user selects value "#CharitableType" from angular dropdown "AccountDetailsPage.dropdownCharitableType"
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
