#Author: Nick Tulio
Feature: Interested Party - Regulatory

  @test1
  Scenario: 8873243|AD_Interested Party - Regulatory
    #initiate form
    When user initiate "#FormName" form flow
    And set value of variable "Env_Load" to "PASS"
    And set value of variable "Forms_Load" to "PASS"
    #submit the form
    When user enters value "#InterestedParty" in textbox "FormAccountsPage.lookupInterestedParty"
    #And user selects value "#InterestedParty" from angular dropdown "FormAccountsPage.lookupInterestedParty"
    And user selects value "#InterestedParty" from angular dropdown "FormAccountsPage.lookupInterestedParty"
    
		And user clears text of textbox "FormAccountsPage.lookupCitizenStatus"
  	And user selects value "#CitizenStatus" from angular dropdown "FormPortfoliosPage.lookupCitizenStatus"
  	
  	And user clears text of textbox "FormAccountsPage.textBoxOriginalStreetAddress1"
  	When user enters value "#OrgStAdd1" in textbox "FormAccountsPage.textBoxOriginalStreetAddress1"
  	
  	    
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
    #approval flow
    And set value of variable "Approver_Bucket" to "#ApproverBucketList"
    And user performs the Approval Flow if required
    And set value of variable "Approval" to "PASS"
    #Verification Flow
    And user validate final form status with Initiator ID
