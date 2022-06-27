@login
Feature: As user I want to see home page So that i can booking office

  @login @positive1
  Scenario: POST - As a user I success to login with valid data
    Given user set endpoint for login
    When user send POST HTTP request with valid data
    Then user see status code 200
    And get valid data

  @login @negative2
  Scenario: POST - As a user I failed to login with empty data
    Given user set endpoint for login
    When user send POST HTTP request with empty data
    Then user see status code 400 and fail to login
    And user get error message

  @login @negative3
  Scenario: POST - As a user I failed to login with not register email
    Given user set endpoint for login
    When user send POST HTTP request with not register email
    Then user see status code 401 and fail to login
    And user get error message

  @login @negative4
  Scenario: POST - As a user I failed to login with invalid password
    Given user set endpoint for login
    When user send POST HTTP request with invalid password
    Then user see status code 401 and fail to login
    And user get error message

  @login @negative5
  Scenario: POST - As a user I failed to login with invalid endpoint
    Given user set invalid endpoint for login
    When user send POST HTTP request
    Then user get status code 404
    And user get error message not found

  @login @negative6
  Scenario: POST - As a user I failed to login with empty email
    Given user set endpoint for login
    When user send POST HTTP request with empty email
    Then user see status code 400 and fail to login
    And user get error message

  @login @negative7
  Scenario: POST - As a user I failed to login with empty password
    Given user set endpoint for login
    When user send POST HTTP request with empty password
    Then user see status code 400 and fail to login
    And user get error message

  @login @negative8
  Scenario: POST - As a user I failed to login with not use @
    Given user set endpoint for login
    When user send POST HTTP request with not use @
    Then user see status code 400 and fail to login
    And user get error message

  @login @negative9
  Scenario: POST - As a user I failed to login with not use domain
    Given user set endpoint for login
    When user send POST HTTP request with not use domain
    Then user see status code 400 and fail to login
    And user get error message

  @login @positive10
  Scenario: POST - As a admin I success to login with valid data
    Given admin set endpoint for login
    When admin send POST HTTP request with valid data
    Then admin get status code 200
    And admin get valid data