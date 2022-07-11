@Account
Feature: As user I want to manage my account on account page

  Background:
    Given android user on landing screen
    When android user input valid email
    And android user input valid password
    And android user click login button
    And android user see homepage

  Scenario: As user i see detail information about my account
    Given user on the account page
    When user click personal information
    Then user see personal information

  Scenario: As user i edit detail information my account
    Given user on the account page
    When user click personal information
    And user edit email
    And user reset location
    And user click save
    Then user success update personal information

  Scenario: As user i delete email on detail information
    Given user on the account page
    When user click personal information
    And user delete email
    And user reset location
    And user click save
    Then user failed to update personal information

  Scenario: As user i see transaction history
    Given user on the account page
    When user click transaction history
    Then user see all transaction history

  Scenario: As user i see privacy
    Given user on the account page
    When user click privacy
    Then user see all about privacy

  Scenario: As user i see setting
    Given user on the account page
    When user click setting
    Then user see all about setting

  Scenario: As user i logout my account
    Given user on the account page
    When user click logout
    And user click logout on pop up bar
    Then user success to logout and back to login page

