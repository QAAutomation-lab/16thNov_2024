package day18.arrays;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDup {

	public static void main(String[] args) {
		int num[]= {10,20,20,30,30,30,40};//10,20,30
		//removeDuplicate(num);
		 
		removeDup(num);
	}
	
	static void removeDup(int num[]) {
		//get first element form Array
		int current=num[0];
		//variable to be use while searching element in array
		boolean found=false;
		//using for loop iterate one by one element
		for(int i=0;i<num.length;i++) {			
			//checking element
			if(current==num[i] && !found) {//10==20 && true
				found=true;
			}else if(current!=num[i]) {
				System.out.println(" "+current );
				current=num[i];
				found=false;
			}
		}
		System.out.println(" "+current);
	}
	
//	static void removeDuplicate(int arr[]) {
//		
//		Set<Integer> set=new TreeSet<Integer>();
//		for(int i=0;i<arr.length;i++) {
//			set.add(arr[i]);
//		}		
//		System.out.println(set);
//	}
}
