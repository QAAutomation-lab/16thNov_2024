package day16.typecasting;
class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class UpCasting1 extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		
		//up casting
		Mumbai m1=new UpCasting1();//implicit/auto
		m1.Deccan();
		m1.Kurla();
		
		Pune p1=(Pune)m1;//explicit
		p1.Deccan();
		
		
		//UpCasting1 obj=new Pune();//directly downcasting is not possible, only upcasted object can be downcasted
		//down casting of upcasted object
		UpCasting1 u1=(UpCasting1)p1;
		u1.myCity();
		u1.Kurla();
		u1.Deccan();
	}

}
