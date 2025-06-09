#Author: Aditya Bawane

Feature: Standard Master - Sponsor Master - Basic Information_End to End workflow
  I want to verify standard form Standard ADDV | Master - Sponsor Master - Basic Information_End to End workflow through feature file

  @April
  Scenario: 46497242|ADDV | Master - Sponsor Master - Basic Information_End to End workflow
   #initiate form
    When user initiate "#FormName" form flow
    When user enters value "#SponsorNum" in textbox "FormAccountsPage.lookupSponsorNum"
    And user selects value "#SponsorNum" from angular dropdown "FormAccountsPage.lookupSponsorNum"
    When user enters value "#shortName" in textbox "FormAccountsPage.textboxshortName"
    When user enters value "#fullName1" in textbox "FormAccountsPage.textboxfullName1"
    When user enters value "#fullName2" in textbox "FormAccountsPage.textboxfullName2"
    When user enters value "#textboxaddress1" in textbox "FormAccountsPage.textboxaddress1"
    When user enters value "#textboxaddress2" in textbox "FormAccountsPage.textboxaddress2"
    When user enters value "#textboxaddress3" in textbox "FormAccountsPage.textboxaddress3"
    When user enters value "#textboxaddress4" in textbox "FormAccountsPage.textboxaddress4"
    When user enters value "#textboxaddress5" in textbox "FormAccountsPage.textboxaddress5"
    
    When user enters value "#State" in textbox "FormAccountsPage.lookupState"
    And user selects value "#State" from angular dropdown "FormAccountsPage.lookupState"
    When user enters value "#ZipCode" in textbox "FormAccountsPage.textboxZipCode"
    When user enters value "#contactName" in textbox "FormAccountsPage.textboxcontactName"
    When user enters value "#contactNumber" in textbox "FormAccountsPage.textboxcontactNumber"
    When user enters value "#taxYearEnd" in textbox "FormAccountsPage.textboxtaxYearEnd"
    When user enters value "#mailingAddress1" in textbox "FormAccountsPage.textboxmailingAddress1"
    When user enters value "#mailingAddress2" in textbox "FormAccountsPage.textboxmailingAddress2"
    When user enters value "#mailingAddress3" in textbox "FormAccountsPage.textboxmailingAddress3"
    
    When user enters value "#SponsorMailState" in textbox "FormAccountsPage.lookupSponsorMailState"
    And user selects value "#SponsorMailState" from angular dropdown "FormAccountsPage.lookupSponsorMailState"
    When user enters value "#sponsorMailZip" in textbox "FormAccountsPage.textboxsponsorMailZip"
    When user enters value "#legalAddressDate" in textbox "FormAccountsPage.textboxlegalAddressDate"
    When user enters value "#mailOkDate" in textbox "FormAccountsPage.textboxmailOkDate"
    When user enters value "#remarks1" in textbox "FormAccountsPage.textboxremarks1"
    When user enters value "#Remarks2" in textbox "FormAccountsPage.textboxRemarks2"
    When user enters value "#Remarks3" in textbox "FormAccountsPage.textboxRemarks3"
    When user enters value "#Remarks4" in textbox "FormAccountsPage.textboxRemarks4"
    When user enters value "#Remarks5" in textbox "FormAccountsPage.textboxRemarks5"
    When user enters value "#Remarks6" in textbox "FormAccountsPage.textboxRemarks6"
    When user enters value "#Remarks7" in textbox "FormAccountsPage.textboxRemarks7"
    When user enters value "#Remarks8" in textbox "FormAccountsPage.textboxRemarks8"
    When user enters value "#Remarks9" in textbox "FormAccountsPage.textboxRemarks9"
    When user enters value "#Remarks10" in textbox "FormAccountsPage.textboxRemarks10"
    
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
   