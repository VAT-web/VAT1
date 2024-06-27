# Saving the steps in Gherkin feature file format
Feature: Login to Pramerica Website

  Scenario: Login with valid credentials and OTP
    Given Open Chrome brow
    When I enter "Pramerica" in the search bar
    And I enter my Pramerica user ID
    And I click on the login button
    And I enter the OTP
    And I click on the verify OTP button
#Feature: ToDo
#   Scenario: create new task in ToDo tab
    And i click on ToDo
    And i click on create new task plus button

  And i enter Add Team Member
    And i enter needs in remember tab
    And i click on priority
    And i click on Set a Due Reminder
    And i enter time
    And i click on save button

#    Scenario: Three dots edit button
      And i click on three dots
      And i click on edit
   And i change Add Team Member
     And i enter needs in remember tab text clear and reenter
      And i changed priority to medium
      And i click on Set a Due Reminder to another date
      And i enter another time
      And i click on save button again

###########################################################################################
##    Feature: new
#    When I click on the Create New Task button
#    And I enter Add Team Member in the task name field
#    And I enter needs in the remember tab
#    And I click on Priority
#    And I click on Set a Due Reminder tab
#    And I enter the specified time to entry
#    And I click on the Save button tab
#    Then I should receive a confirmation message


#    (//span)[@class="ant-select-selection-item"][3]