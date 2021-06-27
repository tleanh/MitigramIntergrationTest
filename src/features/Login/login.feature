# This test file is used to test login functionality for Mitigram web application
# Tags: optional

Feature: Login page tests
#  Background: close web application
#    Given web browser is closed
@High
  Scenario: login with wrong credentials
    Given user is on the Mitigram login page
    When user enters user name "foo@test.com"
    And user enters password "foo123"
    And user clicks the Login button
    Then  user is not logged in to Mitigram
    And user sees message "Invalid login attempt."
    And web browser is closed
@High
  Scenario: login with an empty user name
    Given user is on the Mitigram login page
    When user enters password "foo123"
    And user clicks the Login button
    Then  user sees message "Email is required"
    And web browser is closed
@High
  Scenario: login with an empty password
    Given user is on the Mitigram login page
    When user enters user name "foo@test.com"
    And user clicks the Login button
    Then  user sees message "Password is required"
    And web browser is closed
@Medium
  Scenario: user can click on forgot-your-password link
    Given user is on the Mitigram login page
    When user clicks on link "Forgot your password?"
    Then user sees Forgot-Password page
    And web browser is closed
@High
  Scenario: Open the contact page
    Given user is on the Mitigram login page
    When user clicks on link "Click here to contact us"
    Then user sees Contact-Us page
    And web browser is closed
@Medium
  Scenario: View Mitigram app on App Store
    Given user is on the Mitigram login page
    When user clicks on App Store icon
    Then user sees Mitigram app on App Store
    And web browser is closed
@Medium
  Scenario: View Mitigram app on Google Play
    Given user is on the Mitigram login page
    When user clicks on Google Play icon
    Then user sees Mitigram app on Google Play
    And web browser is closed