@register
Feature: As user i want to create account So that i can login and see home page

  @register-positive
  Scenario: POST - As a user I success to create account with valid data
    Given user set endpoint for register
    When user send create account with valid data
    Then user see status code 200 after send register
    And user see new detail account

  @register-negative
  Scenario: POST - As a user I failed to create account with empty data
    Given user set endpoint for register
    When user send POST HTTP request with empty data register
    Then user see status code 400 and fail to create account
    And user get error message after regist

  @register-negative
  Scenario: POST - As a user I failed to create account with empty email
    Given user set endpoint for register
    When user send POST HTTP request with empty email
    Then user see status code 400 and fail to create account
    And user get error message after regist

  @register-negative
  Scenario: POST - As a user I failed to create account with not use @ in email
    Given user set endpoint for register
    When user send POST HTTP request with invalid email register
    Then user see status code 400 and fail to create account
    And user get error message after regist

  @register-negative
  Scenario: POST - As a user I failed to create account with not use domain email
    Given user set endpoint for register
    When user send POST HTTP request with not use domain email
    Then user see status code 400 and fail to create account
    And user get error message after regist

  @register-negative
  Scenario: POST - As a user I failed to create account with empty username
    Given user set endpoint for register
    When user send POST HTTP request with empty username
    Then user see status code 400 and fail to create account
    And user get error message after regist

  @register-negative
  Scenario: POST - As a user I failed to create account with fill number on username field
    Given user set endpoint for register
    When user send POST HTTP request with fill number on username field
    Then user see status code 200 after send register
    And user see new detail account