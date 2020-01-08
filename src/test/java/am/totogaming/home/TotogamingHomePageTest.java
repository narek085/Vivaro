package am.totogaming.home;

import org.testng.annotations.Test;

import am.totogaming.base.TotogamingBaseTest;
import am.totogaming.pages.home.TotogamingHomePage;
import am.totogaming.pages.login.LoginPage;

public class TotogamingHomePageTest extends TotogamingBaseTest {

	@Test
	public void logoFunctionalityTest() {
		TotogamingHomePage home = new TotogamingHomePage(driver);
		home = home.clickOnLogo();
		LoginPage login = home.goToLoginPage();
		String emailAddress = "armine@gmail.com";
		login = login.fillEmail(emailAddress);
		

	}

}
