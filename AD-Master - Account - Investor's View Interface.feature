#Author: Aditya
Feature: AD-Master - Account - Investors View Interface

  @dynamicForms55
  Scenario: 42584265|AD-Master - Account - Investors View Interface_EndToEnd Checkout
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    Then user selects value "#InvestorsViewEligible" from angular dropdown "AccountDetailsPage.dropdownInvestorsViewEligible"
    When user enters value "#InvManagerClientId" in textbox "AccountDetailsPage.dropdownInvManagerClientId"
    When user selects value "#OpenDate" from angular dropdown "AccountDetailsPage.dropdownOpenDate"
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
