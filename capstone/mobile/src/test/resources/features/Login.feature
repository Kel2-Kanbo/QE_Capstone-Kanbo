@login
Feature: As a user I want to login in the app So that i can see homepage

  @positif
  Scenario: As a user i have be able to success login
    Given android user on landing screen
    When android user input valid email
    And android user input valid password
    And android user click login button
#    And android user see homepage
    And android user click profile
    And android user click logout
    Then android user on login page

  @fail
  Scenario: As user i have failed to login with empty data
    Given android user on landing screen
    When android user not input email
    And android user not input password
#    And android user click login button
    Then android user see error message on field

  @fail2
  Scenario: As user i have failed to login with empty email
    Given android user on landing screen
    When android user not input email
    And android user input password
#    And android user click login button
    Then android user see error message on email field

  @fail3
  Scenario: As user i have failed to login with empty password
    Given android user on landing screen
    When android user input valid email
    And android user not input password
#    And android user tap login button
    Then android user see error message on password field

  @fail4
  Scenario: As user i have failed to login with not registered email
    Given android user on landing screen
    When android user input not registered email
    And android user input valid password
    And android user click login button
    Then android user see error message not registered email

  @fail5
  Scenario: As user i have failed to login with wrong password
    Given android user on landing screen
    When android user input valid email
    And android user input wrong password
    And android user click login button
    Then android user see error message wrong password

  @fail5
  Scenario: As user i have failed to login with invalid password(less than minimum char)
    Given android user on landing screen
    When android user input valid email
    And android user input invalid password
    And android user click login button
    Then android user see error message invalid password