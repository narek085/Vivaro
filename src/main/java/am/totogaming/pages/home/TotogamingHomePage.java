package am.totogaming.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.base.TotogamingBasePageObject;
import am.totogaming.pages.login.LoginPage;

public class TotogamingHomePage extends TotogamingBasePageObject {

	public TotogamingHomePage(WebDriver driver) {
		super(driver);
	}

	public final String LOGO_XPATH = "//div[contains(@class, 'logo')]/a";
	public final String LOGIN_LINK_XPATH = "//a[@data-href='/Login/Login']";
	
	@FindBy(xpath = LOGO_XPATH)
	WebElement logo;

	@FindBy(xpath = LOGIN_LINK_XPATH)
	WebElement loginLink;
	
	public TotogamingHomePage clickOnLogo() {
		logo.click();
		return new TotogamingHomePage(driver);
	}
	
	public LoginPage goToLoginPage() {
		loginLink.click();
		return new LoginPage(driver);
	}
}
