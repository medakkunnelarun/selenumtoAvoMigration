#Author: Palash Saxena
Feature: Verify AD-Free-Receipt-Multiple-Lotsform

  Scenario: 38809517|AD_Free-Receipt-Multiple-Lots-EndToEndCheckout
     #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    When user enters value "#Cusip" in textbox "FormAccountsPage.lookupcusip"
    And user selects value "#Cusip" from angular dropdown "FormAccountsPage.lookupcusip"
    When user selects value "#PortfolioNumber" from angular dropdown "FormFreeActivityPage.dropdownPortfolioAdv"
    When user enters value "#Date" in textbox "FormFreeActivityPage.textBoxTaxAcquisitionDate"
    And user enters value "#Units" in textbox "FormFreeActivityPage.textBoxUnits"
    And user enters value "#BookVal" in textbox "FormFreeActivityPage.textBoxBookValue"
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
    And user performs the Approval Flow if required
    And user validate final form status with Initiator ID

