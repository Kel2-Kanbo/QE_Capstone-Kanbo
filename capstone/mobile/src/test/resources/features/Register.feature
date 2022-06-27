@register
Feature: As user I want to create account So that i can login and see homepage

  @Scenario1
  Scenario: As user i have be able to success create account
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user input email
    And user input password
    And user input confirm password
    And user click register button
    And user click confirm email
    Then user back to login page

  @fail1
  Scenario: As user i failed to create account with empty data
    Given android user on landing screen login page
    When android user click to register
    And user not input name
    And user not input username
    And user not input email
    And user not input password
    And user not input confirm password
#    And user click register button
    Then user get error message

  @fail2
  Scenario: As user i failed to create account with not use @
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user input email with not input @
    And user input password
    And user input confirm password
#    And user click register button
    Then user get error message invalid email

  @fail3
  Scenario: As user i failed to create account with invalid password
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user input email
    And user input password with input password less than six char
    And user input confirm password
#    And user click register button
    Then user get error message invalid password

  @fail4 @empty
  Scenario: As user i failed to create account with empty email
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user not input email
    And user input password
    And user input confirm password
#    And user click register button
    Then user get error message empty email

  @fail5 @empty
  Scenario: As user i failed to create account with empty username
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user not input username
    And user input email
    And user input password
    And user input confirm password
#    And user click register button
    Then user get error message empty username

  @fail6 @empty1
  Scenario: As user i failed to create account with empty password
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user input email
    And user not input password
    And user input confirm password
#    And user click register button
    Then user get error message empty password

  @fail7 @empty1
  Scenario: As user i failed to create account with empty name
    Given android user on landing screen login page
    When android user click to register
    And user not input name
    And user input username
    And user input email
    And user input password
    And user input confirm password
#    And user click register button
    Then user get error message empty name

  @fail8 @empty1
  Scenario: As user i failed to create account with empty confirm password
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user input email
    And user input password
    And user not input confirm password
#    And user click register button
    Then user get error message empty confirm password

  @fail9
  Scenario: As user i failed to create account with registered username
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input registered username
    And user input email
    And user input password
    And user input confirm password
    And user click register button
    Then user get error message username is already taken

  @fail10
  Scenario: As user i failed to create account with registered email
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user input registered email
    And user input password
    And user input confirm password
    And user click register button
    Then user get error message "email is already in user"

  @fail11
  Scenario: As user i failed to create account with input confirm password not same as password
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user input email
    And user input password
    And user input different confirm password
#    And user click register button
    Then user get error message password not same

  @fail12
  Scenario: As user i failed to create account with input max char password
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user input email
    And user input password with input max char password
    And user input confirm password max char
#    And user click register button
    Then user get error message password max char

  @fail13
  Scenario: As user i failed to create account with input email not use domain
    Given android user on landing screen login page
    When android user click to register
    And user input name
    And user input username
    And user input email with input email not use domain
    And user input password
    And user input confirm password
#    And user click register button
    Then user get error message not use domain

