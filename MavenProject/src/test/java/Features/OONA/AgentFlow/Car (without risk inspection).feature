Feature: Perform actions on Oona website

  Scenario: Navigate through Oona website and verify AF Car(Without Risk Inspection) product
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

#  Scenario: Purchase Motor Insurance Policy
#    Given I am on the Motor Insurance Policy Page
    When I enter the Insured Name
    And I enter the License Plate Code
    And I enter the Vehicle Brand
    And I choose the coverage
    And I click on the Next Button
    Then I should be on the Choose Product Page
    When I click on TLO Basic
    And I click on the Next Button
#   Then I should proceed to the next step

# Scenario: Add additional protection and create a policy
#  Given I am on the Additional Protection page
    When I click on the first checkbox
    And I click on the Add to Cart button
    And I am on the Quote Summary page
    And I click on the next button
#    And i verify image and quote created or not
    And I click on the create policy button
    And I click on the upload national id card
#  And click on capture photo
#    And accept popup
#    And click  again capture photo
   And I upload the document
#    And I enter ID number below
    And I click on the verify button
    And I enter Chassis Number
    And I enter Engine Number
    And I enter Insured's Mobile Phone
    And I enter Insured's Email Address
    And I click on the next BTN
#   And I click on click this skip
#    And verify total amount
    And click on checkout

#Feature: Payment Process
#
#  Scenario: Completing Payment via Bank Transfer

    Given User is on the checkout page
    When User proceeds to payment
    And User selects bank transfer option
    And User selects virtual account BCA
    And User copies the virtual account number
    And User opens a new tab with the payment link
    And User pastes the virtual account number
    And User clicks on the inquiry button
    And User clicks on the pay now button
    Then User should see the payment success image
    And User is redirected to the original tab
    And User should see the payment successful image on the old tab




