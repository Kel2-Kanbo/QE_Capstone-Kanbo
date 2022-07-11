@room
Feature: As a admin I want to see list room in room page

  @positive
  Background: : As admin i success to see list room in room page
    Given i am on the login page
    When i click room
    Then i success see list room

  Scenario: As admin i success to create room
    When i click create new room
    And i fill new data room
    And i click create room
    Then i success create new room

  Scenario: As admin i failed to create room with empty data
    When i click create new room
    And i not fill new data room
    And i click create room
    Then i failed create new room with empty data

  Scenario: As admin i failed to create room with same name
    When i click create new room
    And i fill same data room
    And i click create room
    Then i failed to create room with same data

  Scenario: As admin i success to delete existing room
    When i click delete existing room
    Then i success delete room

  Scenario: As admin i search room name
    When i fill search box with valid keyword room
    Then i get room with this name

  Scenario: As admin i filter room
    When i choose filter on room page
    Then i see list room by filter