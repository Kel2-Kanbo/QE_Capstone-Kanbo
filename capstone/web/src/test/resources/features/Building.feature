@building
Feature: As admin I want to see details building on building page

  Background: : As admin i have be able success to see building on building page
    Given I am on the home page
    When I click building on home page
    Then I can see list building

  Scenario: As admin i have be able success to create new building
    When admin click create new building
    And admin fill new data building
    And admin click create
    Then admin success crete new building

  Scenario: As admin i have failed to create building with same name
    When admin click create new building
    And admin fill same data building
    And admin click create
    Then admin fail to create new building

  Scenario: As admin i create new building but i click cancel
    When admin click create new building
    And admin fill new data building
    And admin click cancel
    Then admin fail create building and back to building page

  Scenario: As admin i failed to create building with empty data
    When admin click create new building
    And admin bot fill data building
    And admin click create
    Then admin fail to crete building and get message

  Scenario: As admin i have be able to success delete building
    When i click delete on existing building
    Then i success delete building

  Scenario: As admin i search building name
    When i fill search box with valid keyword
    Then i get building with this name

  Scenario: As admin i filter building
    When i choose filter on building page
    Then i see building by filter