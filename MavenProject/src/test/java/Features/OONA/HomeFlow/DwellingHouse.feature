Feature: Perform actions on Oona website
#2350
  Scenario: Navigate through Oona website and verify HomeFlow DwellingHouse flow.
    Given I open Chrome
    When I enter the Oona URL
    And I enter my Mobile Number
    And I click on the Terms & Conditions and Privacy Policy
    And I click on the continue button
    And I fill the OTP
    And I click on the Verify Button
    And i click on IDN Button
    And click on HOME button
    And Do you have an existing quotation? as NO
    And click on skip this step in share link page
    And click on confirm in Property Requirement page
    And im in Property Insurance Policy in Dwelling HOuse flow
    And enter  Insured Name (as per ID card)
    And selcct option in Province
    And selct City Kabupaten
    And enter Sum Insured for Building
#    And enter Sum Insured for Content
    And click on Next button in Property Insurance Policy
    And click on FLEXAS select button in Choose Product page
    And click on next button in Choose Product page
    And enable check box in typhoon function
    And click on next button in Additional Protection page
    And  I click on nxt button in Quote Summary page
    And click on create policy tab


