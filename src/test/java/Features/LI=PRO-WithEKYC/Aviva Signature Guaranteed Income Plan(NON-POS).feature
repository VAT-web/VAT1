Feature: Aviva POS-Signature Guaranteed - LI=PRO- WITHEkyc

  Background: Aviva application login verification
    Given Open Chrome browser
    Given Entered Aviva url
    Then I Entered the EmployeeID
    And I Entered the Password
    And I click on Login button
    Then Home Page of the Aviva application is successfully opened

  @LEAD
  Scenario: New Lead Creation
    Then I clicked on the Plus Icon
    And I Entered Mobile No
    And I Entered Email ID
    And I Selected checkbox Proceed with eKYC
    And I entered Adhar No
    And Cliked on Verify button
    And I wait for 30 sec to enter the otp
    And Clear existing mobile no and enter a random mobile no
    And I selected the Title
    And I Selected the Title as MR
    And Down to Bottom
    And I Clicked on the Submit button Status tab --> Status


  @PRODUCT
  Scenario: GIP(NON-POS)- CONTINUATION- From Self/Reference home page
    Then Clicked on self or Reference item in Lead Cart - Aviva home page
    And Click on filter at the Top side
    And Click on Leadid  tab
    And Enter the lead id LiProSameW
    And Click on Apply button
    And Click on Update button in Lead cart page
    And Clicked on lead details tab
#    And Selected the title from the dropdown- Lead details tab- Personal details section
#    And Entered the Father name
#    And Selected the Gender
    And Selected the Marital Status- Lead details tab- Personal details section
    And Down to Bottom
    And I Clicked on Proceed button in Lead details tab- Personal details section
    And Wait for some time
#    And Address line One
#    And Selected the State in Lead details tab- Contact details section
    And Down to Bottom
    And Clicked on Proceed button in Lead details tab- Contact details section
    And Selected the Educational Qualification in Lead details tab- Professional details section
    And Selected the Profession Type in Lead details tab- Professional details section
    And Selected the Income Group in Lead details tab- Professional details section
    And Clicked on Proceed button in Lead details tab- Professional details section
  #  And Selected the Smoking Status in Lead details tab- Additional details section
    And Clicked on Proceed button in Lead details tab- Additional details section
#    And Selected the Age of Life Insured or Policy Holder in Need Analysis tab
    And Selected the Occupation of Life Insured or Policy Holder in Need analysis tab
    And Selected the Priority 1 in Need Analysis tab
    And Selected the Risk Profile in Need analysis tab
    And Clicked on Submit in Need analysis tab
    And Down to Bottom
    And Select the product GIP
    And CLick on BI button
    And Click proceed in alert
    And POSPs or Non POSPs Channel GIP
    And Plan Options Type
    And Policy Term one
    And Payment Frequency
    And Annual Premium one
    And Down to Bottom
    And Clicked on BI Generate Button GIP
    And Scroll to TOP





#    Then Click on the WIP button on home page
#    And CLicked on Resume on WIP
    And Click on Mandatory document upload button
#    And Select Document Type
#    And Selected the Doc as Recent photo
    And Upload the Document
    And Click on OK button after uploading the document
    And Upload the Document
    And Click on OK button after uploading the document
    And Down to Bottom
    And Click Next
#    And Click on Photo Id Proof
#    And Select Document Type
#    And Selected the Doc as ID Address proof
    And Upload the Document Sample adhar
    And Upload the Document Sample adhar
    And Down to Bottom
    And Click Next
#    And Click on Address Proof
#    And Select Document Type
#    And Selected the Doc as ID Address proof two
#    And Upload the Document Sample adhar
#    And Click on OK button after uploading the document
#    And Upload the Document Sample adhar
#    And Click on OK button after uploading the document
    And Down to Bottom
    And Click Next
#    And CLick on Owner bank AC Proof
#    And Select Document Type
#    And Selected the Doc as Bank AC Proof
#    And Upload the Document
#    And Down to Bottom
#    And Click Next
#    And CLick on Joint photo
#    And Select Document Type
#    And Selected the Doc as Joint photo
#    And Upload the Document
#    And Click on OK button after uploading the document
#    And Down to Bottom
#    And Click on Proceed button
    And Down to Bottom
    And Click on Continue - E-Insurance Account Details
    And Down to Bottom
    And Click on Next Button
#    And Select title
    And Select age proof on About Customer
    And Select Educational Qualification
    And Select Occupation
    And Copy the Proposal ID
#    And Select the City one
#    And Enter Pincode one
#    And Permanent Address same as Current Address
    And Enter Name of the Business
    And Enter Business Address Line
    And Select State
    And Select the City LIPROSAME
    And Enter Pincode
    And Enter Tel
    And Enter Email Id
    And Enter Annual Income
    And Down to Bottom
    And Select Income Tax PAN
    And Click on Next Button
    And Entered Name as per Bank Account - Finacial Details tab
    And Entered Bank Account number
    And Select Bank Name
    And Select Bank Account Type
    And Entered MICR Code
    And Entered IFSC Code
    And Down to Bottom
    And Click on Next Button
    And Entered Customer Height & Weight in Health Details DGH section
    And Click on Next Button
    And Click on Next Button
    And Entered First Name in Nomination Details
    And Entered Last Name
    And Selected Relationship With Life To Be Insured
    And Entered Reason
    And Enterd Date Of Birth
    And Select Gender
    And Select Address same as LI Check box
    And Down to Bottom
    And Click on Next Button
    And Down to Bottom
    And Wait for few sec and click Next
    And Select Document Type
    And Selected the Doc as Self Addendum
    And Upload the Document
    And Down to Bottom
    And Click Next
    And Select the Check box on otp auth
    And Down to Bottom
    And Wait for some time
    And Click on get otp on otp auth
    And Wait for some time to enter the otp
    And Click on payment mode
    And Down to Bottom
    And Select the option Payment done through Aviva Website
    And Click on Proceed
    And CLick on close popo-up
    And proceed to Esir
    And Select the SP agent
    And Down to 500
    And Select the CheckBox
    And Down to Bottom
    And Click on Submit
    And Click on Verify Button



