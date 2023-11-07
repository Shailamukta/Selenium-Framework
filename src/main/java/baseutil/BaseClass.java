package baseutil;

import java.time.Duration;

import org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.ResidentPage;

public class BaseClass {
	public WebDriver driver;
	public ResidentPage rp;

	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver",
				"/Users/bioferdous/eclipse-workspace/gov.texas/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.texas.gov");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		rp = new ResidentPage(driver);

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
