package basictestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationInTestNG {

	@Test(enabled=false)
	public void testNumber() {
		int num=-10;
		boolean res=(num>=0);
		if(res) {
			System.out.println("Positive number");
		}else {
			System.out.println("Negative number");
		}
	}
	
	@Test(enabled=false)
	public void testNumber2() {
		int num=10;
		boolean res=(num>=0);
		//when you are expecting true result, if true --> pass | false ---> fail
		//Assert.assertTrue(res);
		Assert.assertTrue(res,"Given number is not positive");
	}
	@Test(enabled=true)
	public void checkNumberIsEven() {
		int num=10;	
		//when you are expecting false result, if false --> pass| true --> fail
		//Assert.assertFalse((num%2)!=0);
		
		Assert.assertFalse((num%2)!=0,"Given number is odd");
	}
}
