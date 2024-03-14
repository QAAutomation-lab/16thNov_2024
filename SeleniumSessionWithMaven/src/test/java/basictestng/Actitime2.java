package basictestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
public class Actitime2 extends SeleniumUtility{
	static WebDriver driver;
	@Test(priority=1)
	public void openBrowserAndAppURL() {		
		driver=setUp("chrome","https://demo.actitime.com/login.do");
		//validation login page opened or not
		String actualLoginPageTitle=getCurrentTitleOfApplication();
		String expectedLoginPageTitle="actiTIME - Login";
		
//		if(expectedLoginPageTitle.equals(actualLoginPageTitle)) {
//			System.out.println("Login page validation passed");
//		}else {
//			System.out.println("Login page validation failed");
//		}
		
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"Either login page not opened or page title got changed");
	}
}
/*
 * if you want to compare two values are same then use this-
 	Assert.assertEquals(arg1,arg2); 
 			---> if both are same, dn TC will be pass else failed
 	Assert.assertEquals(arg1, arg2, "msg");
 			---> if both are same, dn TC will be pass else failed

 * if you are expecting boolean condition to be true dn user this 
 	Assert.asserTrue(boolean condition);
 			---> if condition is true, dn TC will be pass else failed
 	Assert.asserTrue(boolean condition,"msg");
 			---> if condition is true, dn TC will be pass else failed

 * if you are expecting boolean condition to false dn user this 
 	Assert.asserFalse(boolean condition);
 			---> if condition is false, dn TC will be pass else failed
 	Assert.asserFalse(boolean condition,"msg");
 			---> if condition is false, dn TC will be pass else failed
 */
