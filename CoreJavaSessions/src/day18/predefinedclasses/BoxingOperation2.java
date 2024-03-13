package day18.predefinedclasses;

public class BoxingOperation2 {

	public static void main(String[] args) {
		
		char c1='A';
	
		Character charObj1=(Character)c1;// 
		System.out.println(c1==charObj1);//
		Character charObj2=(Character)'Z';//
		
		Character charObj3='H';//
		
		System.out.println("c1: "+c1);//
		System.out.println("charObj1: "+charObj1);
		System.out.println("charObj2: "+charObj2);
		System.out.println("charObj3: "+charObj3);
		
		boolean b=true;//
		Boolean bObj=(Boolean)b;//
		System.out.println(bObj==b);
	}
}
