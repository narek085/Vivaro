package am.totogaming.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.base.TotogamingBasePageObject;
import am.totogaming.pages.member.TotogamingMemberPage;

public class LoginPage extends TotogamingBasePageObject {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public final String EMAIL_INPUT = "//input[@automation='email_input']";

	@FindBy(xpath = EMAIL_INPUT)
	WebElement emailInputField;

	//change this to Password Input
	@FindBy(xpath = EMAIL_INPUT)
	WebElement passInputField;

	@FindBy(xpath = EMAIL_INPUT)
	WebElement loginBtn;

	public LoginPage fillEmail(String email) {
		emailInputField.sendKeys(email);
		return new LoginPage(driver);
	}

	public LoginPage fillPassword(String email) {
		emailInputField.sendKeys(email);
		return new LoginPage(driver);
	}

	public TotogamingBasePageObject clickOnLoginBtn() {
		// click on login btn element shall be called here
		return new TotogamingBasePageObject(driver);
	}

	private boolean isElementPresent() {
		// if element present then return true, otherwise return false
		return true;
	}

	public TotogamingBasePageObject login(String email, String pass) {
		fillEmail(email);
		fillPassword(pass);
		clickOnLoginBtn();
		if (isElementPresent()) {
			return new TotogamingMemberPage(driver);
		}
		return new LoginPage(driver);
	}
}
