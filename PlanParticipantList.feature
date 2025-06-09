Feature: Plan/Partipant list
  I want to verify Retirement Management screen for Addvantage

  # Author  : Gaurav Jain
  
  Scenario: 38851532|Verify plan/Partipant list for retirement
    Given user is on Unity Login Page
    When user logs into Unity with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkRetirementManagement"
    Then verify that user is on "DashboardPage" screen
    And validate that element "RetirementManagementPage.linkDashboard" is visible
    And validate that element "RetirementManagementPage.linkPlanParticipants" is visible
    When user clicks on "RetirementManagementPage.linkPlanParticipants"
    Then verify that user is on "Planparticipantpage" screen
    
    When user clicks on "CommonMenuPage.buttonColumnSettings"
    Then validate that element "Planparticipantpage.checkboxAddressline1" is visible
    Then validate that element "Planparticipantpage.checkboxCity" is visible
   Then validate that element "Planparticipantpage.checkboxPlanNumber" is visible
    Then validate that element "Planparticipantpage.checkboxPlanShortName" is visible
   Then user deselects all checkboxes in column settings panel
   And verify that user is on "Planparticipantpage" screen
   And verify column "Favorite" is present in "Planparticipantpage.gridPlanParticipantList" grid
    And verify column "Short Name" is present in "Planparticipantpage.gridPlanParticipantList" grid
   And verify column "Number" is present in "Planparticipantpage.gridPlanParticipantList" grid
    And verify column "Actions " is present in "Planparticipantpage.gridPlanParticipantList" grid
    Then user clicks on "CommonMenuPage.buttonColumnSettings"


   
 #Rupali
    @25AugRMD
    Scenario: 38851532|Plan/Participant List screen
    Given user is on Unity Login Page
    When user logs into Unity with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkRMD"
    Then verify that user is on "RetirementManagementPage" screen
    And verify element "RetirementManagementPage.linkDashboard" is visible 
    And verify element "RetirementManagementPage.linkPlanParticipantList" is visible 
    And user clicks on "RetirementManagementPage.linkPlanParticipantList"
    And verify that user is on "RetirementManagementPage" screen
    And verify grid "RetirementManagementPage.gridRMD" is visible
    And verify element "RetirementManagementPage.checkboxRecent" is visible 
    And verify element "RetirementManagementPage.checkboxClear" is visible 
    And verify element "RetirementManagementPage.checkboxFavorites" is visible 
    And verify element "RetirementManagementPage.textboxSearch" is visible 
    #Then user clicks on "RetirementManagementPage.checkboxClear"
    
    When user clicks on "RetirementManagementPage.dropdownView"
    And user clicks on "RetirementManagementPage.checkboxPlans"
    And user clicks on "RetirementManagementPage.checkboxParticipants"
    And user clicks on "RetirementManagementPage.buttonRefresh"
    Then verify that user is on "RetirementManagementPage" screen
      
    And user clicks on "CommonMenuPage.buttonColumnSettings"
    And user deselects all checkboxes in column settings panel
    Then verify that user is on "RetirementManagementPage" screen
    And verify column "Short Name" is present in "RetirementManagementPage.gridRMD" grid
    And verify column "Number" is present in "RetirementManagementPage.gridRMD" grid
    And verify column "Actions" is present in "RetirementManagementPage.gridRMD" grid
    #And user clicks on "CommonMenuPage.buttonColumnSettings"
    #Then user selects all checkboxes in column settings panel
    When user perform a page refresh
    Then verify that user is on "RetirementManagementPage" screen    
    When user clicks on "CommonMenuPage.buttonExportToCSV"
    And user waits for file "#FileName" to download and save file as "ExportedFile"
    Then verify exported csv "#ExportedFile" with grid "RetirementManagementPage.gridRMD"    
    When user clicks on "CommonMenuPage.buttonPrint"
    Then user clicks on "CommonMenuPage.buttonPrintCurrentPage"
    And user switches to new window
    And verify text "Short Name" is present in print current page
    And verify text "Number" is present in print current page
    Then user switches back to parent window
    And verify that user is on "RetirementManagementPage" screen
    
    
     #Rupali
    @25AugRMD2
    Scenario: 38851534|Hyperlinks - Plan screen
    Given user is on Unity Login Page
    When user logs into Unity with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkRMD"
    Then verify that user is on "RetirementManagementPage" screen
    And verify element "RetirementManagementPage.linkDashboard" is visible 
    And verify element "RetirementManagementPage.linkPlanParticipantList" is visible 
    And user clicks on "RetirementManagementPage.linkPlanParticipantList"
    And verify that user is on "RetirementManagementPage" screen
    And verify grid "RetirementManagementPage.gridRMD" is visible
    When user clicks on "RetirementManagementPage.dropdownView"
    #And user clicks on "RetirementManagementPage.checkboxPlans"
    And user clicks on "RetirementManagementPage.checkboxParticipants"
    And user clicks on "RetirementManagementPage.buttonRefresh"
    Then verify that user is on "RetirementManagementPage" screen    
     When user selects an Plan/Participants "#PlanNumber" from "RetirementManagementPage.textboxSearch"
     Then verify that user is on "RetirementManagementPage" screen
     And verify element "RetirementManagementPage.tabPlanInformation" is visible 
     And verify element "RetirementManagementPage.tabFundAccounts" is visible 
     And verify element "RetirementManagementPage.tabOtherMasters" is visible 
     And verify element "RetirementManagementPage.tabNotes" is visible 

    


  
  
  Scenario: WRAWUP-T54883|Verify that user will see additional columns for the Local Search results for Participant accordion - ADDV
    Given user is on Unity Login Page
    When user logs into Unity with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkRetirementManagement"
    Then verify that user is on "DashboardPage" screen
    And validate that element "RetirementManagementPage.linkDashboard" is visible
    And validate that element "RetirementManagementPage.linkPlanParticipants" is visible
    When user clicks on "RetirementManagementPage.linkPlanParticipants"
    Then verify that user is on "Planparticipantpage" screen
    And user clicks on link in column "Short Name" with index "0" in grid "RetirementManagementPage.gridRMD"
   When user clicks on "CommonMenuPage.iconLocalSearch" using js
   And user waits for element "CommonMenuPage.labelSearchByParticipant" to be visible
    And user enters value "#PartNumber" in textbox "CommonMenuPage.textboxSearchByParticipant"
    Then verify element "CommonMenuPage.panelSearchResults" is visible
    Then verify element "CommonMenuPage.panelSearchAccorParticipant" is visible
    And verify grid "CommonMenuPage.panelSearchParticipantgrid" is visible
    And verify column "Participant" is present in "CommonMenuPage.panelSearchParticipantgrid" grid
    And verify column "Participant Number" is present in "CommonMenuPage.panelSearchParticipantgrid" grid
    And verify link text "#PartName" is present in column "Participant" in grid "CommonMenuPage.panelSearchParticipantgrid"
		When user clicks on link "#PartName" of column "Participant" in grid "CommonMenuPage.panelSearchParticipantgrid"
		Then verify that user is on "ParticipantDetailsPage" screen
    
   
  Scenario: WRAWUP-T54913|Verify that user will see additional columns for the Global Search results for Plan accordion
     Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.iconGlobalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchBy" to be visible
    And user enters value "#Plan" in textbox "CommonMenuPage.textboxSearch"
    And verify grid "CommonMenuPage.panelSearchPlangrid" is visible
    And verify column "Plan" is present in "CommonMenuPage.panelSearchPlangrid" grid
    And verify column "Plan Account Number" is present in "CommonMenuPage.panelSearchPlangrid" grid
		And verify link text "#Plan" is present in column "Plan" in grid "CommonMenuPage.panelSearchPlangrid"
		When user clicks on link "#Plan" of column "Plan" in grid "CommonMenuPage.panelSearchPlangrid"
		Then verify that user is on "PlanDetailsPage" screen
		
		
  Scenario: WRAWUP-T54925|Verify that user will see additional columns for the Global Search results for Participant accordion - ADDV
     Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.iconGlobalSearch" using js
    And user waits for element "CommonMenuPage.labelSearchBy" to be visible
    And user enters value "#PartNumber" in textbox "CommonMenuPage.textboxSearch"
    And verify grid "CommonMenuPage.panelSearchParticipantgrid" is visible
    And verify column "Participant" is present in "CommonMenuPage.panelSearchParticipantgrid" grid
    And verify column "Participant Number" is present in "CommonMenuPage.panelSearchParticipantgrid" grid
		And verify link text "#PartName" is present in column "Participant" in grid "CommonMenuPage.panelSearchParticipantgrid"
		When user clicks on link "#PartName" of column "Participant" in grid "CommonMenuPage.panelSearchParticipantgrid"
		Then verify that user is on "ParticipantDetailsPage" screen
		
		@New
		 Scenario: WRAWUP-T54928|Verify that user will not see additional columns for the Local Search results for Plan accordion - ADDV
    Given user is on Unity Login Page
    When user logs into Unity with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkRetirementManagement"
    Then verify that user is on "DashboardPage" screen
    And validate that element "RetirementManagementPage.linkDashboard" is visible
    And validate that element "RetirementManagementPage.linkPlanParticipants" is visible
    When user clicks on "RetirementManagementPage.linkPlanParticipants"
    Then verify that user is on "Planparticipantpage" screen
    And user clicks on link in column "Short Name" with index "0" in grid "RetirementManagementPage.gridRMD"
    Then verify that user is on "PlanDetailsPage" screen
		And verify element "CommonMenuPage.iconLocalSearch" is not visible 