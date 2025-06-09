#Author: Shilpa Khare
Feature: FA_WUP-13259_Account_Client_Search_U 2022.4

  @A181
  Scenario: 42439491|Verify Account search in Global search
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.iconGlobalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchBy" to be visible
    And user enters value "cat" in textbox "CommonMenuPage.textboxSearch"
    Then verify element "CommonMenuPage.panelSearchResults" is visible
    Then verify element "CommonMenuPage.panelSearchAccorAccount" is visible
    Then verify element "CommonMenuPage.panelSearchAccorClient" is visible
    Then verify element "CommonMenuPage.panelSearchAccorAG" is visible
    Then verify element "CommonMenuPage.panelSearchAccorPlan" is visible
    Then verify element "CommonMenuPage.panelSearchAccorParticipant" is visible
    When user clicks on "CommonMenuPage.panelSearchAccorAccount"
    And verify grid "CommonMenuPage.panelSearchAccountgrid" is visible
    And verify column "Account Number" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    And verify column "Account Name" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    And verify column "Tax ID" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    And verify column "Alternate Account Number" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    And verify column "Branch" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    Then verify element "CommonMenuPage.panelSearchCloseIcon" is visible
    When user clicks on "CommonMenuPage.panelSearchCloseIcon"
    Then verify element "CommonMenuPage.panelSearchResults" is not visible
    When user clicks on "CommonMenuPage.iconGlobalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchBy" to be visible
    And user enters value "#AltAccountNumber" in textbox "CommonMenuPage.textboxSearch"
		Then verify element "CommonMenuPage.panelSearchResults" is visible
		And verify grid "CommonMenuPage.panelSearchAccountgrid" is visible
		And verify link text "#AccountNumber" is present in column "Account Number" in grid "CommonMenuPage.panelSearchAccountgrid"
		When user clicks on link "#AccountNumber" of column "Account Number" in grid "CommonMenuPage.panelSearchAccountgrid"
		Then verify that user is on "AccountDetailsPage" screen
		
		@A18
		Scenario: 42439492|Verify Client search in Global search
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.iconGlobalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchBy" to be visible
    And user enters value "#SSN" in textbox "CommonMenuPage.textboxSearch"
    And verify grid "CommonMenuPage.panelSearchClientgrid" is visible
    And verify column "Client Name" is present in "CommonMenuPage.panelSearchClientgrid" grid
    And verify column "Tax ID" is present in "CommonMenuPage.panelSearchClientgrid" grid
    And verify column "Interested Party" is present in "CommonMenuPage.panelSearchClientgrid" grid
    And verify column "Address" is present in "CommonMenuPage.panelSearchClientgrid" grid
    Then verify element "CommonMenuPage.panelSearchCloseIcon" is visible
    When user clicks on "CommonMenuPage.panelSearchCloseIcon"
    Then verify element "CommonMenuPage.panelSearchResults" is not visible
    When user clicks on "CommonMenuPage.iconGlobalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchBy" to be visible
    And user enters value "#SSN" in textbox "CommonMenuPage.textboxSearch"
		Then verify element "CommonMenuPage.panelSearchResults" is visible
		And verify grid "CommonMenuPage.panelSearchClientgrid" is visible
		And verify link text "#ClientName" is present in column "Client Name" in grid "CommonMenuPage.panelSearchClientgrid"
		When user clicks on link "#ClientName" of column "Client Name" in grid "CommonMenuPage.panelSearchClientgrid"
		Then verify that user is on "ClientDetailsPage" screen
		
