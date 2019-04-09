#Each feature file contains one scenario
#Feature files use Gherkin language
#A feature file may have different specific scenarios
# Scenarios use Given-When-Then structure
Feature:Test the login functionality on Whatsapp Dashboard.
Scenario: The user should be able to login with correct username and password.
Given user is on the login page.
When user enters correct Username and correct Password.
Then the user gets a confirmation.
