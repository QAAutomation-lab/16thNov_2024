package day18.predefinedclasses.objectclass;
class Example extends Object{
	public void testing() {
		System.out.println("Hi");
	}
}
public class Sample1 extends Example{

	public static void main(String[] args) {
	
		Sample1 s1=new Sample1();
		System.out.println("Sample1 object ref s1 with implicit toString(): "+s1);//toString() method will be called
		System.out.println("Sample1 object ref s1 with explicit toString(): "+s1.toString());
		Example e1=new Example();
		System.out.println("Example object ref e1 with implicit toString(): "+e1);
		Example e2=new Sample1();
		System.out.println("Example Sample1 ref e2 with implicit toString(): "+e2);
		Sample1 s2=s1;
		System.out.println("Sample1 object ref s2 with implicit toString(): "+s2);
		
		System.out.println("s1 and e1 comparision based on address: "+s1.equals(e1));
		System.out.println("e1 and e2 comparision based on address: "+e2.equals(e1));
		System.out.println("s1 and s2 comparision based on address: "+s1.equals(s2));
		System.out.println("s1 object address in int format: "+s1.hashCode());
		System.out.println("e1 object address in int format: "+e1.hashCode());
		System.out.println("e2 object address in int format: "+e2.hashCode());
		System.out.println("s2 object address in int format: "+s2.hashCode());
	}
	public int hashCode() {
		return 404;
	}
	
	public boolean equals(Object obj) {
		return true;
	}
	public void testing() {
		System.out.println("Hello");
	}
	
	public String toString() {
		return "Pune";
	}
}
/*
toString()-->String-->Object : FullyQualifiedClassName@hexaDecimalAddress
		day18.predefinedclasses.objectclass.Sample1@h387hiuh987
		
equals(Object obj)-->boolean -->Object: compares two object based on address
hashCode()-->long --->Object : gives you address of the object

*/