Feature: Validate Techfios Login Functionality

Scenario: Login with Valid Credentials

Given User on Techfios Login Page
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
And User clicks on Signin button
Then User should land on Dashboard page