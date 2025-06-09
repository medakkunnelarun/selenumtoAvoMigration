#Author: Aniket Bhosale
Feature: Verify ADDV_Master_CUSIP_Fee Disclosure Report_form
@FDR

  Scenario: 42592523|ADDV_Master_CUSIP_Fee Disclosure Report_form
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    
    When user enters value "#CUSIP" in textbox "FormAccountsPage.lookupcusip"
    And user selects value "#CUSIP" from angular dropdown "FormAccountsPage.lookupcusip"
    And user enters value "#ExpenseRatio" in textbox "FormAccountsPage.textBoxExpRatio"
    And user enters value "#12Bfee" in textbox "FormAccountsPage.textBoxfee12B1"
    And user enters value "#Shareservicesfee" in textbox "FormAccountsPage.textBoxshareholderServicesFee"
    And user selects value "#Redemptionfee" from angular dropdown "FormAccountsPage.textBoxredemptionFee"
    And user enters value "#FundRepeatper" in textbox "FormAccountsPage.textBoxfundRepeatPercentage"
   
    
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
    