Feature: Perform actions on Oona website

  Scenario: Navigate through Oona website and verify CF CAR product(Without Risk Inspection)
    Given I open Chrome
    When I enter the Oona URL
    And I enter my Mobile Number
    And I click on the Terms & Conditions and Privacy Policy
    And I click on the continue button
    And I fill the OTP
    And I click on the Verify Button
    And i click on IDN Button
    And I click on the CAR product
    And I click on existing quotation as NO
   And click on customer link
    And open new tab and enter that URL
    When I enter the Customer Insured Name
    And I enter the Customer License Plate Code
    And I enter the Customer Vehicle Brand
    And I choose Customer the coverage
    And I click on the CustomerNext Button
    And click on TLO+ select button
    And click on NextButton
And click on first checkBox in Additional protection page
    And click on AddTocart Button
    And click on next button in quote summary page
    And I click on the Customer upload national id card
 And click on proceed on mobile button
# And scan the QR code through mobile phone
 And  enter ID card number
#    And I upload the Customer document
#    And I enter ID number
#    And I click on the Customer verify button
    And I enter  Customer Chassis Number
    And I enter  Customer Engine Number
    And I enter  Customer Insured's Mobile Phone
    And I enter Customer Insured's Email Address
    And I click Customer on the next BTN


