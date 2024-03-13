package day16.typecasting;

public class Casting {
	public static void main(String[] args) {
		int num1=100;
		//widening
		long num2=num1;//implicit/auto widening
		float num3=(float)num1;//explicit widening
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Num3: "+num3);
		//narrowing
		double salary=55000.55;
		int num4=(int)salary;//explicit narrowing- data loss
		System.out.println("Salary: "+salary);
		System.out.println("num4: "+num4);	
		System.out.println("*********************************");
		calling(12345);
		System.out.println("*********************************");
		double num5=25.54;
		System.out.println("return value of display method: "+display((int)num5));
	}
	static double display(int num)//int num=(int)num5;//25
	{
		System.out.println("Displaying number: "+num);
		return num;//implicit widening
	}
	static void calling(long number) {//long number=12345;//auto widening
		System.out.println("dialing number: "+number);
	}
}
