package basictestng;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class GoogleApplicationWithBeforeAfterTest extends SeleniumUtility {

	WebDriver driver;
	
	@Test(priority=1)
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
	}
	@Test(priority=2)
	public void testSearch() {
		getActiveElementFromUI().sendKeys("SQL", Keys.ENTER);
		Assert.assertTrue(getCurrentTitleOfApplication().contains("SQL"), "SQL search is failed");
	}
	@AfterTest
	public void tearDown() {
		cleanUp();
	}
	@BeforeTest
	public void startUp() {
		driver = setUp("chrome", "https://www.google.com/");
	}
}
/*
	Pre-condition: for all test cases open browser and enter application url once
		TC1: validation google search page opened or not
		TC2: search SQL and validate SQL search page opened or not
	Post-condition: once all the test cases are executed close the browser
*/