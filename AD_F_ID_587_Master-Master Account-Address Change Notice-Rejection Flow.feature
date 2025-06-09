#Author: Nick Tulio
Feature: Master-Master Account-Address Change Notice-Rejection flow

  Scenario: 46275280|AD_F_ID_587_Master-Master Account-Address Change Notice-Rejection flow
    #initiate form
    When user initiate "#FormName" form flow without account in focus
    And set value of variable "Env_Load" to "PASS"
    And set value of variable "Forms_Load" to "PASS"
    #submit the form
    And user selects value "#MasterAccount" from angular dropdown "FormAccountsPage.lookupMasterAccount"
    And user clears text of textbox "FormAccountsPage.lookupexcludeFromNotices"
    And user selects value "#ExcludeFromNotice" from angular dropdown "FormAccountsPage.lookupexcludeFromNotices"
    And user clears text of textbox "FormAccountsPage.lookupexcludeFromEmailNotices"
    And user selects value "#ExcludeFromEmailNotice" from angular dropdown "FormAccountsPage.lookupexcludeFromEmailNotices"
    And user clicks on "FormDetailsPage.buttonSubmit"
    Then verify that ticket is submitted successfully and extract ticket id as "TicketID"
    #And set value of variable "Lookup_Load" to "PASS"
    And set value of variable "Submission" to "#TicketID"
    And user clicks on "FormDetailsPage.iconDecisions"
    And user hovers over element "CommonMenuPage.linkUserRequestList"
    And user clicks on "CommonMenuPage.linkUserRequestList" using js
    And user switches to frame element "UnityDecisionsPage.frameDecisions"
    When user logs in with "#InitiatorUserID" if "UnitySSOLoginPage.textBoxUserID" is visible
    And user captures value of column "Descriptors" as "Descriptors" for ticket ID "#TicketID" from table "UnityDecisionsPage.tableDecisions"
    Then verify column "Current State" has value "Awaiting First Approval" for ticket ID "#TicketID" in table "UnityDecisionsPage.tableDecisions"
    And set value of variable "UserList_Status" to "Awaiting First Approval"
    And user switches to default content
    #And user logs out of Unity
    And user closes current browser instance
    And user opens new browser
    Then user performs the Rejection Flow if required
    Then user validate rejected form status with Initiator ID
    # for "Reject to Initiator" 
    And user initiate the Editing Flow
    And user clears text of textbox "FormAccountsPage.lookupexcludeFromNotices"
    When user enters value "#ExcludeFromNoticeNew" in textbox "FormAccountsPage.lookupexcludeFromNotices"
    And user selects value "#ExcludeFromNoticeNew" from angular dropdown "FormAccountsPage.lookupexcludeFromNotices"
    And user clicks on "FormDetailsPage.buttonSubmit"
    And user accepts the alert
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
