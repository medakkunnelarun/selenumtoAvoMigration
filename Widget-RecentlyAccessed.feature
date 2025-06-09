
Feature: Widget-RecentlyAccessed
  I want to verify dashboard widget - Recently Accesed

  # Scenario Description : Verify that recently accessed account list is getting updated properly
  # Jira ID : WRAAUTO-1066
  # Author  : Neeraj Maurya
  # Created : 31 Jul 20
  # Updated : 31 Jul 20
  # Defects : N/A
  @1
  Scenario: 28989048|To validate that recently accessed account list is getting updated
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" is visible
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop10Accounts"
    Then verify that user is on "DashboardPage" screen   
    When user selects link with index "0" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user selects link with index "1" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user selects link with index "2" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user selects link with index "3" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "AccountDetailsPage" screen
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user selects link with index "4" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "AccountDetailsPage" screen
    #When user clicks on "CommonMenuPage.linkHomeOffice"
    #Then verify that user is on "DashboardPage" screen
    #And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    #When user selects link with index "5" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    #Then verify that user is on "AccountDetailsPage" screen
    #When user clicks on "CommonMenuPage.linkHomeOffice"
    #Then verify that user is on "DashboardPage" screen
    #And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    #When user selects link with index "6" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    #Then verify that user is on "AccountDetailsPage" screen
    #When user clicks on "CommonMenuPage.linkHomeOffice"
    #Then verify that user is on "DashboardPage" screen
    #And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    #When user selects link with index "7" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    #Then verify that user is on "AccountDetailsPage" screen
    #When user clicks on "CommonMenuPage.linkHomeOffice"
    #Then verify that user is on "DashboardPage" screen
    #And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    #When user selects link with index "8" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    #Then verify that user is on "AccountDetailsPage" screen
    And user captures text of element "AccountDetailsPage.labelAccountNameValue" as "AccountName"
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user perform a page refresh
    Then verify that user is on "DashboardPage" screen
    And verify text of link with index "0" in dashboard widget "DashboardPage.widgetRecentlyAccessed" should be "#AccountName"

  # Scenario Description : Verify that recently accessed client list is getting updated properly
  # Jira ID : WRAAUTO-1066
  # Author  : Neeraj Maurya
  # Created : 31 Jul 20
  # Updated : 31 Jul 20
  # Defects : N/A
  @yre
  Scenario: 28989058|To validate that recently accessed client list is getting updated
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" is visible
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    #And user scroll the page vertically "Down"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop10Clients"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user selects link with index "0" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "ClientDetailsPage" screen
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user selects link with index "1" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "ClientDetailsPage" screen
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user selects link with index "2" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "ClientDetailsPage" screen
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user selects link with index "3" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "ClientDetailsPage" screen
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user selects link with index "4" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "ClientDetailsPage" screen
    #When user clicks on "CommonMenuPage.linkHomeOffice"
    #Then verify that user is on "DashboardPage" screen
    #When user selects link with index "5" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    #Then verify that user is on "ClientDetailsPage" screen
    #When user clicks on "CommonMenuPage.linkHomeOffice"
    #Then verify that user is on "DashboardPage" screen
    #When user selects link with index "6" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    #Then verify that user is on "ClientDetailsPage" screen
    #When user clicks on "CommonMenuPage.linkHomeOffice"
    #Then verify that user is on "DashboardPage" screen
    #When user selects link with index "7" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    #Then verify that user is on "ClientDetailsPage" screen
    #When user clicks on "CommonMenuPage.linkHomeOffice"
    #Then verify that user is on "DashboardPage" screen
    #When user selects link with index "8" in dashboard widget "DashboardPage.widgetRecentlyAccessed"
    #Then verify that user is on "ClientDetailsPage" screen
    And user captures text of element "ClientDetailsPage.textClientFullName" as "ClientName"
    When user clicks on "CommonMenuPage.linkHomeOffice"
    Then verify that user is on "DashboardPage" screen
    And user perform a page refresh
    Then verify that user is on "DashboardPage" screen
    And verify text of link with index "0" in dashboard widget "DashboardPage.widgetRecentlyAccessed" should be "#ClientName"

  # Scenario Description : Verify that recently accessed account list is getting updated as per selected set of clients
  # Jira ID : WRAAUTO-1066
  # Author  : Vishal Sinha
  # Created : 31 Jul 20
  # Updated : 31 Jul 20
  # Defects : N/A
  @dre
  Scenario: 28989047|To validate the ability to select different set of accounts (10, 20 or 30)
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" is visible
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop10Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" with service url "#ServiceUrl"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop20Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" with service url "#ServiceUrl1"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop30Accounts"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" with service url "#ServiceUrl2"

  # Scenario Description : Verify that recently accessed client list is getting updated as per selected set of clients
  # Jira ID : WRAAUTO-1066
  # Author  : Vishal Sinha
  # Created : 31 Jul 20
  # Updated : 31 Jul 20
  # Defects : N/A
  @failing
  Scenario: 28989046|To validate the ability to select different set of client (10, 20 or 30)
   	Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" is visible
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop10Clients"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" with service url "#ServiceUrl"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop20Clients"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" with service url "#ServiceUrl1"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop30Clients"
    Then verify that user is on "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" with service url "#ServiceUrl2"

  # Scenario Description : Verify the navigation on clicking the hyperlink for account
  # Jira ID : N/A
  # Author  : Neeraj Maurya
  # Created : 01 Sep 20
  # Updated : 01 Sep 20
  # Defects : N/A
  @testnow
  Scenario: 28989049|To validate the navigation on clicking the hyperlink for account
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" is visible
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop10Accounts"
    Then verify that user is on "DashboardPage" screen
    When user captures value with index "0" in column "Name" from widget "DashboardPage.widgetRecentlyAccessed" as "AccountName"
    And user clicks on link in column "Name" with index "0" in widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "AccountDetailsPage" screen

  # Scenario Description : Verify the navigation on clicking the hyperlink for client
  # Jira ID : N/A
  # Author  : Neeraj Maurya
  # Created : 01 Sep 20
  # Updated : 01 Sep 20
  # Defects : N/A
  Scenario: 28989059|To validate the navigation on clicking the hyperlink for client
    Given user logs in to unity application with "#UserID"
    Then verify that user is on "DashboardPage" screen
    When user reset default state of "DashboardPage" screen
    And verify widget "DashboardPage.widgetRecentlyAccessed" is visible
    And user scroll to view widget "DashboardPage.widgetRecentlyAccessed"
    When user clicks on "DashboardPage.menuRecentlyAccessed"
    And user clicks on "DashboardPage.optionTop10Clients"
    Then verify that user is on "DashboardPage" screen
    And user clicks on link in column "Name" with index "0" in widget "DashboardPage.widgetRecentlyAccessed"
    Then verify that user is on "ClientDetailsPage" screen
    And verify element "ClientDetailsPage.tabClientInformation" is visible
