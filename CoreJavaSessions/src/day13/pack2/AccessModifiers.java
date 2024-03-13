package day13.pack2;

import day13.pack1.Modifiers;

public class AccessModifiers extends Modifiers{
	public static void main(String[] args) {

		AccessModifiers a1=new AccessModifiers();
		//System.out.println("private variable: "+a1.num1);//error as its declared as private, not accessible from outside the class
		//System.out.println("default variable: "+a1.num2);//error as its declared as default,not accessible from outside the package
		System.out.println("protected variable: "+a1.num3);//accessible as its protected and inherited in class AccessModifiers
		System.out.println("public variable: "+a1.num4);//accessible as its public so we can access them using inherited also
	}
}
