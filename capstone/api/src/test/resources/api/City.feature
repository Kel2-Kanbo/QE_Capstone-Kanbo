@city
Feature: As a admin I want to manage city

  Scenario: : As admin i want to login so that i can manage city
    Given admin set endpoint for login
    When admin send POST HTTP request with valid data
    Then admin get status code 200
    And admin get valid data

  Scenario: As admin i want to see all list city with valid endpoint
    Given admin set endpoint for get city
    When admin send request
    Then admin get status code 200 on city
    And admin get list city

  Scenario: As admin i want to see all list city with invalid endpoint
    Given admin set invalid endpoint for get city
    When admin send request invalid endpoint
    Then admin get status code 404 on city
    And admin get error message

  Scenario: As admin i want to create new city with valid endpoint
    Given admin set endpoint for add city
    When admin send POST HTTP request with valid data city
    Then admin get status code 200 on city
    And admin get detail about city

  Scenario: As admin i want to create new city with invalid endpoint
    Given admin set invalid endpoint for add city
    When admin send POST HTTP request with invalid enpoint
    Then admin get status code 404 on city
    And admin get error message

  Scenario: As admin i want to create new city with invalid input data
    Given admin set endpoint for add city
    When admin send POST HTTP request with invalid input data
    Then admin get status code 400 on city
    And admin get error message after add city

  Scenario: As admin i want to create new city with same name
    Given admin set endpoint for add city
    When admin send POST HTTP request with same name
    Then admin get status code 400 on city
    And admin get error message after add city