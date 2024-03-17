package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitDriverExample {
  @Test
  public void testCase() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
  }
  
  @Test
  public void testCase2() {
	  
	  WebDriver driver=new HtmlUnitDriver();
	  driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
  }
}
