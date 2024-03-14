package basictestng;

import org.testng.annotations.Test;

public class Actitime_Timeout {

	@Test(enabled=true,timeOut=200)
	public void openBrowserAndAppURL() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Open browser and enter app url");
	}
}