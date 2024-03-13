package day12.abstractions;
interface AccountCreation{
	void signup();
}
interface GetInsideTheApplication{
	void login();
}
class placeOrder implements GetInsideTheApplication{
	public void login() {
		System.out.println("Login successful....");
	}
}
public class SampleInterface extends placeOrder implements AccountCreation{
	
	public void signup() {
		System.out.println("Your account created successfully.....");
	}
	
	public static void main(String[] args) {
		SampleInterface s1=new SampleInterface();
		s1.signup();
		s1.login();
	}

}
