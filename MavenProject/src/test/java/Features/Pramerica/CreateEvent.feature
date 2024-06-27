# Saving the steps in Gherkin feature file format
Feature: Login to Pramerica Website

  Scenario: Login with valid credentials and OTP
    Given Open Chrome brow
    When I enter "Pramerica" in the search bar
    And I enter my Pramerica user ID
    And I click on the login button
    And I enter the OTP
    And I click on the verify OTP button
#    Then I should be logged in successfully

#Feature: Create Event

#  Scenario: User creates a new event
#    Given the user is logged in
    When the user clicks on activities
    And the user clicks on the create event plus button
    And the user clicks on worksite
    And the user selects the Event Type
    And the user enters the Unit Name
    And the user selects the Event Start Date
#    And the user selects Follow Up 1 Date
#    And the user selects Follow Up 2 Date
    And the user clicks on Add Team Member
#    And the user sets the status to open
    And the user enters remarks
    Then the user clicks on create event
########################################################################################

#Feature: Pramerica Calendar
#
#  Scenario: Create Calendar Event
    Given I am on the Pramerica calendar page
    And the user clicked  on the  event plus button
    When I click on the create event button
    And I select "Access Permission" as the event type
    And I enter "iorta" as the attendee name
    And I select "digital" as the category
    And I click on the All day button
    And I select today's date
    And I type in the description textarea
    And I submit the event
########################################################################################


#Feature: Create Customer Event

#  Scenario: Create Event for Customer
    And the user clicked  on the create event plus button
  When I click on Create Customer Event
    And I click on Event Type
    And I click on event name
    And I click on Mode
    And I click on All Day
    And I click on Event Start Date
    And I click on Today
#    And I click on Add Team Member
    And I click on Enter Remarks
    And I click on Create Event

    ################################################################################
#    Scenario: supervisor tab
    And the user click on the create event plus button
    And i clic on Supervisor
    And i click on event type as a business planning
    And  i click on event mode as a digital
    And i clicked on Allday
    And i clicked on Event Start Date as today
    And i clicked on create event

      ##################################################################################

#  Scenario: Team tab
    And i clickn on create event plus button again
    And i click on tam tab
    And  i click on event type as Training
    And i click on event mode as in-person
    And click on AllDayTab
    And click on event start tab as today
    And click on Create event tab finally


#    merging


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
