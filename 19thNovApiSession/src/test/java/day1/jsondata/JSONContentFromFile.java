package day1.jsondata;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class JSONContentFromFile {
	@Test
	public void testJsonContetnReadingFromFIle() throws IOException, ParseException {	
		
		//create JSONParser instance to parse JSON content of file into Object
		JSONParser jp=new JSONParser();
		//Define JSON file location from where you have read JSON content
		FileReader fr=new FileReader(".\\src\\test\\resources\\JSONFiles\\user.json");
		//Using JSONParser convert JSON file content into Object class
		Object obj=jp.parse(fr);
		//Type cast Object class instance into JSONObject
		JSONObject jObj=(JSONObject)obj;
		System.out.println("JSON content from JSON file: "+jObj);
	}
}
