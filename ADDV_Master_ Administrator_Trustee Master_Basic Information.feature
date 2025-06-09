#Author: Aniket Bhosale
Feature: Verify ADDV_Master_Administrator_Trustee Master_Basic Information form
@ATBI

  Scenario: 46497289|ADDV_Master_Administrator_Trustee Master_Basic Information form
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    
    When user enters value "#AdminTrusteeNumber" in textbox "FormAccountsPage.lookupAdminTrustee"
    And user selects value "#AdminTrusteeNumber" from angular dropdown "FormAccountsPage.lookupAdminTrustee"
    And user enters value "#ShortName" in textbox "FormAccountsPage.textBoxShortName"
    And user enters value "#FullName1" in textbox "FormAccountsPage.textBoxFullName1"
    And user enters value "#FullName2" in textbox "FormAccountsPage.textBoxFullName2"
    And user enters value "#Address1" in textbox "FormAccountsPage.textBoxAddress1"
    And user enters value "#Address2" in textbox "FormAccountsPage.textBoxAddress2"
    And user enters value "#Address3" in textbox "FormAccountsPage.textBoxAddress3"
    And user enters value "#Address4" in textbox "FormAccountsPage.textBoxAddress4"
    And user enters value "#Address5" in textbox "FormAccountsPage.textBoxAddress5"
    When user enters value "#State" in textbox "FormAccountsPage.lookupstate"
    And user selects value "#State" from angular dropdown "FormAccountsPage.lookupstate"
    And user enters value "#ZipCode" in textbox "FormAccountsPage.textBoxZipCode"
    And user enters value "#ContactName" in textbox "FormAccountsPage.textBoxcontactName"
   
    And user enters value "#MailingAddress1" in textbox "FormAccountsPage.textBoxmailingAddress1"
    And user enters value "#MailingAddress2" in textbox "FormAccountsPage.textBoxmailingAddress2"
    And user enters value "#MailingAddress3" in textbox "FormAccountsPage.textBoxmailingAddress3"
    When user enters value "#AdmTrusteeMailState" in textbox "FormAccountsPage.lookupadmTrusteeMailState"
    And user selects value "#AdmTrusteeMailState" from angular dropdown "FormAccountsPage.lookupadmTrusteeMailState"
    And user enters value "#AdmTrusteeMailZip" in textbox "FormAccountsPage.textBoxadmTrusteeMailZip"
    And user enters value "#LegalAddressDate" in textbox "FormAccountsPage.textBoxlegalAddressDate"
    And user enters value "#MailOkDate" in textbox "FormAccountsPage.textBoxmailOkDate"
    And user enters value "#Remarks1" in textbox "FormAccountsPage.textBoxremarks1"
    And user enters value "#Remarks2" in textbox "FormAccountsPage.textBoxremarks2"
    And user enters value "#Remarks3" in textbox "FormAccountsPage.textBoxremarks3"
    
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
    