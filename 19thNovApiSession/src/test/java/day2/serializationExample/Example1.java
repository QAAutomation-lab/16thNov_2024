package day2.serializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Testing implements Serializable{
	public int salary;
	public String name;
	public Testing(int a,String b) {
		salary=a;
		name=b;
	}
}
public class Example1 {

	public static void main(String[] args) {
		//creation an instance of class which we need to Serialized
		Testing ref=new Testing(25000,"Aman");
		//file location along name to store Serialized object
		String fileName="file.ser";
		try {
			//Use FileOutputStream to define file location for Serialization
			FileOutputStream fos=new FileOutputStream(fileName);
			//Creating an instance of ObjectOutputStream
			ObjectOutputStream out=new ObjectOutputStream(fos);
			//Writing object into file
			out.writeObject(ref);
			out.close();
			fos.close();
			System.out.println("Object has been Serialized....");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Testing ref2=null;
		try {
			//Use FileInputStream to define file location for De-Serialization
			FileInputStream fos=new FileInputStream(fileName);
			//Creating an instance of ObjectInputStream
			ObjectInputStream input=new ObjectInputStream(fos);
			//reading object from the file and store back to to required Object reference
			ref2=(Testing)input.readObject();
			input.close();
			fos.close();
			System.out.println("Object has been De-Serialized....");
			System.out.println("Salary is: "+ref2.salary );
			System.out.println("Name is: "+ref2.name );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
