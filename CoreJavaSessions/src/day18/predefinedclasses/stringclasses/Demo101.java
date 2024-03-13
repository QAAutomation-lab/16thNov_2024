package day18.predefinedclasses.stringclasses;

import java.util.Arrays;

public class Demo101 {

	public static void main(String[] args) {
		
		System.out.println("******************************************");
		String s4="PuneITCityMagarpattaDeccan";
		System.out.println("Original String s4: "+s4);
		String s5=s4.substring(4);
		System.out.println("s4 SubString from index 4 as s5: "+s5);
		String s6=s4.substring(4,20);
		System.out.println("s4 SubString from index 4,20 as s6: "+s6);
		System.out.println("*****************************************");
	}
	
	static void basicFunc_3() {
		String s1 = "Bangalore is IT HUB, Pune is known as nature cit and it has IT as well";
		//replace, replaceAll, replaceFirst, trim, split, toCharArray, subString
		System.out.println("Original String s1: "+s1);
		System.out.println("After replacing 'a' with 'X' in String s1: "+s1.replace('a', 'X'));
		System.out.println("After replacing first 'is' with 'XX' in String s1: "+s1.replaceFirst("is","XX"));
		System.out.println("After replacing All 'as' with 'XX' in String s1: "+s1.replaceAll("as","XX"));
		System.out.println("Original String s1: "+s1);
		System.out.println("*****************************************");
		String s2 = "   Bangalore is IT HUB     ";
		System.out.println("Original String s2: "+s2);
		System.out.println("char in s2: "+s2.length());
		System.out.println("After trim s2: "+s2.trim());
		System.out.println("After trim s2 char count: "+s2.trim().length());
		System.out.println("*****************************************");
		String s3="I am in Pune, working in IT compant, Pune is knows as Nature City";
		System.out.println("Original String s3: "+s3);
		String[] words=s3.split(" ");
		System.out.println("After spliting s3 with ' ' words are: ");
		for(String str:words) {
			System.out.println(str);
		}
		System.out.println("***************************************");
		String[] word2=s3.split("in");
		System.out.println("After spliting s3 with 'in' words are: ");
		for(String str:word2) {
			System.out.println(str);
		}
		System.out.println("***************************************");
		String[] word3=s3.split("in",2);
		System.out.println("After spliting s3 with 'in' words are: ");
		for(String str:word3) {
			System.out.println(str);
		}
	}
	
	static void basicFunc_2() {
		String s1 = "Bangalore";
		System.out.println("is String empty? "+s1.isEmpty());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println("Original String s1: "+s1);		
		System.out.println("is this String s1 have 'ma': "+s1.contains("ma"));
		System.out.println("is this String s1 have 'ga': "+s1.contains("ga"));
		System.out.println("is this String s1 starts with 'Ban': "+s1.startsWith("Ban"));
		System.out.println("is this String s1 ends with 'lore': "+s1.endsWith("lore"));
		//left to right
		System.out.println("index of 'a' in String s1: "+s1.indexOf('a'));
		System.out.println("After index 2 next visit of 'a' in String s1: "+s1.indexOf('a',2));
		//right to left
		System.out.println("last index of 'a' in String s1: "+s1.lastIndexOf('a'));
		System.out.println("before index 2 next visit of 'a' in String s1: "+s1.lastIndexOf('a',2));		
		String s2="bangalore";
		System.out.println("s1 and s2 comparision using equals(): "+s1.equals(s2));
		System.out.println("s1 and s2 comparision using equalsIgnoreCase(): "+s1.equalsIgnoreCase(s2));
	}
	
	static void basicFunc_1() {
		String s1 = "Bangalore";
		String s2 = new String("Bangalore");// single object, outside SCP
		System.out.println("String object s1 & s2 with equals(): " + s2.equals(s1));
		System.out.println("String object s2 & s1 with '==': " + (s2 == s1));
		
		System.out.println("s1 object char count: "+s1.length());
		System.out.println("s2 object char count: "+s2.length());
		
		System.out.println("s1, char at index 2: "+s1.charAt(2));
		System.out.println("**********************************");
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println("**********************************");
	}

	static void newKeywordObject() {
		String s2 = new String("Bangalore");// two object, 1st-SCP & 2nd-outside SCP
		String s3 = new String("Mumbai");// two object, 1st-SCP & 2nd-outside SCP
		String s4 = new String("Bangalore");// single object,1st-outside SCP
		String s5 = new String("Pune");// single object,1st-outside SCP
		System.out.println("String object s2 & s3 with equals(): " + s2.equals(s3));
		System.out.println("String object s2 & s4 with equals(): " + s2.equals(s4));
		System.out.println("String object s2 & s5 with equals(): " + s2.equals(s5));

		System.out.println("String object s2 & s4 with '==': " + (s2 == s4));
		System.out.println("String object s2 & s3 with '==': " + (s2 == s3));
		System.out.println("String object s2 & s5 with '==': " + (s2 == s5));
	}

	static void literalObject() {
		String s1 = "Pune";
		System.out.println("String object s1: " + s1);
		String s2 = "Mumbai";
		System.out.println("String object s2: " + s2);
		String s3 = "Pune";
		System.out.println("String object s3: " + s3);
		System.out.println("String object s1 & s2 with equals(): " + s1.equals(s2));
		System.out.println("String object s1 & s3 with equals(): " + s1.equals(s3));
		System.out.println("String object s1 & s2 with '==': " + (s1 == s2));
		System.out.println("String object s1 & s3 with '==': " + (s1 == s3));
	}
}
/**
 * Following method of Object clas is overrided in String class
 * toString()-->value stored in String object equals() --->compare two String
 * objects based on values == ----> compares Two String objects based on address
 */