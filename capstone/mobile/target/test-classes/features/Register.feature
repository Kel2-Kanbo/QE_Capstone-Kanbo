@register
Feature: As user I want to create account So that i can login and see homepage

  @success
  Scenario: As user i have be able to success create account
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input email
    And user input password
    And user click register button
    Then user back to homepage

  @fail1
  Scenario: As user i failed to create account with empty data
    Given android user on landing screen login page
    When android user click to register
    And user not input name
    And user not input email
    And user not input password
    And user click register button
    Then user get error message

  @fail2
  Scenario: As user i failed to create account with registered account
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input registered email
    And user input password
    And user click register button
    Then user get error message "gagal"

  @fail3R
  Scenario: As user i failed to create account with empty name
    Given android user on landing screen login page
    When android user click to register
    And user not input name
    And user input email
    And user input password
    And user click register button
    Then user get error message not input name

  @fail4
  Scenario: As user i failed to create account with empty email
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user not input email
    And user input password
    And user click register button
    Then user get error message not input email

  @fail5
  Scenario: As user i failed to create account with empty password
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input email
    And user not input password
    And user click register button
    Then user get error message not input password