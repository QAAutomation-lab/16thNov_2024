package day1.jsondata;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;

public class JSONObjectExamples {
	@Test
	public void testJsonObject() {		
		JSONObject ref=new JSONObject();
		ref.put("Name", "Pune");
		ref.put("Email", "abc@gmail.com");
		ref.put("ContactNumber", "9764975157");
		ref.put("Company", "IBM");
		System.out.println("JSON Object Elements are: "+ref);
		System.out.println("Get 'Company' value : "+ref.get("Company"));
		System.out.println(ref.keySet());
		System.out.println(ref.values());
	}
	@Test
	public void testMapToJsonStringValue() {		
		Map ref=new HashMap();
		ref.put("Name", "Pune");
		ref.put("Email", "abc@gmail.com");
		ref.put("ContactNumber", "9764975157");
		ref.put("Company", "IBM");
		System.out.println("Map Object Elements are: "+ref);
		
		//Converting Map into JSON String
		String jsonText=JSONValue.toJSONString(ref);
		System.out.println("JSON String is "+jsonText);
	}
	
	@Test
	public void testStringValueToJSONObject() {		
		String jsonText="{\"Company\":\"IBM\",\"Email\":\"abc@gmail.com\",\"ContactNumber\":\"9764975157\",\"Name\":\"Pune\"}";
		
		//First convert String into Object
		Object obj=JSONValue.parse(jsonText);
		//Convert Object into JSONObject
		JSONObject jsonObj=(JSONObject)obj;
		System.out.println("JSON Object value: "+jsonObj);
		
//		Object nameOBj=jsonObj.get("Name");
//		String name=(String)nameOBj;//downcasting
//		System.out.println("Name value is "+ name+" and its length is "+name.length());
			//or
		String name=(String)jsonObj.get("Name");
		System.out.println("Name value is "+ name+" and its length is "+name.length());
		
	}
}
