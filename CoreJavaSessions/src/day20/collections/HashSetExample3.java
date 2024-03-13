package day20.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class HashSetExample3 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println("List elements: "+list);
		HashSet<String> set = new HashSet<String>(list);
		System.out.println("Initial set elements: "+set);//Ravi,Ajay,Vijay
		//use iterator to get element from Set
		Iterator<String> itr=set.iterator();
		for(int i=0;i<set.size();i++) {
			String str=itr.next();
			System.out.print(str +": ");
			System.out.println(Collections.frequency(list, str));
		}
	}
}