@building @ready
Feature: As user I want to see building So that i can booking room

#  Background:
#    Given android user on landing screen
#    When android user input valid email
#    And android user input valid password
#    And android user click login button
#    And android user see homepage

  Scenario: : As user i see existing building
    Given user on the home page
    When user click existing building on the home page
    Then user see detail building
    And user see list room on building

  Scenario: As user i see nearby facilities on building page
    Given user on the home page
    When user click existing building on the home page
    And user on the building page
    And user click nearby facilities
    Then user see pop up menu about nearby facilities

