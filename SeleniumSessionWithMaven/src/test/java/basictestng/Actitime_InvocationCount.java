package basictestng;

import org.testng.annotations.Test;

public class Actitime_InvocationCount {

	@Test(enabled=true,invocationCount=5)
	public void openBrowserAndAppURL() {
		System.out.println("Open browser and enter app url");
	}
	@Test
	public void login() {
		System.out.println("Login is done");
	}
}