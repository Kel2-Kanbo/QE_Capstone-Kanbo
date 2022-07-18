@booking
Feature: As user I want to booking room

  Scenario: As user i see booking existing room
    Given user on the home page
    When user click booking room on home page
    Then user see room on booking page

  Scenario: As user i success to checkout room on boking page
    Given user on the booking page
    When user click checkout
    And user fill data and choose payment
    And user click checkout
    Then user success to booking room on booking page

  Scenario: As user i see history on booking page
    Given user on the booking page
    When user click history
    Then user see all history booking room