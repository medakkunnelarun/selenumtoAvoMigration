#Author: Shilpa Khare
@tag
Feature: Fee Oversight Verification

  Scenario: WRAWUP-T40127|Fee Oversight page verification
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify element "AccountDetailsPage.panelFeeInformation" is visible
    And verify element "FeeOversightPage.panelTotalSummary" is visible

  @retes
  Scenario: WRAWUP-T22662|Fee Oversight - Total Summary section
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    And user waits for element "CommonMenuPage.linkFeeOversight" to be visible
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify element "FeeOversightPage.panelTotalSummary" is visible
    And verify element "FeeOversightPage.labelFeeYearToDate" is visible
    And verify element "FeeOversightPage.labelFeeThisMonth" is visible
    And verify element "FeeOversightPage.labelFeeThisQuarter" is visible
    And verify element "FeeOversightPage.labelFeePriorYear" is visible
  #And verify ui field keys "FeeOversightPage.labelHeadersTotalSummary" and values "FeeOversightPage.labelValuesTotalSummary" with service url "#ServiceUrl"
  
  
  Scenario: WRAWUP-T12865|Verify visibility of fee oversight screen
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And user clicks on "FeeOversightPage.dropdownGroupby"
    And verify element "FeeOversightPage.optionBranch" is visible
    And verify element "FeeOversightPage.optionAdministrator" is visible
    And verify element "FeeOversightPage.optionInvestmentOfficer" is visible
    And verify element "FeeOversightPage.optionFeeGroup" is visible
    When user clicks on "FeeOversightPage.optionBranch"
    Then verify column "Branch" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Number of Accounts" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Total Market Value" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Fees Year-to-Date" is present in "FeeOversightPage.gridFeeInformation" grid

  @22.4FeeOver @rete @1
  Scenario: WRAWUP-T13455|Fee Oversight - Fee Information section - Group By Branch
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And user clicks on "FeeOversightPage.optionBranch"
    And verify element "FeeOversightPage.groupbyoptionBranch" is visible
    Then verify that user is on "FeeOversightPage" screen
    And verify column "Branch" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Number of Accounts" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Total Market Value" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Fees Year-to-Date" is present in "FeeOversightPage.gridFeeInformation" grid
    Then verify that user is on "FeeOversightPage" screen
    #And verify grid "FeeOversightPage.gridFeeInformation" with service url "#ServiceUrl"
  
  
  Scenario: WRAWUP-T33659|Fee Oversight - Fee Information section - Group By Administrator Name
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And user clicks on "FeeOversightPage.optionAdministrator"
    And verify element "FeeOversightPage.groupbyoptionAdministrator" is visible
    Then verify that user is on "FeeOversightPage" screen
    And verify column "Administrator" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Number of Accounts" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Total Market Value" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Fees Year-to-Date" is present in "FeeOversightPage.gridFeeInformation" grid
    Then verify that user is on "FeeOversightPage" screen
  	#And verify grid "FeeOversightPage.gridFeeInformation" with service url "#ServiceUrl"
  
  @22.4FeeOver1
  Scenario: WRAWUP-T41143|Fee Oversight - Fee Information section - Group By Investment Officer Name
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And user clicks on "FeeOversightPage.optionInvestmentOfficer"
    And verify element "FeeOversightPage.groupbyoptionInvestmentOfficer" is visible
    Then verify that user is on "FeeOversightPage" screen
    And verify column "Investment Officer" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Number of Accounts" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Total Market Value" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Fees Year-to-Date" is present in "FeeOversightPage.gridFeeInformation" grid
    Then verify that user is on "FeeOversightPage" screen
    #And verify grid "FeeOversightPage.gridFeeInformation" with service url "#ServiceUrl"
  
  @22.4FeeOver1
  Scenario: WRAWUP-T24364|Fee Oversight - Fee Information section - Group By 'Fee Group Name'
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And user clicks on "FeeOversightPage.optionFeeGroup"
    And verify element "FeeOversightPage.groupbyoptionFeeGroup" is visible
    Then verify that user is on "FeeOversightPage" screen
    And verify column "Fee Group" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Number of Accounts" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Total Market Value" is present in "FeeOversightPage.gridFeeInformation" grid
    And verify column "Fees Year-to-Date" is present in "FeeOversightPage.gridFeeInformation" grid
    Then verify that user is on "FeeOversightPage" screen
    #And verify grid "FeeOversightPage.gridFeeInformation" with service url "#ServiceUrl"
    
    
  Scenario: WRAWUP-T34469|Fee Oversight - Fee Informatin grid - print, export
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And verify element "FeeOversightPage.optionBranch" is visible
    And user clicks on "FeeOversightPage.optionBranch"
    When user clicks on "FeeOversightPage.linkPrint"
    Then user clicks on "CommonMenuPage.buttonPrintCurrentPage"
    And user switches to new window
    And verify text "Group By" is present in print current page
    And verify text "Number of Accounts" is present in print current page
    And verify text "Total Market Value " is present in print current page
    And verify text "Fees Year-to-Date" is present in print current page
    Then user switches back to parent window
    Then verify that user is on "FeeOversightPage" screen
    And user clicks on "FeeOversightPage.buttonExportToCSV"
    Then user waits for file "FeeOversight" to download and save file as "ExportedFile"
    Then verify exported csv "#ExportedFile" with grid "FeeOversightPage.gridFeeInformation"

  Scenario: WRAWUP-T5712|Fee Oversight - Fee Informatin grid - print, export, group by
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And verify element "FeeOversightPage.optionFeeGroup" is visible
    And user clicks on "FeeOversightPage.optionFeeGroup"
    Then verify that user is on "FeeOversightPage" screen
    When user clicks on "FeeOversightPage.linkPrint"
    Then user clicks on "CommonMenuPage.buttonPrintCurrentPage"
    And user switches to new window
    And verify text "Group By" is present in print current page
    And verify text "Number of Accounts" is present in print current page
    And verify text "Total Market Value " is present in print current page
    And verify text "Fees Year-to-Date" is present in print current page
    Then user switches back to parent window
    Then verify that user is on "FeeOversightPage" screen
    And user clicks on "FeeOversightPage.buttonExportToCSV"
    Then user waits for file "FeeOversight" to download and save file as "ExportedFile"
    Then verify exported csv "#ExportedFile" with grid "FeeOversightPage.gridFeeInformation"

  Scenario: WRAWUP-T9268|Fee Oversight - Sorting
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And verify element "FeeOversightPage.optionBranch" is visible
    Then verify that user is on "FeeOversightPage" screen
    And verify column "Branch" is present in "FeeOversightPage.gridFeeInformation" grid
    Then user applies descending sort on column "Number of Accounts" in grid "FeeOversightPage.gridFeeInformation"
    And verify column "Total Market Value" is present in "FeeOversightPage.gridFeeInformation" grid
    Then user applies descending sort on column "Total Market Value" in grid "FeeOversightPage.gridFeeInformation"
    And verify column "Fees Year-to-Date" is present in "FeeOversightPage.gridFeeInformation" grid
    Then user applies descending sort on column "Fees Year-to-Date" in grid "FeeOversightPage.gridFeeInformation"
    And verify column "Number of Accounts" is present in "FeeOversightPage.gridFeeInformation" grid
    Then user applies ascending sort on column "Number of Accounts" in grid "FeeOversightPage.gridFeeInformation"
    And verify column "Total Market Value" is present in "FeeOversightPage.gridFeeInformation" grid
    Then user applies ascending sort on column "Total Market Value" in grid "FeeOversightPage.gridFeeInformation"
    And verify column "Fees Year-to-Date" is present in "FeeOversightPage.gridFeeInformation" grid
    Then user applies ascending sort on column "Fees Year-to-Date" in grid "FeeOversightPage.gridFeeInformation"

  Scenario: WRAWUP-T4770|Fee Oversight - Fee Information - Filter - Branch column
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And user clicks on "FeeOversightPage.optionBranch"
    And verify element "FeeOversightPage.groupbyoptionBranch" is visible
    Then verify that user is on "FeeOversightPage" screen
    And verify column "Branch" is present in "FeeOversightPage.gridFeeInformation" grid
    ###menuFilterContains
    And user hovers over element "FeeOversightPage.columnBranch"
    And validate that element "FeeOversightPage.menuBranch" is visible
    When user clicks on "FeeOversightPage.menuBranch" using js
    And validate that element "FeeOversightPage.menuFilter" is visible
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterContains" is visible
    When user clicks on "FeeOversightPage.menuFilterContains"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterContains" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#ContainsBranch" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Branch" in grid "FeeOversightPage.gridFeeInformation"
    ###menuFilterNotContains
    And user hovers over element "FeeOversightPage.columnBranch"
    And validate that element "FeeOversightPage.menuBranch" is visible
    When user clicks on "FeeOversightPage.menuBranch" using js
    When user clicks on "FeeOversightPage.buttonClearFilter" using js
    Then verify that user is on "FeeOversightPage" screen
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    When user clicks on "FeeOversightPage.menuFilterNotContains"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterNotContains" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#NotcontainsBranch" is present in grid "FeeOversightPage.gridFeeInformation"
    And verify text "#NotcontainsBranch1" is not present in column " Branch" in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    And user waits for "2" seconds
    Then verify no filter is applied on column "Branch" in grid "FeeOversightPage.gridFeeInformation"
    ###Equals
    And user hovers over element "FeeOversightPage.columnBranch"
    And validate that element "FeeOversightPage.menuBranch" is visible
    When user clicks on "FeeOversightPage.menuBranch" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterEquals" is visible
    When user clicks on "FeeOversightPage.menuFilterEquals"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#Branch1" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#Branch1" is present in grid "FeeOversightPage.gridFeeInformation"
    ##NotEquals
    And user hovers over element "FeeOversightPage.columnBranch"
    And validate that element "FeeOversightPage.menuBranch" is visible
    When user clicks on "FeeOversightPage.menuBranch" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterNotEqual" is visible
    When user clicks on "FeeOversightPage.menuFilterNotEqual"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#Branch2" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#Branch2" is not present in column " Branch" in grid "FeeOversightPage.gridFeeInformation"
    ##StartsWith
    And user hovers over element "FeeOversightPage.columnBranch"
    And validate that element "FeeOversightPage.menuBranch" is visible
    When user clicks on "FeeOversightPage.menuBranch" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterStartsWith" is visible
    When user clicks on "FeeOversightPage.menuFilterStartsWith"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterStartsWith" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#StartsWithBranch" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Branch" in grid "FeeOversightPage.gridFeeInformation"
    ###EndsWith
    And user hovers over element "FeeOversightPage.columnBranch"
    And validate that element "FeeOversightPage.menuBranch" is visible
    When user clicks on "FeeOversightPage.menuBranch" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterEndsWith" is visible
    When user clicks on "FeeOversightPage.menuFilterEndsWith"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterEndsWith" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#EndsWithBranch" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Branch" in grid "FeeOversightPage.gridFeeInformation"

  Scenario: WRAWUP-T34079|Fee Oversight - Fee Information - Filter - Administrator Name
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    Then verify that user is on "FeeActivityPage" screen
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And user clicks on "FeeOversightPage.optionAdministrator"
    And verify element "FeeOversightPage.groupbyoptionAdministrator" is visible
    Then verify that user is on "FeeOversightPage" screen
    And verify column "Administrator" is present in "FeeOversightPage.gridFeeInformation" grid
    ###menuFilterContains
    And user hovers over element "FeeOversightPage.columnAdministrator"
    And validate that element "FeeOversightPage.menuAdministrator" is visible
    When user clicks on "FeeOversightPage.menuAdministrator" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And user waits for "30" seconds
    And validate that element "FeeOversightPage.menuFilterContains" is visible
    When user clicks on "FeeOversightPage.menuFilterContains"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterContains" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#ContainsAdministrator" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Administrator" in grid "FeeOversightPage.gridFeeInformation"
    ##menuFilterNotContains
    And user hovers over element "FeeOversightPage.columnAdministrator"
    And validate that element "FeeOversightPage.menuAdministrator" is visible
    When user clicks on "FeeOversightPage.menuAdministrator" using js
    And validate that element "FeeOversightPage.menuFilter" is visible
    When user clicks on "FeeOversightPage.buttonClearFilter"
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    Then verify that user is on "FeeOversightPage" screen
    When user clicks on "FeeOversightPage.menuFilterNotContains"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterNotContains" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#NotcontainsAdministrator" is present in grid "FeeOversightPage.gridFeeInformation"
    And verify text "#NotcontainsAdministrator1" is not present in column "Administrator" in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Administrator" in grid "FeeOversightPage.gridFeeInformation"
    ###Equals
    And user hovers over element "FeeOversightPage.columnAdministrator"
    And validate that element "FeeOversightPage.menuAdministrator" is visible
    When user clicks on "FeeOversightPage.menuAdministrator" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterEquals" is visible
    When user clicks on "FeeOversightPage.menuFilterEquals"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#Administrator1" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#Administrator1" is present in grid "FeeOversightPage.gridFeeInformation"
    ##NotEquals
    And user hovers over element "FeeOversightPage.columnAdministrator"
    And validate that element "FeeOversightPage.menuAdministrator" is visible
    When user clicks on "FeeOversightPage.menuAdministrator" using js
    And validate that element "FeeOversightPage.menuFilter" is visible
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterNotEqual" is visible
    When user clicks on "FeeOversightPage.menuFilterNotEqual"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#Administrator2" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#Administrator2" is not present in column "Administrator" in grid "FeeOversightPage.gridFeeInformation"
    ##StartsWith
    And user hovers over element "FeeOversightPage.columnAdministrator"
    And validate that element "FeeOversightPage.menuAdministrator" is visible
    When user clicks on "FeeOversightPage.menuAdministrator" using js
    And validate that element "FeeOversightPage.menuFilter" is visible
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterStartsWith" is visible
    When user clicks on "FeeOversightPage.menuFilterStartsWith"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterStartsWith" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#StartsWithAdministrator" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Administrator" in grid "FeeOversightPage.gridFeeInformation"
    ###EndsWith
    And user hovers over element "FeeOversightPage.columnAdministrator"
    And validate that element "FeeOversightPage.menuAdministrator" is visible
    When user clicks on "FeeOversightPage.menuAdministrator" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterEndsWith" is visible
    When user clicks on "FeeOversightPage.menuFilterEndsWith"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterEndsWith" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#EndsWithAdministrator" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Administrator" in grid "FeeOversightPage.gridFeeInformation"

  @new @Z
  Scenario: WRAWUP-T15492|Fee Oversight - Fee Information - Filter - Investment Officer Name
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    And user waits for element "CommonMenuPage.linkFeeOversight" to be visible
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And user clicks on "FeeOversightPage.optionInvestmentOfficer"
    And verify element "FeeOversightPage.groupbyoptionInvestmentOfficer" is visible
    Then verify that user is on "FeeOversightPage" screen
    And verify column "Investment Officer" is present in "FeeOversightPage.gridFeeInformation" grid
    ##menuFilterContains
    And user hovers over element "FeeOversightPage.columnInvestmentOfficer"
    And validate that element "FeeOversightPage.menuInvestmentOfficer" is visible
    When user clicks on "FeeOversightPage.menuInvestmentOfficer" using js
    And validate that element "FeeOversightPage.menuFilter" is visible
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterContains" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#ContainsInvestment" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Investment Officer" in grid "FeeOversightPage.gridFeeInformation"
    #menuFilterNotContains
    And user hovers over element "FeeOversightPage.columnInvestmentOfficer"
    And validate that element "FeeOversightPage.menuInvestmentOfficer" is visible
    When user clicks on "FeeOversightPage.menuInvestmentOfficer" using js
    When user clicks on "FeeOversightPage.buttonClearFilter"
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterNotContains" is visible
    When user clicks on "FeeOversightPage.menuFilterNotContains"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterNotContains" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#NotcontainsInvestment" is present in grid "FeeOversightPage.gridFeeInformation"
    Then verify that user is on "FeeOversightPage" screen
    And verify text "#NotcontainsInvestment1" is not present in column "Administrator" in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Investment Officer" in grid "FeeOversightPage.gridFeeInformation"
    ##Equals
    And user hovers over element "FeeOversightPage.columnInvestmentOfficer"
    And validate that element "FeeOversightPage.menuInvestmentOfficer" is visible
    When user clicks on "FeeOversightPage.menuInvestmentOfficer" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterEquals" is visible
    When user clicks on "FeeOversightPage.menuFilterEquals"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#Investment1" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#Investment1" is present in grid "FeeOversightPage.gridFeeInformation"
    #NotEquals
    And user hovers over element "FeeOversightPage.columnInvestmentOfficer"
    And validate that element "FeeOversightPage.menuInvestmentOfficer" is visible
    When user clicks on "FeeOversightPage.menuInvestmentOfficer" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterNotEqual" is visible
    When user clicks on "FeeOversightPage.menuFilterNotEqual"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#Investment2" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#Investment2" is not present in column "Administrator" in grid "FeeOversightPage.gridFeeInformation"
    #StartsWith
    And user hovers over element "FeeOversightPage.columnInvestmentOfficer"
    And validate that element "FeeOversightPage.menuInvestmentOfficer" is visible
    When user clicks on "FeeOversightPage.menuInvestmentOfficer" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterStartsWith" is visible
    When user clicks on "FeeOversightPage.menuFilterStartsWith"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterStartsWith" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#StartsWithInvestment" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Investment Officer" in grid "FeeOversightPage.gridFeeInformation"
    ##EndsWith
    And user hovers over element "FeeOversightPage.columnInvestmentOfficer"
    And validate that element "FeeOversightPage.menuInvestmentOfficer" is visible
    When user clicks on "FeeOversightPage.menuInvestmentOfficer" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterEndsWith" is visible
    When user clicks on "FeeOversightPage.menuFilterEndsWith"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterEndsWith" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#EndsWithInvestment" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Investment Officer" in grid "FeeOversightPage.gridFeeInformation"

  @new @Z
  Scenario: WRAWUP-T44783|Fee Oversight - Fee Information - Filter - Fee Group Name
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user clicks on "CommonMenuPage.linkFees"
    And user waits for element "CommonMenuPage.linkFeeOversight" to be visible
    When user clicks on "CommonMenuPage.linkFeeOversight"
    Then verify that user is on "FeeOversightPage" screen
    And verify grid "FeeOversightPage.gridFeeInformation" is visible
    When user clicks on "FeeOversightPage.dropdownGroupby"
    And user clicks on "FeeOversightPage.optionFeeGroup"
    And verify element "FeeOversightPage.groupbyoptionFeeGroup" is visible
    Then verify that user is on "FeeOversightPage" screen
    And verify column "Fee Group" is present in "FeeOversightPage.gridFeeInformation" grid
    ##menuFilterContains
    And user hovers over element "FeeOversightPage.columnFeeGroup"
    And validate that element "FeeOversightPage.menuFeeGroup" is visible
    When user clicks on "FeeOversightPage.menuFeeGroup" using js
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterContains" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#ContainsFee" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    And verify column "Fee Group" is present in "FeeOversightPage.gridFeeInformation" grid
    #menuFilterNotContains
    And user hovers over element "FeeOversightPage.columnFeeGroup"
    And validate that element "FeeOversightPage.menuFeeGroup" is visible
    When user clicks on "FeeOversightPage.menuFeeGroup" using js
    When user clicks on "FeeOversightPage.buttonClearFilter"
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterNotContains" is visible
    When user clicks on "FeeOversightPage.menuFilterNotContains"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterNotContains" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#NotcontainsFee" is present in grid "FeeOversightPage.gridFeeInformation"
    Then verify that user is on "FeeOversightPage" screen
    And verify text "#NotcontainsFee1" is not present in column "Fee Group" in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Fee Group" in grid "FeeOversightPage.gridFeeInformation"
    ##Equals
    And user hovers over element "FeeOversightPage.columnFeeGroup"
    And validate that element "FeeOversightPage.menuFeeGroup" is visible
    When user clicks on "FeeOversightPage.menuFeeGroup" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterEquals" is visible
    When user clicks on "FeeOversightPage.menuFilterEquals"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#Fee1" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#Fee1" is present in grid "FeeOversightPage.gridFeeInformation"
    #NotEquals
    And user hovers over element "FeeOversightPage.columnFeeGroup"
    And validate that element "FeeOversightPage.menuFeeGroup" is visible
    When user clicks on "FeeOversightPage.menuFeeGroup" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterNotEqual" is visible
    When user clicks on "FeeOversightPage.menuFilterNotEqual"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#Fee2" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#Fee2" is not present in column "Administrator" in grid "FeeOversightPage.gridFeeInformation"
    #StartsWith
    And user hovers over element "FeeOversightPage.columnFeeGroup"
    And validate that element "FeeOversightPage.menuFeeGroup" is visible
    When user clicks on "FeeOversightPage.menuFeeGroup" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterStartsWith" is visible
    When user clicks on "FeeOversightPage.menuFilterStartsWith"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterStartsWith" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#StartsWithFee" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Fee Group" in grid "FeeOversightPage.gridFeeInformation"
    ##EndsWith
    And user hovers over element "FeeOversightPage.columnFeeGroup"
    And validate that element "FeeOversightPage.menuFeeGroup" is visible
    When user clicks on "FeeOversightPage.menuFeeGroup" using js
    When user clicks on "FeeOversightPage.menuFilterDropdown"
    And validate that element "FeeOversightPage.menuFilterEndsWith" is visible
    When user clicks on "FeeOversightPage.menuFilterEndsWith"
    When user clicks on "FeeOversightPage.menuFilterTextBox1"
    And user enters value "#MenuFilterEndsWith" in textbox "FeeOversightPage.menuFilterTextBox1"
    When user clicks on "FeeOversightPage.menuFilter"
    And verify text "#EndsWithFee" is present in grid "FeeOversightPage.gridFeeInformation"
    When user clicks on "FeeOversightPage.buttonClearAllGridFilter"
    Then verify no filter is applied on column "Fee Group" in grid "FeeOversightPage.gridFeeInformation"
