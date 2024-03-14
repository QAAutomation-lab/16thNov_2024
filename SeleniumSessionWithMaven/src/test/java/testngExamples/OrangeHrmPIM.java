package testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHrmPIM extends SeleniumUtility {

	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeMethod
	public void loginAndNavigateToPIM() {
		typeInput(driver.findElement(By.name("username")),"Admin");
		typeInput(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
	}

	@Test
	public void testPIMCreation() {
		System.out.println("Created PIM");
	}

	@Test
	public void testPIMUpdate() {
		System.out.println("Updated PIM");
	}

	@Test
	public void testPIMDelete() {
		System.out.println("Deleted PIM");
	}

	@AfterMethod
	public void logout() {
		clickOnElement(driver.findElement(By.cssSelector(".oxd-userdropdown-icon")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Logout']")));
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
