#Author: Aditya Bawane
Feature: Verify AD-Master - Account - First Rate Performance

  @dynamicForms29 @Test23.2
  Scenario: 42584263|AD-Master - Account - First Rate Performance_EndToEnd Checkout
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    When user selects value "#cycleDateMonths" from angular dropdown "FormAccountsPage.lookupCycleDateMonths"
    And user press ESC button
    When user selects value "#cycleDateDays" from angular dropdown "FormAccountsPage.lookupCycleDateDays"
    And user press ESC button
    When user selects value "#cycleDateYears" from angular dropdown "FormAccountsPage.lookupCycleDateYears"
    And user press ESC button
    When user enters value "#cycleDateOccursEvery" in textbox "FormAccountsPage.lookupCycleDateOccursEvery"
    Then user selects value "#cycleDateFrequency" from angular dropdown "FormAccountsPage.lookupCycleDateFrequency"
    And user selects value "#firstRateParticipation" from angular dropdown "FormAccountsPage.lookupFirstRateParticipation"
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
