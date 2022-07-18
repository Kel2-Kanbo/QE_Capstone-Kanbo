@search
Feature: As user i want to search building by city So that i can see detail building

  Background:
    Given android user on landing screen
    When android user input valid email
    And android user input valid password
    And android user click login button
    And android user see homepage

  Scenario: As user i success to search building by city with valid keyword
    Given user on the home page
    When user fill search box with keyword city name
    Then user see building by city name

  Scenario: As user i failed to search building with invalid city name
    Given user on the home page
    When user fill search box with invalid city name
    Then user failed to search building by invalid city name

  Scenario: As user i success see building with popular history
    Given user on the home page
    When user click search box
    And user click popular name city on the search box
    Then user see building by popular city