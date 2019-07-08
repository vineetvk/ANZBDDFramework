$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/SUSHMITA/workspace/FreeCrmBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "500",
        "0",
        "100",
        "10000",
        "80000",
        "10000"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters startover button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters only for Living expense",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 10951144350,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 8424114,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 6032503,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 11198521912,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_startover_button()"
});
formatter.result({
  "duration": 10085766900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_only_for_Living_expenses()"
});
formatter.result({
  "duration": 141902059,
  "status": "passed"
});
});