package day13.pack2;

import day13.pack1.Modifiers;

public class AccessModifiers2{
	public static void main(String[] args) {

		Modifiers a1=new Modifiers();
		//System.out.println("private variable: "+a1.num1);//error as its declared as private, not accessible from outside the class
		//System.out.println("default variable: "+a1.num2);//error as its declared as default,not accessible from outside the package
		//System.out.println("protected variable: "+a1.num3);//for protected inheritance is mandatory to access them from outside the class
		System.out.println("public variable: "+a1.num4);//accessible as its public
	}
}
