@room
Feature: As a admin I want to see list room in room page

  Background:
    Given i am on the login page
    When i input valid email
    And i input valid password
    And i click login button

  @positive
  Scenario: As admin i success to see list room in room page
    Given admin on the home page
    When i click room
    Then i success see list room

  Scenario: As admin i success to create room
    Given admin on the home page
    When i click room
    And i click create new room
    And i fill new data room
    And i click create room
    Then i success create new room

  Scenario: As admin i failed to create room with empty data
    Given admin on the home page
    When i click room
    And i click create new room
    And i not fill new data room
    And i click create room
    Then i failed create new room with empty data

  Scenario: As admin i failed to create room with same name
    Given admin on the home page
    When i click room
    And i click create new room
    And i fill same data room
    And i click create room
    Then i failed to create room with same data

  Scenario: As admin i success to delete existing room
    Given admin on the home page
    When i click room
    And i click delete existing room
    Then i success delete room

  Scenario: As admin i search room name
    Given admin on the home page
    When i click room
    And i fill search box with valid keyword room
    Then i get room with this name

  Scenario: As admin i filter room
    Given admin on the home page
    When i click room
    And i choose filter on room page
    Then i see list room by filter