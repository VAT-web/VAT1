Feature: Admin Functionality

  Scenario: Quality Check
    Given Open Chrome browser
    Given I opened the Admin URL
    Then Entered the Email ID
    And Entered the Password
    And Clicked on Login button
    And Click on QC from side menu
#    And Ented the Proposal Id and Search
    And Paste the copied ProID
    And Click on Action icon
    And Open the Uploaded Dcuments LIPRODIFFWithEKYC
    And Open the Generated PDFs LIPRODIFFWithEKYC
    And Scroll to TOP Admin
    And Click on View Logs button

