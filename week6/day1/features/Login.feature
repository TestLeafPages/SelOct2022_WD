Feature: Login functionality of Leaftaps application

Background:
Given Open the Chrome Browser
And load the application url

Scenario: TC-001 Login succesfully
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on  Login button
Then HomePage should be displayed

Scenario: TC-002 Login with invalid credential

Given Enter the username as 'Democsr1'
And Enter the password as 'crmsfa'
When Click on  Login button
Then Errormessage should be displayed

