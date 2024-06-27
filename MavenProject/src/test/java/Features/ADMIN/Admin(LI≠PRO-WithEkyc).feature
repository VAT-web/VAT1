

Feature: Aviva Dashboard Functionalitys

 Scenario: Fill Aviva Dashboard Detailss
    Given Open Chrome browserss
    When Entered Aviva url in searchs
    When they enter valid Employee ID and Passwords
    And they click on the login buttons
    Then they should be logged in successfullys

#Feature: Perform actions on user creation and quality check

# Scenario: Perform actions on user creation and quality check
#    Given I am on the homepage
    When I click on the User Creation three lines button
    And I click on Quality Check
    And I click on Search by Proposal Id
    And I click on Action
    And I click on Documents Uploaded
#    Then I should see the documents uploaded page

#Feature: Handle images and cross buttons

#   Scenario: Handle images and cross buttons

      When I click on the first image
   And i taking screenshot of first image
      And I click on the first cross buttonz
      And I click on the second image
 And i taking screenshot of second image
      And I click on the second cross button
      And I click on the third image
And i taking screenshot of third image
      And I click on the third cross button
#      Then I should have handled all images and cross buttons
