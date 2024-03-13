package day18.arrays;

import java.util.Arrays;

class M_Array5{

	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom = { 'a', 'b','e', 'c', 'd'};
		//duplicate array
		char[] copyArray=copyFrom.clone();
		
		boolean result=Arrays.equals(copyArray, copyFrom);
		System.out.println("Before sorting copyFrom array: "+result);
		
		//sorting copyFrom in ascending order
		Arrays.sort(copyFrom);//a,b,c,d,e
		
		result=Arrays.equals(copyArray, copyFrom);
		System.out.println("after sorting copyFrom array: "+result);
	}
}

