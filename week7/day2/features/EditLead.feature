@lead
Feature: LeaftTaps Edit Lead functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@functional @smoke
Scenario: Edit Lead with mandatory information
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomePage should be displayed
