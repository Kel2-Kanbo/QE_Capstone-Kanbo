@review
Feature: As user I want to send review

  Background:
    Given android user on landing screen
    When android user input valid email
    And android user input valid password
    And android user click login button
    And android user see homepage

  Scenario: As user i success to give review about room
    Given user on the booking page
    When user click review on the room booking
    And user give stars about room
    And user fill review box
    And user click send review
    Then user success to give review

  Scenario: As user i see existing review
    Given user on  the detail room page
    When user click view all on review
    Then user see all reviews

  Scenario: As user i success give  review without fill review box
    Given user on the booking page
    When user click review on the room booking
    And user give stars about room
    And user not fill review box
    And user click send review
    Then user success to give review