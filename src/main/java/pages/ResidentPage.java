package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class ResidentPage {
	WebDriver driver;

	public ResidentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Resident']")
	WebElement ResidentPage;

	public void clickResident() throws InterruptedException {
		ResidentPage.click();
		Thread.sleep(3000);
	}

}
