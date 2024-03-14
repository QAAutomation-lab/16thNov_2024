package testngExamples;

import org.testng.annotations.Test;

public class Example3 {
  @Test(priority=5)
  public void createPIM() {
	  System.out.println("PIM created successfully");
	 // int i=10/0;
  }
  
  @Test(priority=2,dependsOnMethods = "createPIM")
  public void updatePIM() {
	  System.out.println("PIM updated successfully");
  }
  
  @Test(priority=1,dependsOnMethods = "updatePIM")
  public void deletePIM() {
	  System.out.println("PIM deleted successfully");
  }
}
/*
if the test is depends on another method and that method is failed, 
then dependent method will be skipped
*/