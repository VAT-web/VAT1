Feature: Completing Proposal Submission

  Scenario: Uploading Documents and Completing Proposal Submission
    Given I upload Proposer document
    And I upload Life Insured document
    And I click on the checkbox
    And I click on getotp
    And I verify the OTP
    And I click the proceed to payment button
    And I select the payment mode
    And I click on proceed to eSIR
    And select agent
    And click on eSIR Authentication verify
    Then the proposal submission process should be completed successfully
