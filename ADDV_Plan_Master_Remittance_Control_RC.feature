#Author: Gayatri Powar

Feature: ADDV_Plan_Master_Remittance_Control_RC
  
  I want to verify ADDV_Plan_Master_Remittance_Control_RC form.

  Scenario: 46497260|ADDV_Plan Master Remittance Control-RC form
    #initiate form
    When user initiate "#FormName" form flow
    #Select values and submit the form
    When user enters value "#planNum" in textbox "FormPensionPage.lookupplanNum"
		And user selects value "#planNum" from angular dropdown "FormPensionPage.lookupplanNum"
		And user enters value "#moneyTypeForRemittance" in textbox "FormPensionPage.textBoxmoneyTypeForRemittance"
		And user enters value "#taxCodeForDetailTrans" in textbox "FormPensionPage.textBoxtaxCodeForDetailTrans"
		And user enters value "#yearOfAccruedYTDDeductions" in textbox "FormPensionPage.textBoxyearOfAccruedYTDDeductions"
		When user enters value "#taxCodeForSummaryTrans" in textbox "FormPensionPage.lookuptaxCodeForSummaryTrans"
		And user selects value "#taxCodeForSummaryTrans" from angular dropdown "FormPensionPage.lookuptaxCodeForSummaryTrans"
		And user enters value "#checkingAccountNum" in textbox "FormPensionPage.textBoxcheckingAccountNum"
		And user selects value "#checkIRASetBox1099R" from angular dropdown "FormPensionPage.dropdowncheckIRASetBox1099R"
		And user selects value "#lastYearFor1099RRept" from angular dropdown "FormPensionPage.dropdownlastYearFor1099RRept"
		And user selects value "#suppressLongNameFromTrust" from angular dropdown "FormPensionPage.dropdownsuppressLongNameFromTrust"
		And user selects value "#displayParticipantPayeeOrBothOnTr" from angular dropdown "FormPensionPage.dropdowndisplayParticipantPayeeOrBothOnTr"
		And user selects value "#includeWithholdingDescriptionsOnTr" from angular dropdown "FormPensionPage.dropdownincludeWithholdingDescriptionsOnTr"
		And user selects value "#employeeNumberOnStub" from angular dropdown "FormPensionPage.dropdownemployeeNumberOnStub"
		And user selects value "#awardNumberOnStub" from angular dropdown "FormPensionPage.dropdownawardNumberOnStub"
		And user selects value "#displayIncomeSource" from angular dropdown "FormPensionPage.dropdowndisplayIncomeSource"
		And user selects value "#updateTrustAccounts" from angular dropdown "FormPensionPage.dropdownupdateTrustAccounts"
		And user selects value "#postSumOrDetailTrTrn" from angular dropdown "FormPensionPage.dropdownpostSumOrDetailTrTrn"
		And user selects value "#trustTransPortfolio" from angular dropdown "FormPensionPage.dropdowntrustTransPortfolio"
		And user selects value "#feeBaseForTrpTransactions" from angular dropdown "FormPensionPage.dropdownfeeBaseForTrpTransactions"
		And user selects value "#printAdviceForMailing" from angular dropdown "FormPensionPage.dropdownprintAdviceForMailing"
		And user selects value "#addressOnTaxForms" from angular dropdown "FormPensionPage.dropdownaddressOnTaxForms"
		And user selects value "#taxableAmtZeroFor1099R" from angular dropdown "FormPensionPage.dropdowntaxableAmtZeroFor1099R"
		And user selects value "#inclPRUnitWDsIn1099" from angular dropdown "FormPensionPage.dropdowninclPRUnitWDsIn1099"
		And user enters value "#stubDesc1" in textbox "FormPensionPage.textBoxstubDesc1"
		And user enters value "#stubDesc2" in textbox "FormPensionPage.textBoxstubDesc2"
		And user enters value "#incomeSourceMtOrder" in textbox "FormPensionPage.textBoxincomeSourceMtOrder"
		And user enters value "#incomeSourceFundOrder" in textbox "FormPensionPage.textBoxincomeSourceFundOrder"
		And user enters value "#summaryOverrideDisbursementCodes" in textbox "FormPensionPage.textBoxsummaryOverrideDisbursementCodes"
		When user enters value "#fundsCodeTrpTrans" in textbox "FormPensionPage.lookupfundsCodeTrpTrans"
		And user selects value "#fundsCodeTrpTrans" from angular dropdown "FormPensionPage.lookupfundsCodeTrpTrans"
    And user waits for "5" seconds
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
    #approval flow
    And user performs the Approval Flow if required
    #Verification Flow
    And user validate final form status with Initiator ID

