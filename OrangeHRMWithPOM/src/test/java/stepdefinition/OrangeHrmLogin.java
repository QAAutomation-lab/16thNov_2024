//package stepdefinition;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import utilities.SeleniumUtility;
//
//public class OrangeHrmLogin extends SeleniumUtility {
//
//	@Given("user is on OrangeHrm login page")
//	public void user_is_on_orange_hrm_login_page() {
//		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
//	@When("user enters a valid username as {string}")
//	public void user_enters_a_valid_username_as_(String username) {
//		typeInput(driver.findElement(By.name("username")),username );
//	}
//
//	@And("user enters a valid password as {string}")
//	public void user_enters_a_valid_password_as_(String password) {
//		typeInput(driver.findElement(By.name("password")),password );
//	}
//
//	@And("user clicks on Login button")
//	public void user_clicks_on_login_button() {
//		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
//	}
//
//	@Then("user should be able to navigate to Home Page of OrangeHrm having {string} in URL")
//	public void user_should_be_able_to_navigate_to_home_page_of_orange_hrm_having_in_url(String expectedText) {
//		String actualUrl=getCurrentUrlOfApplication();
//		Assert.assertTrue(actualUrl.contains(expectedText), "Either login failed or URL changed");
//	}
//
//	@Then("close the browser for OrangeHRM")
//	public void close_the_browser_for_orange_hrm() {
//		tearDown();
//	}
//}
