Feature: As admin I want to see list customer So that i can manage customer

  Background: As admin i want to see list customer on customer page
    Given admin on the home page
    And admin click customer
    Then admin see list customer

  Scenario: As admin i success to delete existing customer
    When i click delete customer
    Then i success to delete customer

  Scenario: As admin i success to search customer name
    When i input search box with customer name
    Then i see customer with this name

  Scenario: As admin i search customer name
    When i fill search box with valid keyword customer
    Then i get customer with this name

  Scenario: As admin i filter customer
    When i choose filter on customer page
    Then i see list customer by filter