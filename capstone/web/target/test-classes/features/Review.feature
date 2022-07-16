Feature: As admin I want to see review So that i can reply review

  Background:
    Given i am on the login page
    When i input valid email
    And i input valid password
    And i click login button

  Scenario: As admin i success to see review
    Given admin on the home page
    When admin click review
    Then admin see all review

  Scenario: As admin i success to reply review
    Given admin on the home page
    When admin click review
    And admin click reply review
    And admin write reply
    And admin send reply
    Then admin success to send reply review

  Scenario: As admin search review by username customer
    Given admin on the home page
    When admin click review
    And admin fill username om search box
    Then admin success find review by username

  Scenario: As admin i filter review
    Given admin on the home page
    When admin click review
    And i choose filter on review page
    Then i see list review by filter