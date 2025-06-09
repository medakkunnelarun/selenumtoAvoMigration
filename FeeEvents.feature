# Author  : Shilpa Khare
Feature: FeeActivity
  I want to verify Fee Events screen for Global Plus


  #Scenario: 40144174|Verify Fee Events grid - Navigation
    #Given user logs in to unity application with "#UserID"
    #Then verify that user is on "DashboardPage" screen
    #When user clicks on "CommonMenuPage.linkFees"
    #When user clicks on "CommonMenuPage.linkFeeEvents"
    #Then verify that user is on "FeeEventsPage" screen
    
    @NewFeeEvent 
    Scenario: WRAWUP-T22926|Verify Fees Events grid - Validate Column setting 
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    And verify element "FeeEventsPage.checkboxBookOfBusiness" is visible
    When user deselects checkbox "FeeEventsPage.checkboxBookOfBusiness"
    And verify element "FeeEventsPage.checkboxFavorites" is visible
    When user deselects checkbox "FeeEventsPage.checkboxFavorites"
    And verify element "FeeEventsPage.checkboxRecent" is visible
    And verify element "FeeEventsPage.buttonClear" is visible
    And verify grid "FeeEventsPage.gridFeeEvents" is visible
    And verify element "FeeEventsPage.textboxSearch" is visible
    And verify element "CommonMenuPage.buttonColumnSettings" is visible
    And verify element "CommonMenuPage.buttonPrint" is visible
    And verify element "CommonMenuPage.buttonExportToCSV" is visible
    And verify element "CommonMenuPage.buttonClearAllFilter" is visible
    Then user clicks on "CommonMenuPage.buttonColumnSettings"
    When user deselects all checkboxes in column settings panel
    And verify column "Account Number" is present in "FeeEventsPage.gridFeeEvents" grid
    And verify column "Event Type" is present in "FeeEventsPage.gridFeeEvents" grid
    And verify column "Account Name" is present in "FeeEventsPage.gridFeeEvents" grid
    And verify column "Event Number" is present in "FeeEventsPage.gridFeeEvents" grid
    And verify column "Interested Party Number" is present in "FeeEventsPage.gridFeeEvents" grid
    And verify column "Event Description" is present in "FeeEventsPage.gridFeeEvents" grid
    When user clicks on "CommonMenuPage.buttonColumnSettings"
    Then verify element "FeeEventsPage.checkboxAsOfDate" is visible
    And verify element "FeeEventsPage.checkboxBlockNumber" is visible
    And verify element "FeeEventsPage.checkboxEventClassCode" is visible
    And verify element "FeeEventsPage.checkboxEventName" is visible
    And verify element "FeeEventsPage.checkboxFrequency" is visible
    And verify element "FeeEventsPage.checkboxLastScheduledExecution" is visible
    And verify element "FeeEventsPage.checkboxNextScheduledExecution" is visible
    And verify element "FeeEventsPage.checkboxResponsibleEmployee" is visible
    When user clicks on "CommonMenuPage.buttonSaveColumnSettings"
    Then verify that user is on "FeeEventsPage" screen
    And verify grid "FeeEventsPage.gridFeeEvents" with service url "#ServiceUrl"
    
    
    Scenario: WRAWUP-T17746|Verify Fees Events grid - sorting  
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    And validate that element "CommonMenuPage.buttonColumnSettings" is visible
    Then user clicks on "CommonMenuPage.buttonColumnSettings"
    And user selects all checkboxes in column settings panel
    And verify column "Next Scheduled Execution" is present in "FeeEventsPage.gridFeeEvents" grid
    And user applies ascending sort on column "Next Scheduled Execution" in grid "FeeEventsPage.gridFeeEvents"
    And verify column "Account Number" is present in "FeeEventsPage.gridFeeEvents" grid
    And user applies ascending sort on column "Account Number" in grid "FeeEventsPage.gridFeeEvents"
    And verify column "Event Type" is present in "FeeEventsPage.gridFeeEvents" grid
    And user applies ascending sort on column "Event Type" in grid "FeeEventsPage.gridFeeEvents"
    And verify column "Event Number" is present in "FeeEventsPage.gridFeeEvents" grid
    And user applies ascending sort on column "Event Number" in grid "FeeEventsPage.gridFeeEvents"
    Then user clicks on "CommonMenuPage.buttonColumnSettings"
    And user deselects all checkboxes in column settings panel
    
		
    Scenario: WRAWUP-T14491|Verify Fees Events grid - Book of Business checkbox	  
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    And verify element "FeeEventsPage.checkboxBookOfBusiness" is visible
    And verify checkbox "FeeEventsPage.checkboxBookOfBusiness" is not selected
    #Then verify attribute "class" of element "FeeEventsPage.checkboxBookOfBusiness" should not contains "mat-mdc-checkbox-checked"
    #And verify attribute "aria-checked" of element "FeeEventsPage.checkboxBookOfBusiness" should be "false"
    And user deselects checkbox "FeeEventsPage.checkboxRecent"
    When user selects checkbox "FeeEventsPage.checkboxBookOfBusiness"
    And user clicks on "FeeEventsPage.dropDownBookOfBusiness"
    And user clicks on "FeeEventsPage.optionBOBByOther"  
    And verify grid "FeeEventsPage.gridFeeEvents" with service url "#ServiceUrl"
    
    @NewFeeEvent1 
    Scenario: WRAWUP-T25850|Verify Fees Events grid - Favorites checkbox
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkAccountManagement"
    Then verify that user is on "AccountListPage" screen
    And user selects checkbox "AccountListPage.checkboxClear"
    And user clicks on "AccountListPage.dropdownView"
    And user selects checkbox "AccountListPage.checkboxAccounts"
    And user deselects checkbox "AccountListPage.checkboxClients"
    And user deselects checkbox "AccountListPage.checkboxSystemDefinedAccountGroups"
    And user deselects checkbox "AccountListPage.checkboxUserDefinedAccountGroups"
    And user clicks on "AccountListPage.buttonRefresh"
    Then verify that user is on "AccountListPage" screen
    And user enters value "#AccountNumber" in textbox "AccountListPage.textboxSearch"
    And user selects account/client "#AccountNumber" as favorite in AccountListGrid
    When user clicks on "CommonMenuPage.linkFees"
    When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    And user deselects checkbox "FeeEventsPage.checkboxRecent"
    And user deselects checkbox "FeeEventsPage.checkboxBookOfBusiness"
    And user selects checkbox "FeeEventsPage.checkboxFavorites"
    And user enters value "#AccountName" in textbox "FeeEventsPage.textboxSearch"
    Then verify that user is on "FeeEventsPage" screen
    And verify text "#AccountName" is present in all the values of column "Account Name" in grid "FeeEventsPage.gridFeeEvents" 
    
    @NewFeeEvent12 
    Scenario: WRAWUP-T40201|Verify Fees Events grid - Recent checkbox
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user selects an account/client "#AccountNumber" from global search
    When user clicks on "CommonMenuPage.linkFees"
    When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user selects checkbox "FeeEventsPage.checkboxRecent"
    And user enters value "#AccountName" in textbox "FeeEventsPage.textboxSearch"
    Then verify that user is on "FeeEventsPage" screen
    And verify text "#AccountName" is present in column "Account Name" in grid "FeeEventsPage.gridFeeEvents" 
    When user deselects checkbox "FeeEventsPage.checkboxRecent"
    And user enters value "#AccountName2" in textbox "FeeEventsPage.textboxSearch"
    Then verify that user is on "FeeEventsPage" screen
    And verify text "#AccountName2" is present in column "Account Name" in grid "FeeEventsPage.gridFeeEvents" 
    
   
    Scenario: WRAWUP-T23244|Verify Fees Events grid - Reset button 	  
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user selects checkbox "FeeEventsPage.checkboxBookOfBusiness"
    When user selects checkbox "FeeEventsPage.checkboxFavorites"
    When user deselects checkbox "FeeEventsPage.checkboxRecent"
    When user clicks on "FeeEventsPage.buttonClear"
    And verify checkbox "FeeEventsPage.checkboxBookOfBusiness" is not selected
    And verify checkbox "FeeEventsPage.checkboxFavorites" is not selected
    And verify checkbox "FeeEventsPage.checkboxRecent" is selected
    #Then verify attribute "class" of element "FeeEventsPage.checkboxBookOfBusiness" should not contains "mat-mdc-checkbox-checked"
    #Then verify attribute "class" of element "FeeEventsPage.checkboxFavorites" should not contains "mat-mdc-checkbox-checked"
    #Then verify attribute "class" of element "FeeEventsPage.checkboxRecent" should contains "mat-mdc-checkbox-checked"
    #And verify attribute "aria-checked" of element "FeeEventsPage.checkboxBookOfBusiness" should be "false"
    #And verify attribute "aria-checked" of element "FeeEventsPage.checkboxFavorites" should be "false"
    #And verify attribute "aria-checked" of element "FeeEventsPage.checkboxRecent" should be "true"
    
   
    Scenario: WRAWUP-T31801|Verify combination of checkboxes 	  
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user selects checkbox "FeeEventsPage.checkboxFavorites"
    When user selects checkbox "FeeEventsPage.checkboxRecent"
    And verify grid "FeeEventsPage.gridFeeEvents" with service url "#ServiceUrl"
    When user deselects checkbox "FeeEventsPage.checkboxFavorites"
    When user selects checkbox "FeeEventsPage.checkboxBookOfBusiness"
    And user clicks on "FeeEventsPage.dropDownBookOfBusiness"
    And user clicks on "FeeEventsPage.optionBOBByOther"
    And verify grid "FeeEventsPage.gridFeeEvents" with service url "#ServiceUrl1"
    #When user deselects checkbox "FeeEventsPage.checkboxRecent"
    #When user selects checkbox "FeeEventsPage.checkboxFavorites"
    #And verify grid "FeeEventsPage.gridFeeEvents" with service url "#ServiceUrl2"
    When user clicks on "FeeEventsPage.buttonClear"
    
    @ReTest123 
    Scenario: WRAWUP-T40599|Verify Fees Events grid - Search By textbox
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
     When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user clicks on "FeeEventsPage.textboxSearch"
    And user enters value "#AccountName" in textbox "FeeEventsPage.textboxSearch"
    Then verify that user is on "FeeEventsPage" screen
    And verify text "#AccountName" is present in all the values of column "Account Name" in grid "FeeEventsPage.gridFeeEvents"
    When user clicks on "FeeEventsPage.textboxSearch"
    And user enters value "#EventNumber" in textbox "FeeActivityPage.textboxSearch"
    Then verify that user is on "FeeEventsPage" screen
    And verify text "#EventNumber" is present in all the values of column "Event Number" in grid "FeeEventsPage.gridFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user clicks on "FeeEventsPage.textboxSearch"
    And user enters value "#AlternateAccountNumber" in textbox "FeeEventsPage.textboxSearch"
    Then verify that user is on "FeeEventsPage" screen
    And verify text "#AccountNumber" is present in all the values of column "Account Number" in grid "FeeEventsPage.gridFeeEvents"
    
    
    Scenario: WRAWUP-T41715|Verify Fees Events grid - Account Number hyperlink
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
     When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user clicks on "FeeEventsPage.textboxSearch"
    And user enters value "#AccountName" in textbox "FeeEventsPage.textboxSearch"
    Then verify that user is on "FeeEventsPage" screen
    And verify text "#AccountName" is present in all the values of column "Account Name" in grid "FeeEventsPage.gridFeeEvents"
    When user clicks on link "#AccountNumber" of column "Account Number" in grid "FeeEventsPage.gridFeeEvents"
    Then verify that user is on "AccountDetailsPage" screen
    Then verify element "AccountDetailsPage.panelFeeInformation" is visible
    And user expands accordian "AccountDetailsPage.panelFeeInformation"
    Then verify element "AccountDetailsPage.linkFeeInformationMoreDetails" is visible
    And verify attribute "aria-expanded" of element "AccountDetailsPage.panelFeeInformation" should be "true"
    
    @NewFeeEvent12 
    Scenario: WRAWUP-T37092|Verify Fees Events grid - Event Type hyperlink
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
     When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user clicks on "FeeEventsPage.textboxSearch"
    And user enters value "4149945418413136" in textbox "FeeEventsPage.textboxSearch"
    Then verify that user is on "FeeEventsPage" screen
    And verify text "4149945418413136" is present in all the values of column "Event Number" in grid "FeeEventsPage.gridFeeEvents"
    When user clicks on link "#EventType" of column "Event Type" in grid "FeeEventsPage.gridFeeEvents"
    Then verify that user is on "EventsPage" screen
    Then verify element "EventsPage.panelEventDetails" is visible
    Then verify element "EventsPage.labelEventTypeKey" is visible
    And verify attribute "aria-expanded" of element "EventsPage.panelEventDetails" should be "true"
    
    @rete 
    Scenario: WRAWUP-T10188|Verify Fee Events grid - Print and Export
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
     When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user clicks on "CommonMenuPage.buttonExportToCSV"
    And user waits for file "#FileName" to download and save file as "ExportedFile"
    Then verify exported csv "#ExportedFile" with grid "FeeEventsPage.gridFeeEvents"
    When user clicks on "CommonMenuPage.buttonPrint"
    Then user clicks on "CommonMenuPage.buttonPrintCurrentPage"
    And user switches to new window
    And verify text "Account" is present in print current page
    And verify text "Name" is present in print current page
    And verify text "Account" is present in print current page
    And verify text "Number" is present in print current page
    And verify text "Event" is present in print current page
    And verify text "Type" is present in print current page
    And verify text "Event" is present in print current page
    And verify text "Number" is present in print current page
    Then user switches back to parent window
    When user clicks on "CommonMenuPage.buttonPrint"
    Then user clicks on "CommonMenuPage.buttonPrintAllPages"
    And user switches to new window
    And verify text "Account" is present in print current page
    And verify text "Name" is present in print current page
    And verify text "Account" is present in print current page
    And verify text "Number" is present in print current page
    And verify text "Event" is present in print current page
    And verify text "Type" is present in print current page
    And verify text "Event" is present in print current page
    And verify text "Number" is present in print current page
    Then user switches back to parent window
    
		@1 
    Scenario: WRAWUP-T35039|Verify Fees Events grid - Grouping
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
     When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user selects checkbox "FeeEventsPage.checkboxBookOfBusiness"
    And user clicks on "FeeEventsPage.dropDownBookOfBusiness"
    And user clicks on "FeeEventsPage.optionBOBByOther"
    When user deselects checkbox "FeeEventsPage.checkboxFavorites"
    When user selects checkbox "FeeEventsPage.checkboxRecent"
     Then verify that user is on "FeeEventsPage" screen
    When verify single level grouping for column "Event Type" in grid "FeeEventsPage.gridFeeEvents"
    And user clicks on "CommonMenuPage.buttonGroupingCancel"
    And verify single level grouping for column "Account Number" in grid "FeeEventsPage.gridFeeEvents"
    And user clicks on "CommonMenuPage.buttonGroupingCancel"
    And verify multi level grouping for columns "Event Type,Account Number" in grid "FeeEventsPage.gridFeeEvents"
    
    @1 @Z
    Scenario: WRAWUP-T27798|Verify applicable event_types for the grid
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
     When user clicks on "CommonMenuPage.linkFeeEvents"
    Then verify that user is on "FeeEventsPage" screen
    When user deselects checkbox "FeeEventsPage.checkboxBookOfBusiness"
    When user deselects checkbox "FeeEventsPage.checkboxFavorites"
    When user deselects checkbox "FeeEventsPage.checkboxRecent"
    Then verify that user is on "FeeEventsPage" screen
    And verify column "Event Type" is present in "FeeEventsPage.gridFeeEvents" grid
    And verify column "Event Type" filter contains values which are subset of "FEE CALCULATION,FEE INVOICE PRINT,FEE PROCESSING,FEE RECEIVABLE"
    #When user clicks on "FeeEventsPage.iconEventTypeMenu"
    #And verify element "FeeEventsPage.panelColumnFilter" is visible
    #And user select checkbox for "FeeEventsPage.gridFeeEvents" on gridfilter
    #And verify 
    
    #When verify single level grouping for column "Event Type" in grid "FeeEventsPage.gridFeeEvents"
    #And user clicks on "CommonMenuPage.buttonGroupingCancel"
    #And verify single level grouping for column "Account Number" in grid "FeeEventsPage.gridFeeEvents"
    #And user clicks on "CommonMenuPage.buttonGroupingCancel"
    #And verify multi level grouping for columns "Event Type,Account Number" in grid "FeeEventsPage.gridFeeEvents"
    
    