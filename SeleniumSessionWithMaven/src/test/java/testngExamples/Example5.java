package testngExamples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Example5 {
  
	@BeforeSuite
	public void runBeforeSuite() {
		System.out.println("**************Before Suite***************************");
	}
	
	@AfterSuite
	public void runAfterSuite() {
		System.out.println("**************After Suite***************************");
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
