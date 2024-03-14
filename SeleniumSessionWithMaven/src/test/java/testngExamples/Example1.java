package testngExamples;

import org.testng.annotations.Test;

public class Example1 {
  @Test
  public void testCase1() {
	  System.out.println("I am TC1");
  }
  
  @Test
  public void testCase0() {
	  System.out.println("I am TC0");
	  calling();
  }
  
  public void calling() {
	  System.out.println("I am calling method");
  }
}
/*
main() is not required here
to run testNG file @Test annotation method is required
	output:
		Java Console
		TestNG Console
		
in a single testng file you can have multiple @Test annotation method, in such cases method will be
executed in alphabetical order

Tests run: depends on number of @Test Annotation method
*/