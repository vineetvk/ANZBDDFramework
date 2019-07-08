Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user is on home page
Then user enters deal details
| 500 | 0 | 100 | 10000 | 80000 | 10000 |
Then user enters startover button
Then user enters only for Living expense