package am.totogaming.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TotogamingBaseTest {

	protected WebDriver driver;
	
	@BeforeTest
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\A. Hayk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		     driver = new ChromeDriver();
		driver.get("https://totogaming.am");
	}
	
	@AfterTest
	public void cleanup() {
		driver.quit();
	}
}
