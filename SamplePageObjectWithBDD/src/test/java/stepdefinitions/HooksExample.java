//package stepdefinitions;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//
//public class HooksExample {
//		//Hooks
//		@Before
//		public void starUp() {
//			//setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//			System.out.println("*************************Hooks-Before*************************************");
//		}
//		
//		@BeforeStep
//		public void beforeSteps() {
//			System.out.println("#####################Hooks- BeforeStep################################");
//		}
//		@AfterStep
//		public void afterSteps() {
//			System.out.println("#####################Hooks- AfterStep################################");
//		}
//		
//		@After
//		public void finish() {
//			//cleanUp();
//			System.out.println("*************************Hooks-After*************************************");
//		}
//}
