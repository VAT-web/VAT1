Feature: Login Functionality of Health Claims

  Background:
    Given I launch the Chrome browser
    When I Open the Health claims Login page
    When I Click on the Login with NTID & Password
    And I have entered a valid username in the NITD field
    And I have entered a valid Password in the Password field
    And I Wait for 10 Sec to enter the Captcha
    And I click on the login button
    And I click on Close on popup
    Then Successfully opened the Home page of the Health claims application
    And I click on Claims logo

  Scenario: Generate Inward ID through Inward(Softcopy) screen
    When I click on the Inward Soft-copy Button from side menu
    And I Entered Email Id in the Email id field
    And I Entered Date field
    And I Entered the Time
    And I Entered the No.of documents in the No.of documents field
    And I selected the Claim type
    And I selected the Claim sub-type
    And I clicked on Add document button
    And I selected the Document type
    And I selected Photocopy Yes or No
    And Document date I selected
    And I selected the Document and Upload the document
    And I Clicked on upload button
    And I clicked on submit button
    Then Inward ID Successfully generated

  Scenario: Assign to user in Supervisor Data entry Queue
    When I Clicked on the Supervisor Data entry Q button From side menu
    And I entered the Inward id in the search text box
    And I Clicked on search button
    And I Assigned to User and click on action button
    And Clicked on Claim user home page from the side menu
    And I Searched with Inward id
    And Clicked on Next button for the result work item
    And I Searched with MemID in Details of insured person hospitalized tab
    And I Selected Retail Radio button
    And I Selected MemID Radio button
    And I entered the MemID in the MemID text box
    And I searched with the same MemID
    And Selected one work item from the search result
    And I Clicked on OK
    And I Selected Date in Details of insured person hospitalized tab
    And I Selected Time in Details of insured person hospitalized tab
    And I Entered Claimed amount in Details of insured person hospitalized tab
    And I Selected Benefit claimed in Details of insured person hospitalized tab
    And Clicked Save in Details of insured person hospitalized tab
    And Potential duplicate - clicked on Yes
    And Clicked on Next button in Insurance history details tab
    And I clicked Search button in Provider details tab
    And Entered Entity name in Provider details tab
    And Clicked Search button in Provider search screen- Provider details tab
    And Selected one item from the search result - Provider search - provider details tab
    And Clicked on Save button in provider search screen- Provider details tab
    And Selected checkbox in treating doctor popup- provider details tab
    And Clicked Save button in treating doctor popup provider details tab
    And Clicked on Next button in Provider details screen
    And Entered In-Patient Registration number inHospitalization details
    And Selected Room category in Hospitalization details
    And Selected Hospitalization due to in Hospitalization details
    And Selected Type of admission in Hospitalization details
    And Selected Date of discharge in Hospitalization details
    And Selected Time in Hospitalization details
    And Entered System of medicine in Hospitalization details tab
    And Selected Status at discharge in Hospitalization details tab
    And Selected Date of injury in Hospitalization details tab
    And Entered Injury details in Hospitalization details tab
    And Selected Cause in Hospitalization details tab
    And Clicked Next button in Hospitalization details tab
    And Entered PAN Number in Bank details screen
    And Entered Account number in Bank details screen
    And Entered IFSC in Bank details screen
    And Clicked on Next button in Bank details screen
    And Entered Invoice Number in Invoice addition screen
    And Select Date in Invoice addition
    And Entered pincode Enter inInvoice addition screen
    And Select Party is hospital in Invoice addition screen
    And Clicked on Add invoice button in Invoice addition screen
    And Clicked on Add Services button in Invoice addition screen - Single room
    And Click on Item Description in Invoice addition screen
    And Enter Room type in search box -Item Description popup in Invoice addition screen
    And Click on Search button in Item Description popup -Invoice addition screen
    And Select radio button in Invoice addition screen
    And Click on Submit button in Invoice addition screen
    And Entered Units in Invoice addition screen
    And Entered Gross amount in Invoice addition screen
    And Save Services in Invoice addition screen
    And Click on Submit button in Invoice addition screen
    And Click on Billing tab
    And Click on Global calculate button in Billing screen
    And Click on Save button in Billing screen
    And Click on Return button in popup-Billing screen
    And Click on Submit button in Billing screen
    Then Claim ID is successfully generated











