@chat @ready
Feature: As user I want to chat admin So that i can se detail chat

#  Background:
#    Given android user on landing screen
#    When android user input valid email
#    And android user input valid password
#    And android user click login button
#    And android user see homepage

  @chatPositive @ready
  Scenario: As user i click existing chat from admin building
    Given user click chat tab
    And user on the chat page
    When user click message
    Then user see detail chat

  Scenario: As user i search chat with admin
    Given user on the chat page
    When user click search box and input name building
    Then user see message from admin building

  @chatPositive @ready
  Scenario: As user i send message
    Given user click chat tab
    And user on the chat page
    When user click message
    And user input text on message field
    And user click send button
    Then user success send message

  Scenario: As user i send message with not input text
    Given user on the chat page
    When user click message
    And user not input text on message field
    And user click send button
    Then user fail send message