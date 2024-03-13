package day11.overridings;

class Human {
	// Overridden method: when we declare a method in child class which is already present in parent class
	//in overriding we can increase the visibility of overridden method except private
	// default ---> protected or public or default
	// protected ---> protected or public
	// public ----> public
	void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human {
	// Overriding method
	protected void eat() {
		System.out.println("Boy is eating");
	}
}
class Overriding3 {
	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
	}
}
/*
member not participate in overriding
	- static method
	- final method
	- private method
	- constructor

*/