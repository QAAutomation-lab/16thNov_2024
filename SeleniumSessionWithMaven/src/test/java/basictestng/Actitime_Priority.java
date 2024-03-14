package basictestng;
import org.testng.annotations.Test;
public class Actitime_Priority {
	@Test(priority=1, description="Open browser and enter required URL")
	public void openBrowserAndAppURL() {
		System.out.println("Open browser and enter app url");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("enter username, password and click on login button");
	}
	@Test(priority=3)
	public void createTask() {
		System.out.println("create new task");
	}
	@Test(priority=4, description="Logout an close browser instance")
	public void logoutClose() {
		System.out.println("Logout from the application and close the browser");
	}
}
/*
by default all @Test method priority is 0, if two method priority is same dn 
they will be executed alphabetical order
*/