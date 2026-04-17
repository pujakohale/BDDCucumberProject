Feature: Login 
Scenario: Valid login
Given user launches browser
When user open login page
And enter username and password
And clicks login button
Then user should login successfully