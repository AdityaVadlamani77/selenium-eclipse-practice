Feature: Testing OrangeHRM Demo website
Scenario: To test login page of OrangeHRM Demo website
Given user should be in the login page
When enter valid username "Admin"
And enter valid password "admin123"
And click on login button
Then I should get the title "OrangeHRM"