
Feature: User Registration


Scenario: Successful registration with all required fields
Given I am on the Demo Web Shop registration page
When i enter "Arjun" as the first name
And i enter "reddy" as the last name
And i select "Male" as the gender
And i enter the following credentials:
| Email         | Password  | Confirm Password|
|invalid@gmail.com | 12345678  | 12345678        |
And I click the "Registration" button
