@room
Feature: As user I want to see existing room So that i can booking room

  Background:
    Given android user on landing screen
    When android user input valid email
    And android user input valid password
    And android user click login button
    And android user see homepage

  Scenario: As user i see list room on the building page
    Given user on the building page
    When user click room
    Then user see list room on building page

  Scenario: As user i see detail room
    Given user on the room page
    When user click existing room
    Then user see detail about room

  Scenario: As user i success booking room
    Given on the room page the selected
    When user click booking room
    And user fill data and pay
    Then user success to booking room