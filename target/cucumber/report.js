$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Techfios.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1998418000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on login page of techfios",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on sign button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should land on dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on bankCash button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click on newAccount button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should land on new accounts form",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter accountTitle in accounts page as \"Credi Account\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter description in accounts page as \"My account\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enter initialBalance in accounts page as \"200\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enter accountNumber in accounts page as \"30012455\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enter contactPerson in accounts page as \"keyy@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enter Phone in accounts page as \"4572381245\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enter internetBankingURL in accounts page as \"techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page_of_techfios()"
});
formatter.result({
  "duration": 913684300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 24
    }
  ],
  "location": "LoginStepDefinition.user_enter_username_as(String)"
});
formatter.result({
  "duration": 3131561100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 24
    }
  ],
  "location": "LoginStepDefinition.user_enter_password_as(String)"
});
formatter.result({
  "duration": 3102426600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_sign_button()"
});
formatter.result({
  "duration": 4859953800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 16460300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_bankCash_button()"
});
formatter.result({
  "duration": 85745000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_newAccount_button()"
});
formatter.result({
  "duration": 3315246800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_new_accounts_form()"
});
formatter.result({
  "duration": 10788900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Credi Account",
      "offset": 45
    }
  ],
  "location": "LoginStepDefinition.user_enter_accountTitle_in_accounts_page_as(String)"
});
formatter.result({
  "duration": 3146204800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account",
      "offset": 44
    }
  ],
  "location": "LoginStepDefinition.user_enter_description_in_accounts_page_as(String)"
});
formatter.result({
  "duration": 3120799000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 47
    }
  ],
  "location": "LoginStepDefinition.user_enter_initialBalance_in_accounts_page_as(String)"
});
formatter.result({
  "duration": 3126309300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30012455",
      "offset": 46
    }
  ],
  "location": "LoginStepDefinition.user_enter_accountNumber_in_accounts_page_as(String)"
});
formatter.result({
  "duration": 3123950200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "keyy@gmail.com",
      "offset": 46
    }
  ],
  "location": "LoginStepDefinition.user_enter_contactPerson_in_accounts_page_as(String)"
});
formatter.result({
  "duration": 3123143300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4572381245",
      "offset": 38
    }
  ],
  "location": "LoginStepDefinition.user_enter_Phone_in_accounts_page_as(String)"
});
formatter.result({
  "duration": 3121382800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "techfios.com",
      "offset": 51
    }
  ],
  "location": "LoginStepDefinition.user_enter_internetBankingURL_in_accounts_page_as(String)"
});
formatter.result({
  "duration": 3133527400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_submit_button()"
});
formatter.result({
  "duration": 774817400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "duration": 10158700,
  "status": "passed"
});
});