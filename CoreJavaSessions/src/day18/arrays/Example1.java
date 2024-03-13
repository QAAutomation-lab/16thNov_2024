package day18.arrays;

public class Example1 {

	public static void main(String[] args) {

//		int num[];//int[] num; | int []num;
//		num=new int[5];
				//or
		int num[]=new int[5];
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		//System.out.println(num[5]);you will get run time error, as array size is 5 dn max index number will be 4
		
		System.out.println("Element count in array: "+num.length);
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		System.out.println("***********After array element initialization and print them using for loop*****************");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("***********print them using for loop*****************");
		/*
		 * for each loop:
		 * 		for(LHS:RHS){
		 * 
		 * 		}
		 * 
		 * based on RHS, LHS type should be defined
		 */
		for(int n:num) {
			System.out.println(n);
		}
		System.out.println("****************************************");
		char[] vowels= {'a','e','i','u','o'};
		for(char ch:vowels) {
			System.out.println(ch);
		}
		System.out.println("*************************************");
		boolean values[]=new boolean[] {true,false,true};
		for(boolean bool:values) {
			System.out.println(bool);
		}
		
	}

}
