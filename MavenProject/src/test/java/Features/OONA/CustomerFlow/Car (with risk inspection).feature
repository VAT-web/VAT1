Feature: Perform actions on Oona website

  Scenario: Navigate through Oona website and verify CF Car (With Risk Inspection) product
    Given I open Chrome
    When I enter the Oona URL
    And I enter my Mobile Number
    And I click on the Terms & Conditions and Privacy Policy
    And I click on the continue button
    And I fill the OTP
    And I click on the Verify Button
    And i click on IDN Butt
    And I click on the CAR product CRI
    And I click on existing quotation as NO CRI
    And click on customer link CRI
    And open new tab and enter that URL CRI
    When I enter the Customer Insured Name CRI
    And I enter the Customer License Plate Code CRI
    And I enter the Customer Vehicle Brand CRI
    And I choose Customer the coverage CRI
    And I click on the CustomerNext Button CRI
    And click on TLO+ select button CRI
    And click on NextButton CRI
    And click on first checkBox in Additional protection page CRI
    And click on AddTocart Button CRI
    And click on next button in quote summary page CRI
    And I click on the Customer upload national id card CRI
    And click on proceed on mobile button CRI
# And scan the QR code through mobile phone CRI
    And  enter ID card number CRI
#    And I upload the Customer document CRI
#    And I enter ID number CRI
#    And I click on the Customer verify button CRI
    And I enter  Customer Chassis Number CRI
    And I enter  Customer Engine Number CRI
    And I enter  Customer Insured's Mobile Phone CRI
    And I enter Customer Insured's Email Address  CRI
    And I click Customer on the next BTN CRI
