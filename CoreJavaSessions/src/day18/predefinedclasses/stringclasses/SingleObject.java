package day18.predefinedclasses.stringclasses;

public class SingleObject {
	/**
	 * 1. constructor should be private
	 * 2. create static ref variable of the class
	 * 3. create static method which return current class object
	 */
	private SingleObject(){
		System.out.println("I am SingleObject class cons..");
	}
	private static SingleObject obj=new SingleObject();
	
	public static SingleObject getInstance() {
		return obj;
	}
	int age=55;
	void display() {
		System.out.println("I am display of SingleObject class and age: "+age);
	}
}
class Demo{	
	public static void main(String[] args) {
		//SingleObject s1=new SingleObject();
		System.out.println("Program starts");
		SingleObject s1=SingleObject.getInstance();
		s1.display();
		s1.age=60;
		s1.display();
		SingleObject s2=SingleObject.getInstance();
		s1.display();
		System.out.println("Program ends...");
	}
}
