Feature: As admin I want to search building So that i can see existing building

  Background: As admin i success to search building with valid keyword
    Given admin on the home page
    When admin fill name building on the search box
    Then admin see building with this keyword

  Scenario: As admin i failed to search building with invalid keyword
    When admin fill name building on the search box with invalid keyword
    Then admin fail to see list building with invalid keyword