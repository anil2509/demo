@fetchTable
Feature: To test that table values are not null
I want to run a a test to check that table values are not null.

Scenario: Check table values are not null.

Given User is on firefox browser 
When navigates to "https://www.tutorialspoint.com/html/html_attributes_reference.htm/"
Then table values in the page should not be null