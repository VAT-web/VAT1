Feature: Aviva Dashboard Functionality

  Scenario: Fill Aviva Dashboard Details
    Given Open Chrome browsers
    When Entered Aviva url in search
    When they enter valid Employee ID and Password
    And they click on the login button
    Then they should be logged in successfully


    ############################################################################################################
    #Feature: New Lead Creation
#
#Scenario: Verify New Lead Creation Process
#
#    Given I initiated the lead creation process by clicking the Add New Lead icon(plus icon)
#    When I Entered the Mobile number in corresponding text input field
#    And I Entered the Email ID in corresponding text input field
#    And Is Proposer Same as Life Insured? - I Selected as NO
#    And I have chosen the option to proceed with the eKYC by selecting the checkbox
#    And I Entered the AadhaarNum No in corresponding text input field
#    And I Clicked on Verify button

    #########################################################################################
##    And I wait for 30 seconds to enter the OTP
##    Then the lead creation process should be completed successfully
    #################################################################################
#
#
#    Given Details Of The Life Insured 1
#    When I agree to proceed with e-KYC Authentication
#    And I enter the Aadhaar Number
#    Then I clicked on Submit & Proceed button
    ################################################################################################################
##    And I enter the PAN Number
##    And I select the Title
##    And I click on state button
##   And I clicked on Cit
#
#
#
#
##Feature: Lead Status and Disposition
##
#
##  Scenario: Update Lead Status and Disposition
##    And I select the Lead Status
##    And I select the Lead Disposition


##############################################################################################################

    When I click on the Self Reference in the Aviva Dashboard
    And I click on the Filter button
    And I click on Lead ID
    And I enter the lead ID
    And I click on the Apply button
    And I click on the Update button

    #########################################################################################################################

    And I click on the Lead Details tab
    And I click on the Title and select Mr
    And I click on Father and enter father's name
#    And I click on the Marital Status tab
    And I click on the Proceed button
    And I click on the Proceed button again in contact details
#    And I click on Educational Qualification
#    And I click on Profession Type
#    And I click on Income Group
    And I click on the Proceed button in professional details
    And I click on the Proceed button in Additional Details functionality
    And i click on Need Analysis tab
    And I click on Occupation of Proposer Policy Holder
    And I click on Priorityz
    And I click on Risk Profile
    And I click on the Submit button
    And I click on Aviva New Wealth Builder
    And I click on Benefit Illustration
  And i select gender
    And I click on Policy Terms plan
    And I click on Payment Frequency - Annual
    And I click on Annualized Premium
    And I click on Generate BI
    And bottom
    And I click on the Proceed buttons
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
    And I select title
#    And I select MRS
    And I enter Father's First Name
    And  i enter martialStatus
    And I click Age proof as aadhar

 And i enter Educational Qualification

    And i click on occupation
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
#    Then the Proposal Form should be filled out successfully

#  Scenario: Fill Financial Details and Declaration Form
#    Given I am on the Financial Details page
    When I click on next button
    And I enter Customer Height
    And I enter Customer Weight(in kgs)
  And i click to bottom
    And I click on next btnn
    And I click on next btn again
    And I click on next btn in declarationform
#    Then I should see the confirmation page

#Feature: Completing Proposer Details

#  Scenario: Providing Proposer's Information
#    Given I am on the Proposer Details pages
    When I click on the Relationship with Life to be Insured section
    And I click on Age proof

    And I click on Source Of Income
    And I click on Name of the Organisation
    And I click on Address Line 1
    And I click on state
    And I click on city
    And I entered Pincode
    And I enter Work phone number
    And I enter Proposer's Annual Income
    And I enter Name as per Bank Account
    And I enter Bank Account Number
    And I enter Bank Name
    And I enter Bank Account Type
    And I enter MICR Code(9 Digits)
    And I enter IFSC Code (11 digit)
    And I click verify bank details
 And click on bottom proceed btn
#    And I click proceed Btn
    Then I should be directed to the next step

#Feature: Completing Proposal Submission

#  Scenario: Uploading Documents and Completing Proposal Submission
    Given I upload Proposer document
    And I upload Life Insured document
    And I click on the checkbox
    And I click on getotpToEnter to verify
    And I verify the OTP
#    And I click the proceed to payment button
    And I select the payment mode
    And I click on proceed to eSIR
    And select agent
    And click on eSIR Authentication verify
    Then the proposal submission process should be completed successfully
#
#  //
#  //        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
#  //        WebElement martialStatus = wait.until(ExpectedConditions.elementToBeClickable(By.id("MaritalStatus")));
#  //
#  //        // Create an instance of Actions class
#  //        Actions actions = new Actions(driver);
#  //
#  //        actions.moveToElement(martialStatus).click().perform();
#  //        martialStatus.sendKeys("S");
#  //
#  //        actions.sendKeys(martialStatus, Keys.ENTER).perform();
#############################################################################################
#  Thread.sleep(5000);
#  //      WebElement Educ = driver.findElement(By.id("Educational"));
#  //      Actions ac = new Actions(driver);
#  //      ac.moveToElement(Educ).click().perform();
#  //      Educ.sendKeys("G");
#  //      Thread.sleep(1000);
#  //     ac.sendKeys(Educ,Keys.ENTER).perform();
#  //   Thread.sleep(4000);