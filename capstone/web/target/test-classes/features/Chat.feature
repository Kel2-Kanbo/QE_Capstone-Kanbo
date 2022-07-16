Feature: As admin I want to chat customer

  Background:
    Given i am on the login page
    When i input valid email
    And i input valid password
    And i click login button

  Scenario: : As admin i success to see all chat
    Given admin on the home page
    When admin click chat
    Then admin on the chat page

  Scenario: As admin i success search chat customer with valid keyword
    Given admin on the home page
    When admin click chat
    And admin fill search box with customer username
    Then admin see chat customer

  Scenario: As admin i success send message to customer
    Given admin on the home page
    When admin click chat
    And admin click chat with customer
    And admin write message
    And admin click send message
    Then admin success send message
