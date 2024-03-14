package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;
public class ActitimeLogin extends SeleniumUtility{	
	String appUrl;
	String userName;
	String password;
	static int row=1;
	static String expectecTitle;
	static String actualTitle;
	String filePath=".\\src\\test\\resources\\AppTest.xlsx";
	@BeforeMethod
	public void getData() {
		appUrl=ExcelUtility.getCellValue(filePath, "TC", row, 0);
		userName=ExcelUtility.getCellValue(filePath, "TC", row, 1);
		password=ExcelUtility.getCellValue(filePath, "TC", row, 2);
		expectecTitle=ExcelUtility.getCellValue(filePath, "TC", row, 3);
	}
	@Test
	public void testOrangeHRMLogin() {
			setUp("chrome", appUrl);	
			typeInput(driver.findElement(By.id("username")), userName);
			typeInput(driver.findElement(By.name("pwd")), password);
			clickOnElement(driver.findElement(By.id("loginButton")));
			actualTitle=getCurrentTitleOfApplication(expectecTitle);
			Assert.assertEquals(actualTitle, expectecTitle);
	}
	@AfterMethod
	public void cleanUp1() {
		//update current title
		ExcelUtility.updateExcelContent(filePath, "TC", row, 4,actualTitle);
		if(actualTitle.equals(expectecTitle)) {
			ExcelUtility.updateExcelContent(filePath, "TC", row, 5,"Passed");
		}else {
			ExcelUtility.updateExcelContent(filePath, "TC", row, 5,"failed");
		}
	}
}
