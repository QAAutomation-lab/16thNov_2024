package day1.jsondata;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class JSONArrayExample {
	@Test
	public void testJsonArray() {	
		
		JSONObject ref1=new JSONObject();
		ref1.put("Name", "Pune");
		ref1.put("Email", "abc@gmail.com");
		ref1.put("ContactNumber", "9764975157");
		ref1.put("Company", "IBM");
		System.out.println("1st JSON Object Elements are: "+ref1);
		
		JSONObject ref2=new JSONObject();
		ref2.put("Name", "Mumbai");
		ref2.put("Email", "xyz@gmail.com");
		ref2.put("ContactNumber", "9874563215");
		ref2.put("Company", "TCS");
		System.out.println("2nd JSON Object Elements are: "+ref2);
		
		JSONArray arr=new JSONArray();
		arr.add(ref1);
		arr.add(ref2);
		System.out.println("JSON Array Elements are: \n"+arr);
	}
	
	@Test
	public void testJsonArray2() {	
		
		JSONObject ref1=new JSONObject();
		ref1.put("Name", "Pune");
		ref1.put("Email", "abc@gmail.com");
		ref1.put("ContactNumber", "9764975157");
		ref1.put("Company", "IBM");
		System.out.println("1st JSON Object Elements are: "+ref1);
		
		JSONObject obj1=new JSONObject();
		obj1.put("emp", ref1);
		System.out.println("New JSONObject obj1: "+obj1);
		System.out.println("******************************************");
		JSONObject ref2=new JSONObject();
		ref2.put("Name", "Mumbai");
		ref2.put("Email", "xyz@gmail.com");
		ref2.put("ContactNumber", "9874563215");
		ref2.put("Company", "TCS");
		System.out.println("2nd JSON Object Elements are: "+ref2);
		
		JSONObject obj2=new JSONObject();
		obj2.put("emp", ref2);
		System.out.println("New JSONObject obj2: "+obj2);
		
		JSONArray arr=new JSONArray();
		arr.add(obj1);
		arr.add(obj2);
		System.out.println("JSON Array Elements are: \n"+arr);
	}
}
