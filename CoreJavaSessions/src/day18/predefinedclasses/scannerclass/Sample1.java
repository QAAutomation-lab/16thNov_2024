package day18.predefinedclasses.scannerclass;

import java.util.Scanner;

public class Sample1 {
	
	public static void main(String[] args) {
		//without scanner class
		//addNumbers(10, 20);
		
		int a,b;
		//with Scanner class
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter number1:");
		a=scn.nextInt();
		System.out.println("Please enter number1:");
		b=scn.nextInt();
		addNumbers(a, b);
		System.out.println("******************************");
		//calculation(20,'+',50);
		char op;
		System.out.println("Select operation: ");
		op=scn.next().charAt(0);
		System.out.println("Enter new number1: ");
		a=scn.nextInt();
		System.out.println("Enter new number2: ");
		b=scn.nextInt();
		calculation(a, op, b);
		System.out.println("*****************************");
		System.out.println("Pls enter your current salary");
		double salary=scn.nextDouble();
		System.out.println("Salary: "+salary);
	}
	static void calculation(int num1,char ops,int num2) {
		int res;
		if(ops=='+') {
			res=num1+num2;
			System.out.println("Number1: "+num1);
			System.out.println("Number2: "+num2);
			System.out.println("Result: "+res);
		}else if(ops=='-') {
			res=num1-num2;
			System.out.println("Number1: "+num1);
			System.out.println("Number2: "+num2);
			System.out.println("Result: "+res);
		}else if(ops=='%') {
			res=num1%num2;
			System.out.println("Number1: "+num1);
			System.out.println("Number2: "+num2);
			System.out.println("Result: "+res);
		}else {
			System.out.println("Invalid ops");
		}
	}
	static void addNumbers(int a,int b) {
		int c=a+b;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println("Result: "+c);
	}
}
