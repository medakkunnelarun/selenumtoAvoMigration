#Author: Aniket Bhosale
Feature: Verify ADDV_Master_Fund Master_Basic Information_form
@FDBI

  Scenario: 42584284|ADDV_Master_Fund Master_Basic Information_form
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    
    When user enters value "#PlanNumber" in textbox "FormAccountsPage.lookupplanNum"
    And user selects value "#PlanNumber" from angular dropdown "FormAccountsPage.lookupplanNum"
    When user enters value "#FundNumber" in textbox "FormAccountsPage.lookupfundNum"
    And user selects value "#FundNumber" from angular dropdown "FormAccountsPage.lookupfundNum"
    And user enters value "#FundName" in textbox "FormAccountsPage.textBoxfundName"
    When user enters value "#FundType" in textbox "FormAccountsPage.lookupfundType"
    And user selects value "#FundType" from angular dropdown "FormAccountsPage.lookupfundType"
    And user enters value "#FundingTrustAcctNum" in textbox "FormAccountsPage.textBoxfundingTrustAcctNum"
    And user selects value "#UnitFund" from angular dropdown "FormAccountsPage.dropdownunitFund"
    And user enters value "#FundCUSIPNum" in textbox "FormAccountsPage.textBoxfundCusipNum"
    And user selects value "#CompanyStockFund" from angular dropdown "FormAccountsPage.dropdownunitcompanyStockFund"
    And user enters value "#NumofdecimalsforRouting" in textbox "FormAccountsPage.textBoxnumOfDecimalsForRounding"
    And user selects value "#IncomeSourceOnlyFund" from angular dropdown "FormAccountsPage.dropdownincomeSourceOnlyFund"
    And user enters value "#Remarks1" in textbox "FormAccountsPage.textBoxremarks1"
    And user enters value "#Remarks2" in textbox "FormAccountsPage.textBoxremarks2"
    And user enters value "#Remarks3" in textbox "FormAccountsPage.textBoxremarks3"
    And user enters value "#Remarks4" in textbox "FormAccountsPage.textBoxremarks4"
    And user enters value "#Remarks5" in textbox "FormAccountsPage.textBoxremarks5"
    
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
    