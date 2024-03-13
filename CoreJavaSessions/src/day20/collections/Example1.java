package day20.collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("Pune");// String object --> Object class Object(auto up casting)
		list.add(101);// int to Integer Object(Auto boxing) --->Object class Object(auto up casting)
		list.add(true);// Autoboxing --> Auto Up casting
		System.out.println("Element count in ArrayList: " + list.size());
		System.out.println("ELements of ArrayList are: " + list);
	
	}
	static void addAllRemoveAll() {
		List list = new ArrayList();
		list.add("Pune");// String object --> Object class Object(auto up casting)
		list.add(101);// int to Integer Object(Auto boxing) --->Object class Object(auto up casting)
		list.add(true);// Autoboxing --> Auto Up casting
		System.out.println("Element count in ArrayList: " + list.size());
		System.out.println("ELements of ArrayList are: " + list);
		
		List list2 = new ArrayList();
		list2.add('A');// Autoboxing --> Auto Up casting
		list2.add('E');// Autoboxing --> Auto Up casting
		list2.add('I');// Autoboxing --> Auto Up casting
		list2.add('O');// Autoboxing --> Auto Up casting
		System.out.println("Element count in ArrayList2: " + list2.size());
		System.out.println("ELements of ArrayList2 are: " + list2);
		System.out.println("******************************************");
		list2.addAll(list);
		System.out.println("After adding list into list2: "+list2);
		list2.removeAll(list);
		System.out.println("After removing list into list2: "+list2);
		list2.addAll(2,list);
		System.out.println("After adding list at index2 into list2: "+list2);
		list2.removeAll(list);
		System.out.println("After removing list into list2: "+list2);
	}
	static void printListElementUsingLoops() {
		List list = new ArrayList();
		System.out.println(list.isEmpty());
		list.add("Pune");// String object --> Object class Object(auto up casting)
		list.add(101);// int to Integer Object(Auto boxing) --->Object class Object(auto up casting)
		list.add(true);// Autoboxing --> Auto Up casting
		list.add("pune");
		list.add(null);
		System.out.println("Element count in ArrayList: " + list.size());
		System.out.println("ELements of ArrayList are: " + list);
		System.out.println("****************Printing list element one by one using for loop**********************");
		for(int i=0;i<list.size();i++) {
			System.out.println("Element at index "+i+": "+list.get(i));
		}
		System.out.println("****************Printing list element one by one using for each loop**********************");
		for(Object obj:list) {
			System.out.println(obj);
		}
	}

	static void addElementsInList() {
		// ArrayList l1=new ArrayList();
		// or
		List list = new ArrayList();
		System.out.println(list.isEmpty());
		list.add("Pune");// String object --> Object class Object(auto up casting)
		list.add(101);// int to Integer Object(Auto boxing) --->Object class Object(auto up casting)
		list.add(true);// Autoboxing --> Auto Up casting
		list.add("pune");
		list.add(null);
		System.out.println("Element count in ArrayList: " + list.size());
		System.out.println("ELements of ArrayList are: " + list);
		System.out.println("element at index 3 in ArrayList: " + list.get(3));
		list.add(3, "Mango");
		System.out.println("updated Element count in ArrayList: " + list.size());
		System.out.println("updated ELements of ArrayList are: " + list);
		System.out.println("**********************************************");
		list.set(4, "Apple");
		System.out.println("updated Element count in ArrayList: " + list.size());
		System.out.println("updated ELements of ArrayList are: " + list);
	}
}
/*
 * toString() overrided --->when collection object printed you will get value
 * stored in collection
 * 
 */