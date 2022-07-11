Feature: As admin I want to chat customer

  Background: As admin i success to see all chat
    Given admin on the home page
    When admin click chat
    Then admin on the chat page

  Scenario: As admin i success search chat customer with valid keyword
    When admin fill search box with customer username
    Then admin see chat customer

  Scenario: As admin i success send message to customer
    When admin click chat with customer
    And admin write message
    And admin click send message
    Then admin success send message
