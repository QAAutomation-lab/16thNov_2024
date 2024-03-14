package jsexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.SeleniumUtility;

public class Example3 extends SeleniumUtility{
	
	public static void main(String[] args) throws InterruptedException {
		Example3 e1=new Example3();
		e1.testCase1();
	}

	public void testCase1() throws InterruptedException {
		WebDriver driver=setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical scrolling
		js.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2500)");
		
		//Horizontal scrolling
		//js.executeScript("window.scrollBy(500,0)");
		
	}
}
