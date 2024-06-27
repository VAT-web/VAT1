Feature: Login functionality

  Scenario: User logs in with valid credentials
    Given Open Chrome browsers
    When Entered Aviva url in search
    When they enter valid Employee ID and Password
    And they click on the login button
    Then they should be logged in successfully

#Feature: New Lead Creation
#
#Scenario: Verify New Lead Creation Process

    Given I initiated the lead creation process by clicking the Add New Lead icon(plus icon)
    When I Entered the Mobile number in corresponding text input field
    And I Entered the Email ID in corresponding text input field
  And Is Proposer Same as Life Insured? - I Selected as NO
   And I have chosen the option to proceed with the eKYC by selecting the checkbox
    And I Entered the AadhaarNum No in corresponding text input field
    And I Clicked on Verify button
    And I wait for 30 seconds to enter the OTP
#    Then the lead creation process should be completed successfully



    Given Details Of The Life Insured 1
When I agree to proceed with e-KYC Authentication
 And I enter the Aadhaar Number
#  And I enter the PAN Number
#    And I select the Title
#    And I click on state button
#   And I clicked on City




#Feature: Lead Status and Disposition
#

#  Scenario: Update Lead Status and Disposition
#    And I select the Lead Status
#    And I select the Lead Disposition
    Then I clicked on Submit & Proceed button
#Feature: Personal Details
#
#  Scenario: Fill Personal Details
    Given I am on the Personal Details page
    When I clicked on Lead Details tab
    When I select a Title
#    And I enter a First Name
#    And I enter a Last Name
    And I enter a Father's Name
    And I select a Gender
    And I select a Marital Status
    Then I  click on proceed button

    Then click on next page proceed button


#    Scenario: Fill in need analysis
      When click on identify needs
      And click on priority 1
      And click on risk profile
      Then  click on submit button

#    Scenario: Products
      When I clicked on Aviva New Wealth Builder
      And I clicked on benfit illustriation
      And I clicked on proceed alert button


#      Scenario: details
      And  I clicked on gender
      And I clicked on policy term
      And I clicked on  Premium Payment Term
      And I clicked on payment frequency
      And I clicked on Annualized Premium
        Then  I cliked on Generete benfit illustriation btn to preocced
#    And I click on Generate BI
    And I click on the Proceed button
    And I click on Upload the Document
    And I click on the OK button
#    And I click on the Next button
    And I click on Upload the Document again
#    And I click on the OK button
    And I click on the Next button
    And I click on Upload the Document (Owner Bank A/c Proof)
    And I click on the Next btn
    And I click on the Proceed btn



#Feature: Proposal Form Filling

#  Scenario: Fill out the Proposal Form
    Given I am on the Proposal Form page
    When I click on Continue to Proposal Form
    And I click on Next
    And I select title as Mrs
    And I enter Father's First Name
    And I click Age proof as aadhar
    And i enter Email ID
    And I enter MObileNum
    And I click on Name of the Business
    And I click on Business Address Line 1
    And I select state as Telangana
    And I select city as Hyderabad
    And I enter pincode
    And I enter Tel (Resi)
    And I enter Annual Income
    And I select Income Tax PAN as Form 60/61
    And I click on last Next Btn
    Then the Proposal Form should be filled out successfully



#When I clicked on Download BI button
#        Then I clicked on proceed button
#
#        And I clicked on upload image button
#        And I Clicked on OK button after uploading the document
#        And I clicked on NEXT button








