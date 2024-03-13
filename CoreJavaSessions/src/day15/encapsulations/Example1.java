package day15.encapsulations;
class Encap{
	private int pinCode=4110;
	private double salary=45000;
	private char grade='A';
	//using getter concept, we can provide access to the people to use private member from outside the class
	/*
	 * Getter method: create a public method with-
	 * 		accessModifier as public
	 * 		no argument/parameter
	 * 		return type should be same as required private variable datatype
	 */
	public int getPinCode() {
		return pinCode;
	}
	public double getSalary() {
		return salary;
	}
	public char getGrade() {
		return grade;
	}
	//setter concept: this will help you to modifier private data member from outside the class
	/**
	 * Setter Method: 
	 * 		accessModifier: public
	 * 		return type: void
	 * 		parameter should be same as required variable datatype
	 */
	public void setPinCode(int pinCode) {
		this.pinCode=pinCode;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setGrade(char grade) {
		this.grade=grade;
	}
}
public class Example1 {

	public static void main(String[] args) {
		Encap e1=new Encap();
//		System.out.println(e1.pinCode);
//		System.out.println(e1.salary);
//		System.out.println(e1.grade);
		System.out.println(e1.getPinCode());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGrade());
		e1.setGrade('B');
		e1.setSalary(5000.05);
		e1.setPinCode(5004);
		System.out.println(e1.getPinCode());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGrade());
	}
}
