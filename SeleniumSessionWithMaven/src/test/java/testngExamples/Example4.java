package testngExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example4 {
  @Test(enabled=false)
  public void testActitimeWithOutAssert() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/tcs/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME -  Login";
		System.out.println("Login page validation: "+actualTitle.equals(expectedTitle));
  }
  
  @Test
  public void testActitimeWithAssert1() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/tcs/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Login";
		Assert.assertTrue(actualTitle.equals(expectedTitle));
  }
  @Test
  public void testActitimeWithAssert2() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/tcs/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME -  Login";
		Assert.assertTrue(actualTitle.equals(expectedTitle),"Login page not opened or title got changed");
  }
  
  @Test
  public void testActitimeWithAssert3() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/tcs/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Login";
		Assert.assertEquals(actualTitle, expectedTitle);
  }
  @Test
  public void testActitimeWithAssert4() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/tcs/login.do");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME -  Login";
		Assert.assertEquals(actualTitle, expectedTitle,"Login page not opened or title got changed");
  }
}
/*
Assert: Its as predefine class of TestNG, used for validation purpose in testng
	if any validation failed, test status will be failed
	if validation pass, test status will be pass

Assert.
	   assertTrue(boolean cond);//if condition is pass, test status will be pass else failed
	   assertTrue(boolean cond, String msg);//if condition is pass, test status will be pass else failed with given msg
		
	   assertFalse(boolean cond);//if condition is failed, test status will be pass else failed
	   assertFalse(boolean cond, String msg);//if condition is failed, test status will be pass else failed with given msg
	
	   assertEquals(arg1, arg2);//if both are same, test will pass else fail
	    assertEquals(arg1, arg2, String msg);//if both are same, test will pass else fail with given msg
 */
