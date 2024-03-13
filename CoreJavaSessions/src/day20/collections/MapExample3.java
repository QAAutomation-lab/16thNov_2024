package day20.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample3 {

	public static void main(String[] args) {
		
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("123", "Amar");
		m1.put("456", "Ajay");
		m1.put("789", "Aman");
		System.out.println("Entry count: "+m1.size());
		System.out.println("All entries: "+m1);
		System.out.println("Keys in map: "+m1.keySet());
		System.out.println("values in map: "+m1.values());
		System.out.println("key 123 value is: "+m1.get("123"));
		
		for(Entry<String,String> e: m1.entrySet()) {
			//System.out.println("Entry --->"+e);
			System.out.println("Key is "+e.getKey() + " value is "+ e.getValue());
		}
	}

}
