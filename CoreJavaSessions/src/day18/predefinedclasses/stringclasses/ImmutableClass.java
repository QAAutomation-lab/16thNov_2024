package day18.predefinedclasses.stringclasses;
/**
 * Immutable Class: its value can't be changed, if you change new object will be created
 * 1. class and data variable should be declared as final
 * 2. constructor should be parameterized, to initialize final data variable
 * 3. use only getter method to get final variables value
 */
final class TestImmutableClass{
	final String name;
	final int salary;
	TestImmutableClass(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}
public class ImmutableClass {

	public static void main(String[] args) {
		TestImmutableClass t1=new TestImmutableClass("Pune",15000);
		System.out.println(t1.getSalary());
		System.out.println(t1.getName());
//		t1.name="Bangalore";
//		t1.salary=45000;
		TestImmutableClass t2=new TestImmutableClass("Bangalore",45000);
		System.out.println(t2.getSalary());
		System.out.println(t2.getName());
	}
}
