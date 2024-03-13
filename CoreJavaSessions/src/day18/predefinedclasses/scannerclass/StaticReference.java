package day18.predefinedclasses.scannerclass;

import day18.predefinedclasses.stringclasses.Demo101;

class Demo{
	void display() {
		System.out.println("Demo class display method");
	}
	void callMe() {
		System.out.println("Demo class callMe method");//
	}
	Demo(){
		System.out.println("Demo class cons..");
	}
}
public class StaticReference {

	static int age=30;
	final static Demo101 d1=new Demo101();
	static void calling() {
		System.out.println("Calling....");
	}
	void test() {
		System.out.println("StaticReference class test method");
	   //class.static-ref.nonstatic-method
	}
	public static void main(String[] args) {
		
		StaticReference.d1.display();
		StaticReference.d1.callMe();
	//class.static-ref.nonstatic_method		
		Demo101 d1=new Demo101();
		d1.display();
		d1.callMe();
		
		StaticReference s1=new StaticReference();
		s1.test();
		
		StaticReference.calling();
		System.out.println(StaticReference.age);
	}

}
