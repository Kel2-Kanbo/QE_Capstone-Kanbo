@building @feature
Feature: As admin I want to see details building on building page

  Background:
    Given i am on the login page
    When i input valid email
    And i input valid password
    And i click login button
    Then i success login

  @positifBuild
  Scenario: As admin i have be able success to see building on building page
    Given admin on the home page
    When I click building on home page
    Then I can see list building

  @positifBuild
  Scenario: As admin i have be able success to create new building
    Given admin on the home page
    When I click building on home page
    And admin click create new building
    And admin fill name building
    And admin choose complex
    And admin fill address building
    And admin fill description
    And admin click create
    And admin click success add
    Then admin success crete new building

  @positifBuild3
  Scenario: As admin i have be able success to create new building with fill facilities
    Given admin on the home page
    When I click building on home page
    And admin click create new building
    And admin fill name building
    And admin choose complex
    And admin fill address building
    And admin fill description
    And admin choose facilities
    And admin fill name facilities
    And admin fill duration and distance facilities
    And admin click add facilities
    And admin click create
    And admin click success add
    Then admin success crete new building

  Scenario: As admin i have failed to create building with no choose complex
    Given admin on the home page
    When I click building on home page
    And admin click create new building
    And admin fill name building
    And admin not choose complex
    And admin fill address building
    And admin fill description
    And admin click create
    Then admin fail to crete building and get message

  Scenario: As admin i create new building but i click cancel
    Given admin on the home page
    When I click building on home page
    And admin click create new building
    And admin fill name building
    And admin choose complex
    And admin fill address building
    And admin fill description
    And admin click close
    Then admin fail add building and back to building page

    @negatifBuild
  Scenario: As admin i failed to create building with empty data
    Given admin on the home page
    When I click building on home page
    And admin click create new building
    And admin not fill name building
    And admin not choose complex
    And admin not fill address building
    And admin not fill description
    And admin click create
    Then admin fail to crete building and get message

  Scenario: As admin i have be able to success delete building
    Given admin on the home page
    When I click building on home page
    And i click delete on existing building
    Then i success delete building

  Scenario: As admin i have be able to update building
    Given admin on the home page
    And admin click update button building
    And admin edit or update data building
    And admin click update building
    And admin click success update building
    Then admin success update building
