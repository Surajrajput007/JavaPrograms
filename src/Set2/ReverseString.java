package Set2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	// Approach 1	
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
	String s=	sc.next();
StringBuffer sb = new StringBuffer(String.valueOf(s));
StringBuffer rev = sb.reverse();
System.out.println(rev);
	*/
	
// APPROACH 02  // using charAt method

Scanner sc = new Scanner(System.in);
System.out.println("enter a string to Reverse");

String s=sc.next();
String rev="";

for(int i=s.length()-1;i>=0;i--) {
	rev = rev+s.charAt(i);
}
System.out.println(rev);
	}

}