@A18
		Scenario: 42462393|Verify Account Group/Plan/Participant search
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.iconGlobalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchBy" to be visible
    And user enters value "#Participant" in textbox "CommonMenuPage.textboxSearch"
    And verify grid "CommonMenuPage.panelSearchParticipantgrid" is visible
    And verify column "Participant" is present in "CommonMenuPage.panelSearchParticipantgrid" grid
		And verify link text "#Participant" is present in column "Participant" in grid "CommonMenuPage.panelSearchParticipantgrid"
		When user clicks on link "#Participant" of column "Participant" in grid "CommonMenuPage.panelSearchParticipantgrid"
		Then verify that user is on "ParticipantDetailsPage" screen
		When user clicks on "CommonMenuPage.iconGlobalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchBy" to be visible
    And user enters value "#Plan" in textbox "CommonMenuPage.textboxSearch"
    And verify grid "CommonMenuPage.panelSearchPlangrid" is visible
    And verify column "Plan" is present in "CommonMenuPage.panelSearchPlangrid" grid
		And verify link text "#Plan" is present in column "Plan" in grid "CommonMenuPage.panelSearchPlangrid"
		When user clicks on link "#Plan" of column "Plan" in grid "CommonMenuPage.panelSearchPlangrid"
		Then verify that user is on "PlanDetailsPage" screen
		When user clicks on "CommonMenuPage.iconGlobalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchBy" to be visible
    And user enters value "#AG" in textbox "CommonMenuPage.textboxSearch"
    And verify grid "CommonMenuPage.panelSearchAGgrid" is visible
    And verify column "Account Name" is present in "CommonMenuPage.panelSearchAGgrid" grid
		And verify link text "#AG" is present in column "Account Name" in grid "CommonMenuPage.panelSearchAGgrid"
		When user clicks on link "#AG" of column "Account Name" in grid "CommonMenuPage.panelSearchAGgrid"
		Then verify that user is on "AccountGroupDetailsPage" screen
		
		@A181
		Scenario: 42439775|Verify Account search in Local search
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And user selects an account/client "#AccountNumber" from global search
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.iconLocalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchByAccount" to be visible
    And user enters value "test" in textbox "CommonMenuPage.textboxSearchByAccount"
    Then verify element "CommonMenuPage.panelSearchResults" is visible
    Then verify element "CommonMenuPage.panelSearchAccorAccount" is visible
    And verify grid "CommonMenuPage.panelSearchAccountgrid" is visible
    And verify column "Account Number" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    And verify column "Account Name" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    And verify column "Tax ID" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    And verify column "Alternate Account Number" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    And verify column "Branch" is present in "CommonMenuPage.panelSearchAccountgrid" grid
    Then verify element "CommonMenuPage.panelSearchCloseIcon" is visible
    When user clicks on "CommonMenuPage.panelSearchCloseIcon"
    Then verify element "CommonMenuPage.panelSearchResults" is not visible
    When user clicks on "CommonMenuPage.iconLocalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchByAccount" to be visible
    And user enters value "#AltAccountNumber" in textbox "CommonMenuPage.textboxSearchByAccount"
		Then verify element "CommonMenuPage.panelSearchResults" is visible
		And verify grid "CommonMenuPage.panelSearchLocalAccountgrid" is visible
		And verify link text "#AccountNumber" is present in column "Account Number" in grid "CommonMenuPage.panelSearchLocalAccountgrid"
		When user clicks on link "#AccountNumber" of column "Account Number" in grid "CommonMenuPage.panelSearchLocalAccountgrid"
		Then verify that user is on "AccountDetailsPage" screen
		
		@A181 @1
		Scenario: 42439776|Verify Client search in Local search
		Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    And user selects an account/client "#ClientName" from global search
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.iconLocalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchByClient" to be visible
    And user enters value "test" in textbox "CommonMenuPage.textboxSearchByClient"
    Then verify element "CommonMenuPage.panelSearchResults" is visible
    And verify grid "CommonMenuPage.panelSearchClientgrid" is visible
    And verify column "Client Name" is present in "CommonMenuPage.panelSearchClientgrid" grid
    And verify column "Tax ID" is present in "CommonMenuPage.panelSearchClientgrid" grid
    And verify column "Interested Party" is present in "CommonMenuPage.panelSearchClientgrid" grid
    And verify column "Address" is present in "CommonMenuPage.panelSearchClientgrid" grid
    Then verify element "CommonMenuPage.panelSearchCloseIcon" is visible
    When user clicks on "CommonMenuPage.panelSearchCloseIcon"
    Then verify element "CommonMenuPage.panelSearchResults" is not visible
    When user clicks on "CommonMenuPage.iconLocalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchByClient" to be visible
    And user enters value "#SSN" in textbox "CommonMenuPage.textboxSearchByClient"
		Then verify element "CommonMenuPage.panelSearchResults" is visible
		And verify grid "CommonMenuPage.panelSearchClientgrid" is visible
		And verify link text "#ClientName" is present in column "Client Name" in grid "CommonMenuPage.panelSearchClientgrid"
		When user clicks on link "#ClientName" of column "Client Name" in grid "CommonMenuPage.panelSearchClientgrid"
		Then verify that user is on "ClientDetailsPage" screen
    
