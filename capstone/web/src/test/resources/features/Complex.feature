@complex
Feature: As a admin I want to see existing complex on complex page

  Background: As admin i want to see existing complex
    Given admin on the home page
    When admin click complex
    Then admin success to see existing complex

  Scenario: As admin i success to create new complex
    When admin click create new complex
    And admin fill new data complex
    And admin click create complex
    Then admin success create new complex

  Scenario: As admin i failed to create new complex with not fill complex name
    When admin click create new complex
    And admin fill new data with not fill name complex
    And admin click create complex
    Then admin failed to create complex with not fill name complex

  Scenario: As admin i failed to crete complex with not choose city and district
    When admin click create new complex
    And admin fill complex name
    And admin choose province
    And admin not choose city and district
    And admin click create complex
    Then admin failed to create complex with not choose city district

  Scenario: As admin i failed to create complex with not choose province
    When admin click create new complex
    And admin fill complex name
    And admin not choose province
    And admin click create complex
    Then admin failed to create complex with not choose province

  Scenario: As admin i failed to create complex with empty data
    When admin click create new complex
    And admin not fill data complex
    And admin click create complex
    Then admin failed create complex with empty data

  Scenario: As admin i failed to create complex with click cancel after fill data
    When admin click create new complex
    And admin fill new data complex
    And admin click cancel after fill data complex
    Then admin failed to create complex with click cancel

  Scenario: As admin i success to delete existing complex
    When i click delete existing complex
    Then i success delete complex

  Scenario: As admin i search complex name
    When i fill search box with valid keyword complex
    Then i get complex with this name

  Scenario: As admin i filter complex
    When i choose filter on complex page
    Then i see list complex by filter