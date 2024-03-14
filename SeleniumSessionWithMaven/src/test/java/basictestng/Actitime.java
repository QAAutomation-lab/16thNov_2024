package basictestng;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
public class Actitime extends SeleniumUtility{
	static WebDriver driver;
	@Test(priority=1)
	public void openBrowserAndAppURL() {		
		driver=setUp("chrome","https://demo.actitime.com/login.do");
		//validation login page opened or not
		String actualLoginPageTitle=getCurrentTitleOfApplication();
		String expectedLoginPageTitle="actiTIME - Login";
		//System.out.println("Login page validation: "+actualLoginPageTitle.equals(expectedLoginPageTitle));
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"Either login page not opened or page title got changed");
	}
	@Test(priority=2)
	public void validateLoginPageComponent() {
		WebElement userNameInputField=driver.findElement(By.name("username"));
		Assert.assertTrue(isElementExist(userNameInputField), "Username field is not displayed");
	}
	
	@Test(priority=3)
	public void validateLoginPageCheckbox() {
		WebElement checkBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		Assert.assertFalse(isCheckBoxSelected(checkBox), "'Keep me logged in' checkbox is by default selected");
	}
	
	@Test(priority=4)
	public void loginInToApplication() {
		typeInput(driver.findElement(By.name("username")), "admin");
		typeInput(driver.findElement(By.name("pwd")),"manager");
		clickOnElement(driver.findElement(By.id("loginButton")));
		String actualLoginPageTitle=getCurrentTitleOfApplication("actiTIME - Enter Time-Track");
		String expectedLoginPageTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"Either Home page not opened or page title got changed");
	}
}
