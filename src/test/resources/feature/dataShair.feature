@EndToEnd
Feature: Data sharing among the different scenario

Background: Navigation to the URL
Given User navigate to url "https://www.demoblaze.com/"
Then  Title is "STORE"

Scenario: User able to login into application
When User click on login button 
And  Enter mailID and Passward to login into appliction


Scenario: varify the same user login into application
When User click on login button
And  Enter mailID and Passward to login into appliction
Then varify the user mailID as a credentials and it's must be match