# this feature file has a very few test cases for testing career page. The test cases do not submit
  # any data to the Mitigram website

Feature: career page tests
#  Background: close web browser
#    Given web browser is closed
@High
  Scenario: submit a form without a uploaded CV
    Given user is on the Careers page
    When user enters first name "Test"
    And user enters last name "Web"
    And user enters country "Sweden"
    And user enters email "test@web.com"
    And user enters phone number "0744444444"
    When user clicks on submit button
    Then user see text "A valid CV in PDF format is required"
@Medium
  Scenario: submit a form without a last name, first name and CV
    Given user is on the Careers page
    When user enters country "Sweden"
    And user enters email "test@web.com"
    And user enters phone number "0744444444"
    When user clicks on submit button
    Then user see text "A valid CV in PDF format is required"
    And user see text "First Name is required"
    And user see text "Last Name is required"