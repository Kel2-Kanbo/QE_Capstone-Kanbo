@register
Feature: As admin i want to create account So that i can login and see home page

  @register-positive1
  Scenario: POST - As a admin I success to create account with valid data
    Given admin set endpoint for register
    When admin send create account with valid data
    Then admin see status code 200 after send register
    And admin see new detail account

  @register-negative2
  Scenario: POST - As a admin I failed to create account with empty data
    Given admin set endpoint for register
    When admin send POST HTTP request with empty data register
    Then admin see status code 400 and fail to create account
    And admin get error message after regist

  @register-negative3
  Scenario: POST - As a admin I failed to create account with empty email
    Given admin set endpoint for register
    When admin send POST HTTP request with empty email
    Then admin see status code 400 and fail to create account
    And admin get error message after regist

  @register-negative4
  Scenario: POST - As a admin I failed to create account with not use @ in email
    Given admin set endpoint for register
    When admin send POST HTTP request with invalid email register
    Then admin see status code 400 and fail to create account
    And admin get error message after regist

  @register-negative5
  Scenario: POST - As a admin I failed to create account with not use domain email
    Given admin set endpoint for register
    When admin send POST HTTP request with not use domain email
    Then admin see status code 400 and fail to create account
    And admin get error message after regist

  @register-negative6
  Scenario: POST - As a admin I failed to create account with registered email
    Given admin set endpoint for register
    When admin send POST HTTP request with registered email
    Then admin see status code 400 and fail to create account
    And admin get error message email is already taken

  @register-negative7
  Scenario: POST - As a admin I failed to create account with empty username
    Given admin set endpoint for register
    When admin send POST HTTP request with empty username
    Then admin see status code 400 and fail to create account
    And admin get error message after regist

  @register-negative8
  Scenario: POST - As a admin I failed to create account with registered username
    Given admin set endpoint for register
    When admin send POST HTTP request with registered username
    Then admin see status code 400 and fail to create account
    And admin get error message username is already

  @register-positive9
  Scenario: POST - As a admin I success to create account with fill number on username field
    Given admin set endpoint for register
    When admin send POST HTTP request with fill number on username field
    Then admin see status code 200 after send register
    And admin see new detail account

  @register-positive10
  Scenario: POST - As a admin I success to create account with fill letter only on username field
    Given admin set endpoint for register
    When admin send POST HTTP request with fill letter on username field
    Then admin see status code 200 after send register
    And admin see new detail account

  @register-negative11
  Scenario: POST - As a admin I failed to create account with empty password
    Given admin set endpoint for register
    When admin send POST HTTP request with empty password
    Then admin see status code 400 and fail to create account
    And admin get error message after regist

  @register-negative12
  Scenario: POST - As a admin I failed to create account with invalid password
    Given admin set endpoint for register
    When admin send POST HTTP request with invalid password
    Then admin see status code 400 and fail to create account
    And admin get error message after regist

  @register-positive13
  Scenario: POST - As a admin I success to create account with fill password with number only
    Given admin set endpoint for register
    When admin send POST HTTP request with fill password with number
    Then admin see status code 200 after send register
    And admin see new detail account

  @register-positive14
  Scenario: POST - As a admin i success to create account with fill password with letter only
    Given admin set endpoint for register
    When admin send POST HTTP request with fill password with letter
    Then admin see status code 200 after send register
    And admin see new detail account

  @register-positive15
  Scenario: POST - As a admin i success to create account with fill password with combination char
    Given admin set endpoint for register
    When admin send POST HTTP request with fill password with combination char
    Then admin see status code 200 after send register
    And admin see new detail account

  @register-negative17
  Scenario: POST - As a admin I failed to create account with maks random char
    Given admin set endpoint for register
    When admin send POST HTTP request with maks random char
    Then admin see status code 400 and fail to create account
    And admin get error message after regist

  @register-negative16
  Scenario: POST - As a admin I failed to create account with invalid endpoint
    Given admin set invalid endpoint for register
    When admin send create account
    Then admin see status code 404
    And admin get error message not found

