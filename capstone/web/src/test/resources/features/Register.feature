@register
Feature: As user i want to create account So that i can login

  @positveRegist
  Scenario: As admin i have be able to success crete account
    Given admin on the register page
    When admin input valid name
    And admin input valid username
    And admin input valid email
    And admin input valid password
    And admin click register button
    And admin verify email
    Then admin success to create account and back to login page

  @negative
  Scenario: As admin i have failed to create account with empty data
    Given admin on the register page
    When admin not input name
    And admin not input username
    And admin not input email
    And admin not input password
    And admin click register button
    Then admin fail to create account and get error message

  @negative
  Scenario: As admin i have failed to create account with not use @ on email
    Given admin on the register page
    When admin input valid name
    And admin input valid username
    And admin input email with not use @
    And admin input valid password
    And admin click register button
    Then admin fail to create account and get error message

  @negative
  Scenario: As admin i have failed to create account with input password less character
    Given admin on the register page
    When admin input valid name
    And admin input valid email
    And admin input invalid password
    And admin click register button
    Then admin fail to create account and get error message

  @negative
  Scenario: As admin i have failed to create account with empty email
    Given admin on the register page
    And admin input valid name
    And admin not input email
    And admin input valid password
    And admin click register button
    Then admin fail to create account and get error message

  @negative
  Scenario: As admin i have failed to create account with empty username
    Given admin on the register page
    And admin input valid name
    And admin not input username
    And admin input valid email
    And i input valid password
    And admin click register button
    Then admin fail to create account and get error message

  @negative2
  Scenario: As admin i have failed to create account with empty password
    Given admin on the register page
    When admin input valid name
    And admin input valid username
    And admin input valid email
    And admin not input password
    And admin click register button
    Then admin fail to create account and get error message

  @negative
  Scenario: As admin i have failed to create account with registered email
    Given admin on the register page
    When admin input valid name
    And admin input valid username
    And admin input registered email
    And admin input valid password
    And admin click register button
    Then admin fail to create account and get error message "ERROR: duplicate key"

  @negative
  Scenario: As admin i have failed to create account with registered username
    Given admin on the register page
    When admin input valid name
    And admin input registered username
    And admin input valid email
    And admin input valid password
    And admin click register button
    Then admin fail to create account and get error message "ERROR: duplicate key"

