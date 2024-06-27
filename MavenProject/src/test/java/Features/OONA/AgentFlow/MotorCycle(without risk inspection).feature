Feature: Perform actions on Oona website

  Scenario: Navigate through Oona website and verify AF MotorCycle(Without Risk Inspection) product
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
    Then I click on Skip This Step
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


#Feature: Payment Process
#
#  Scenario: Complete payment process
#    Given I am on the checkout page
#    And I click on "click this skip"
    And I verify redirection to the next step
    When I navigate to the checkout page
    And I click on the Proceed to Payment button
    And I select the bank transfer payment option
    And I choose the virtual account BCA option
    And I copy the virtual account number from the page
    And I open a new tab with the provided payment link
    And I paste the copied virtual account number into the payment form
    And I click on the Inquiry button on the payment form
    And I click on the Pay Now button
    Then I verify that the payment success image is displayed
    And I switch back to the original tab
    Then I verify that the payment success image is displayed on the original tab
#Feature: Perform actions on Oona websit
#
#  Scenario: Navigate through Oona websit and verify AF MotorCycle(Without Risk Inspection) produc
#    Given I open Chrom
#    When I enter the Oona UR
#    And I enter my Mobile Numbe
#    And I click on the Terms & Conditions and Privacy Polic
#    And I click on the continue butto
#    And I fill the OT
#    And I click on the Verify Butto
#    And i click on IDN Butto
#    And I click on the CA product
#    And I click on existing quotation as N
#    Then I click on Skip This Ste
#    And click on motorcycl
#    When I enter the  MC Insured Nam
#    And I enter the MC License Plate Cod
#    And I enter the motorCycl  Bran
#    And I choose the  MC coverag
#    And I click on the nextbutto
#    When I click on Mc TLO Basi
#    And I click on the Mc Next Butto
#    And  click on Quote Summary nextButto
#    And verify the  quote created tex
#    And click on create polic
#
#    And I click on the upload national ID car
#    And I upload THE documen
##    And I enter ID numbe
#    And I click on the verify bt
#    And I enter Chassis nu
#    And I enter Engine nu
#    And I enter Insured's MobileNu
#    And I enter Insured's EmailAddres
#    And I click on the nextBUTTO
#
##Feature: Payment Proces
##
##  Scenario: Complete payment proces
##    Given I am on the checkout pag
##    And I click on "click this ski
#    And I verify redirection to the next ste
#    When I navigate to the checkout pag
#    And I click on the Proceed to Paymen butto
#    And I select the bank transfer payment optio
#    And I choose the virtual account BCA optio
#    And I copy the virtual account number from the pag
#    And I open a new tab with the provided payment lin
#    And I paste the copied virtual account number into the payment for
#    And I click on the Inquiry butto on the payment for
#    And I click on the Pay Now butto
#    Then I verify that the payment success image is displaye
#    And I switch back to the original ta
#    Then I verify that the payment success image is displayed on the original ta
