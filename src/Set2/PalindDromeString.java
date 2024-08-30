package Set2;

import java.util.Scanner;

public class PalindDromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		
	String s=	sc.next();
	String rev = "";
	String org=s;
	for(int i= s.length()-1;i>=0;i--) {
		rev = rev+ s.charAt(i);}
	
if(org.equals(rev)) {
	System.out.println("paridrome");
}
else {
	System.out.println("its not a paridrome");
}
	}
	}

	
