@district
Feature: As admin i want to manage district

  Background:
    Given admin set endpoint for login admin
    When admin input authorization

  @scenario1D
  Scenario: As admin i want to see all list district with valid endpoint
    Given admin set endpoint for get district
    And admin send request district
    Then admin get status code 200 on district
    And admin get list district

  Scenario: As admin i want to see all district with invalid endpoint
    Given admin set invalid endpoint for get district
    When admin send request invalid endpoint district
    Then admin get status code 404 on district
    And admin get error message

  Scenario: As admin i want to create new district with valid endpoint
    Given admin set endpoint for add district
    When admin send POST HTTP request with valid data district
    Then admin get status code 200 on district
    And admin get detail about district

  Scenario: As admin i want to create new district with invalid endpoint
    Given admin set invalid endpoint for add district
    When admin send POST HTTP request with invalid enpoint district
    Then admin get status code 404 on district
    And admin get error message

  Scenario: As admin i want to create new district with invalid input id city
    Given admin set endpoint for add district
    When admin send POST HTTP request with invalid input id city
    Then admin get status code 400 on district
    And admin get error message after add district

  Scenario: As admin i want to create new district with input same name district
    Given admin set endpoint for add district
    When admin send POST HTTP request with input same name district
    Then admin get status code 400 on district
    And admin get error message after add district

  Scenario: As admin i want to create new district with input name by integer
    Given admin set endpoint for add district
    When admin send POST HTTP request with input name by integer
    Then admin get status code 400 on district
    And admin get error message after add district


