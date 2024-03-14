package testngExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example6 {
	
	@BeforeMethod
	public void login() {
		System.out.println("************will be executed before each @Test ***********************");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("************will be executed after each @Test ***********************");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("************Executed once after all @Test ***********************");
	}

	@Test
	public void tc1() {
		System.out.println("I am TC1 running");
	}

	@Test
	public void tc2() {
		System.out.println("I am TC2 running");
	}

	@BeforeTest
	public void openBrowser() {
		System.out.println("************Executed once before all @Test ***********************");
	}
}
