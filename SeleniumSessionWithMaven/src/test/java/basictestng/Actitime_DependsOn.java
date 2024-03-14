package basictestng;
import org.testng.annotations.Test;
public class Actitime_DependsOn {

	@Test(enabled=true)
	public void createPIM() {
		int i=10/0;
		System.out.println("PIM is created...");
	}
	@Test(enabled=true, dependsOnMethods="createPIM",priority=1)
	public void updatePIM() {
		System.out.println("updated PIM ....");
	}
	@Test(enabled=true, dependsOnMethods="createPIM",priority=2)
	public void deletePIM() {
		System.out.println("deleted PIM...");
	}
	@Test(enabled=true,priority=3)
	public void logoutClose() {
		System.out.println("Logout from the application and close the browser");
	}
}
