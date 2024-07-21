package day1.jsondata;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class JSONContentIntoFile {
	@Test
	public void testJsonContetnWritingIntoFIle() {	
		
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
		
		//write JSON content into JSON file
		
		try {
			FileWriter file=new FileWriter(".\\src\\test\\resources\\JSONFiles\\emp.json");
			file.write(arr.toJSONString());
			file.flush();
			file.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON file is created");
		
	}
}
