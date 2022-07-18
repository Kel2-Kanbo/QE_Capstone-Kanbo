@room @ready
Feature: As user I want to see existing room So that i can booking room

#  Background:
#    Given android user on landing screen
#    When android user input valid email
#    And android user input valid password
#    And android user click login button
#    And android user see homepage

  Scenario: As user i see detail room
    Given user on the home page
    When user click existing building on the home page
    And user on the building page
    And user click existing room
    Then user see detail about room

  Scenario: As user i success booking room
    Given user on the home page
    When user click existing building on the home page
    And user click existing room
    And user click booking room
    Then user just completes the data