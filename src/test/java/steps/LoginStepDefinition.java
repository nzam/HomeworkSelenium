package steps;

import org.junit.Assert;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestBase;
import pages.LoginAndAccountPage;

public class LoginStepDefinition extends TestBase{
	
    LoginAndAccountPage loginPage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginAndAccountPage.class);
	}
	
	@Given("^User is on login page of techfios$")
	public void user_is_on_login_page_of_techfios() {
		driver.get("https://techfios.com/billing/?ng=login/");
	  
	}

	@When("^User enter username as \"([^\"]*)\"$")
	public void user_enter_username_as(String username) {
	    loginPage.enterUserName(username);
	}

	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) {
	   loginPage.enterPassword(password);
	}

	@When("^User click on sign button$")
	public void user_click_on_sign_button() {
	    loginPage.clickSignInButton();
	}

	@When("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getHomePage());
	}

	@When("^User click on bankCash button$")
	public void user_click_on_bankCash_button() {
		loginPage.ClickBankAndCashButton();
	}

	@When("^User click on newAccount button$")
	public void user_click_on_newAccount_button() {
		loginPage.ClickNewAccount();
	}

	@When("^User should land on new accounts form$")
	public void user_should_land_on_new_accounts_form() {
		Assert.assertEquals("Accounts- iBilling", loginPage.getAccountPage()); 
	}

	@When("^User enter accountTitle in accounts page as \"([^\"]*)\"$")
	public void user_enter_accountTitle_in_accounts_page_as(String accountTitle)  {
		loginPage.enterAccountTitle(accountTitle);
	}

	@When("^User enter description in accounts page as \"([^\"]*)\"$")
	public void user_enter_description_in_accounts_page_as(String description) {
		loginPage.enterDescription(description);
	}

	@When("^User enter initialBalance in accounts page as \"([^\"]*)\"$")
	public void user_enter_initialBalance_in_accounts_page_as(String balance) {
		loginPage.enterInitialBalance(balance);
	}

	@When("^User enter accountNumber in accounts page as \"([^\"]*)\"$")
	public void user_enter_accountNumber_in_accounts_page_as(String accountNumber) {
		loginPage.enterAccountNumber(accountNumber);
	}

	@When("^User enter contactPerson in accounts page as \"([^\"]*)\"$")
	public void user_enter_contactPerson_in_accounts_page_as(String contact) {
		loginPage.enterContactPerson(contact);
	}

	@When("^User enter Phone in accounts page as \"([^\"]*)\"$")
	public void user_enter_Phone_in_accounts_page_as(String phone) {
		loginPage.enterphoneNumber(phone);
	}

	@When("^User enter internetBankingURL in accounts page as \"([^\"]*)\"$")
	public void user_enter_internetBankingURL_in_accounts_page_as(String url) {
		loginPage.enternetBankingURL(url);
	}

	@When("^User click on submit button$")
	public void user_click_on_submit_button() {
		loginPage.clickSubmitButton();
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() {
		Assert.assertEquals("Accounts- iBilling", loginPage.getAccountAdd());
	}
	
//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}

}
