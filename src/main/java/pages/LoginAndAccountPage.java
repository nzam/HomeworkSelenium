package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginAndAccountPage {

	WebDriver driver;

	public LoginAndAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")
	WebElement BankAndCashButton;
	@FindBy(how = How.XPATH, using = "//a[text()='New Account']")
	WebElement NewAccountButton;
	@FindBy(how = How.XPATH, using = "//title[text()='Accounts- iBilling']")
	WebElement AccountPage;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='account']")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='description']")
	WebElement AccountDescription;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='balance']")
	WebElement AccountInitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='account_number']")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='contact_person']")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='contact_phone']")
	WebElement PhoneNumber;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @id='ib_url']")
	WebElement InternetBankingURL;
	@FindBy(how = How.XPATH, using = "//button[@ type='submit' and @class='btn btn-primary']")
	WebElement SubmitButton;
	@FindBy(how = How.XPATH, using = "//h2[text()=' Accounts ']")
	WebElement AccountAdded;
	

	// Methods to interact with the WebElements
	public void enterUserName(String username) {
		UserName.sendKeys(username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getHomePage() {
		return driver.getTitle();
	}

	public void ClickBankAndCashButton() {
		BankAndCashButton.click();
	}

	public void ClickNewAccount() {
		NewAccountButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public String getAccountPage() {
		return driver.getTitle();
	}
	
	public void enterAccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterDescription(String descriptions) {
		AccountDescription.sendKeys(descriptions);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterInitialBalance(String balance) {
		AccountInitialBalance.sendKeys(balance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterAccountNumber(String account) {
		AccountNumber.sendKeys(account);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterContactPerson(String contact) {
		ContactPerson.sendKeys(contact);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterphoneNumber(String phone) {
		PhoneNumber.sendKeys(phone);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enternetBankingURL(String bankingURL) {
		InternetBankingURL.sendKeys(bankingURL);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSubmitButton() {
		SubmitButton.click();
		
	}

	public String getAccountAdd() {
		return driver.getTitle();
	}

}
