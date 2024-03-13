package assignment;

public class Pyramid7 {

	public static void main(String[] args) {
	pyramid2();
	}
	
	static void pyramid2() {
		int row=6;
		for(int i=1;i<=row;i++) {//number of rows
			for(int j=1;j<=row-i;j++) {//space manage
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {//pattern
				System.out.print(k);
			}
			for(int x=2;x<=i;x++) {//pattern
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
/**
 *  F6: next line
 *  F5: go inside the function
 *  F8: continue
 *  Ctrl+shift+i : to check value of variable or method return value
 */
