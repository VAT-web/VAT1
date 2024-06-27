Feature: Perform actions on Oona website

  Scenario: Navigate through Oona website and verify Agent On boarding
    Given I open Chrome
    When I enter the Oona URL
    And I enter my Mobile Number
    And I click on the Terms & Conditions and Privacy Policy
    And I click on the continue button
    And I fill the OTP
    And I click on the Verify Button
    And i click on IDN Button
    And click on Invite friends tab
    And And click on copy the code
    And open link in new tab
    And enter mobile number
    And time wait
    And click on checkbox terms and conditions
    And click on next button
    And enter OTP
    And click on submit button
    And enter Full name as per KTP KITAS
    And enter email address
    And click on submit button tab
    And click on No button Card KTP KITAS details now
    And clcik yes Tax Payer details
#    And click on no btn

#    And bank name
#    And bank holder name
#    And bank account number

    And click on No Butn Bank Account details now
#    And click on goto dashboard button

