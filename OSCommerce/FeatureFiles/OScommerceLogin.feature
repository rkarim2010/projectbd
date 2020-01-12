Feature: Login functionality
Scenario: Successful Login with valid credentials

Given Browser to OSCommerce home page
When Browser click on My account  
And Put email address and password 
And Click on sign in button
Then Browser able to log in successfully 