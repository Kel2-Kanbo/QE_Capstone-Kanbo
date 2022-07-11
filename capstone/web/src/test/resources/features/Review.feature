Feature: As admin I want to see review So that i can reply review

  Background: As admin i success to see review
    Given admin on the home page
    When admin click review
    Then admin see all review

  Scenario: As admin i success to reply review
    When admin click reply review
    And admin write reply
    And admin send reply
    Then admin success to send reply review

  Scenario: As admin search review by username customer
    When admin fill username om search box
    Then admin success find review by username

  Scenario: As admin i filter review
    When i choose filter on review page
    Then i see list review by filter