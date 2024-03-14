package day12.mavenpractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example3 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		
		//Convert Browser instance into TakeScreenshot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		//take screenshot of required page
		File file=ts.getScreenshotAs(OutputType.FILE);
		//store screenshot into the required location
		FileUtils.copyFile(file,new File(".\\src\\test\\resources\\screenshots\\GooglePage.jpg"));
		
		driver.close();
	}

}
