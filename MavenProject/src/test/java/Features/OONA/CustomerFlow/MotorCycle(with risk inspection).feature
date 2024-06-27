Feature: Perform actions on Oona website

  Scenario: Navigate through Oona website and verify CF MotorCycle(With Risk Inspection)
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
    And click on customer MC link
    And open new tab and enter that copied URL
    When I enter the Customer  mc Insured Name
    And I enter the Customer  mc License Plate Code
    And I enter the Customer mc Vehicle Brand
    And I choose Customer the mc  coverage
    And I click on the mc CustomerNext Button
    And click on mc TLO Basic select button
    And click on mc NextButton
#    And click on mc first checkBox in Additional protection page
#    And click on mc AddTocart Button
    And click on mc next button in quote summary page
    And I click mc on the Customer upload national id card
    And click on proceed on mobile
#    And I upload the mc  Customer document
#    And I enter ID number
#    And I click on the Customer verify button
    And I enter mc  Customer Chassis Number
    And I enter  mc Customer Engine Number
    And I enter mc  Customer Insured's Mobile Phone
    And I enter mc Customer Insured's Email Address
    And I click  mc Customer on the next BTN
    And click on skip this step option
