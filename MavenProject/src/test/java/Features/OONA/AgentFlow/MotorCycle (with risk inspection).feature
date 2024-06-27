Feature: Perform actions on Oona website

  Scenario: Navigate through Oona website and verify AF MotorCycle(With Risk Inspection) product
    Given I open Chrome
    When I enter the Oona URL
    And I enter my Mobile Number
    And I click on the Terms & Conditions and Privacy Policy
    And I click on the continue button
    And I fill the OTP
    And I click on the Verify Button
    And i click on IDN Button
    And click on motorcycle
    When I enter the  MC Insured Name
    And I enter the MC License Plate Code
    And I enter the motorCycle  Brand
    And I choose the  MC coverage
    And I click on the nextbutton
    When I click on Mc TLO Basic
    And I click on the Mc Next Button
    And  click on  MC Quote Summary nextButton
    And verify the MC  quote created text
    And click on MC create policy

    And I click on the upload MC national ID card
    And I upload the mc  Customer document
#    And I enter ID number
    And I click on MC  the verify btn
    And I enter MC  Chassis num
    And I enter MC Engine num
    And I enter MC Insured's MobileNum
    And I enter MC Insured's EmailAddress
    And I click MC on the nextBUTTON
#    SCANNING PART