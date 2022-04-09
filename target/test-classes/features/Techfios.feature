Feature: Techfios bank and cash New Account Functionality 

Scenario: User should be able to login with valid credentials
Given User is on login page of techfios
When User enter username as "demo@techfios.com"
When User enter password as "abc123"
When User click on sign button
And User should land on dashboard page
When User click on bankCash button
When User click on newAccount button
When User should land on new accounts form
And User enter accountTitle in accounts page as "Credit Account" 
When User enter description in accounts page as "My account"
When User enter initialBalance in accounts page as "200"
When User enter accountNumber in accounts page as "30012455"
When User enter contactPerson in accounts page as "keyy@gmail.com"
When User enter Phone in accounts page as "4572381289"
When User enter internetBankingURL in accounts page as "techfios.com"
When User click on submit button 
Then User should be able to validate account created successfully
