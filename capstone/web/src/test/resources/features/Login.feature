@login @feature
Feature: As admin I want to login So that i can see home page

  Background:
    Given i am on the login page

  @positivelogin
  Scenario: As admin i have be able to success login
    When i input valid email
    And i input valid password
    And i click login button
    Then i success login
    And i see homepage

  @negativeLogin
  Scenario: As admin i have failed to login with not input data
    When i not input username and password
    And i click login button
    Then admin fail to create account and get error message empty email
    And admin fail to create account and get error message empty password

  @negativeLogin
  Scenario: As admin i have failed to login with no input email
    When i not input email
    And i input valid password
    And i click login button
    Then i failed to login and get error message

  @negativeLogin
  Scenario: As admin i have failed to login with no input password
    When i input valid email
    And i not input password
    And i click login button
    Then i failed to login and get error message less char on password

  @negativeLogin
  Scenario: As admin i have failed to login with invalid email
    When i input invalid email
    And i input valid password
    And i click login button
    Then i fail to login and get error message invalid email

  @negativeLogin6
  Scenario: As admin i have failed to login with wrong password
    When i input valid email
    And i input wrong password
    And i click login button
    Then i failed to login and get error message on password

  @negativeLogin
  Scenario: As admin i have failed to login with invalid email with no use domain
    When i input invalid email with not use domain
    And i input valid password
    And i click login button
    Then i fail to login and get error message invalid email

  @negativeLogin
  Scenario: As admin i have failed to login with invalid password
    When i input valid email
    And i input invalid password
    And i click login button
    Then i failed to login and get error message on password

  Scenario: As admin i logout my account
    Given i am on the login page
    When i input valid email
    And i input valid password
    And i click login button
    And i success login
    And i click logout button
    And i click confirm logout
    Then i am on the login page



