Feature: As admin I want to see list customer So that i can manage customer

  Background:
    Given i am on the login page
    When i input valid email
    And i input valid password
    And i click login button

  Scenario: As admin i want to see list customer on customer page
    Given admin on the home page
    When admin click customer
    Then admin see list customer

  Scenario: As admin i success to delete existing customer
    Given admin on the home page
    When admin click customer
    And i click delete customer
    Then i success to delete customer

  Scenario: As admin i success to search customer name
    Given admin on the home page
    When admin click customer
    And i input search box with customer name
    Then i see customer with this name

  Scenario: As admin i search customer name
    Given admin on the home page
    And admin click customer
    When i fill search box with valid keyword customer
    Then i get customer with this name

  Scenario: As admin i filter customer
    Given admin on the home page
    When admin click customer
    And i choose filter on customer page
    Then i see list customer by filter