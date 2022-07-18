@complex @feature
Feature: As a admin I want to see existing complex on complex page

  Background:
    Given i am on the login page
    When i input valid email
    And i input valid password
    And i click login button
    Then i success login

  @positiveComplex
  Scenario: As admin i want to see existing complex
    Given admin on the home page
    When admin click complex
    Then admin success to see existing complex

  @positiveComplex2
  Scenario: As admin i success to create new complex
    Given admin on the home page
    When admin click complex
    And admin click create new complex
    And admin fill new data complex
    And admin choose province
    And admin choose city
    And admin choose district
    And admin click create complex
    And admin click success complex
    Then admin success create new complex

  Scenario: As admin i failed to create new complex with not fill complex name
    Given admin on the home page
    When admin click complex
    And admin click create new complex
    And admin fill new data with not fill name complex
    And admin choose province
    And admin choose city
    And admin choose district
    And admin click create complex
    Then admin failed to create complex with not fill name complex

  Scenario: As admin i failed to crete complex with not choose city and district
    Given admin on the home page
    When admin click complex
    And admin click create new complex
    And admin fill complex name
    And admin choose province
    And admin not choose city and district
    And admin click create complex
    Then admin failed to create complex with not choose city
    And admin failed to create complex with not choose distrit

  Scenario: As admin i failed to create complex with not choose province
    Given admin on the home page
    When admin click complex
    And admin click create new complex
    And admin fill complex name
    And admin not choose province
    And admin click create complex
    Then admin failed to create complex with not choose province

  Scenario: As admin i failed to create complex with empty data
    Given admin on the home page
    When admin click complex
    And admin click create new complex
    And admin not fill data complex
    And admin not choose province,city,district
    And admin click create complex
    Then admin failed create complex with empty data

  Scenario: As admin i failed to create complex with click cancel after fill data
    Given admin on the home page
    When admin click complex
    And admin click create new complex
    And admin fill new data complex
    And admin click cancel after fill data complex
    Then admin failed to create complex with click cancel

  @positiveComplex4
  Scenario: As admin i success to delete existing complex
    Given admin on the home page
    When admin click complex
    And i click delete existing complex
    And i click confirm delete
    Then i success delete complex

#  @positiveComplex3
#  Scenario: As admin i update existing complex
#    Given admin on the home page
#    When admin click complex
#    And admin click edit button on complex
#    And admin edit data complex
#    Then admin success edit complex