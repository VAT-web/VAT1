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
    And click on submit button tab in corporate
    And click on corporate tab
    And enter Company Name
    And enter Company Director's Name
    And enter Company's PIC Email Address
    And click on submit tab button

#    below Three are click NO  #

    And click on No Company Director's ID Card details
    And click on no company’s Taxpayer ID NPWP details
    And click on No Bank Account details

          #    below Three are click YES  #

#  And click on Yes Company Director's ID Card details
#    And click on proceed mobile to scan Taxpayer details
#    And click on continue button
#    And enter canvas signature
#    And click on submit button after signature
#    And click on Yes Taxpayer ID taxpayer NPWP details now?
#    And click on Proceed Mobile
#    And click on yes Bank Account details now
#    And choose bank name
#    And enter Bank Account Holder's Name
#    And enter Bank Account Number
#    And click on submitBun
#
